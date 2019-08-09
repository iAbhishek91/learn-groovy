class myCategory {
  static String shout(String str) {
    str.toUpperCase()
  }
}

use(myCategory) {
  println "abhi".shout() // same as shout("abhi")
}

// this below line will throw error
// println "abhi".shout()