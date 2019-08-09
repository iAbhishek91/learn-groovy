import groovy.json.JsonSlurper

JsonSlurper slurper = new JsonSlurper()
def tree = slurper.parse(new File('src/web/test.json'))

println tree.books.book.name