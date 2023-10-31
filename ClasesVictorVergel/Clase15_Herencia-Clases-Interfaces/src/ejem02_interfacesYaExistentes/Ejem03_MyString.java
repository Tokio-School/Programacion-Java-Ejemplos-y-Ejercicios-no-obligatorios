package ejem02_interfacesYaExistentes;

public class Ejem03_MyString implements Comparable<Ejem03_MyString> {
    private String value;

    public Ejem03_MyString(String value) {
        this.value = value;
    }

    public int compareTo(Ejem03_MyString other) {
        return this.value.compareTo(other.value);
    }

    public static void main(String[] args) {
        Ejem03_MyString str1 = new Ejem03_MyString("apple");
        Ejem03_MyString str2 = new Ejem03_MyString("banana");

        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("str1 viene antes que str2.");
        } else if (result > 0) {
            System.out.println("str1 viene después que str2.");
        } else {
            System.out.println("str1 y str2 son iguales.");
        }
    }
}
