// for loop
for (int i = 0; i < 5; i += 1) {
  println "FOR LOOP: value of i is $i"
}


// for in
def arr = ['bmw', 'audi', 'RR']
for (element in arr) {
  println "FOR-IN LOOP: value of element is $element"
}

// for each
for (String element : arr ) {
  println "FOR-EACH LOOP: value of element is $element"
}

// while
def c = 5
while(c >= 0) {
  println "WHILE LOOP: value of c is $c"
  c -= 1
}

