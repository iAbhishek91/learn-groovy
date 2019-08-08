// blank list
def blankList = []


// an list
ArrayList list1 = [1,2,3,4,5,6]
List list2 = [4,5,6,7,8,9]
List list3 = [10, 11, 12, 13] as ArrayList
List list4 = [10, 11, 12, 13] as LinkedList
List list5 = [39, 49, 59, 60] as SortedSet
List list6 = [39, 49, 59, 60] as Set

// few methods

// add

list1.push(99)
println list1

list1.putAt(0, 77)
println list1

list1 = list1 + [88, 77]
println list1

list1 = list1 << 55
println list1

// similarly we have pop, shift and many more