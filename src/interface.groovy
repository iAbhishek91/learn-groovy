interface Greeter {
  void sayHi()
}

interface Morning extends Greeter {
  void sayGM()
}

class Greet implements Greeter {
  void sayHi() {
    println "Hello from Greet"
  }
}

class GreetMorning implements Morning {
  void sayHi() {
    println "Hello from GreetMorning"
  }

  void sayGM() {
    println "Good morning from GreetMorning"
  }
}

def greet = new Greet()
def instanceOfClass = greet instanceof Greet
def instanceOfInterface = greet instanceof Greeter

println "$instanceOfClass and $instanceOfInterface"

def morning = new GreetMorning()
def instanceOfParentInterface = morning instanceof Greet
def instanceOfChildInterface = morning instanceof Morning
def instanceOfClass1 = morning instanceof GreetMorning

assert morning instanceof Morning

println "$instanceOfParentInterface and $instanceOfChildInterface and $instanceOfClass1"