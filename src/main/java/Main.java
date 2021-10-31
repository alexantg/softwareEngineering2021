public class Main {

        public static Boolean IsLeapYear (int year){
            if(year % 4 == 0 && year % 100 !=0){
                return true;
            }
            if(year % 400 ==0){
                return true;
            }
            if(year % 4 !=0){
                return false;
            }
            if(year % 100 == 0 && year % 400 !=0){
                return false;
            }
           else{
               return false;
            }
        }
    }

