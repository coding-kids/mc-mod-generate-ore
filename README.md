# coding-kids

## Setting up a Workspace/Compiling from Source
Note: Git MUST be installed and in the system path to use our scripts.
Note: Don't use IntelliJ IDEA, it could not work for debug, just use Eclipse IDE.
* Setup: Run [gradle]in the repository root: `gradlew[.bat] [setupDevWorkspace|setupDecompWorkspace] [eclipse]`
* Build: Run [gradle]in the repository root: `gradlew[.bat] build`
* If obscure Gradle issues are found try running `gradlew clean` and `gradlew cleanCache`