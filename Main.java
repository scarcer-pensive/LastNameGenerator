public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", LastNameGenerator.generateLastName());
        Person person2 = new Person("Jane", LastNameGenerator.generateLastName());

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName());
    }
}
