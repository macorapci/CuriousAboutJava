# CuriousAboutCoding
This repo is created for training. 
Select a topic (ex. `01-declare-and-initialize`) and try to answer these questions:
- Will `javac x.java` run successfully?
- What's will be output?

## Topics:
- [Declare And Initialize](https://github.com/macorapci/CuriousAboutCoding/tree/master/01-declare-and-initialize/README.md)
- [Static](https://github.com/macorapci/CuriousAboutCoding/tree/master/02-static/README.md)
- [Declare Constructor](https://github.com/macorapci/CuriousAboutCoding/tree/master/03-declare-constructor/README.md)
- [Overloading](https://github.com/macorapci/CuriousAboutCoding/tree/master/04-overloading/README.md)
- [Object Oriented](https://github.com/macorapci/CuriousAboutCoding/tree/master/05-object-oriented/README.md)
- [Exception](https://github.com/macorapci/CuriousAboutCoding/tree/master/06-exception/README.md)

## Java Version
 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Scripts:
- For creating `README.md` files, u can use this command: `find ./01-declare-and-initialize/ -name "*.java" | sort | java -jar ./scripts/RunCommand-0.0.1.jar Main | sort | java -jar ./scripts/File-0.0.1.jar Main > output.txt`
