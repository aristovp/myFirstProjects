package PackageOne;

import java.io.IOException;

public class TranslatorToDecimal {

    public static int romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();

        //проходим циклом по char-м переданной строки
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;

                default: throw new NullPointerException();
            }}
        return decimal;
    }
          //вычисляем арабское число по принципу построения римских чисел.
    public static int processDecimal(int thisDecimal, int lastNumber, int decimal) {
        if (lastNumber > thisDecimal) {
            return decimal - thisDecimal;
        } else {
            return decimal + thisDecimal;
        }}
    }