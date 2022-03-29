import java.util.Random;

public class RandomCharacter {
    public RandomCharacter() {
    }

    private int RandGen(int mode) {
        Random randGen = new Random();
        switch (mode) {
            case 0:
                return randGen.nextInt(97, 122);
            case 1:
                return randGen.nextInt(48, 57);

            case 2:
                return randGen.nextInt(33, 126);

            default:
                return randGen.nextInt(65, 90);
        }

    }

    public char getRandomLowerCaseLetter() {
        return (char) this.RandGen(0);
    }

    public char getRandomUpperCaseLetter() {
        return (char) this.RandGen(3);

    }

    public char getRandomDigitCharacter() {
        return (char) this.RandGen(1);
    }

    public char getRandomCharacter() {
        return (char) this.RandGen(2);
    }

    public static void main(String[] args) {
        int j = 0;
        RandomCharacter i = new RandomCharacter();
        System.out.println();
        while (j < 15) {
            System.out.println("LowerCase: " + i.getRandomLowerCaseLetter());
            System.out.println("UpperCase: " + i.getRandomUpperCaseLetter());
            System.out.println("Digit: " + i.getRandomDigitCharacter());
            System.out.println("Random Char: " + i.getRandomCharacter() + "\n");
            System.out.println("Prime Number Check:" + i.getRandomDigitCharacter());
            j++;
        }

    }

}
