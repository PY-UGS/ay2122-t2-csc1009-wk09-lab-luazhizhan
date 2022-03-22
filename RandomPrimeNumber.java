import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPrimeNumber {
    public int getPrimeNumber(int max) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (max >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= max; i += 2) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        int index = getRandomDigitCharacter(0, primeNumbers.size() - 1);
        return primeNumbers.get(index);
    }

    public boolean isPrimeBruteForce(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getRandomDigitCharacter(int min, int max) {
        Random r = new Random();
        int randomNum = r.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
