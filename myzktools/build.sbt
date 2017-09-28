name := "MyZkTools"
version := "1.1"
scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0" % "provided" 
libraryDependencies += "org.apache.kafka" %% "kafka" % "0.11.0.1"
//libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.11.0.1"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.1.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.3"
libraryDependencies += "commons-cli" % "commons-cli" % "1.4"


assemblyMergeStrategy in assembly := {  
	case PathList("META-INF", xs @ _*) => MergeStrategy.discard
	case x => MergeStrategy.first
}