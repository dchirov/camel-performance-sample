
# Apache Camel Performance for Simple Language
Java application for checking the performance of Apache Camel v3.4.3 routes that contain Simple language


## Building from Source
Clone the git repository using the URL on the GitHub home page:

```bash
$ git clone https://github.com/dchirov/camel-performance-sample.git
$ cd camel-performance-sample
```

### Command line

#### To build application on Unix
```bash
$ ./mvnw clean compile
```

#### To build application on Windows
```bash
$ mvnw.cmd clean compile
```

#### Java Flight Record configuration
All required JVM parameters have been already set in _camel-performance-sample/.mvn/jvm.config_ file:
```bash
-XX:FlightRecorderOptions=memorysize=50M,stackdepth=256 -XX:StartFlightRecording=disk=true,duration=1m,filename=application-recording.jfr,maxsize=100M
```
This setup starts a recording, collects info for duration (1 minute) and saves the content afterwards in: _camel-performance-sample/application-recording.jfr_.

For details about configuration see chapter: Advanced Runtime Options for Java: https://docs.oracle.com/en/java/javase/11/tools/java.html


#### Running camel-performance-sample with Java Flight Recording on Unix
```bash
$ ./mvnw camel:run
```

#### Running camel-performance-sample with Java Flight Recording on Windows
```bash
$ mvnw.cmd camel:run
```

#### Analysis
After downloading on a Windows platform the generated JFR file can be analyzed by:
https://www.oracle.com/java/technologies/jdk-mission-control.html
