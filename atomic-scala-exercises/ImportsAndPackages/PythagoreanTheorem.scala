package pythagorean
import scala.math.pow
import scala.math.sqrt

class RightTriangle {
  def hypotenuse(a:Double, b:Double):Double = {
    sqrt(pow(a, 2) + pow(b, 2))
  }
  def area(a:Double, b:Double):Double = {
    (a * b) / 2
  }
}
