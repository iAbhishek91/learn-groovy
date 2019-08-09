// this annotation allow the class to follow a singleton design pattern
// - cant have multiple instance, only one instance is allowed
package annotation

import groovy.transform.*

@Singleton
class Service {
  def a = 10
  def b = null
  def c = 20
}

// Service s1 = new Service(60, 70, 'abhi') // this will throw error
Service s2 = Service.instance

println s2.toString()
