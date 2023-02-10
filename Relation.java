
public class Relationship {
    private RelationshipKind relationshipKind;
    private Person a;
    private Person b;

    public Relationship(RelationshipKind relationshipKind, Person a, Person b) {
        this.relationshipKind = relationshipKind;
        this.a = a;
        this.b = b;
    }

    public RelationshipKind getRelationshipKind() {
        return this.relationshipKind;
    }
    public Person getPerson(Person a) {
        if(a ==this.a)
            return this.b;

        return this.a;
    }

}

enum RelationshipKind {
    ParentChild,
    Spouse
}