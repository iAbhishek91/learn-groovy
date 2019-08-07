// simple if statement
if (true)
  println "true section"

// multiline if statement
if (true || "abhi") {
  println "true section"
  println "both the condition resolves to true"
}

// all these resolves to false
if ( !(false || null || "" || []) )
  println "false section made true"

// if-else statements
int a = 10
if ( a >= 10 )
  println "value is greater than equal to 10"
else
  println "value is less than 10"

// else if ladder
int b = 25
if ( b == 20 ) {
  println "value of b is $b"
} else if ( b == 21 ) {
  println "value of b is $b"
} else if ( b == 22 ) {
  println "value of b is $b"
} else {
  println "value of b is NOT 20, 21 or 22"
}

// switch
int c = 35
switch(c) {
  case 30:
    println "value of c is $c"
    break
  case 31:
    println "value of c is $c"
    break
  case 32:
    println "value of c is $c"
    break
  default:
    println "value of c is NOT 30, 31 or 32"
    break
}

