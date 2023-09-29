package hw3;

public class Program {
    public static void main(String[] args) throws PersonDataException {
        Person person1 = new Person();
        person1.createPerson();
        System.out.println(person1);
        Parser parser = new Parser();
        parser.saveToTxt(person1);

    }
}
