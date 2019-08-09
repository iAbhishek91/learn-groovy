def class MyClass {

  // for all undefined method this function will be called.
  def invokeMethod(String name, def args) {
    println "This $name is not defined. Argument passed: $args"
  }
  
  def greet () {
    println 'hello!'
  }
}

MyClass me = new MyClass()

me.greet()

me.methodNotDefined() // generally this should throw error, to handle this we can use meta programming