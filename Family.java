import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
     Person mainParent;
     Person secondParent;
     private List<Person> children = new ArrayList<>();
     private List<Animal> pets = new ArrayList<Animal>();

     public Family(Person mainParent, Person secondParent) {
          this.mainParent = mainParent;
          this.secondParent = secondParent;
     }

     public boolean addPets(Animal pet) {
          return pets.add(pet);
     }

     public boolean addChildren(Person person) {
          person.mainParent =this.mainParent;
          person.secondParent =this.secondParent;
          
          return children.add(person);
     }

     public List<Person> getChildren() {
          return this.children;
     }


     public List<Person> getAllPerson() {
          List<Person> faList = new ArrayList<Person>();
          faList.addAll(this.children);
          faList.addAll(Arrays.asList(this.mainParent, this.secondParent));
          return faList;
     }
     public void printAllPerson(){
          System.out.printf("\nСемья %sых\n",this.mainParent.lastName);
          System.out.printf("Родитель1 (Отец):%s\nРодитель2 (Мать):%s\nДети:", this.mainParent.getName(),this.secondParent.getName());
               for (Person person : children) {
               System.out.println(person.getName());
          }
          if(children.isEmpty()){
               System.out.printf("\t-\n");
          }

     }     

     public boolean isFamilyMember(Person person) {
          return getAllPerson().contains(person);
     }

}
