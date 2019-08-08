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

// times
20.times {
  print '*'
}
println ""

// upto/downto
2.upto(10) {
  num -> print num
}
println ""
10.downto(5) {
  num -> print num
}
println ""

//step
1.step(2, 0.2) {
  num -> print "$num, "
}
println ""

//each
[1,2,3,4,5,6,7].each {
  println it
};

// each with index
[1,2,3,4,5,6,7].eachWithIndex { def data, def i ->
  println "$i $data"
};

// try any, 