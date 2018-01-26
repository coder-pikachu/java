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
7. boolean (bit ?)
8. char (2)

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
## Threads

## Apache

## Unit Testing


## Enums 

## Synchronisation


## Exceptions

## Access Modifiers


## Method Overriding

## Method Overloading 

## Inner classes 

## constructors

## Generic classes 

## Interfaces

## Abstract classes

# Data Structures

## Linkedlist 

## Arrays

## Sets


## HashMaps


