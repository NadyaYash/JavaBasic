/**
* Java Basic HomeTask1
*
* @author Nadzeya Yashchuk
* @todo 12.09.2022
* @date 17.09.2022
*/
class HomeTask3 {
    public static void main(String[] args) {
        int[] arr = {12,34,87,9908,45,98,56,789};
        int[] myArray = {0,1,0,0,0,1,0};
        printArray(arr);
        System.out.println(getMax(arr));
        printArray(invertArray(myArray));
    }
    
    //task1
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
//task2
    static int getMax(int[] array) {
        int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
    }
    
//task3
    static int[] invertArray(int[] array) {
    int[] result = new int [array.length]; 
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 1) {
            result[i] = 0;
        } else {
            result[i] = 1;
        }
    }
    return result;
    }
}    


