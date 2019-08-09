class DemoSetProperty {
  def a = 10

  void setProperty(String name, Object value) { // both the value are required
    this.@"$name" = 20
  }
}

DemoSetProperty r = new DemoSetProperty()
println r.a

r.a = 30

println r.a