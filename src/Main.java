import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] stones = {2.3, 1.2, 0.7, -8.66, 9.9, -5.5, 0.777, 3.1416, 1.618034, -1.05, -13.13, 42.12, 8.5, 7.5, 6.5};
        int k = 0;
        int j = 0;
        double summ = 0;
        for (double check: stones){
            if (check < 0){
                k++;
            }
            if (k > 0 && check > 0){
                j++;
                summ += check;
            }
        }
        if (k > 0 && j > 0) { //Для будущего рандомайзера
            System.out.println(Arrays.toString(stones) + " = " + (summ / j));
        }else {
            System.out.println("Не встречено ни одного отрицательного или положительного после отрицательного числа");
        }
        double z;
        for (int i = 0; i < stones.length; i++) {
            double min = stones[i]; //По умолчанию следующий элемент делаем минимальным
            int q = i;
            for (int x = i; x < stones.length; x++) { //Поиск минимаоьного и его номера в массиве
                if (stones[x] < min) {
                    min = stones[x];
                    q = x;
                }
            }
            z = stones[i]; //Реверсия ячеек
            stones[i] = min;
            stones[q] = z;
            System.out.println(Arrays.toString(stones)); //Вывод ткущего массива
        }
    }
}