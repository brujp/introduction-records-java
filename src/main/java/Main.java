public class Main {

    public static void main(String[] args) {

        //Utilizando a classe comum
        var person = new Person("Bruno", 23);
        System.out.println(person.getName());
        System.out.println(person); //Chamou o método ToString

        //Utilizando record
        var personRecord = new PersonRecord("Bruno Record", 24);
        System.out.println(personRecord.name());
        System.out.println(personRecord); //Chamou o método ToString
        personRecord.printName();
        PersonRecord.printMessage();
    }
}
