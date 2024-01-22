import java.util.Scanner;
public class JavaLatihan_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle_Latihan_II bicycle = new Bicycle_Latihan_II("Bianchi", "Hijau");

        System.out.println("【Info Sepeda】");

        bicycle.printData();
        System.out.println("----------------");
        System.out.print("Masukkan jarak yang akan ditempuh: ");

        int bicycleDistance = scanner.nextInt();
        bicycle.run(bicycleDistance);

        System.out.println("=================");
        Car_Latihan_II car = new Car_Latihan_II("Ferrari", "Merah");
        System.out.println("【Info Mobil】");
        car.printData();
        System.out.println("-----------------");
        System.out.print("Masukkan jarak yang akan ditempuh: ");
        int carDistance = scanner.nextInt();
        car.run(carDistance);

        System.out.println("-----------------");
        System.out.print("Masukkan jumlah isi ulang bahan bakar: ");
        int carLitre = scanner.nextInt();
        car.charge(carLitre);
    }
}
