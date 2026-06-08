public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("----- Kid User Test Cases -----");

        KidUsers kid1 = new KidUsers();
        kid1.age = 10;
        kid1.registerAccount();

        kid1.bookType = "Kids";
        kid1.requestBook();

        System.out.println();

        KidUsers kid2 = new KidUsers();
        kid2.age = 18;
        kid2.registerAccount();

        kid2.bookType = "Fiction";
        kid2.requestBook();

        System.out.println("\n----- Adult User Test Cases -----");

        AdultUser adult1 = new AdultUser();
        adult1.age = 5;
        adult1.registerAccount();

        adult1.bookType = "Kids";
        adult1.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser();
        adult2.age = 23;
        adult2.registerAccount();

        adult2.bookType = "Fiction";
        adult2.requestBook();
    }
}
