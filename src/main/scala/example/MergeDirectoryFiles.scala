package example

import org.apache.spark.sql.{SaveMode, SparkSession}
import org.apache.spark.sql.functions.asc

object MergeDirectoryFiles extends App {
  private val spark = SparkSession
    .builder()
    .appName("Test")
    .master("local[2]")
    .getOrCreate()


  if (args.length == 3) {

    val command = args(0)
    val input_dir = args(1)
    val output_dir = args(2)
    retrieveFilesAndSortToDestination(input_dir, output_dir)
  }
  else {
    println("Please Enter input data location: ")
    val input_dir =  scala.io.StdIn.readLine()
    println("Please Enter output data location: ")
    val output_dir =  scala.io.StdIn.readLine()
    retrieveFilesAndSortToDestination(input_dir, output_dir)
  }

  def retrieveFilesAndSortToDestination(input_dir: String, output_dir:String) {
     val inputFrame = spark.read.text(s"$input_dir/")

    // .show() will not print the entire content. This is here just to get a feel of what the top lines are.
    println("This is the input: ")
    inputFrame.show()

    // Preparing dataframe containing a all files, with duplicates and new lines removed then finally sorted.
    val outputFrame = inputFrame .filter(row => row.getAs[String]("value")
      .nonEmpty).orderBy(asc("value")).toDF().distinct()


    // .show() will not print the entire content. This is here just to get a feel of what the top lines are.
    println("This is the solution: ")
    outputFrame.show()

    // writing it to the output directory
    outputFrame.write.mode(SaveMode.Overwrite).text(s"$output_dir")


  }


}
