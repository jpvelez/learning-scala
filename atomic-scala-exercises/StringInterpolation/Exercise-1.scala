import com.atomicscala.AtomicTest._

class Gnome(val height: Double, val weight: Double, val happy: Boolean) {
  val painted = true
  def this(height: Double) = this(height, 100.0, true)
  def this(name: String) = this(15.0)
  def show():String = s"${height} ${weight} ${happy} ${painted}"
}

val gnome = new Gnome(20.0, 110.0, false)
gnome.show is "20.0 110.0 false true"

val bob = new Gnome("Bob")
bob.show is "15.0 100.0 true true"
