// import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 1,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  val caf = shots - decaf
  var result = ""
  println(shots, caf, decaf, milk, toGo, syrup)
  def getCup(): Unit = {
    if (toGo) result += "ToGoCup "
    else result += "HereCup "
  }
  def pourShots(): Unit = {
    for (s <- 0 until caf)
      result += "shot "
    for (s <- 0 until decaf)
      result += "decaf shot "
  }
  def addMilk = { result += "milk " }
  def addSyrup = result += syrup
  getCup()
  pourShots()
  addMilk
  addSyrup
}
val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=1)
assert(doubleHalfCaf.shots == 2, "error")
assert(doubleHalfCaf.caf == 1, "error")
assert(doubleHalfCaf.decaf == 1, "error")
assert(tripleHalfCaf.shots == 3, "error")
assert(tripleHalfCaf.caf == 2, "error")
assert(tripleHalfCaf.decaf == 1, "error")
