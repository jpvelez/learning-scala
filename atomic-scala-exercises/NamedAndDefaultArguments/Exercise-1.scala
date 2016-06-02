import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val seconds: Int)

val t = new SimpleTime(hours=5, seconds=30)
t.hours is 5
t.seconds is 30
