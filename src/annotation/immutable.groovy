// there are many thing which makes a class immutable
// basically a instance cant be modified once created.
// under the hood grrovy dont assign any setters for the properties

package annotation

import groovy.transform.Immutable

@Immutable
class Service {
  BigInteger a
  String b
}

Service s1 = new Service(1, "Abhi")
Service s2 = new Service(2, "Akash")

println s1.toString()
// below line will throw err as instances are immutable
// s1.a = 3
println s2.toString()