import java.time.LocalDate;

public abstract class Human implements  ICreature  {
     protected  byte gender;
     protected String name;
     protected LocalDate birthDate;

     public Human(String name, LocalDate birthDate, byte gender) {
          this.name =name;
          this.gender = gender;
          this.birthDate = birthDate;
     }

     public Human(String name, LocalDate birthDate) {
          this.name =name;
          this.birthDate = birthDate;
     }

     public abstract String getName();
     public abstract int getAge();
}

