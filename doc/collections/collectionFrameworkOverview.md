# Collections Framework Overview

The java plateform includes a collections framework. A collection is an object that represents a group of objects. A collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details.

## Primary advantages

- Reduces Programming effort
- Increase performance
- Provide interoperability between unrelated APIs
- Reduces the efforts 
- Fosters software reuse

The collections framework consists of:

- Collection interfaces. Represent different types of collections, such as sets, lists, and maps. These interfaces form the basis of the framework.
- General-purpose implementations. Primary implementations of the collection interfaces.
- Legacy implementations. The collection classes from earlier releases, Vector and Hashtable, were retrofitted to implement the collection interfaces.
- Special-purpose implementations. Implementations designed for use in special situations. These implementations display nonstandard performance characteristics, usage restrictions, or behavior.
- Concurrent implementations. Implementations designed for highly concurrent use.
- Wrapper implementations. Add functionality, such as synchronization, to other implementations.
- Convenience implementations. High-performance "mini-implementations" of the collection interfaces.
- Abstract implementations. Partial implementations of the collection interfaces to facilitate custom implementations.
- lgorithms. Static methods that perform useful functions on collections, such as sorting a list.
- Infrastructure. Interfaces that provide essential support for the collection interfaces.
- Array Utilities. Utility functions for arrays of primitive types and reference objects. Not, strictly speaking, a part of the collections framework, this feature was added to the Java platform at the same time as the collections framework and relies on some of the same infrastructure.