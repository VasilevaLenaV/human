import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DataComponent {

     public Family addFamaly() {
          Function<String, Boolean> isAnswer = n -> {
               if (n.toLowerCase() == "y")
                    return true;
               return false;
          };

          Family family = new Family();

          Supplier<Person> personFactory = () -> {

               Scanner in = new Scanner(System.in);
               System.out.println("Введите имя: ");
               String name = in.nextLine();

               System.out.println("Введите дату рождения (YYYY-MM-dd): ");
               LocalDate dt = LocalDate.parse(in.nextLine());

               return new Person(name, dt);
          };
          Supplier<Animal> petFactory = () -> {

               Scanner in = new Scanner(System.in);
               System.out.println("Введите имя питомца: ");
               String name = in.nextLine();

               return new Cat(name);
          };

          Consumer<Person> addChild = x -> {
               Person children = personFactory.get();
               family.parenthood(x, children);
          };

          System.out.println("Муж:");
          Person p1 = personFactory.get();

          System.out.println("Жена:");
          Person p2 = personFactory.get();

          family.marry(p1, p2);

          return family;
     }
}
