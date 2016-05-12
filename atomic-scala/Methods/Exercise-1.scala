def isSquare(num:Int):Int = {
    num * num
}

val a = isSquare(3)
println(a)
assert(a == 9, "Returned value did not match expected value")

val b = isSquare(6)
println(b)
assert(b == 36, "Returned value did not match expected value")

val c = isSquare(5)
println(c)
assert(c == 25, "Returned value did not match expected value")
