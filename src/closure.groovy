def a = {}
println a.class
println a instanceof Closure

// a simple closure
Closure b = { name -> // args
  println name // closure body starts
}

b("abhi")

// multiple parameter

def greet = { String message = "morning", String name = "abhi" -> 
  println "$message $name"
}

greet("hello", "abhi")
greet("morning")

// var args

def printall = { String... args ->
  println args
}

printall('abhi', 'su', ' malpa')

// findall is a good closure condition [javascript forEach]

def newList = [1,2,3,4,5,6,7,8].findAll {
  it % 2 == 0
}

println newList

// collect [javascript map]

def multipiedByTwo = [1,2,3,4,5,6,7,8].collect {
  it * 2
}

println multipiedByTwo