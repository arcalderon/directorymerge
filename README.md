# directorymerge


### Installation



```
git clone git@github.com:arcalderon/coding-challenge.git

```


###### Directory Merge - Using IDE (Passing No Arguments: Program Will Prompt for User Input)
```
Step 1: Open MergeDirectoryFiles located in /directorymerge/src/main/scala/example/MergeDirectoryFiles.scala
Step 2: Right Click + 'Run MergeDirectoryFiles'
Step 3: Please Enter input data location:
i.e  Please Enter input data location: input
Step 3: Please Enter output data location: output
i.e  Please Enter output data location: input
```

###### Directory Merge - Using IDE (Passing Arguments)
```
Step 1: Enter Program Arguments as such: merge /path/directorymerge/input /path/directorymerge/output
Step 1: Open MergeDirectoryFiles located in /directorymerge/src/main/scala/example/MergeDirectoryFiles.scala
Step 2: Right Click + 'Run MergeDirectoryFiles'

```


### Approach
Decided to use Spark in order to make use of computing power. For big data problems requiring large data sets. It makes
sense to leverage Sparks' way of handling large amount of data. Loading say one thousand files of a 1GB would have stressed
a non spark application.


