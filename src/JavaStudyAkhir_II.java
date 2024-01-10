public class JavaStudyAkhir_II {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7 ,8 , 9 ,10};

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                evenSum = evenSum + number[i];
            } else {
                oddSum += number[i];
            }
        }

        // menggunakan enhanced loop
//        for (int i : number) {
//            if (i % 2 == 0) {
//                evenSum = evenSum + i;
//            } else {
//                oddSum += i;
//            }
//        }

        System.out.println("Jumlah Bilangan Ganjil Sebanyak: " + oddSum);
        System.out.println(("Jumlah Bilangan Genap Sebanyak: " + evenSum));
    }
}
