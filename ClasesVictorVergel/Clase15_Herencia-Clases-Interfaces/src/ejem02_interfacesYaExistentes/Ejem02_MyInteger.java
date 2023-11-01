package ejem02_interfacesYaExistentes;

public class Ejem02_MyInteger implements Comparable<Ejem02_MyInteger> {
    private int value;

    public Ejem02_MyInteger(int value) {
        this.value = value;
    }

    public int compareTo(Ejem02_MyInteger other) {
        return Integer.compare(this.value, other.value);
    }

    public static void main(String[] args) {
        Ejem02_MyInteger num1 = new Ejem02_MyInteger(5);
        Ejem02_MyInteger num2 = new Ejem02_MyInteger(5);

        if (num1.compareTo(num2) > 0) {
            System.out.println("num1 es mayor que num2.");
        } else if (num1.compareTo(num2) < 0) {
            System.out.println("num1 es menor que num2.");
        } else {
            System.out.println("num1 y num2 son iguales.");
        }
    }
}

