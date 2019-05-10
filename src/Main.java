import ModelOsoba.Osoba;
import ModelOsoba.Student;

public class Main {

    public static void main(String[] args) {

        ArrayBox<Osoba> bo = new ArrayBox<>(6);
        System.out.println("OSOBA!\n");
        System.out.println("Wydruk pustej tablicy!\n");
        bo.print();

        bo.add(new Osoba("Kowalkiewicz", 45));
        bo.add(new Osoba("Kowalski", 29));
        bo.add(new Osoba("Kowalski", 15));
        bo.add(new Osoba("Kowalski", 15));
        bo.add(new Osoba("Michałowski", 86));
        bo.add(new Osoba("Duda", 51));
        System.out.println("\nWydruk tablicy z osobami!\n");
        bo.print();

        Osoba[] tab = new Osoba[]{new Osoba("Maciejewski", 70),
                new Osoba("Kubica", 34),
                new Osoba("Duda", 51)};
        bo.addAll(tab);
        System.out.println("\nWydruk tablicy z osobami, po dodaniu nowej tablicy!\n");
        bo.print();

        Osoba kowalski = new Osoba("Kowalski", 15);
        System.out.println("\nWyszukanie indeksu osoby o następujących danych:"
                + kowalski + "\nIndeks: " + bo.search(kowalski));

        bo.swap(3, 5);
        bo.swap(0, 6);
        System.out.println("\nWydruk tablicy z osobami, po zamianie miejsc!\n");
        bo.print();

        bo.delete(kowalski);
        System.out.println("\nWydruk tablicy z osobami, po usunieciu wskazanego użytkownika:\n" + kowalski + "\n");
        bo.print();

        System.out.println("\nObiekt o najwiekszej(alfabetycznie) wartosci:\n" + bo.max());
        System.out.println("\nObiekt o najmniejszej(alfabetycznie) wartosci:\n" + bo.min());

        //==============================================================================================================

        System.out.println("\nSTUDENT!\n");
        ArrayBox<Student> bst = new ArrayBox<>(2);
        bst.add(new Student("Nowacka", 24, 100));
        bst.add(new Student("Nowacka", 24, 300));
        bst.add(new Student("Nowacka", 24, 200));
        System.out.println("Wydruk tablicy ze studentami!\n");
        bst.print();

        Student student = new Student("Nowacka", 24, 100);
        bst.delete(student);
        System.out.println("\nWydruk tablicy ze studentami, po usunieciu wskazanego studenta:\n" + student + "\n");
        bst.print();

        Student[] tst = new Student[]{
                new Student("Kowalski", 25, 101),
                new Student("Osinski", 26, 121),
                new Student("Nowacka", 24, 100)};
        bst.addAll(tst);

        System.out.println("\nWydruk tablicy ze studentami, po dodaniu tablicy studentów!\n");
        bst.print();

        bst.swap(3, 4);
        bst.swap(0, 2);
        System.out.println("\nWydruk tablicy ze studentami, po zamianie miejsc!\n");
        bst.print();

        System.out.println("\nObiekt o najwiekszej(alfabetycznie) wartosci:\n" + bst.max());
        System.out.println("\nObiekt o najmniejszej(alfabetycznie) wartosci:\n" + bst.min());

        //==============================================================================================================

        System.out.println("\nINTEGER!");

        ArrayBox<Integer> bi = new ArrayBox<>(1);
        Integer[] ti = new Integer[]{Integer.valueOf(1), 6, 8, 9, 3, 4, 5, 6, 5};
        bi.addAll(ti);
        System.out.println("\nWydruk tablicy po dodaniu Integerów!\n");
        bi.print();

        bi.swap(1, 3);
        bi.swap(4, 2);
        System.out.println("\nWydruk tablicy, po zamianie miejsc!\n");
        bi.print();

        System.out.println("\nWyszukanie indeksu integer:" + 5 + "\nIndeks:" + bi.search(5));

        bi.delete(9);
        System.out.println("\nUsuniecie z tablicy '9'. Następnie wydruk tablicy:");
        bi.print();

        System.out.println("\nObiekt o najwiekszej wartosci:\n" + bi.max());
        System.out.println("\nObiekt o najmniejszej wartosci:\n" + bi.min());

        //==============================================================================================================
        System.out.println("\nSTRING!");

        ArrayBox<String> bs = new ArrayBox<>(2);
        String[] ts = new String[]{"cpp", new String("java"), "agrafka","komputer","beczka"};
        bs.addAll(ts);
        bs.swap(0, 1);
        System.out.println("\nWydruk tablicy stringów, po zamianie:\n");
        bs.print();

        //==============================================================================================================
        System.out.println("\nOSOBA-STUDENT!");

        ArrayBox<Osoba> bx = new ArrayBox<>(2);
        bx.add(new Osoba("Kowalski", 19));
        bx.add(new Student("Kowalska", 18, 100));
        bx.add(new Student("Kowalska", 20, 200));

        Osoba[] tx = new Osoba[]
                {new Osoba("Nowak", 21),
                        new Student("Nowak", 22, 200)
                };

        bx.addAll(tx);
        System.out.println("\nWydruk tablicy osób i studentów:\n");
        bx.print();
        System.out.println("\nObiekt o najwiekszej(alfabetycznie) wartosci:\n" + bx.max());
        System.out.println("\nObiekt o najmniejszej(alfabetycznie) wartosci:\n" + bx.min());

    }
}
