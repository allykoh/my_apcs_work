
public class Person{
    private String name;
    private int numberOfPets;

    public  Person(String name, int numberOfPets) {
        this.name = name;
        this.numberOfPets = numberOfPets;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }
    public String greeting() {
        return "Hello, my name is " + name + " and I have " + numberOfPets + " pets.";
    }
     public static void testGreeting(Person p, String expected) {
        String result = p.greeting();
        if (result.equals(expected)) {
            System.out.println("PASS: greeting() -> " + result);
        } else {
            System.out.println("FAIL: greeting() -> " + result
                               + " (expected " + expected + ")");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("Kira", 2);
        Person p2 = new Person("Elissa", 0);
        Person p3 = new Person("Lexi", 5);
        
         testGreeting(p1, "Hello, my name is Kira and I have 2 pets.");
        testGreeting(p2, "Hello, my name is Elissa and I have 0 pets.");
        testGreeting(p3, "Hello, my name is Lexi and I have 5 pets.");
    }
}


