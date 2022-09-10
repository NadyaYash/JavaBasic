/**
* Java Basic HomeTask1
*
* @author Nadzeya Yashchuk
* @version 06.09.2022
*
*/

class HomeTask1 {
    public static void main(String[] args) {
        //task1
        int value1 = 13;
        int value2 = 17;
        int perimeter = 2*(value1 + value2);
        int square = value1*value2;
        System.out.printf ("Perimeter is %d . Square is %s.", perimeter, square);
        
        //task2
        int value3 = 5;
        int value4 = 3;
        double value5 = value3;
        System.out.println ( '\n' + "Addition is " + (value3+value4) + ", subtraction is " + (value3-value4) + ", multiplication is " + (value3*value4) + ", division is " + (value5/value4));
    
        //task3
        int[] a = { 4, 9, 8, 4, 2};
        for (int = 0; i < a.length; i++)
        { System.out.println(a[i]);
        }
        //task4 
        int diametr = 6;
        double s = Math.PI * Math.pow(diametr,2) / 4;
        System.out.printf ("There are %.0f kalories in pizza with diametr %d.", s*40, diametr);
        }
}


