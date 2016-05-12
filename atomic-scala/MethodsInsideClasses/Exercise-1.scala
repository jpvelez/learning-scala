class Sailboat {
  def raiseSails():String = { "Sails raised" }
  def lowerSails():String = { "Sails lowered" }
}

class Motorboat {
  def startMotor():String = { "Motor on" }
  def stopMotor():String = { "Motor off" }
}

def checkResult (result:String, expected:String) = {
  assert(result == expected, s"Expected $expected, Got $result")
}

val sailboat = new Sailboat
val r1 = sailboat.raiseSails
checkResult(r1, "Sails raised")

val r2 = sailboat.lowerSails
checkResult(r2, "Sails lowered")

val motorboat = new Motorboat
val r3 = motorboat.startMotor
checkResult(r3, "Motor on")

val r4 = motorboat.stopMotor
checkResult(r4, "Motor off")
