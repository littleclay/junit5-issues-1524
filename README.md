# junit5-issues-1524
Example code that encountered issues.

Machine:
  2017, 15-inch Macbook Pro
  macOS High Sierra 10.13.6

Build tool:
  bazel

https://docs.bazel.build/versions/master/install-os-x.html

From the root directory of the code, you can build a jar with the tests via:
```
bazel build tests_deploy.jar
```
The built jar will then be located at: `bazel-bin/tests_deploy.jar`. Simply move it to the same directory you have the standalone ConsoleLauncher and then run:
```
java -jar junit-platform-console-standalone-1.3.0-M1.jar --cp tests_deploy.jar -p com.foo
```
Or, with parallel execution:
```
java -jar junit-platform-console-standalone-1.3.0-M1.jar --cp tests_deploy.jar -p com.foo --config junit.jupiter.execution.parallel.enabled=true --details tree
```
Note: you need (on my machine) to run the above command multiple times. Occasionally it will run fine, other times it will seem to succeed but will have truncated tree output, other times there is a NullPointerException.
