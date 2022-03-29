import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandTest {
    RandomCharacter randChar;

    @BeforeEach
    public void setup() {
        randChar = new RandomCharacter();
    }

    // Check if the generated values fall between the corrosponding ascii values to
    // determine if the testcases pass
    @Test
    public void TestUpper() {
        int testchar = (int) randChar.getRandomUpperCaseLetter();
        assertTrue(testchar >= 65 && testchar <= 90);
    }

    @Test
    public void TestLower() {
        int testchar = (int) randChar.getRandomLowerCaseLetter();
        assertTrue(testchar >= 97 && testchar <= 122);
    }

    @Test
    public void TestDigit() {
        int testchar = (int) randChar.getRandomDigitCharacter();
        assertTrue(testchar >= 48 && testchar <= 57);
    }

    @Test
    public void TestRand() {
        int testchar = (int) randChar.getRandomCharacter();
        assertTrue(testchar >= 33 && testchar <= 126);
    }

    // uses the primality test function which returns a bool to determine if the
    // generated digit is prime
    @Test
    public void TestPrime() {
        int primeTest = Character.getNumericValue(randChar.getRandomDigitCharacter());
        assertTrue(PrimalityTest(primeTest));
    }

    private boolean PrimalityTest(int test) {
        if (0 < test && test <= 3) // 1, 2 and 3 are primes so any number greater than 0 and less than or equal to
                                   // 3 is prime
        {
            return true;
        } else if ((test % 2 == 0) || (test % 3 == 0)) // if there is no remainder when divided by 2 or 3, the number is
                                                       // not prime as it is a mutiple of a prime
        {
            return false;
        } else {
            int i = 5;
            while (Math.pow(i, 2) <= test) {
                // since all prime numbers after 3 can be expressed as 6k+-1 and all integers
                // can also be expressed in the form
                // of 6n to 6n+5, if the number when tested, has no remainder, we can assume it
                // to not be prime
                if (test % i == 0 || test % (i + 2) == 0) {
                    return false;
                }
                i += 6;
            }
            return true;
        }

    }

}
