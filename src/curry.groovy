// currying function, creating function from one another.

def a = { String msg, Date createdOn, Integer userId ->
  println "Message $msg, -$userId [$createdOn]"
}

def b = { String msg, Integer userId ->
  Date now = new Date()
  a(msg, now, userId)
}

// "curry" this method will take parameter in order LEFT
// "rcurry" this method will take parameter in order RIGHT
// "ncurry" this method will take parameter in order n
def c = a.ncurry(1, new Date());

b("I am learning Groovy", 8900319)
c("I am learning curry", 8900319)
