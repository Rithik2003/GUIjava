import java.awt.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;







import java.util.*;
import java.io.*;
/*checking maxes with each index
public class Main {
    public static void main(String[] args) {
        int [] array = {8, 3, 4, 5};
        System.out.println(getMax(array));
    }
    static int getMax(int [] array){
        if(array.length == 1){
            return array[0];
        }
        else{
            int Index = array.length;
            int numMax [] = Arrays.copyOfRange(array, 1, Index);
            return Math.max(array[0], getMax(numMax));
        }

    }
}

/*
/*each time you go down the bunny ears increase by 2.
public class Main {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(bunnyEars(num));
    }

    static int bunnyEars(int num) {
        if (num == 0) {
            return 0;
        } else {
           return  bunnyEars(num - 1) + 2;
        }

    }
}
*/


/*
public class Main {
    public static void main(String[] args) {
        int array [] = {10, 7, 9};
        System.out.println(listSum(array));

    }

    static int listSum(int [] array){
        if(array.length == 1){      //if the length is at the end then return just that number
            return array[0];
        } else {
            int lastIndex = array.length;
            int tempArray[] = Arrays.copyOfRange(array, 1, lastIndex);      //
            return array[0] + listSum(tempArray);   //moving backwards so 9 + 7 + 10
        }

    }
}


*/








/*

public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(recursiveSum(num));

    }

    static int recursiveSum(int num){       //runs like 5 + recursiveSum(4) then 4 + recursiveSum(3). This is just 5 + 4 + 3 + 2 + 1
        if(num > 0){
            return num + recursiveSum(num - 1);
        }
        else{
            return 0;
        }
    }
}





*/
















// printRadixRec(n, r)  “” if n is 0
// printRadixRec (n/r, r) followed by n%r


/*class Main {

    //suppports radix > 10
    static String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    static void printRadixRec(int value, int radix){
        if (value == 0){
            return;
        }

        printRadixRec(value / radix, radix);
        System.out.println(array[value % radix]);
        }




//helper method to take care of non recursive issues.
    static void printRadix(int value, int radix){
        if(value == 0){
            System.out.println(0);
            return;
        }
        if (value < 0){
            System.out.println("-");
            printRadixRec(Math.abs(value), radix);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int radix = input.nextInt();

        printRadixRec(value, radix);


    }
}


*/




/* public class Main {

    static int weights[] = {40, 10, 46, 23, 22, 16, 27, 6};

    static int bestOne(int target) {
        //find the highest weight <= target
        int bestSoFar = 0;

        for (int i = 0; i < weights.length; i++)

            if (weights[i] <= target && weights[i] > bestSoFar)
                bestSoFar = weights[i];
        //loop?

        return bestSoFar;
    }

    static int bestTwo(int target, int selectedItems[]) {
        int bestSoFar = 0;

        for (int i = 0; i < weights.length; i++)
            for (int j = i + 1; j < weights.length; j++)
                if (i != j)
                    if (weights[i] + weights[j] <= target && weights[i] + weights[j] > bestSoFar) {
                        bestSoFar = weights[i] + weights[j];
                        // record individual weights too
                        selectedItems[0] = weights[i];
                        selectedItems[1] = weights[j];
                    }

        //loop?

        return bestSoFar;
    }
    //we want best solution
    static int knapsack(int index, int totalSoFar, int target){
        //end conditions
        if (totalSoFar > target)
            return 0;
        if (totalSoFar == target)
            return target;
        //we know that totalSoFar < target
        if (index == weights.length)
            return totalSoFar;


        //considering weights [index]
        //exclude path: knapsack(index+1, totalSoFar, target )
        //include path: knapsack(index+1, totalSoFar+weights[index], target)
        return Math.max( knapsack(index+1, totalSoFar, target),
                        knapsack(index+1, totalSoFar+weights[index], target));
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("bestOne(" + i + "): " + bestOne(i));

            int resultItems[] = new int[2];
            System.out.println("bestTwo(" + i + "): " + bestTwo(i, resultItems));
            System.out.println(" (" + resultItems[0] + "," + resultItems[1] + ")");

            System.out.println("knapsack("+ i + "): " + knapsack(0,0, i));
        }

    }

}







*/














/*
    reading in files
    File file = new File("input.txt");
    scanner input = new

search up command for reading in and writing



Creating arrrays java
dynamic array is int[] array = new int [10];
then call function

int[] array;
array = new int [10];
array = new int [10];

with every block of allocated memory, it keeps a reference count.
 */


/*watch video of recursion in java
public class Main {
    // recursive equation (factorials) to compute factorials
// non recursive function to compute factorials
    public static long recursiveFactorial(int n){
        if (n==0)
            return 1;
        else
            return n * recursiveFactorial(n-1);
    }

    public static long nonRecursiveFactorial(int n){
        //n! = 1 * 2 * 3 .... n
        int result = 1;
        for (int i = 2; i<=n; i++)
            result *= i;
        return result;
    }


    public static void main(String[] args){
        //print first 50 factorial numbers using both functions
        for (int i=0; i<=50; i++)
            System.out.println("f(" + i + "): " + recursiveFactorial(i)
                    + " " + nonRecursiveFactorial(i));
    }

}
/*














/*find out what day of the week it is

public class Main {
    public static void main(String[] args) {
        System.out.println("What day is it");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        switch (day){
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");

        }


    }
}

*/














/* program for pass or fail
public class Main {
     public static void main (String[] args){
         int m1=0, m2=0, m3 = 0;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a grade for physics");
         m1 = scan.nextInt();

         System.out.println("Enter a grade for chem");
         m2 = scan.nextInt();

         System.out.println("Enter a grade for Law");
         m3 = scan.nextInt();

         float avg = (m1+m2+m3)/3.0f;
         System.out.println("The percentage is: " + avg);

         if (avg>= 40 && m1>=33 && m2>= 33 && m3>= 33){
             System.out.println("Congrats you pass");
         }
         else{
             System.out.println("You are a failure");
         }

     }
}

*/















/* how to calculate float sum using arrays
public class Main {
    public static void main(String[] args) {
        float[] values = {44.3f, 54.5f, 56.4f, 33.4f};
        float sum = 0;
        for (float elements : values) {
            sum = sum + elements;
        }
        System.out.println(sum);
    }

}

*/















/*
public class Main {
    public static void main(String[] args){
        int[ ] numbers = new int[3]; //to make array you specify type off array the
        System.out.println(numbers);
    }
}


*/














/*
public class Main {
    public void greet(String[] names){
        //O(1) space without copy. O(N) with. The more items in input memory means more
        String[] copy = new String[names.length];
        for (int i=0; i < names.length; i++)
            System.out.println("Hi " + names[i]);
    }

}
*/



//exponential growth is the opposite of logarithmic O(2^n)
// algorithm with logarithmic time is faster and more scalable than linear time.
/*
public class Main{
    public void log(int[] numbers){
        //O(n^2) runs in quadratic time and gets slower and slower.
        //O(N^3)
        for (int first : numbers) //O(n)
            for (int second : numbers)//O(N)
                for (int third : numbers)
                    System.out.println(first + ',' + second);
    }
}
*/











/*
public class Main {
    public void log(int[] numbers){
        //O(2 + n) turns into O(n). O(n) means that the run time increases at the same pace as the input.
        System.out.println(); //O(1)
        for (int i = 0; i < numbers.length; i++) //O(n)
            System.out.println(numbers[i]);
        System.out.println(); // O(1)
    }
}

*/








/*  O(1) constant time

public class Main {
    public void log(int[] numbers){
        //O(1)
        System.out.println(numbers[0]);
        //O(2)
        System.out.println(numbers[0]);
    }
}
/*


/* scanner lesson
Scanner scanner = new Scanner(System.in);

      System.out.println("Who is the prettiest girl in the world? ");
      String name = scanner.nextLine();
      System.out.println("How long is your weiner? ");
      int length = scanner.nextInt();
      scanner.nextLine();
      System.out.println("What is your favorite food");
      String food = scanner.nextLine();

      System.out.println(name +" is the correct answer");
      System.out.println("Your wiener is " +length+ " inches long");
      System.out.println("Your favorite food is " + food);
 */

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall");
    }
}




/*
        double x;
       double y;
       double z;

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);
        scanner.close();

*/


/*

    Random rand = new Random();
     int x = rand.nextInt(6)+1;
    double y = rand.nextDouble();
    boolean z = rand.nextBoolean();
        System.out.println(z);
*/

/*
if statement practice - checks through if and then goes to else unless else ifs are in place
int age = 13;
        {
            if (age >= 75) {
                System.out.println("Ok Boomer!");

            } else if (age>=18) {
                System.out.println("You are an adult!");
            } else if (age >= 13) {
                System.out.println("You are a teenager!");
            }
                else {
                System.out.println("You are not an adult!");
            }

        }
    }
}
 */

/*
  String day = "Saturday";

        switch(day) {
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday. Time for the special date with Noushi!");
            break;
            default:
                System.out.println("That is not a day");

        }

 */