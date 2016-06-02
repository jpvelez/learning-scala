name := "Programming MapReduce with Scalding"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.twitter" %% "scalding-core" % "0.15.0",
  "org.apache.hadoop" % "hadoop-core" % "1.1.2"
)
