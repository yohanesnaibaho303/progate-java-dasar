public class JavaStudyAkhir_V {
    public static void main(String[] args) {
        Person_V person1 = new Person_V("Murni", "Aminah", 27, 1.6, 50.0);
        Person_V person2 = new Person_V("Yahya", "Nasrun", "Rizal", 65, 1.75, 80.0);

        Car car = new Car("Ferrari", "Merah");
        Bicycle bicycle = new Bicycle("Bianchi", "Hijau");

        person1.buy(car);

        person2.buy(bicycle);

        System.out.println("【Info Mobil】");
        car.printData();
        System.out.println("-----------------");
        System.out.println("【Info Pemilik Mobil】");
        car.getOwner().printData();

        System.out.println("=================");
        System.out.println("【Info Sepeda】");
        bicycle.printData();
        System.out.println("-----------------");
        System.out.println("【Info Pemilik Sepeda】");
        bicycle.getOwner().printData();
    }
}

abstract class Vehicle {
    private String name;
    private String color;
    protected int distance = 0;
    private Person_V owner;

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getDistance() {
        return this.distance;
    }
    public Person_V getOwner() {
        return this.owner;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOwner(Person_V person) {
        this.owner = person;
    }

    public void printData() {
        System.out.println("Nama: " + this.name);
        System.out.println("Warna: " + this.color);
        System.out.println("Jarak: " + this.distance + "km");
    }

    abstract public void run(int distance);
}

class Car extends Vehicle {
    private int fuel = 50;

    Car(String name, String color) {
        super(name, color);
    }

    public int getFuel() {
        return this.fuel;
    }

    public void printData() {
        super.printData();
        System.out.println("Bahan Bakar: " + this.fuel + "L");
    }

    public void run(int distance) {
        System.out.println("Bergerak " + distance + "km ...");
        if (distance <= this.fuel) {
            this.distance += distance;
            this.fuel -= distance;
        } else {
            System.out.println("Bahan bakar tidak mencukupi");
        }
        System.out.println("Jarak: " + this.distance + "km");
        System.out.println("Bahan Bakar: " + this.fuel + "L");
    }

    public void charge(int litre) {
        System.out.println("Menambah " + litre + "L ...");
        if (litre <= 0) {
            System.out.println("Tidak ada bahan bakar tertambahkan");
        } else if (litre + this.fuel >= 100) {
            System.out.println("Tangki sekarang penuh");
            this.fuel = 100;
        } else {
            this.fuel += litre;
        }
        System.out.println("Bahan Bakar: " + this.fuel + "L");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String name, String color) {
        super(name, color);
    }

    public void run(int distance) {
        System.out.println("Bergerak " + distance + "km ...");
        this.distance += distance;
        System.out.println("Jarak: " + this.distance + "km");
    }
}

class Person_V {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    Person_V(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Person_V(String firstName, String middleName, String lastName, int age, double height, double weight) {
        this(firstName, lastName, age, height, weight);
        this.middleName = middleName;
    }

    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }

    public void printData() {
        System.out.println("Nama saya adalah " + this.fullName() + ".");
        System.out.println("Saya berusia " + this.age + " tahun.");
        System.out.println("Tinggi Badan saya " + this.height + "m.");
        System.out.println("Berat Badan saya " + this.weight + "kg.");
        System.out.println("Nilai BMI saya " + Math.round(this.bmi()) + ".");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    // Gabungkan dua method berikut ini menjadi satu method
    public void buy(Vehicle vehicle) {
        vehicle.setOwner(this);
    }
}


