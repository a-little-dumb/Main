
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] romanTen = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        List<String> listRoman = new ArrayList<>(Arrays.asList(roman));
        String string;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        string = scanner.nextLine();
        String[] peremennye = String.valueOf(string).split(" ");

        String deystvie = null;
        String first = null;
        String second = null;
        try {
            for (int i = 0; i < peremennye.length; i++) {
                first = peremennye[0];
                second = peremennye[2];
                deystvie = peremennye[1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Значения введены неверно!");
        }


        if (listRoman.contains(first) && listRoman.contains(second)) {
            int second1 = 0;
            int first1 = 0;
            for (int i = 0; i < 10; i++) {
                if (first.equals(romanTen[i])) {
                    first1 = i + 1;

                }
                if (second.equals(romanTen[i])) {
                    second1 = i + 1;
                }
            }


            try {
                switch (deystvie) {
                    case "+" -> {
                        int result = first1 + second1;
                        String finalResult = roman[result - 1];
                        System.out.println(finalResult);
                        break;
                    }
                    case "-" -> {
                        int result = first1 - second1;
                        String finalResult = roman[result - 1];
                        System.out.println(finalResult);
                        break;
                    }
                    case "*" -> {
                        int result = first1 * second1;
                        String finalResult = roman[result - 1];
                        System.out.println(finalResult);
                        break;
                    }
                    case "/" -> {
                        int result = first1 / second1;
                        String finalResult = roman[result - 1];
                        System.out.println(finalResult);
                        break;
                    }
                    default -> System.out.println("Ошибка");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Такого значения не существует");
            }


        }

        try {
            if (!listRoman.contains(first) && !listRoman.contains(second)) {
                if (Integer.parseInt(first) > 0 && Integer.parseInt(second) < 11) {
                    int first2 = Integer.parseInt(first);
                    int second2 = Integer.parseInt(second);
                    switch (deystvie) {
                        case "+" -> {
                            System.out.println(first2 + second2);
                            break;
                        }
                        case "-" -> {
                            System.out.println(first2 - second2);
                            break;
                        }
                        case "*" -> {
                            System.out.println(first2 * second2);
                            break;
                        }
                        case "/" -> {
                            System.out.println(first2 / second2);
                            break;
                        }
                        default -> System.out.println("Ошибка");
                    }
                }
                }
                } catch(NumberFormatException e){
                    System.out.println("Значения введены неверно!!");
            }
        }
    }





