import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchComponent {
     List<Family> searchData = new ArrayList();

     Predicate<Integer> isPositive = x -> x > 0;
     
     public SearchComponent(List<Family> data) {
          this.searchData.addAll(data);
     }

     public List<Person> getParents(String fullName) {
          List<Person> result = new ArrayList<>();

          return result;
     }

     public Family getPosterity(String fullName) {
          return searchData
                    .stream()
                    //.filter(f -> f.mainParent.getName() == fullName || f.secondParent.getName() == fullName)
                    .findFirst()
                    .get();
     }

     public void showPosterity(String fullName) {
          // Family posterity = getPosterity(fullName);

          // List<Person> persons = posterity.getChildren();

          // System.out.println("Потомки");

          // for (Person p : persons) {
          //      p.getName();
          // }
     }

     public void showFamilies() {

          // for (Family family : searchData) {
          //      family.printAllPerson();
          // }

     }

}
