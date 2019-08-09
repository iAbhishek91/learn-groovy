// this annotation are combination of toString, equalAndHash and TupleConstructor

package annotation

import groovy.transform.*

@Canonical
class Service {
  def a = 10
  def b = null
  def c = 20
}

Service s1 = new Service(60, 70, 'abhi')
Service s2 = new Service(60, 70, 'abhi')

println s1.toString() // name of the parameter wasnot mentioned
println s1 == s2