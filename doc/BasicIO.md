# Basic I/O
This lesson covers the Java platform classes used for basic I/O. 
It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. 
The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. 
Then the lesson looks at file I/O and file system operations, including random access files.

> I/O Streams
>   - Byte Streams
>   - Character Streams
>   - Buffered Streams
>   - Scanning and Formatting
>       - Scanning
>       - Formatting
>   - I/O from the Command Line
>   - Data Streams
>   - Object Streams


# Byte Streams

All byte stream classes are descended from <InputStream> and <OutputStream>.

There are many byte stream classes. To demonstrate how byte streams work, we'll focus on the file I/O byte streams, FileInputStream and FileOutputStream. Other kinds of byte streams are used in much the same way; they differ mainly in the way they are constructed.

