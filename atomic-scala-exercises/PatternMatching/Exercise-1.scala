import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  if      (color == "red") { "RED" }
  else if (color == "blue") { "BLUE" }
  else if (color == "green") { "GREEN" }
  else    { "UNKNOWN COLOR: " + color }
}

matchColor("white") is "UNKNOWN COLOR: white"
matchColor("blue") is "BLUE"
