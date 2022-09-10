/**
* Java Basic HomeTask1
*
* @author Nadzeya Yashchuk
* @todo 07.09.2022
* @date 10.09.2022
*/
class HomeTask2 {
    public static void main(String[] args) {
        //task1
        System.out.println (checkWeather(19));

        //task2
        System.out.println (canWalk(false,true));
        
        //task3
        
        System.out.println ( add ( 2, 6 ));
        System.out.println ( subtraction ( 2, 6 ));
        System.out.println ( multiplication ( 2, 6 ));
        System.out.println ( segmentation ( 5, 2 ));
        
        //task4
        System.out.println ( dayOfWeek(7));
        
    }
    static String checkWeather (int temperature){
         
        if (temperature < 0){
            return "It's frost";
        }else if (temperature > 0 && temperature < 18) {
            return "It's cold";
        }else if(temperature > 18 && temperature < 29) {
            return "It's warm";
        }else if(temperature >29) {
            return "It's hot";
        }else {
            return "";
        }
    }

    static boolean canWalk (boolean isRain, boolean isWeekend) {
        if ( !isRain && isWeekend){
            return true;
        } else
            {return false;
        }
    }
    static int add (int firstValue, int secondValue) {
        int result = firstValue + secondValue;
        return result ;
    }
    static int subtraction (int firstValue, int secondValue) {
        int result = firstValue - secondValue;
        return result ;
    }
    static int multiplication (int firstValue, int secondValue) {
        int result = firstValue * secondValue;
        return result ;
    }
    static double segmentation (int firstValue, int secondValue) {
        double x = firstValue;
        double result = x / secondValue;
        return result;
    }
    static String dayOfWeek (int dayNumber) {
        switch (dayNumber) {
        case 1:
        return "Monday";
        case 2:
        return "Tuesday";
        case 3:
        return "Wednesday";
        case 4:
        return "Thusday";
        case 5:
        return "Friday";
        case 6:
        return "Saturday";
        case 7:
        return "Sunday";
        default:
        return "There is no such day number";
        }
    }
}

