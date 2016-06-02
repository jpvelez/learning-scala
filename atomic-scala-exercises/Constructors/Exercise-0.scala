class Coffee(val shots:Int = 2,
             val decaf:Boolean = false,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  println(shots, decaf, milk, toGo, syrup)
  def getCup(): Unit = { 
    if (toGo) result += "ToGoCup " 
    else result += "HereCup "
  }
  def pourShots(): Unit = {
    for (s <- 0 until shots)
      if (decaf) result += "decaf shot "
      else result += "shot "
  }
  def addMilk = { result += "milk " }
  def addSyrup = result += syrup
  getCup()
  pourShots()
  addMilk
  addSyrup
}
val c = new Coffee
val c2 = new Coffee(shots=7, decaf=true, toGo=true, milk=true, syrup=c.result)
println(c.result)
println(c2.result)
