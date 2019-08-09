import groovy.json.JsonBuilder

// there are multiple method to format the output please refer documentation
JsonBuilder builder = new JsonBuilder()

builder.books {
  book {
    name "Think and grow rich"
  }
}

println builder.toString()
println builder.toPrettyString()
new File('src/builder/test.json').write(builder.toPrettyString())