package kata1;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Kata1 {
    
   
    public static void main(String[] args) {
        LocalDate date;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse("24/09/1949", fmt);
        
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
