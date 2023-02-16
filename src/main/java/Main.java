//Первый семинар.
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)
import java.util.ArrayList;
import java.util.Random;

public class Main {

    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

    public static int randNum() {
        Random rand = new Random();
        System.out.println(rand.nextInt(2000) + 1);
        return 0;
    }

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

    public static int bit(int i) {
        int bin = Integer.toBinaryString(i).length();
        return bin;

    }

    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }

        public static void main(String[] args) {
            int min = Short.MIN_VALUE;
            int max = Short.MAX_VALUE;
            int i = randNum();
            System.out.println("Случайное целое число в диапазоне от 0 до 2000: " + i);
            int n = bit(i);
            System.out.println("Номер старшего бита из i: n = " + n);
            ArrayList<Integer> m1 = arrayMult(i, n, max);
            ArrayList<Integer> m2 = arrayNotMult(i, n, min);
            System.out.println("Массив с кратными n числами в диапазоне от i до Short.MAX_VALUE: " + m1);
            System.out.println("Массив с некратными n числами в диапазоне от Short.MIN_VALUE до i: " + m2);

        }
}

