# Groovy

- optionally typed, dynamic language.
- inspired Python, Small talk.
- aligned to java(java-like-syntax).
- very very popular, and most downloaded in 2018.

## Documentation

[Official documentation](http://groovy-lang.org/documentation.html)

## Advantage of groovy

- Saves lot of time on import. Many file are imported automatically.
  - java.lang, java.util, java.io, java.net, groovy.lang, groovy.util, BigInteger, BigDecimal.
- Can sometime be treated as scripting language as well.
  - we directly execute the print statement, with a class. This internally gettin wrapped in a class, and puts the body in the run method.
- Everything is treated as object. Consistency let you learn this language easily.

## Groovysh

- This is usefull if you want to evaluating small groovy expression.
- It's a command line(shell) tool for writing groovy line.
- Multiple line is supported.
  - Groovy will automatically try determine the syntax, and understand the EOL. If not, you can continue in the next line as well.
- start:

```sh
groovysh
```

- quit/exit: `:q` or `:x`
- help: `:h`

- For example:

```groovy
def hello(name) {
  println "hello, $name"
}

hello('abhishek')
```

## Groovyc

- It's similar to javac. Its changes goovy source code into **java** byte code.
- **Important to note**: *There is a difference between executing a java complied file and groovy compiled file. The difference is that we have to include groovy jar file in the class path.*

```sh
java -cp /path/to/groovy/jar: GroovyProgram
```

- The file will be in `.class` file.
- To **compile all groovy** file in a  directory `groovyc *.groovy`.
- To compile and set destination of the file other that source directory: `groovy -d classes *.groovy`.

## GrrovyConsole

It's similar to GUI for groovysh.

```sh
groovyConsole # empty
groovyConsole fileName # file name is open
```

## Programming

### Module

- Import a package which are not imported by default.

```groovy
import groovy.xml.*
```

### Keywords

- Java keywords + groovy keywords.

### Comments

- Single line `//`
- Milti line `/* */`
- Groovy doc `/**   */
- Shebang `#!/usr/bin/env groovy`
  - this will run as executable, but this will not run if executable permission are not given.

### Assertion

- We can put anywhere in the code. Not only in our test.
- It returns false and throws an exception.

```groovy
assert true
assert 1 == 1

def a = 1
assert a == 3

assert false

def b = [1, 2, 3, 4,5]
assert (b << 1) == [6, 7, 8, 9]
```

### access specifier

- By default everything is public. For eg: `examples` and `methods`.
- Few exceptions: class property are by default private.

### accessing varibles (Interpolation)

- its very similar to javascript template string. refer `datatype/string`

### classes

- very similar to java classes.
- differences:
  - same file names are not required.
  - file can contain one or more classes, but file without any classes are called scripts.
  - after compiling we will have class files, incase of multiple classes in a file, it will generate multiple .class files from a single file.
  - get and set shorthand. Really you dont have to use set or get method, you can really use it as if member of the class.
  
  ```groovy
    class Emp {
      String a = ""
      String b = ""
    }

    def employee = new Emp();
    employee.a = "Abhishek"
    employee.setB('Das);
  ```

  - cannot instantiate a class in the same file with same filename. [Under the hood: If we are defining a class in the same file, as said before script will be wrapped in a class, and there is already a class. This will create a duplicate class with same name in the file and throws error.]

### Interface

- Interface defines a contract that a class need to confirm.
- defines a list of method, however the methods are implemented by a class.
- Interface and methods are by default **public**.
- Interface methods can't be **private or protected**.
- Class inherits a interface using a keyword called **implements**.
- Any instance of class implementing a interface, then class instance also becomes interface instance.

```groovy
interface Greeter {
  void sayHi()
}

class Greet implements Greeter {
  void sayHi() println "Hello from Greet"
}

def greet = new Greet()
assert greet instanceof Greet
assert greet instanceof Greeter
```

- An interface can inherit another interface using the keyword `extends`.

### Datatype

- Groovy is an optionally typed, we may not specify the datatype. Use the keyword `def`.
- We have 15 primitive datatype in java. 8 are primitive, 7 are collection and String.

#### Primitive datatype

- they are same as Java. `byte`, `char(16 bit)`, `boolean`, `float(32 bit)`, `double(64 bit)`, `byte(8 bit)`, `short(16 bit)`, `int(32 bit)` and `long(64 bit)`.
- However they are wapped as object automatically like javascipt.
- Hence all data have methods attached with them. For example: `1.intdiv(2)`, `2.5.toInteger()`, `'str'.isNumber()`.

**Numbers** : refer `src/numbers.groovy`

#### Collections

- Range:
  - number or alphabets.
  - itrable value number and alphabets.
  - we could do forward itration or reverse.

- List:
  - no separate implementation of Groovy.
  - However the syntax is bit differnt.
  - List are class are implemented using `ArrayList`, `LinedList`, `Set`, `SortedSet`.

- Map:
  - also known as dictionary in some languages.
  - they are key value pair.
  - Even for Map there are multiple implementation. like `LinkedHashMap`.

#### Strings

- Three type of string:
  - Single quote: 'abhishek'
  - Double quote: "abhishek"
  - Triple quote: '''abhishek''' [they are similar to template string in javascript, can span over multiple line.]
- Support escape sequence. For example: `\$` for dollar sign.
- Support unicode character: For example: `\u20AC`
- Interpolation are allowed in any type of string. It can be `$a` or `${a+b}`. Only `$` is allowed for dotted expression. like `$a` or `$a.b` or `$a.b.c`

### Conditional statements

- if
- if else
- else if ladder
- switch case

For **multiline use curly brace** else its not required. But its suggested. Similar to javascript.

refer `src/conditional.groovy`.

### Truthy (Groovy truth)

Below all evaluate to true

- Boolean value true
- Macher has a match
- Collection is not empty
- Map is not empty
- String is not empty
- Number is not 0
- Obj reference is not Null.

### loop statements

- while
- for
- for in
- for each
- each
- upto / downto
- times
- step

refer `src/loopStatement.groovy`

### annotation

- Annotation helps in chaning our code automatically.
- For example when you have a normal class and you what to add bunch of property like, final, private etc.
- We can obiously do that manually, but this gives an easy way to implement.
- This is also known as AST(abstrct syntax tree) transformation.
- Annotaation can be applied to variable, class and functions.

[Grrovy docs annotation](http://docs.groovy-lang.org/latest/html/documentation/#_annotation)

### operator

- **Arithmetic operator**: `+`, `-`, `*`, `/`, `%` and  `**` for eg, `2 ** 3` // 8.
- **Assignment arithmetic operator**: `+=`, `-=`, `*=`, `/=`, `**=` and `%=`.
- **Unary operator**: `+`, `++`, `-` and `--`.
- **Relational operator**: `==`, `!=`, `<`, `<=`, `>`, `>=`
- **Logical operator**: `&&`, `||` and `!`
- **Bitwise opertor**: `&`, `|`, `^` and `~`
- **Conditional operator**: `condition ? true : false`, `!`
- **Elvis operator**: `condition ?: false` used mainly for assigning default value.
- **Object access operator**: `@`, `?.`, `.&`
- **Regular expression**:
  - `~` *pattern operator* for eg: `~/foo/`, this becomes instance of a *java.util.regex.Pattern*.
  - `=~` *find operator*, returns a matcher, for eg
  - `==~` *match operator*, return a boolean. This for exact match

  ```groovy
  def f = "text to match" =~ /match/
  def m = "text to match" ==~ /match/

  assert f instanceof Matcher
  assert m instanceof Boolean

  if (!f)
    throw new RuntimeException("Oops, text not found!")
  if (m)
    throw new RuntimeException("Should not reach that point!")
  ```

- **Other operators**:
  - `*.` *spread operator*
  - `*` *spread in list, map*
  - `..` *range operator*
  - `<=>` *space ship operator*, delegation to compareTo().
  - `is` *identity operator* can check the value as well as reference similat to "===" in javascipt.
  - `as` *coerse operator* datatype which can't be converted to a datatype automatically. There are some rules defined for the conversion.
  - `<>` *diamond operator* "List<String> strings = new LinkedList<>()"
  - `()` *call operator*

- Operator can be overloaded, easily as we know name of each operator. Like `+` is plus, so if we define the function `plus`, then I can easily do it.

### Closures

- they are first class citizen in Groovy.
- they are objects.
- they can be nested.
- Closure are used for:
  - iterate
  - callback
  - higher ordr function
  - specific control structure
  - builders
  - resource allocation
  - threads
  - DSLs
  - interface
  - functional programming
- In groovy there is a class called `Closure`.
- normal function cant be passed along(they are not objects), however closure are simiar to javascript function.
- `it` is a keyword used inside a closure to access the current element. This wont work if we mention any parameter.
- there are inbuilt attribute like `maximumNumberOfParameters` , `parameterTypes`.
- no argument closure look something like this. `{ -> statement.. }`

- **this** inside a closure resolves to class enclosing it.
- **owner** resolves to corrosponding object where closure is defined. The object can be a class or a parent closure.
- **delegate** resolves to a third party object, where method calls or properties are resolved. Usually owner and delegate are same.

### function

- varargs `...` the variable name should be agrs.
- default value are allowed.
- they are not objects like in javascript.

### Exception

similar to java. Refer `src/exception.groovy`

### Package

- we can package groovy script just like java.
- use the keywork `package package.name`.

### Trait

- its add capability to class.
- use the keyword `trait`.
- definition is similar to interface, but it allow u to implement functions and properties.
- best practice: name to start with capital letter.
- traits are implemented by class.
- we can define abstract method, but then its mandetory for the class to imlement it. But normal method are optional to override.

### Groovy Bean

- they are class with properties.
- purpose: TDL

## Meta Programming

- before doing some action such as calling a function, reading a property or writing a property we can do certain thing.
- Examples:
  - invokeMethod: refer `/src/invokeMethod.groovy`
  - getProperty: refer `/src/getProperty.groovy`
  - propertyMissing: refer `/src/propertyMissing.groovy`
  - methodmissing: refer `/src/methodmissing.groovy`
  - setProperty: refer `/src/setProperty.groovy`

### metaClass

- each object has a default property called `metaClass`
- and that property have many cool stuff.

### Expando

- this is an automatially created groovy bean class.
- refer `src/meta/metaClass.groovy`.
- allow to add properties and method to a class dynamically.

### category

- Few category are defined in the groovy language. You can also define your category.
- there is a disadvantage in adding method to any class using `metaClass` is not suggested. For example we can add methods to String class. :(
- To overcome this problem, category comes into picture. This will allow you to add method to a limited scope not globally for all the instance of the class.
- Convension to end category class with name `Category`.
- Use `use` keyword to access category class.

### Compile time metaprogramming

AST transformation.Refer `/src/annotation/*` package.

### Builder

These are also differnt type of annotation used in groovy. Refer `/src/builder/*`.

## Package/dependency management

- this a annotation.
- you can pass it in `@grab` annotation.
- This will download when the module do not exist in the class path.

```groovy
@grapes(
  @grab(group='org.apache.commons', module='commons-lang4', version='3.4')
)
```

## Jenkins

To create and write pipeline-library please refer [official documentation-1](https://jenkins.io/doc/book/pipeline/shared-libraries/).
[Pipeline syntax](https://jenkins.io/doc/book/pipeline/syntax/)
