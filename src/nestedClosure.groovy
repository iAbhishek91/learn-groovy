def parentclosure = {
  println "PARENT ${this.class.name}"
  println "PARENT ${owner.class.name}"
  println "PARENT ${delegate.class.name}"
  def childClosure = {
    println "CHILD ${this.class.name}"
    println "CHILD ${owner.class.name}"
    println "CHILD ${delegate.class.name}"
    def grandChildClosure = {
      println "GRAND CHILD ${this.class.name}"
      println "GRAND CHILD ${owner.class.name}"
      println "GRAND CHILD ${delegate.class.name}"
    }
    grandChildClosure()
  }
  childClosure()
}

parentclosure();