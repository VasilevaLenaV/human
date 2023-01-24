import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Mock {
     public static List<Family> init() {
          Person human1 = new Person("Иванов Иван", LocalDate.now());
          Person human1_2 = new Person("Ивановa Иванa", LocalDate.now());
          Person human2 = new Person("Петров Петр", LocalDate.now());
          Person human2_2 = new Person("Петрова Петра", LocalDate.now());
          Person human3 = new Person("Сидоров Сидор", LocalDate.now());
          Person human3_2 = new Person("Сидорова Эйсидора", LocalDate.now());
          Family fam1 = new Family(human1, human1_2); // 2 поколение
          Family fam2 = new Family(human2, human2_2); // 1 поколение
          Family fam3 = new Family(human3, human3_2);

          fam3.addChildren(human2);
          fam2.addChildren(human1);

          human1.relations.add(new Relation(human1_2, "Жена"));
          human2.relations.add(new Relation(human2_2, "Жена"));
          human3.relations.add(new Relation(human3_2, "Жена"));

          List<Family> result = Arrays.asList(fam1, fam2, fam3);

          return result;
     }
}
