def class DemoGetProperty {
  /*
  this method have overriden all the actual getter.
  Note: datatype of the argument is mandtory.
  */
  def getProperty(String name) {
    println "$name property is accessed"

    if (metaClass.hasProperty(this, name)) {
      // use the below line to get back the actual value of the property
      return metaClass.getProperty(this, name)  
    } else {
      println 'Property is NOT defined.'
      return 'UNDEFINED' // this value is returned for all the undefined property
    }
  }

  def a = "value of default parameter a"
  def b = "value of default parameter b"
  def c = "value of default parameter c"
}

def me = new DemoGetProperty()

// note default are not printed(printed as null), see meta programming
println me.a
println me.b
println me.c

println me.d // handled by metaClass