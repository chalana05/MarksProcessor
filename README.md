# MarksProcessor - Java Program
Overview
This is a simple Java program that allows users to input six marks and performs various operations such as categorizing, calculating the average, finding the maximum and minimum, and sorting the marks in ascending order.

Features
Input Marks: Allows the user to input six marks.
Categorization:
Fails (marks below 40).
Passes (marks between 40 and 49).
2:2 (marks between 50 and 59).
2:1 (marks between 60 and 69).
First Class (marks 70 and above).
Compute Average: Calculates the average of the entered marks.
Find Maximum: Finds the highest mark among the entered marks.
Find Minimum: Finds the lowest mark among the entered marks.
Sort Marks: Sorts the marks in ascending order and prints the result.
How to Run
Prerequisites
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from here.
Steps to Run
Clone or Download the Repository:

If you cloned this repository or downloaded the code as a zip file, extract it to a folder on your computer.
Compile the Code:

Open a terminal or command prompt.
Navigate to the folder where the MarksProcessor.java file is located.
Run the following command to compile the code:
bash
Copy code
javac MarksProcessor.java
Run the Program:

After the compilation is successful, run the program with:
bash
Copy code
java MarksProcessor
Input Marks:

The program will prompt you to enter six marks one by one.
After all marks are entered, the program will print:
All the entered marks.
Number of marks that are categorized into different result categories (fail, pass, 2:2, etc.).
The average, maximum, and minimum marks.
Sorted marks in ascending order.
Sample Run
bash
Copy code
Enter mark 1: 45
Enter mark 2: 70
Enter mark 3: 65
Enter mark 4: 58
Enter mark 5: 30
Enter mark 6: 85

Marks entered: [45, 70, 65, 58, 30, 85]

Number of fails (below 40): 1
Number of passes (40-49): 1
Number of 2:2 (50-59): 1
Number of 2:1 (60-69): 1
Number of first class (70+): 2

Average mark: 58.83
Maximum mark: 85
Minimum mark: 30
Sorted marks: [30, 45, 58, 65, 70, 85]
Code Explanation
Main Method
The main method drives the program, starting with reading the marks from the user, and then invoking various methods to process and print the results.
Methods
computeAverage(int[] marks): Computes the average of the six entered marks and returns a double.
computeMax(int[] marks): Returns the maximum mark from the array.
computeMin(int[] marks): Returns the minimum mark from the array.
sortMarks(int[] marks): Sorts the marks in ascending order and returns the sorted array.
