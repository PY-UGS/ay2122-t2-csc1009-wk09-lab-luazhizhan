import java.util.Random;

public class RandomCharacter {
    public char getRandomLowerCaseLetter() {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter() {
        return Character.toUpperCase(getRandomLowerCaseLetter());
    }

    public char getRandomDigitCharacter() {
        return getRandomDigitCharacter(0, 9);
    }

    private char getRandomDigitCharacter(int min, int max) {
        Random r = new Random();
        int randomNum = r.nextInt((max - min) + 1) + min;

        // RADIX = 10
        return Character.forDigit(randomNum, 10);
    }

    public char getRandomCharacter() {
        char i = getRandomDigitCharacter(0, 2);
        switch (i) {
            case '0':
                return getRandomLowerCaseLetter();
            case '1':
                return getRandomUpperCaseLetter();
            case '2':
                return getRandomDigitCharacter();
            default:
                return getRandomLowerCaseLetter();
        }
    }

    public static void main(String[] args) {
        int i = 0;
        RandomCharacter randChar = new RandomCharacter();
        String result = "";
        while (i < 15) {
            result += randChar.getRandomCharacter();
            i++;
        }
        System.out.println(result);
    }
}
