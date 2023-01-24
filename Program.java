public class Program {
    public static void main(String[] args) {

        SearchComponent sc =new SearchComponent(Mock.init());
        sc.showFamilies();


        sc.showPosterity("Сидоров Сидор");
    }
}
