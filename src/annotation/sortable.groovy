package annotation

import groovy.transform.Sortable
import groovy.transform.Canonical

@Sortable(includes=["b"])
@Canonical(excludes=["b"])
class Service {
  int a // def cant be use with sortable, actual datatype are required
  int b
  String c
}

Service s1 = new Service(10, 'a')
Service s2 = new Service(34, 'b')
Service s3 = new Service(4, 'd')
Service s4 = new Service(5, 'e')

def s = [s1,s2,s3,s4]

println s
println s.toSorted()

