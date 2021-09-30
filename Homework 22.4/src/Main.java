public class Main {
    public static void main(String[] args) {
        Country germany = new Country("Германия", 125, 1345697855);
        Country italy = new Country(germany.getName(), germany.getAge(), germany.getGdp());

        System.out.println(germany);
        System.out.println(italy);

        italy = italy.setName("Италия");

        System.out.println(germany);
        System.out.println(italy);
    }
}
