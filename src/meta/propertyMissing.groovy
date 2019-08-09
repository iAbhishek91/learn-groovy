def class DemoPropertyMissing {
  // every property missing is handled by this method
  def propertyMissing(String name) {
    return "$name is undefined"
  }

  def a = 10
  def b = 20
}

def obj = new DemoPropertyMissing()

println obj.a
println obj.b
println obj.c