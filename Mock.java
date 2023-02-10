import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Mock {
     public static List<Family> init() {
          Person human1 = new Person("Иванов Иван", LocalDate.now());
          Person human1_2 = new Person("Ивановa Иванa", LocalDate.now());
          Person human1_3 = new Person("Иванов Ребенок", LocalDate.now());
 
          Family fam1 = new Family();
          
          fam1.marry(human1, human1_2);
          fam1.parenthood(human1_2, human1_3);
          
          List<Family> result = Arrays.asList(fam1);

          return result;
     }
}
