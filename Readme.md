## Languages
There are majorly two types of languages.
1. Statically typed language
2. Dynamically typed languages


Java is statically typed and also a strongly typed language

## Datatypes
There are two data types available in Java 
1. Primitive Data Types
2. Reference/Object Data Types


### Primary datatypes
1. byte (1)
2. short (2)
3. int (4)
4. long (8)
5. float (4) 
6. double (8)
7. boolean (1 bit)
8. char (2)

**unsigned** : to make signed data to unsigned and increasing the range.

All the data types are prone to overflow. eg adding 1 to 127 in byte data will result in -128.

Each primitive datatype has default value.
Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead.

## variable

There are three types of variables in Java:
Local Variables Instance Variables Static Variables

declaration of the variable in java is different from creation of the object.
```
Point p;
```
It only declares a reference variable. So, no memory is created at this point of time.
```
Point p=new Point();
```
The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory.
The new operator also invokes the class constructor.
A new variable is created at left and new object is created at right side. Reference variable is made to point to the newly created object.

```
int x;
```
here declaration and creation is done at same time. no need for new.


## Comments

In Java there are three types of comments:
1. Single – line comments.
```
// Comment
```

2. Multi – line comments
```
/*

Comment

*/
```
3. Documentation comments.
Code documentation can be generated by using a tool ‘javadoc’ :
```
javadoc Test.java
```
There is whole tutorial on it. For the time being it is skipped.

## compilation in Terminal 

## Structure

```java
class Test{
	
	primaryField p;
	referenceFiels r;

	methods(paramter){

	}
}
```
```java
	object.method();
```

all the non static method recieve a self reference. So, we cannot use any non static field of the class inside a static member.
where referenceField also has its own class structure.
class at leaf level contains only **primaryFiels**  and no **referenceField**.

# File and I/O 

```java
import java.io.*;
```

A stream can be defined as a sequence of data. There are two kinds of Streams

1. InPutStream 
2. OutPutStream

## byte stream
### FileInputStream
[link](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html)
```java
FileInputStream f=new FileInputStream("file.txt");
while(x=f.read()!=-1){
	--code--
}
```
### FileOutputStream
```java
FileInputStream f=new FileInputStream("file.txt");
f.write(character);
```

exceptions are not catched for understanding purpose.
# Scanner

## File operation

## Big Integers

## Static keyword 

### Static varaible
static variable will get the memory only once, if any object changes the value of the static variable,it will retain its value.
Static keyword comes before data type.
[javatpoint](https://www.javatpoint.com/static-keyword-in-java)
[geeksforgeeks](https://www.geeksforgeeks.org/static-keyword-java/)
e.g.
```java
class Test{
	static Point p=new Point(1,2);
}
```

```java
class Test{
	static type method(){

	}
}
```

```java
	Test.method();
```

```java
```

```java
```




### Java static method


## Super keyword

## Final Keyword

## This Keyword




## Wrapper Classes


## Conditional 

```java
if(condition 1){
	--code--
}
else if(condition 2){
	--code--
}
else{
	//code
}
```

```java
switch(expression){
	case v1: --code-- 
	break;
	case v2: --code-- 
	break;	
	default: --code--
}
```	
## Looping 
```java
for(initialisation; condition; update){
	--code--
}
```
index based
```java
for(type  d:array){
	--code--
}
```
value based

```java
initialisation;
while(condition){
	--code--
	update;
}
```
## Java Socket Programming

## Bufferreader

## Strings

```java
import java.lang.String;
```

string is basically an object that represents sequence of char values. An array of characters works same as java string.
```java
char arr[]={'s','t','r','i','n','g'}
String str=new String(arr);
```
or
```java
String str=new "string";
```
## MultiThreading
**java.lang.Thread**
Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

**Thread creation by extending the Thread class**
```java
class  MyThread extends Thread{
	@override
	public void run(){
		--code--
	}
}

class Test{
	public static void main(String[] args){
	MyThread object = new MyThread();
		object.start();
	}
}
```

**Thread creation by implementing the Runnable Interface**


## Apache

## Unit Testing


## Enums 

## Synchronisation


## Exceptions

## Access Modifiers


## Method Overriding

## Method Overloading 

## Inner classes 

## Constructors

Things to Remember:
1. if we write a constructor with arguments or no-argument then compiler does not create default constructor.
2. unlike c++, default constructor in Java initializes member data variable to default values 
3. unlike C++, Java doesn’t create a default copy constructor if you don’t write your own.
3. Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
4. A constructor in Java can not be abstract, final, static and Synchronized.

Important topics:
1. No-argument constructor
2. Parameterized Constructor
3. Constructor Overloading
4. Copy Constructor
5. Singleton class

References:
[GFG1](https://www.geeksforgeeks.org/constructors-in-java/)
[GFG2](https://www.geeksforgeeks.org/copy-constructor-in-java/)

## Generic classes 

## Interfaces

## Abstract classes

# Collections


### Vectors

| Method | description |
| --- | --- |
| Vector()										|										|
| Vector(int size)								|										|
| Vector(Collection c)							|										|
| boolean add(Object obj)						|										|
| void add(int index, Object obj)				|										|
| boolean addAll(Collection c) 					|										|
| boolean addAll(int index, Collection c)		|										|
| void clear() 									|										|
| Object clone()								|										|
| boolean contains(Object o)					|										|
| Object get(int index)							|										|
| int indexOf(Object o)							|										|
| boolean isEmpty()								|										|
| int lastIndexOf(Object o)						|										|
| boolean remove(Object o)						|										|
| boolean equals(Object o) 						| content comparison of two vectors		|
| Object firstElement()							|										|
| void trimToSize()								|										|
| String toString()								|										|
| object[] toArray()							|										|
| int size()									|										|

[GFG](https://www.geeksforgeeks.org/java-util-vector-class-java/)

### LinkedList

| Method | description |
| --- | --- |
| boolean add(E e) 		  		| same as addLast only return boolean 	|
| void add(int index, E s) 		| same as insert()    				 	|
| void addFirst(E e) 	  		| same as push_front()                 	|
| void addLast(E element) 		| same as push_back()					|
| int size() 					| same as c++							|
| void clear() 					| same as c++							|
| void removeFirst()			| same as pop_front()					|
| void removeLast()				| same as pop_back()					|
| E getFirst() 					| same as front()						|
| E getLast() 					| same as bacck()						|
| Object get(int index) 		|										|
| E indexOf(Object element) 	|										|
| Object remove(int index)		| 										|

References :
Same as [cpp list](http://www.cplusplus.com/reference/list/list/)
### Stack
| Method | description |
| --- | --- |
| st.search() 					| not available in c++					|
| st.peek()						| same as c++ st.top()					|
| st.push()						|										|
| st.pop()						|										|
| st.empty()					|										|

References:
[JavaDoc](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html)
[GFG](https://www.geeksforgeeks.org/stack-class-in-java/)
plus all the methods of vector class

### Arrays

### Sets


### HashMaps

