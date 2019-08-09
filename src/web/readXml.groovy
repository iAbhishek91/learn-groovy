
def dataList = new File('src/web/test.xml').readLines()

def data = ''

dataList.each { d ->
  data = data + d
}


def employees = new XmlSlurper().parseText(data)
println employees.employee[2].name