   
   public class PersonTest{
   
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
