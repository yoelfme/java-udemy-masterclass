package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        // this doesn't work because Java expects a class instead of a primitive type
//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        // unnecesary boxing
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 55; // Integer.valueOf(55) -> boxing
        int myInt = myIntValue; // myInt.invValue() -> unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl <= 10.0 ; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); // boxing
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }
    }
}
