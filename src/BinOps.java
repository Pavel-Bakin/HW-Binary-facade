public class BinOps {
    // Метод для сложения двоичных чисел
    public String sum(String a, String b) {
        // Преобразуем двоичные строки в целые числа
        int numA = binaryStringToInt(a);
        int numB = binaryStringToInt(b);
        // Складываем целые числа
        int sum = numA + numB;
        // Преобразуем сумму обратно в двоичную строку и возвращаем
        return intToBinaryString(sum);
    }

    // Метод для умножения двоичных чисел
    public String mult(String a, String b) {
        // Преобразуем двоичные строки в целые числа
        int numA = binaryStringToInt(a);
        int numB = binaryStringToInt(b);
        // Умножаем целые числа
        int product = numA * numB;
        // Преобразуем произведение обратно в двоичную строку и возвращаем
        return intToBinaryString(product);
    }

    // Приватный метод для преобразования двоичной строки в целое число
    private int binaryStringToInt(String binaryStr) {
        // Используем Integer.parseInt с основанием 2 для двоичной системы
        return Integer.parseInt(binaryStr, 2);
    }

    // Приватный метод для преобразования целого числа в двоичную строку
    private String intToBinaryString(int num) {
        // Используем Integer.toBinaryString
        return Integer.toBinaryString(num);
    }
}