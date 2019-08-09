import groovy.xml.MarkupBuilder

// there are multiple method to format the output please refer documentation
FileWriter writer = new FileWriter('src/builder/test.html')
MarkupBuilder builder = new MarkupBuilder(writer)
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

def list = [
  [id:1, name: 'abhishek das'],
  [id:2, name: 'akash das'],
  [id:3, name: 'subrata das'],
]
builder.html {
  head {
    title "my site"
  }
  body {
    list.each { e ->
      employee(id:e.id) {
        name e.name
      }
    }
  }
}