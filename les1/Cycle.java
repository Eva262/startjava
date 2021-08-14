public class Cycle {
    public static void main(String[] args) {
        System.out.println("Числа от 0 до 20, цикл For");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nЧисла от -6 до 6 с шагом итерации 2, цикл While");
        int i = -6; 
        while (i <= 6) {
            System.out.println(i);
            i += 2;
        }
        
        //Сумма нечетных чисел, цикл Do While
        int j = 10;
        int sumOdd = 0;
        do {
            if (j % 2 > 0) {
                sumOdd += j;
            }
            j++;
        } while (j < 20);
        System.out.println("Сумма нечетных чисел от 10 до 20 равна " + sumOdd);
    } 
}        