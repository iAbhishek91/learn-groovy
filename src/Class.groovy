@groovy.transform.ToString
class FirstClass {
  String a, b
}

FirstClass a = new FirstClass(a: 10, b: 20)
println a

@groovy.transform.ToString
class SecondClass {
  String first, second

  SecondClass(fullName) {
    def splitName = fullName.split(' ')
    this.first = splitName[0]
    this.second = splitName[1]
  }

  def concat(String... args) {
    println args.length
  }
}

SecondClass me = new SecondClass("Abhishek Das")
println me
me.concat('a', "b", '''c''')