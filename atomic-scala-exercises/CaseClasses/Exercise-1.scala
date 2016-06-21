import com.atomicscala.AtomicTest._

case class Person(val first: String, val last: String, val email: String)

val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"
