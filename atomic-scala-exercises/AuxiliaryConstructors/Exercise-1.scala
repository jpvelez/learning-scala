// import com.atomicscala.AtomicTest._

class ClothesWasher(val model:String, val capacity:Double) {
  def this(model:String) = {
    this(model, 1)
  }

  def this(capacity:Double) = {
    this("Unknown", capacity)
  }

  def this() = {
    this("Unknown", 2)
  }
}

val w1 = new ClothesWasher
val w2 = new ClothesWasher("allInOne")
val w3 = new ClothesWasher(3.6)

assert(w1.model == "Unknown" && w1.capacity == 2, "Error")
assert(w2.model == "allInOne" && w2.capacity == 1, "Error")
assert(w3.model == "Unknown" && w3.capacity == 3.6, "Error")
