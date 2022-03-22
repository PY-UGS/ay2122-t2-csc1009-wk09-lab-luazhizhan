public class RandomPrimeNumberTest {
    public static void main(String[] args) {
        try {
            RandomPrimeNumber randPrime = new RandomPrimeNumber();
            int number = randPrime.getPrimeNumber(100);
            if (randPrime.isPrimeBruteForce(number) == false) {
                throw new Exception("getPrimeNumber Failed.");
            }
            System.out.println("Random Prime Number -> " + number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
