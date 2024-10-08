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


> Byte streams are used for reading and writing streams of raw bytes (8-bit data units) in Java. They are represented by classes that end with InputStream or OutputStream. These streams are suitable for handling binary data like images, audio files, or any non-text files where data is not in human-readable form.

##Key Classes for Byte Streams

### InputStream and OutputStream:

- InputStream: Abstract class for reading bytes.
- OutputStream: Abstract class for writing bytes.

### FileInputStream and FileOutputStream:

- FileInputStream: Reads bytes from a file.
- FileOutputStream: Writes bytes to a file.

### ByteArrayInputStream and ByteArrayOutputStream:

- ByteArrayInputStream: Reads bytes from a byte array.
- ByteArrayOutputStream: Writes bytes to a byte array.

### DataInputStream and DataOutputStream:

- DataInputStream: Reads primitive Java data types (int, float, boolean, etc.) from an underlying input stream.
- DataOutputStream: Writes primitive Java data types to an underlying output stream.

> Byte streams in Java are essential for handling raw binary data efficiently. 


# Charcter Stream 

Character streams are represented by classes that end with Reader or Writer. They provide methods to read and write characters, making them suitable for tasks like reading text files, processing user input as text, or transmitting textual data over network connections.

## Key Classes for Character Streams

### Reader and Writer:

- Reader: Abstract class for reading characters.
- Writer: Abstract class for writing characters.

### FileReader and FileWriter:

- FileReader: Reads characters from a file.
- FileWriter: Writes characters to a file.

### BufferedReader and BufferedWriter:

- BufferedReader: Reads text from a character-input stream with buffering for efficiency.
- BufferedWriter: Writes text to a character-output stream with buffering for efficiency.

### InputStreamReader and OutputStreamWriter:

- InputStreamReader: Bridge from byte streams to character streams, reading bytes and decoding them into characters using a specified charset.
- OutputStreamWriter: Bridge from character streams to byte streams, converting characters into bytes using a specified charset.