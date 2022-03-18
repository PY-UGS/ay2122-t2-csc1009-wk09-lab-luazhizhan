public class RandomCharacterTest {
    public static void main(String[] args) {
        try {
            RandomCharacter randChar = new RandomCharacter();
            char lc = randChar.getRandomLowerCaseLetter();
            char uc = randChar.getRandomUpperCaseLetter();
            char d = randChar.getRandomDigitCharacter();
            if (lc < 'a' || lc > 'z') {
                throw new Exception("geRandomLowerCaseLetter Failed.");
            }
            if (uc < 'A' || uc > 'Z') {
                throw new Exception("getRandomUpperCaseLetter Failed.");
            }
            if (d < '0' || d > '9') {
                System.out.println(d);
                throw new Exception("getRandomDigitCharacter Failed.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
