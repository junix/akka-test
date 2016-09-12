name := "akka-test"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.url("Typesafe Ivy Snapshots Repository",
  url("https://oss.sonatype.org/content/repositories/snapshots/"))(Resolver.ivyStylePatterns)

// "org.mybatis.scala"   % "mybatis-scala-core_2.11" % "1.0.3",

libraryDependencies ++= Seq(
    "com.lihaoyi"       % "ammonite_2.11.7"                      % "0.7.4"     % "test" ,
    "com.typesafe"      % "config"                               % "1.3.0"              ,
    "org.scalaz"        %% "scalaz-core"                         % "7.2.5"              ,
    "com.typesafe.akka" %% "akka-actor"                          % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-agent"                          % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-camel"                          % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-cluster"                        % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-cluster-metrics"                % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-cluster-sharding"               % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-cluster-tools"                  % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-contrib"                        % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-core"                      % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-testkit"                   % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-multi-node-testkit"             % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-osgi"                           % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-persistence"                    % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-persistence-tck"                % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-remote"                         % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-slf4j"                          % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-stream"                         % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-stream-testkit"                 % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-testkit"                        % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-distributed-data-experimental"  % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-typed-experimental"             % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-experimental"              % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-jackson-experimental"      % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental"   % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-http-xml-experimental"          % "2.4.10"             ,
    "com.typesafe.akka" %% "akka-persistence-query-experimental" % "2.4.10"
  )

initialCommands in (Test, console) := """ammonite.Main().run()"""
