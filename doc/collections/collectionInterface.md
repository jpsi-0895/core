# Collection Interface 

The collection interface serves as root interface for a hierarchy of collection classes in Java (e.g., List, Set, Queue).

## Key functionlities:

- Adding elements:
    Method: add(object)
    Work: Add element
- Removing elements:
    Methods:
        1. remove(object)
        2. removeAll(collection)
    Work: Remove elements
- Checking element existence:
    Method: Contains(object)
    Work: To check a specific element exist or not
- Collection size:
    Method: size()
    Work: Return number of element in the collection
- Iterating over elements:
    Method: iterator()
    Work: To traverse through the elements in the collections

## Details

### Adding Elements:

- add(E element): Appends the specified element to the end of the list. It returns true if the addition is successful.
- addAll(Collection<? extends E> c): Adds all the elements from another collection (c) to the end of the current list. Returns true if the list is modified after the operation.

### Removing Elements:

- remove(Object o): Removes the first occurrence of the specified element (o) from the list. Returns true if the element is removed.
- removeAll(Collection<?> c): Removes all elements from the current list that are also present in the specified collection (c). Returns true if the list is modified after the operation.
- clear(): Removes all elements from the list.

### Checking Elements:

- contains(Object o): Returns true if the list contains the specified element (o).
isEmpty(): Returns true if the list is empty (contains no elements).
Accessing Elements:

- get(int index): Returns the element at the specified index in the list. Throws an IndexOutOfBoundsException if the index is invalid.
- indexOf(Object o): Returns the index of the first occurrence of the specified element (o) in the list. Returns -1 if the element is not found.
- lastIndexOf(Object o): Returns the index of the last occurrence of the specified element (o) in the list. Returns -1 if the element is not found.

### List Manipulation:

- set(int index, E element): Replaces the element at the specified index with the provided element (element). Throws an IndexOutOfBoundsException if the index is invalid.
- subList(int fromIndex, int toIndex): Returns a sublist view of the original list containing elements from the specified fromIndex (inclusive) to toIndex (exclusive).

### Iterating over elements:

- iterator(): Returns an iterator object that allows you to traverse through the elements in the list one by one. You can use a loop with the <hasNext()> and <next()> methods of the iterator to process each element.
