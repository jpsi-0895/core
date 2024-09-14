# JDK (Java Development Kit)

The JDK (Java Development Kit) is a crucial tool for Java developers.
It provides the necessary tools and libraries to develop, compile, and debug Java applications.

1.  Components of the JDK

    1.  Java Compiler (`javac`):

        - `Function`: Converts Java source code (written in .java files) into `bytecode` (stored in `.class` files).
        - `Command`: `javac MyProgram.java`

    2.  Java Virtual Machine (`JVM`):

        - `Function`: Executes Java `bytecode`. While the JVM itself is not part of the JDK (it's part of the JRE), the JDK includes the JVM so that you can run and test your Java applications.
        - Command to Run Bytecode: `java MyProgram`

    3.  Java Runtime Environment (`JRE`):

        - `Function`: Provides the libraries and JVM needed to run Java applications. The JDK includes the JRE as part of its package.
        - Includes: JVM, standard libraries, and other components required to run Java applications.

    4.  Java Debugger (`jdb`):

        - `Function`: A command-line tool to debug Java programs. Allows you to set breakpoints, step through code, and inspect variables.
        - Command: `jdb -attach 8000`

    5.  Java Documentation Generator (`javadoc`):

        - `Function`: Generates API documentation from Java source code comments.
        - Command: `javadoc -d doc MyProgram.java`

    6.  Java Archiver (`jar`):

        - `Function`: Packages Java class files and associated metadata into a single JAR (Java Archive) file.
        - Command: `jar cf MyProgram.jar MyProgram.class`

    7.  Java Application Launcher (java):

        - `Function`: Launches Java applications by interpreting bytecode. It’s also used to run Java applications from JAR files.
        - Command: `java MyProgram`

    8.  Java Class Library:

        - `Function`: A collection of pre-written classes that provide functionality such as file I/O, networking, and graphical user interfaces.
