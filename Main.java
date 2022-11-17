import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


interface AnonClass {
    public void anonAlph();
    public void anonSize();
}

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        cars.add("Volvo");
        cars.add("Tesla");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Subaru");
        cars.add("Porsche");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Chrysler");
        cars.add("Hyundai");

        AnonClass anon = new AnonClass() {
            @Override
            public void anonAlph() {
                Collections.sort(cars);
            }

            @Override
            public void anonSize() {
                Collections.sort(cars, Comparator.comparingInt(String::length));
            }
        };

        System.out.println("Selecciona una opcion");
        System.out.println("1 Anon alfabeto");
        System.out.println("2 Anon tamaño");
        System.out.println("3 Lambda alfabeto");
        System.out.println("4 Lambda tamaño");
        System.out.println("5 Ref alfabeto");
        System.out.println("6 Ref tamaño");

        int num = scan.nextInt();

        switch(num){
            case 1:
                System.out.println(cars);
                anon.anonAlph();
                System.out.println(cars);
                break;
            case 2:
                System.out.println(cars);
                anon.anonSize();
                System.out.println(cars);
                break;
            case 3:
                System.out.println(cars);
                cars.sort((p1, p2) -> p1.compareTo(p2));
                System.out.println(cars);
                break;
            case 4:
                System.out.println(cars);
                cars.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));
                System.out.println(cars);
                break;
            case 5:
                System.out.println(cars);
                Collections.sort(cars, String::compareToIgnoreCase);
                System.out.println(cars);
                break;
            case 6:
                System.out.println(cars);
                Collections.sort(cars, Comparator.comparingInt(String::length));
                System.out.println(cars);
                break;
        }
    }
}