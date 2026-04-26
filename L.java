/*
How a Java Program Runs

1. Write Java source code in a file with extension .java.
   Example filename: L-2.java

2. Compile the source code using the Java compiler.
   Command: javac L-2.java
   - This creates a bytecode file named L-2.class.

3. Run the Java program using the Java Virtual Machine.
   Command: java L-2
   - The JVM loads the bytecode and executes it.

Why Java has two steps:
- Java source code is human-readable text.
- The compiler turns it into bytecode, which the JVM can run.
- The JVM makes Java programs work on many computers.

Example flow:
  Source code (.java) -> Compiler -> Bytecode (.class) -> JVM -> Program runs

Important terms:
- Source code: Java code you write.
- Compiler: Tool that converts source code into bytecode.
- Bytecode: Platform-independent code stored in .class files.
- JVM: Java Virtual Machine that runs bytecode.
*/

public class L-2 {
    public static void main(String[] args) {
        System.out.println("Java program is running!");
    }
}
