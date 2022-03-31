public class RandomCharacter {
        public static void main(String[]args) {
            int randomLow = 97+(int)(Math.random()*(122-97));
            char s = (char)randomLow;
            System.out.println(Character.toLowerCase (s));
    }
}
