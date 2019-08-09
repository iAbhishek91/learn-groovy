package annotation

import groovy.transform.ToString

@ToString(excludes=["c"])
class Service {
  def a = 10
  def b = null
  def c = 20
}

Service s = new Service()

println s.toString()