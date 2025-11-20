
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
}


