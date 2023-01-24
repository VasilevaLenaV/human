import java.time.LocalDate;

public abstract class Human implements  ICreature  {
     protected  byte gender;
     protected String lastName;
     protected String firstName;
     protected String patronymicName;
     protected LocalDate birthDate;

     public Human(String lastName, String firstName, byte gender, LocalDate birthDate2) {
          this.lastName = lastName;
          this.firstName = firstName;
          this.gender = gender;
          this.birthDate = birthDate2;
     }

     public Human(String fio, LocalDate birthDate) {
          String[] fio_ = fio.split(" ");
          this.firstName = fio_[1];
          this.lastName = fio_[0];
          this.birthDate = birthDate;
     }

     public abstract String getName();
     public abstract int getAge();
}

