public class Main {

    public static void main(String[] args) {

        String[] examples = new String[]{"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};
        int value = 0;

        for (String s : examples) {
            String replacedString = s.replaceAll("[^\\d.]", "");
            String firstDigit = Character.toString(replacedString.charAt(0));
            String secondDigit = replacedString.substring(replacedString.length() - 1);
            int number = Integer.parseInt(firstDigit + secondDigit);
            value += number;
        }
        System.out.println(value);

    }

}