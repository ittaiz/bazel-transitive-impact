# bazel-transitive-impact
Exploring a nuance with impact of transitive changes in Bazel and test running

* GreeterTest => greeter (BUILD, compile and runtime)    
* greeter => before_greeter (only BUILD file wise, source code has no relation and that is to create a situation where change in before_greeter outputs the same greeter)    
* before_greeter => greeter (only BUILD file wise, source code has no relation and that is to create a situation where change in before_before_greeter outputs the same before_greeter)    

When changing a single character in BeforeBeforeGreeting.java (which nothing depends on source wise) GreeterTest is run

Contents of explain:    
```Build options: --explain=foo.log
Executing action 'BazelWorkspaceStatusAction stable-status.txt': unconditional execution is requested.
Executing action 'Building libbefore_before_greeter.jar (1 source file)': One of the files has changed.
Executing action 'Extracting interface //:before_before_greeter': One of the files has changed.
Executing action 'Testing //:GreeterTest': One of the files has changed.```
