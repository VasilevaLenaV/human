import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person extends Human {
     Person mainParent;
     Person secondParent;
     String identifyNumber;

     List<Relation> relations = new ArrayList<>();

     public Person(String lastName, String firstName, byte gender, Date birthDate) {
          super(lastName, firstName, gender, birthDate);
          
     };

     public Person(String fio, Date birthDate) {
          super(fio, birthDate);
     };
}
