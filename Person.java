import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person extends Human {
     Person mainParent;
     Person secondParent;
     String identifyNumber;

     List<Relation> relations = new ArrayList<>();

     public Person(String lastName, String firstName, byte gender, LocalDate birthDate) {
          super(lastName, firstName, gender, birthDate);

     };

     public Person(String fio, LocalDate birthDate) {
          super(fio, birthDate);
     };

     @Override
     public void sit() {
          System.out.printf("%s устав стоять, просто сел на свободный стул\n",this.firstName);
     }

     @Override
     public void standup() {
          System.out.printf("%s встал со стула\n",this.firstName);
     }

     @Override
     public void move() {
          System.out.printf("%s начал идти только вперед\n",this.firstName);
     }

     @Override
     public void stop() {
          System.out.printf("%s остановился\n",this.firstName);
     }

     @Override
     public void say(String sayText) {
          System.out.printf("%s сказал: -%s\n",this.firstName,sayText);
     }

     @Override
     public int getAge() {
          LocalDate dtNow = LocalDate.now();
          LocalDate bdt = this.birthDate == null ? LocalDate.now() : this.birthDate;
      
          return Math.abs(dtNow.getYear() - bdt.getYear());
     }

     @Override
     public String getName() {
          return String.format("%s %s", this.lastName, this.firstName);
     }
}
