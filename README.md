# pwr_s3_tp_lab1
PWr - 3 Semestr - Technologie Programowania (Programming Technologies) - Laboratories list 1

**Language:**

<p>
  <a href="https://www.java.com" target="_blank" rel="noreferrer"> 
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> 
  </a>
  <a href="https://maven.apache.org/" target="_blank" rel="noreferrer"> 
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/python/maven-original.svg" alt="maven" width="40" height="40"/> 
  </a>
</p>

<br />
<br />

> To run the project you must have [Maven](https://maven.apache.org/) installed.
>
> Download instructions can be found [here](https://maven.apache.org/download.cgi)

<br />
<br />

### **Running the project**


1. Opan `Git Bash` or any type of command line capable of executing git

2. Enter the directory you want to keep the project files:
```
cd <project_dir>
```

3. Clone the project repository:
```
git clone https://github.com/SpectraL519/pwr_s3_tp_lab1.git
```

4. Enter the `PositionalSystems` folder:
```
cd PositionalSystems
```

5. *Optional:* Check the project source code using PMD and Checkstyle:
```
mvn site
```

6. Build the maven package:
```
mvn package
```

7. Execute the project code:
```
java -cp target/PositionalSystems-1.0-SNAPSHOT.jar com.PWr.app.App
```

