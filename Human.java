import java.util.Date;

public class Human {
     protected byte gender;
     protected String firstName;
     protected String lastName;
     protected Date birthDate;

     public Human(String lastName,String firstName,byte gender,Date birthDate) {
          this.lastName= lastName;
          this.firstName =firstName;
          this.gender = gender;
          this.birthDate =birthDate;
     }
     public Human(String fio, Date birthDate) {
          String[] fio_= fio.split(" ");
          //super(gender);
          this.firstName = fio_[1];
          this.lastName = fio_[0];;
          this.birthDate =birthDate;
     }

     public String getName(){
          return String.format("%s %s", lastName,firstName);
     }
}
