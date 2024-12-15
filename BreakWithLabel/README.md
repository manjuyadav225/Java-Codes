# Break With Label Explanation

## Code Overview

The following Java program searches for a value in a 2D array and prints the coordinates of that value if found.

### Code:

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        // 2D array initialization
        int[][] arrayOfInts = {
            {2, 4, 8, 16},
            {4, 8, 16, 32},
            {12, 24, 48, 96}
        };

        int searchFor = 12;  // Value to search for
        int i, j = 0;  // Indices for looping
        boolean foundIt = false;  // Flag to indicate if value is found

        // Loop through the 2D array
        for(i = 0; i < arrayOfInts.length; i++) {
            for(j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;  // Set found flag
                    break;  // Exit inner loop
                }
            }
        }

        // Output the result
        if (foundIt)
            System.out.println("Found " + searchFor + " at " + i + "," + j);
        else
            System.out.println(searchFor + " not in the array");
    }
}
_Output : Found 12 at 3,0_

**Code Explanation**
Array Initialization:
The program defines a 2D array arrayOfInts:
int[][] arrayOfInts = {
    {2, 4, 8, 16},
    {4, 8, 16, 32},
    {12, 24, 48, 96}
};
This array has 3 rows and 4 columns:
arrayOfInts = {
    {2, 4, 8, 16},
    {4, 8, 16, 32},
    {12, 24, 48, 96}
}

Search Setup:
The program sets up a value 12 to search for in the array:
int searchFor = 12;
The variables i and j track the indices of the row and column. The foundIt flag is used to check whether the target value has been found.

**_Loop to Search the Array:_**
The program uses two nested for loops to iterate over the rows and columns:
for(i = 0; i < arrayOfInts.length; i++) {
    for(j = 0; j < arrayOfInts[i].length; j++) {
        if (arrayOfInts[i][j] == searchFor) {
            foundIt = true;
            break; // Exits only the inner loop
        }
    }
}
Outer loop: Iterates through the rows (i runs from 0 to 2).
Inner loop: Iterates through the columns (j runs from 0 to 3).
If the value 12 is found, the flag foundIt is set to true, and the program breaks out of the inner loop. However, the outer loop continues running.
Output:
After both loops finish, the program checks if the value was found:
if (foundIt)
    System.out.println("Found " + searchFor + " at " + i + "," + j);
else
    System.out.println(searchFor + " not in the array");

_**Output Explanation**_
The target value 12 is located at arrayOfInts[2][0] (third row, first column).
When the inner loop finds 12, it sets foundIt = true and breaks out of the inner loop. The outer loop, however, continues running.
By the time the outer loop finishes, i has the value 3 (since it completes all three iterations) and j is 0 (because the 12 was found in the first column).
Thus, the program will print:
       **Found 12 at 3,0**
Issue:
The output incorrectly reports "Found 12 at 3,0" instead of the correct coordinates "2,0".
This happens because the break statement only exits the inner loop, but not the outer loop.
Suggested Fix:
To correctly break out of both loops and print the correct coordinates, you can use a labeled break statement:

**Updated Code with Labeled Break**:
search: 
  for (i = 0; i < arrayOfInts.length; i++) 
  {
    for (j = 0; j < arrayOfInts[i].length; j++) 
    {
        if (arrayOfInts[i][j] == searchFor) 
        {
            foundIt = true;
            break search;  // Exit both loops
        }
    }
}
With this change, the program will break out of both loops, and the output will correctly print:
Found 12 at 2,0

_**Conclusion**_
This program demonstrates the use of nested loops to search for a value in a 2D array. However, the way the loops are structured can lead to incorrect output due to the behavior of the break statement. A labeled break can resolve this issue and produce the correct result.

_**referece**_ : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html


