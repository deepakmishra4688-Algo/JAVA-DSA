# Lecture 1: Flowchart, Pseudocode, and Basics

## 1. What is an Algorithm?
- An algorithm is a step-by-step list of instructions to solve a problem.
- It is like a recipe for cooking: each step is clear and in order.
- Algorithms are the foundation of programming.

## 2. What is a Flowchart?
- A flowchart is a diagram that shows how a program or process works.
- It uses simple shapes to represent steps and decisions.
- Flowcharts help us understand the logic before writing code.

### Common Flowchart Symbols
- Oval: Start / End
- Rectangle: Process or action
- Diamond: Decision (yes or no)
- Arrow: Flow direction

### Example Flowchart: Add Two Numbers

```
   [Start]
      |
   [Input A]
      |
   [Input B]
      |
   [Sum = A + B]
      |
   [Display Sum]
      |
   [End]
```

## 3. What is Pseudocode?
- Pseudocode is a way to write the steps of an algorithm in plain language.
- It looks like code, but it is not tied to any programming language.
- Pseudocode is easy to read and helps plan the actual program.

### Example Pseudocode: Add Two Numbers

```
START
  READ number1
  READ number2
  sum = number1 + number2
  PRINT sum
END
```

## 4. Basic Concepts in Programming

### 4.1 Input and Output
- Input: data the program receives from the user or another source.
- Output: result the program shows or sends out.
- Example: Input two numbers, output the total.

### 4.2 Variables
- A variable stores a value.
- Think of it as a labeled box where you keep data.
- Example: `number1`, `number2`, `sum`.

### 4.3 Sequence
- Sequence means doing steps one after another.
- Most programs follow a sequence of actions.

### 4.4 Decision / Condition
- A decision checks if something is true or false.
- Example: If a number is greater than 10, do one action; otherwise, do another.

### 4.5 Repetition / Loop (Basic idea)
- Repetition means doing a step again and again.
- Example: Repeat until a condition is met.

## 5. Simple Example: Find the Larger Number

### Flowchart
```
   [Start]
      |
   [Read A]
      |
   [Read B]
      |
   [Is A > B?]--No-->[Print B is larger]
      |Yes
   [Print A is larger]
      |
   [End]
```

### Pseudocode
```
START
  READ A
  READ B
  IF A > B THEN
    PRINT "A is larger"
  ELSE
    PRINT "B is larger"
  ENDIF
END
```

## 6. How to Start from Zero for Java
- Start simple: learn the idea of input, output, variables, and decisions first.
- Think in steps: one action after another is the heart of every program.
- Use flowcharts and pseudocode to plan a program before jumping to real Java code.

### What you should use to learn Java
- Use simple examples: adding numbers, comparing values, and printing results.
- Use plain language to describe each step, like an IIT professor explaining with clear examples.
- Practice by writing the same idea in a flowchart, in pseudocode, and then in Java.
- Keep the first programs short and easy to follow.

### Tools that help beginners
- A text editor or IDE: for example, VS Code or IntelliJ IDEA.
- Java JDK installed on your computer so you can run Java programs.
- A simple way to compile and run: `javac` to compile, `java` to run.
- A notebook or paper to draw the flowchart first.

## 7. Starting Java with a Very Small Program
### Example: Hello World in words
- Step 1: Start.
- Step 2: Display the message "Hello, Java!".
- Step 3: End.

### Flowchart
```
   [Start]
      |
   [Print "Hello, Java!"]
      |
   [End]
```

### Pseudocode
```
START
  PRINT "Hello, Java!"
END
```

## 8. Simple Learning Advice
- Learn one concept at a time: first variables, then decisions, then loops.
- Always write the logic in words first.
- If a step is not clear, draw it as a flowchart.
- Repeat small examples many times until they feel easy.

## 9. Summary
- Flowcharts and pseudocode make programming easier.
- Flowcharts show the path of logic with shapes and arrows.
- Pseudocode writes the steps in simple words.
- Basic programming ideas: input, output, variables, sequence, decision, loop.
- To learn Java from zero, start with simple examples, draw the logic first, and use a beginner-friendly editor.

> Remember: Start from small ideas, practice step by step, and make sure you understand the logic before writing Java code.