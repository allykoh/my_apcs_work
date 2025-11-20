  public class ScoreTest{
  
  public static void testScore(String testName, int actual, int expected) {
        if (actual == expected) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName + " (expected " + expected + ", got " + actual + ")");
        }
    }

    public static void main(String[] args) {
        ScoreKeeper sk = new ScoreKeeper();

        testScore("Initial score", sk.getScore(), 0);

        sk.scoreNormal();
        testScore("After scoreNormal", sk.getScore(), 100);

        sk.scoreNormal();
        testScore("After second scoreNormal", sk.getScore(), 200);

        sk.scoreBonus();
        testScore("After scoreBonus", sk.getScore(), 1200);
    }
}
