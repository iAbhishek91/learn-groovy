def map = [:] // blank map

println map
println map.getClass().getName()

LinkedHashMap myMap = [
  name: "abhi",
  last: "das",
  age: 29
]

println myMap
println myMap.last

// dynamic key

def keyEmail = "email"

Map me = [
  name: "abhi",
  last: "das",
  age: 29,
  (keyEmail): 'abhi.das2007das@gmail.com'
]

println me.email
println me.values()
// println me.keys()