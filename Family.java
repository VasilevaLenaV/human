import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Family {
     private final Map<Person, Set<Relationship>> directRelationships = new HashMap<>();

     public void marry(Person a, Person b) {
          Relationship marriage = new Relationship(RelationshipKind.Spouse, a, b);
          directRelationships.computeIfAbsent(a, k -> new HashSet<>()).add(marriage);
          directRelationships.computeIfAbsent(b, k -> new HashSet<>()).add(marriage);
     }

     public Map<Person, Set<Relationship>> getPersons() {
          return directRelationships;
     };

     public void getFamilyPrint(){
            for (Map.Entry<Person, Set<Relationship>> entry : this.directRelationships.entrySet()) {
                System.out.println("\nPerson : " + entry.getKey().getName());

                for(Relationship r : entry.getValue()){
                    System.out.println("Relation : " + r.getPerson(entry.getKey()).name);
                    System.out.println("RelationshipKind : " + r.getRelationshipKind().name());
                }
            }
     }

     public void parenthood(Person mother,  Person child) {
          Relationship motherhood = new Relationship(RelationshipKind.ParentChild, mother, child);

          Optional<Relationship> otherParent = directRelationships.get(mother)
          .stream()
          .filter(r -> r.getRelationshipKind() == RelationshipKind.Spouse)
          .findFirst()
          .map(marriage -> new Relationship(RelationshipKind.ParentChild,
          marriage.getPerson(mother) , child));


          directRelationships.computeIfAbsent(mother, k -> new HashSet<>()).add(motherhood);
          directRelationships.computeIfAbsent(child, k -> new HashSet<>()).add(motherhood);

          if (otherParent.isPresent()) {
          directRelationships.computeIfAbsent(otherParent.get().getPerson(mother), k -> new HashSet<>()).add(otherParent.get());
          directRelationships.get(child).add(otherParent.get());
          }
     }

}
