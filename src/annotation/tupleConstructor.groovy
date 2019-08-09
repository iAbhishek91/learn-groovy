package annotation

import groovy.transform.*

@ToString(excludes=["c"])
@TupleConstructor
class Service {
  def a = 10
  def b = null
  def c = 20
}

Service s = new Service(60, 70, 'abhi')

println s.toString() // name of the parameter wasnot mentioned