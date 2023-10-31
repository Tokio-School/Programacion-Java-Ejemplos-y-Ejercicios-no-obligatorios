package ejem02_interfacesYaExistentes;

public class Ejem01_MyString implements CharSequence {
    private String value;

    public Ejem01_MyString(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public char charAt(int index) {
        return value.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return value.subSequence(start, end);
    }

    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        Ejem01_MyString myString = new Ejem01_MyString("Ejemplo");
        System.out.println("Longitud: " + myString.length());
        System.out.println("Carácter en la posición 3: " + myString.charAt(3));
        System.out.println("Subsecuencia: " + myString.subSequence(1, 4));
    }
}
