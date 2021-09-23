package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthDate;
    
    public Person(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
        
    }
    
    // test
    public String getName(){
        return name;
    }
    
    public Date getBirthdate(){
        return birthDate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthDate.getTime())/31536000000L);
    }
}
