public class Main {

    public static void main(String[] args) {

        String[] examples = new String[]{"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};
        int value = 0;

        for (String s : examples) {
            String replacedString = s.replaceAll("[^\\d.]", "");

            int number = Integer.parseInt(replacedString.charAt(0) +
                    replacedString.substring(replacedString.length() - 1)
            );

            value += number;
        }
        System.out.println(value);

    }

}