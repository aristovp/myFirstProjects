package PackageOne;

import java.io.IOException;

public class Splitter {
    private String input;
    private String numberA = null;
    private String numberB = null;
    private String operator = null;

    public Splitter(String input){this.input = input;}
    public String getInput() {return this.input;}
    public String getNumberA() {
        return this.numberA;
    }
    public void setNumberA(String numberA){this.numberA = numberA;}
    public String getNumberB() {
        return this.numberB;
    }
    public void setNumberB(String numberB){this.numberB = numberB;}
    public String getOperator() {
        return this.operator;
    }
    public void setOperator(String operator){this.operator = operator;}


    public void split() {
        String buffer = getInput().replaceAll(" ", "");

        if (buffer.contains("*")) {
            String[] array = buffer.split("\\*");
            if (array.length != 2)
                return;

            setNumberA(array[0]);
            setNumberB(array[1]);
            setOperator("*");
          }
        else if (buffer.contains("/")) {
            String[] array = buffer.split("/");
            if (array.length != 2)
                return;

            setNumberA(array[0]);
            setNumberB(array[1]);
            setOperator("/");
        }
        else if (buffer.contains("+")) {
            String[] array = buffer.split("\\+");
            if (array.length != 2)
                return;

            setNumberA(array[0]);
            setNumberB(array[1]);
            setOperator("+");
        }
        else if (buffer.contains("-")) {
            String[] array = buffer.split("-");
            if (array.length != 2)
                return;

            setNumberA(array[0]);
            setNumberB(array[1]);
            setOperator("-");
        }
    }
}
