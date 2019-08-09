// groovy is dynamically typed but we  can make typechecked
// wrong proprty will not throw error, however this AST will give
package annotation

import groovy.transform.TypeChecked

@TypeChecked
class Service {
  int a = 10

  int getA() {
    a
  }
  
}

Service s = new Service()

println s.a