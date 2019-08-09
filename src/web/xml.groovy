import groovy.xml.MarkupBuilder

// there are multiple method to format the output please refer documentation
FileWriter writer = new FileWriter('src/web/test.xml')
MarkupBuilder builder = new MarkupBuilder(writer)
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

builder.employees {
  employee(id:1) {
    name "abhishek das"
  }
  employee(id:2) {
    name "akash das"
  }
  employee(id:3) {
    name "subrata das"
  }
  employee(id: null) {
    name ""
  }
}