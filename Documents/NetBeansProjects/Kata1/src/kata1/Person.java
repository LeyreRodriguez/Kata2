package kata1;

import java.util.*;

public class Person {
    private final String name;
    private final Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String name, Calendar birthDate){
        this.name = name;
        this.birthDate = birthDate;
        
    }
    
 
    public String getName(){
        return name;
    }
    
    public Calendar getBirthdate(){
        return birthDate;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthDate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
}
