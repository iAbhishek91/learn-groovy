def foo () {
  throw new Exception('foo exp')
}

def bla () {
  try {
    foo()
  } catch (Exception | NullPointerException e) {
    println 'exp thrown'
  }
}

bla()