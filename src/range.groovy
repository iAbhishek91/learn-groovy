def rangeNumber = 1..10
Range rangeNumberExlusive = 1..<10

Range rangeAlpha = 'A'..'S'
Range rangeAlphaExclusive = 'A'..<'S'

println rangeNumber.from
println rangeNumber.to

println rangeNumberExlusive.from
println rangeNumberExlusive.to

println rangeAlpha.from
println rangeAlpha.to

println rangeAlphaExclusive.from
println rangeAlphaExclusive.to

// contains: if the range contain a perticular value

println rangeNumber.contains(2)

// Date range
Date today = new Date()
def afterOneWeek = today + 7

Range oneCurrentWeek = today..afterOneWeek

println oneCurrentWeek.from
println oneCurrentWeek.to

// enum to range

enum weekdays {Mon, Tue, Wed, Thrus, Fri, Sat, Sun}
Range rangeWeekDays = weekdays.Mon..<weekdays.Sun

println rangeWeekDays.to