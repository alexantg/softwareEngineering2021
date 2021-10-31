import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Testing {

    @Test
    public void Dividable_By_Four_But_Not_Hundred(){
        //Test of criteria one (When a year is a leap year): Dividable by 4 but not 100. 36 as an example, should return true
        assertEquals(true, Main.IsLeapYear(36));
    }

    @Test
    public void Dividable_By_Four_Hundred(){
        //Test of criteria two (When a year is a leap year): Dividable by 400. 2000 as an example, should return true
        assertEquals(true, Main.IsLeapYear(2000));
    }

    @Test
    public void Not_Dividable_By_Four(){
        //Test of criteria three(When a year is not a leap year): Not dividable by 4. 2005 as an example, should return false
        assertEquals(false, Main.IsLeapYear(2005));

    }
    @Test
    public void Dividable_By_Hundred_But_Not_Four_Hundred(){
        ////Test of criteria four(When a year is not a leap year): Dividable by 100 but not 400. 1900 as an example, should return false
        assertEquals(false,Main.IsLeapYear(1900));
    }

}
