import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person extends Human {

     List<Relationship> relations = new ArrayList<>();

     public Person(String name, LocalDate birthDate) {
          super(name, birthDate);
     };

     @Override
     public void sit() {
          System.out.printf("%s устав стоять, просто сел на свободный стул\n",this.name);
     }

     @Override
     public void standup() {
          System.out.printf("%s встал со стула\n",this.name);
     }

     @Override
     public void move() {
          System.out.printf("%s начал идти только вперед\n",this.name);
     }

     @Override
     public void stop() {
          System.out.printf("%s остановился\n",this.name);
     }

     @Override
     public void say(String sayText) {
          System.out.printf("%s сказал: -%s\n",this.name,sayText);
     }

     @Override
     public int getAge() {
          LocalDate dtNow = LocalDate.now();
          LocalDate bdt = this.birthDate == null ? LocalDate.now() : this.birthDate;
      
          return Math.abs(dtNow.getYear() - bdt.getYear());
     }

     @Override
     public String getName() {
          return String.format("%s", this.name);
     }
}
