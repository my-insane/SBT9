public class Main {
    public static void main(String[] args) {
        Person maha = new Person(false,"Masha");
        Person semen = new Person(true, "Semen");
        Person dasha = new Person(false, "Dasha");
        Person igor = new Person(true, "Igor");
        Person sara = new Person(false, "Sara");

        maha.marry(semen);
        System.out.println(maha.toString() + " " + semen.toString());
        maha.marry(igor);
        System.out.println(maha.toString() + " " +  " " + igor.toString());
        maha.marry(igor);
        System.out.println(maha.toString() + " " +  " " + igor.toString());
        maha.marry(dasha);
        System.out.println(maha.toString() + " " +  " " + dasha.toString());
        dasha.marry(sara);
        System.out.println(dasha.toString() + " " +  " " + sara.toString());
        igor.marry(sara);
        System.out.println(igor.toString() + " " +  " " + sara.toString());
        System.out.println(semen.toString() );
    }
}
