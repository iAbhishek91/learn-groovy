def myStr = "abhishek is learning groovy"

def res = myStr ==~ ~/abhishek/ ? 'yes' : 'no'
def res1 = myStr ==~ ~/abhishek is learning groovy/ ? 'yes' : 'no'
                                                      
println res
println res1


def a
def res2 = a ?: 'no'

println res2