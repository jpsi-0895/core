# The jar command

The `jar` command is used to create, view, and manipulate JAR (Java Archive) files.

JAR files are used to package Java class files, metadata, and resources into a single archive, making it easier to distribute and deploy Java applications.

### Basic Syntax

```sh
jar [options] [jar-file] [manifest-file] [entry-point] [files...]
```

## Common jar Commands and Options

### 1. Creating a JAR File

To create a JAR file, use the cf options. The `c` option stands for `"create"`, and `f` stands for `"file"`.

```sh
jar cf MyArchive.jar -C path/to/classes/ .
```

- `cf`: Create a new JAR file.
- `MyArchive.jar`: The name of the JAR file to be created.
- `-C path/to/classes/ .`: Changes to the specified directory and includes all files in it.

If you want to include a manifest file:

```sh
jar cfm MyArchive.jar Manifest.txt -C path/to/classes/ .
```

- `m`: Include the specified manifest file (`Manifest.txt`).

### 2. Viewing the Contents of a JAR File

To view the contents of a `JAR file`, use the tf options. The `t` option stands for `"list table of contents"`, and `f` specifies the `JAR file`.
