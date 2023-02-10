import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Family> fams = Mock.init();

        DataComponent data =new DataComponent();

        Family fam=  data.addFamaly();
        fam.getFamilyPrint();

        
        for (Family family : fams) {
            family.getFamilyPrint();
        }
    }
}
