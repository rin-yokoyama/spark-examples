name := "example-scala-udf"
version := "1.0"
scalaVersion := "2.13.16"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided"
)