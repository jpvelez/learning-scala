import com.atomicscala.AtomicTest._

class Overloading1 {
  def f(): Int = { 88 }
  def f(n: Int): Int = {
    n + 2
  }
}

class Overloading2 {
  def f = 99
  def f(n: Int) = n + 3
}

val o1 = new Overloading1
val o2 = new Overloading2

o1.f is 88
o1.f(37) is 39
o2.f is 99
o2.f(93) is 96
