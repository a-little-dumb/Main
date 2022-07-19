import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String string = scanner.nextLine();
        System.out.println(calc(string));
    }

    public static String calc(String input) {
        //получение из строки трёх переменных
        String[] peremennye = String.valueOf(input).split(" ");
        String deystvie = null, first = null, second = null;
        if (peremennye.length != 3) {
            System.out.println("Введено не два значения. Попробуйте снова.");}
        //проверка на наличие пробелов и заполнение значений
        else {try {
            for (int i = 0; i < peremennye.length; i++) {
                first = peremennye[0]; second = peremennye[2]; deystvie = peremennye[1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы не ввели пробелы между значениями или же выражение введено неверно");
        }
        //РИМСКИЕ
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] romanTen = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        List<String> listRoman = new ArrayList<>(Arrays.asList(roman));
        if (listRoman.contains(first) || listRoman.contains(second)) {
            if (listRoman.contains(first) && listRoman.contains(second)) {
                int second1 = 0,first1 = 0;
                for (int i = 0; i < 10; i++) {
                    if (first.equals(romanTen[i])) {
                        first1 = i + 1;
                    }
                    if (second.equals(romanTen[i])) {
                        second1 = i + 1;
                    }
                }
            //действия над римскими
                if ((first1 < 11 && first1 > 0) && (second1 < 11 && second1 > 0)) {
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
                            default -> System.out.println("Это арифметическое действие недоступно. Введите выражение с операциями +, -, * или /");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Такого значения не существует");
                    } } else System.out.println("Значения превышают допустимый предел. Введите значения от 1 до 10");
            } else System.out.println("Введите два значения одного типа");}
        //АРАБСКИЕ
        try {
            if (!listRoman.contains(first) && !listRoman.contains(second)) {
                if (Integer.parseInt(first) > 0 && Integer.parseInt(first) < 11 && Integer.parseInt(second) > 0 && Integer.parseInt(second) < 11) {
                    int first2 = Integer.parseInt(first), second2 = Integer.parseInt(second);
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
                        default -> System.out.println("Это арифметическое действие недоступно. Введите выражение с операциями +, -, * или /");
                    }
                } else System.out.println("Значения превышают допустимый предел. Введите значения от 1 до 10");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены некорректные значения");
        }}
        return "Программа завершила свою работу";
    }
}
