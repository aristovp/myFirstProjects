package PackageOne;

import java.io.IOException;

public class Calculator {
    private String stringA;
    private String stringB;
    private String stringOperator;

    private int intA;
    private int intB;

    public Calculator(String a, String operator, String b){
        this.stringA = a;
        this.stringB = b;
        this.stringOperator = operator;
    }

    public String calculation() {
        String result = null;
        int resultInt = 0;

        // есля строка является числом, то решаем уравнение:
        if (isNumeric(stringA) && isNumeric(stringB)) {
            intA = Integer.parseInt(stringA);
            intB = Integer.parseInt(stringB);
            if (intA > 10 || intB > 10 || intA < 1 || intB < 1)
                throw new NullPointerException();

            switch (stringOperator) {
                case "+":
                    resultInt = intA + intB;
                    break;
                case "-":
                    resultInt = intA - intB;
                    break;
                case "*":
                    resultInt = intA * intB;
                    break;
                case "/":
                    resultInt = intA / intB;
                    break;
                default:
                    throw new NullPointerException();
            }
            result = "" + resultInt;
        }
        //иначе, если строка является римским числом, решаем уравнение:
        else {
            int intA = TranslatorToDecimal.romanToDecimal(stringA);
            int intB = TranslatorToDecimal.romanToDecimal(stringB);

            if (intA > 10 || intB > 10 || intA < 1 || intB < 1)
                throw new NullPointerException();

            switch (stringOperator) {
                case "+":
                    resultInt = intA + intB;
                    break;
                case "-":
                    resultInt = intA - intB;
                    break;
                case "*":
                    resultInt = intA * intB;
                    break;
                case "/":
                    resultInt = intA / intB;
                    break;
                default:
                    throw new NullPointerException();
            }
            result = TranslatorToRoman.decimalToRoman(resultInt);
        }
    return result;
    }

    // проверяем, является ли строка числом.
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}