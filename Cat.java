import java.time.LocalDate;

public class Cat extends Animal{

     public Cat(String name) {
          super(name);
     }

     @Override
     public void sit() {
          System.out.printf("Кот %s устав стоять, просто сел\n",name);
     }
     @Override
     public void standup() {
          System.out.printf("Кот %s встал вытянув спину\n",name);
     }
     @Override
     public void move() {
          System.out.printf("Кот %s уходить от твоих рук\n",name);
     }
     @Override
     public void stop() {
          System.out.printf("Кот %s остановился что-бы многозначительно посмотреть на тебя\n",name);
     }

     public void say() {
          System.out.printf("Кот %s сказал Мяу\n",name);
     }
     @Override
     public int getAge() {
          LocalDate dtNow = LocalDate.now();
          LocalDate bdt = this.birthDate == null ? LocalDate.now() : this.birthDate;
      
          return Math.abs(dtNow.getYear() - bdt.getYear());
     }

     @Override
     public void setBirthDate(LocalDate date) {
          this.birthDate =date;
     }

     @Override
     public void say(String message) {
          say();
     }
}
