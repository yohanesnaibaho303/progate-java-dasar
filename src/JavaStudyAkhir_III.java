import java.util.Scanner;

public class JavaStudyAkhir_III {
    //menerima input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Depan: ");
        String firstName = scanner.next();

        System.out.print("Nama Belakang: ");
        String lastName = scanner.next();

        System.out.print("Usia: ");
        int age = scanner.nextInt();

        System.out.print("Tinggi Badan (m): ");
        double height = scanner.nextDouble();

        System.out.print("Berat Badan (kg): ");
        double weight = scanner.nextDouble();

        Person_III.printData(Person_III.fullName(firstName, lastName),age ,height, height);

    }
}
