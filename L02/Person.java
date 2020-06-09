public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public static void main(String[] args) {
        Person maha = new Person(false,"Masha");
        Person semen = new Person(true, "Semen");
        Person dasha = new Person(false, "Dasha");
        Person igor = new Person(true, "Igor");
        Person sara = new Person(false, "Sara");

        maha.marry(semen);
        System.out.println(maha.spouse.name + " " + semen.spouse.name);
        maha.marry(igor);
        System.out.println(maha.spouse.name + " " +  " " + igor.spouse.name);
        maha.marry(sara);
        System.out.println(maha.spouse.name );
    }

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    public boolean marry(Person person) {
        if (this.man != person.man) {
            if (this.spouse != null){
                this.divorce();
            }
            if(person.spouse != null){
                person.divorce();
            }
            if (this.spouse == null | person == null){
                this.spouse = person;
                person.spouse = this;
                return true;
            }
        }
        return false;
    }

    public boolean divorce() {
        if(this.spouse != null){
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        return false;
    }

}