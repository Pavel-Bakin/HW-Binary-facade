public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса BinOps
        BinOps bins = new BinOps();

        // Двоичные числа для операций
        String binaryNum1 = "1101";
        String binaryNum2 = "1010";

        // Вызываем методы сложения и умножения из BinOps
        String sumResult = bins.sum(binaryNum1, binaryNum2);
        String multResult = bins.mult(binaryNum1, binaryNum2);

        // Выводим результаты
        System.out.println("Binary Sum: " + sumResult);
        System.out.println("Binary Multiplication: " + multResult);
    }
}