// grrovy bean
Expando e = new Expando()
e.name = "abhi"
e.myName = { -> println "$name" }
e.myName()

// this same thing will not happen with normal groovy class
class DemoMetaClass {

}

DemoMetaClass a = new DemoMetaClass()
// we cant add a property on a object. We can only update the value using setter.
// this is possible using grrovy bean class
// or by using metaClass
// below two line will throw error
// a.name = "abhi"
// println a.name

// however below is possible
// this will add a method to every instance of the class.
a.metaClass.name = 'Su'
println a.name