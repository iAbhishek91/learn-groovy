class DemoMethodMissing {
  def myMethod1() {
    println 'my method-1'
  }

  def myMethod2() {
    println 'my method-2'
  }

  def methodMissing(String name, Object args) {
    println "my missing method $name"
  }
}

DemoMethodMissing obj = new DemoMethodMissing()
obj.myMethod1()
obj.myMethod2()
obj.myMethod3()