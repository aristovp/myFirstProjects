package PackageOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
        reader.close();
            Splitter splitter = new Splitter(input);
            splitter.split();
            if (splitter.getNumberA().isEmpty() || splitter.getNumberB().isEmpty() || splitter.getOperator().isEmpty())
                throw new NullPointerException("Введены неверные данные");
            Calculator calculator = new Calculator(splitter.getNumberA(), splitter.getOperator(), splitter.getNumberB());
            System.out.println(calculator.calculation());
        }
    }
