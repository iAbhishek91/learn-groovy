package annotation

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes=["c"])
class Service {
  def a = 10
  def b = null
  def c = 20
}

Service s1 = new Service()
Service s2 = new Service()

println s1 == s2 // without this annotation "EqualsAndHashCode" this line will fail