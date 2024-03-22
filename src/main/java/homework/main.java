package homework;

public class main {public static void main(String[] args) {
    //Q1
    String[] arrayOfNames = {"Jane", "Jack", "Jill", "Cesar"};
    int lastIndexPosition = getLastIndex(arrayOfNames);
    System.out.println("Q1: " + lastIndexPosition);

    //Q2
    String[] arrayOfNamesTwo = {"John", "Alex", "Mike", "Cesar"};
    int secondToLastIndex = getSecondToLastIndex(arrayOfNamesTwo);
    System.out.println("Q2: " + secondToLastIndex);

    //Q3
    String[] arrayOfNamesThree = {"John", "Alex", "Mike", "Cesar"};
    String firstElement = getFirstElement(arrayOfNamesThree);
    System.out.println("Q3: " + firstElement);

    //Q4
    String[] questionFour = {"John", "Alex", "Mike", "Cesar"};
    String lastElement = getLastElement(questionFour);
    System.out.println("Q4: " + lastElement);

    //Q5
    String[] questionFive = {"John", "Alex", "Mike", "Cesar"};
    String secondToLastElement = getSecondToLastElement(questionFive);
    System.out.println("Q5: " + secondToLastElement);

    //Q6
    int[] questionSix = {21, 44, 67, 88, 99};
    int sum = getSum(questionSix);
    System.out.println("Q6: " + sum);

    //Q7
    double[] questionSeven = {21, 44, 67, 88, 99};
    double average = getAverage(questionSeven);
    System.out.println("Q7: " + average);

    //Q8
    int[] questionEight = {21, 44, 67, 88, 99};
    String result = extractAllOddNumbers(questionEight);
    System.out.println("Q8: " + result);

    //Q9
    int[] questionNine = {21, 44, 67, 88, 99};
    String evenNumbersString = extractAllEvenNumbers(questionNine);
    System.out.println("Q9: " + evenNumbersString);

    //Q10
    String[] questionTen = {"John", "Alex", "Mike", "Cesar"};
    String nameToCheck = "Walter";
    String nameWithProperCapitalization = properCapitals(nameToCheck);
    boolean isPresent = contains(questionTen, nameWithProperCapitalization);
    if (isPresent) {
        System.out.println("Q10: " + isPresent);
    } else {
        System.out.println("Q10: " + isPresent);
    }

    //Q11
    String[] questionEleven = {"John", "Alex", "Mike", "Cesar"};
    String element = "Alex";
    int index = getIndexByElement(questionEleven, "Alex");
    System.out.println("Q11: Index of " + element + ": " + index);

    //Q12
    int start = 0; //start of range, start of index positions
    int end = 10;
    System.out.print("Q12: ");
    printOddNumbersInRange(start, end); //This line calls our custom method
    System.out.println();

    //Q13
    String questionThirteen = printGivenStringTimesNumberGiven("Hello", 3);
    System.out.println("Q13: " + questionThirteen); //Call custom method with a string(str) and number(n).

    //Q14
    String exampleString = "What a nice day today"; //Example string to use
    int wordCount = wordsInAStringCounter(exampleString);
    System.out.println("Q14: Number of words in the string is " + wordCount);

    //Q15
    String string = "Hello there world";
    System.out.println("Q15: " + vowelsCounter(string));

    //Q16
    String[] sampleArray = {"Hello", "World"};                                                                  // Sample array to demonstrate the swap method
    System.out.print("Q16: Original array: " + java.util.Arrays.toString(sampleArray) + "   ");                 // Print the original array
    String[] swappedArray = swap(sampleArray);                                                                  // Call the swap method and store the result in swappedArray
    System.out.println("Swapped array: " + java.util.Arrays.toString(swappedArray));                    // Print the swapped array

    //Q17
    String input = "The farmer went to the store to get 1 dollar's worth of fertilizer";
    String output = replaceCharacters(input);
    System.out.println("Q17: " + output);

    //Q18
    String inputString = "The Wu Tang Wu Hopped Wu Tang";                                                      // Define 'sample' input string
    String replacedString = replaceWuTangTwoThreeDivisible(inputString);                                        // Call/invoke the custom method
    System.out.println("Q18: " + replacedString);                                                               // Print the result

    //Q19
    int maxNumber = 100;                                                                                 //You can change this to get different values                                                                                   // Change this value to the desired maximum number
    String fibonacciString = createStringOfFibonnaciUpToMax(maxNumber);
    System.out.println("Q19: Fibonacci sequence up to " + maxNumber + ": " + fibonacciString);


} //Main Method

//Note: Create all your static methods outside on the main() method!
    // Loops, Control Flow, Arrays and Methods

    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] arrayOfNamesThree) {
        if (arrayOfNamesThree != null && arrayOfNamesThree.length > 0) {
            return arrayOfNamesThree[0];
        } else {
            return "Array is empty.";
        }
    }

    //Question 4
    public static String getLastElement(String[] questionFour) {
        if (questionFour != null && questionFour.length > 0) {
            return questionFour[questionFour.length - 1];
        } else {
            return "Array is empty or null";
        }
    }

    //Question 5
    public static String getSecondToLastElement(String[] questionFive) {
        if (questionFive != null && questionFive.length > 0) {
            return questionFive[questionFive.length - 2];

        } else {
            return "Array is empty.";
        }
    }

    //Question 6
    public static int getSum(int[] questionSix) {
        int sum = 0;
        for (int num : questionSix) {
            sum += num;
        }
        return sum;
    }

    //Question7
    public static double getAverage(double[] questionSeven) {
        double sum = 0;
        for (double num : questionSeven) {
            sum += num;
        }
        return sum / questionSeven.length;
    }

    //Question8
    public static String extractAllOddNumbers(int[] questionEight) {
        StringBuilder oddNumbers = new StringBuilder(); //Makes a new object of values with special methods to construct a string
        boolean isFirst = true; //Flag to track if it's the first odd number
        for (int number : questionEight) { //For every number value we have in the array...
            if (number % 2 != 0) {// If there's a number with a remainder after dividing by 2, remember it.
                if (!isFirst) {
                    oddNumbers.append(", "); // Adds a comma and space ONLY between numbers, not after the last one.
                } else {
                    isFirst = false; // set isFirst to false after encountering the first odd number
                }
                oddNumbers.append(number); //Collecting all the ood numbers
            }
        }
        return oddNumbers.toString(); // Turns the values into a string
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] questionNine) {
        StringBuilder evenNumbersBuilder = new StringBuilder();
        boolean foundEven = false;
        for (int number : questionNine) {
            if (number % 2 == 0) {
                if (foundEven) {
                    evenNumbersBuilder.append(", ");
                }
                evenNumbersBuilder.append(number);
                foundEven = true;
            }
        }
        return evenNumbersBuilder.toString();
    }

    //Question 10
    public static boolean contains(String[] questionTen, String nameToCheck) {      //Declares method "contains" returns a boolean
        for (String name : questionTen) {                                           //A loop that iterates over each element, within the loop, each element is assigned to "name"
            if (name.equalsIgnoreCase(nameToCheck)) {                               //This line checks if the name we are looking for, is in the array, ignoring spelling.
                return true;                                                        //If condition is true, return "True"
            }
        }
        return false; //If condition is not true, returns "False".
    }

    public static String properCapitals(String input) {
        if (input == null || input.isEmpty()) {                                     //This line checks if the input is empty (null).
            return input;                                                           //If there is no input, this line returns the string as it is.
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();    //If there WAS input, this line is executed.
        // input.substring(0, 1).toUpperCase() = Capitalizes the first character/letter
        //input.substring(1) = Converts the rest of the characters/letters into lower case.

    } //This statement just makes the name come out neat, with proper spelling

    // Question 11
    //    public static int getIndexByElement(String[] names, String element) {             //Find the index of a specific element, using an array of Strings, and a specific "element" value
    //
    //        return 0;
    //    }
    public static int getIndexByElement(String[] questionEleven, String element) {          //Declares a method which takes 2 parameters
        for (int i = 0; i < questionEleven.length; i++) {                                   //This line starts a 'for' loop that goes through each element
            if (questionEleven[i].equalsIgnoreCase(element)) {                              //This line checks if the current element is equal to 'element' string
                return i;                                                                   // Return the index if element is found
            }
        }
        return 0; //If loop finishes without finding element, the line returns 0.
    }


    //Question 12
    //public static void printOddNumbersInRange(int start, int end){                //Create 'printoddnums' method with appropriate arguments
    //}
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {                                    //Runs a 'for' loop from two values
            if (i % 2 != 0) {                                                   //This line checks if there is any remainder after dividing 'i' value by 2, which would indicate an odd number
                System.out.print(i + " ");                                      //Print odd numbers in range
            }
        }

    }

    ////Question 13
    //public static String printGivenStringTimesNumberGiven(String str, int n) {    //This method takes 'str'(the string to be repeated) and 'n' (number of times string should be repeated).
    //    return null;                                                              //It utilizes a 'StringBuilder()' to concatenate the string 'n' times.     //In the main method, we call our custom method with the string "Hello" and the number 3. The result "HelloHelloHello" is then printed.
    //}
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        StringBuilder result = new StringBuilder();                             //Allows us to multiply/repeat one string over and over again.
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    //Question 14
    //public static int wordsInAStringCounter(String str){                      -Custom method to count words in a string
    //    return 0;                                                             -If the string is null or empty, there are no words
    public static int wordsInAStringCounter(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    //Question 15 - A, E, I, O, U
    //public static int vowelsCounter(String str){                                              //A method used to count vowels in a string
    //    return 0;

    public static int vowelsCounter(String str) {
        int x = 0;                                                                              //Creating a value to start our loop at
        String strL = str.toLowerCase();                                                        //Turns everything to lower case
        for (int i = 0; i < strL.length(); i++) {                                               //Going through every letter in the string using the loop
            char one = strL.charAt(i);                                                          //Storing value of each character to 1
            if (one == 'a' || one == 'e' || one == 'i' || one == 'l' || one == 'u') {           //Checking if selected vowel is
                x++;                                                                            //If true, incrementing counter each loop
            }
        }
        return x;                                                                               //Returns count
    }

    //Question 16
    //public static String[] swap(String[] stringArray) {                       // Custom method to swap the elements of an array
    //return null;
    //}
    public static String[] swap(String[] stringArray) {
        if (stringArray.length != 2) {                                       // Check if the length of the array is not equal to 2
            return null;                                                    // Return null as swapping cannot be performed
        }
        String temp = stringArray[0];                                       // Temporary variable to hold the first element for swapping
        stringArray[0] = stringArray[1];
        stringArray[1] = temp;                                              // Swap the first and second elements
        return stringArray;                                                 // Return the modified array after swapping
    }

    //Question 17
    //     * Given the following legend
    //     *
    //     * f   >>   7
    //     * s   >>   $
    //     * 1   >>   !
    //     * a   >>   @
    //     *
    //     * your method should replace any character represented by a key in the legend, with its corresponding value.
    //     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
    //     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer

    public static String replaceCharacters(String str) {

        str = str.replace("F", "7");
        str = str.replace("f", "7");
        str = str.replace("s", "$");
        str = str.replace("1", "!");
        str = str.replace("a", "@");
        return str;
    }

    //Question 18
    //"The Wu Tang Wu jumps Wu the Wu Tang"
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] words = stringInput.split(" ");                                     // Split the input string into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {                                                         // Iterate over each word
            if (word.length() % 2 == 0 && word.length() % 3 == 0) {                         // Check if the length of the word is divisible by both 2 and 3
                result.append("jumps Wu the ");                                             // Replace "Wu" with "Hop"
            } else {
                result.append(word).append(" ");                                            // Otherwise, keep the original word
            }
        }
        return result.toString().trim();                                                    // Remove the extra space at the end and return the result
    }

    //Question19
    //    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
    //    return null;

    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        StringBuilder result = new StringBuilder();                                 // StringBuilder to build the Fibonacci sequence string
        int prev = 0;                                                               // Initialize the first Fibonacci number
        int current = 1;                                                            // Initialize the second Fibonacci number
        result.append(prev).append(", ");                                           // Append the first two Fibonacci numbers

        while (current <= maxnumber) {                                              // Generate Fibonacci sequence up to maxNumber
            result.append(current).append(", ");                                    // Append the current Fibonacci number to the result string
            int temp = prev + current;                                              // Calculate the next Fibonacci number
            prev = current;                                                         // Update prev to the current Fibonacci number
            current = temp;                                                         // Update current to the next Fibonacci number
        }
        if (result.length() > 0) {                                                  // Remove the trailing comma and space
            result.setLength(result.length() - 2);                                  // Remove the last two characters (comma and space)
        }

        return result.toString();                                                   // Return the generated Fibonacci sequence as a string
    }
}
