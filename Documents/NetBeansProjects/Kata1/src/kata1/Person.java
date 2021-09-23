package kata1;

import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    
    
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
        
    }

    public String getName(){
        return name;
    }
    
    public LocalDate getBirthdate(){
        return birthDate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        return (int) period.getYears();
    }
    
    private long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
}
