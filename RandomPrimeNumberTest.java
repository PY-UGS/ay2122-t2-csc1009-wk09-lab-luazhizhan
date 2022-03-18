public class RandomPrimeNumberTest {
    public static void main(String[] args) {
        try {
            RandomPrimeNumber randPrime = new RandomPrimeNumber();
            if (randPrime.isPrimeBruteForce(randPrime.getPrimeNumber(100)) == false) {
                throw new Exception("getPrimeNumber Failed.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
