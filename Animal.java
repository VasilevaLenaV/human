import java.time.LocalDate;

public abstract class Animal implements ICreature {
     protected String name;
     protected LocalDate birthDate;

     public Animal(String name){
          this.name =name;
     }

     public abstract int getAge();
     public abstract void setBirthDate(LocalDate date);
}

