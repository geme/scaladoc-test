name := "scaladoc-test"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions in (Compile, doc) ++= Seq("-doc-generator", "com.example.doclet.MyDoclet")
scalacOptions in (Compile, doc) ++= Seq("-toolcp", "./target/scala-2.12/classes")