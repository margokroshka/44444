import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        main16();
    }

    //первое задание
    public static void main1() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String found = "Не входит";
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int t : ints) {
            if (t == x) {
                found = "Входит";
                break;
            }
        }
        System.out.println(found);
    }


    public static int[] remove(int[] a, int x) {
        return Arrays.stream(a)    // IntStream
                .filter(val -> val != x)
                .toArray();
    }

    public static void main2() {
        int[] a = {1, 2, 3, 4, 5, 3, 7, 8, 3, 10, 11, 3, 13, 14, 3};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        a = remove(a, x);
        System.out.println(Arrays.toString(a));
    }

    public static void main3() {
        double rand = Math.random();
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
        double rand4 = Math.random();

        double[] a = {rand, rand1, rand2, rand3, rand4};
        System.out.println(rand + ", " + rand1 + ", " + rand2 + ", " + rand3 + ", " + rand4);
        double min = Integer.MAX_VALUE;

        double max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println();
        System.out.println("min " + min);
        System.out.println("max " + max);

    }

    public static void main4() {

        int sum = 0;
        int[] randoms = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < randoms.length; i++) {
            sum = sum + randoms[i];
        }
        int sr = sum / 5;
        System.out.println();
        System.out.println(sr);

        int sum1 = 0;
        int[] ints = new int[]{6, 7, 8, 9, 10};
        for (int j = 0; j < ints.length; j++) {
            sum1 = sum1 + ints[j];
        }
        int sr1 = sum1 / 5;
        System.out.println();
        System.out.println(sr1);

        if (sr > sr1) {
            System.out.println("Среднее арифметическое 1 массива больше");
        } else if (sr1 > sr) {
            System.out.println("Среднее арифметическое 2 массива больше");
        } else if (sr == sr1) {
            System.out.println("Среднии арифметические равны");
        }
    }


    public static void main5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenNums = 0;
        int[] randoms = new int[n];
        Random random = new Random();
        int[] ints = new int[n];
        if (n > 5 && n <= 10) {
            System.out.println("n - Удовлетворяет условию");

        } else {
            System.out.println("n - Не Удовлетворяет условию, введите новое число");
            Scanner scanner1 = new Scanner(System.in);
            int n1 = scanner.nextInt();
        }
        int j = 0;
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(50);
            System.out.print(randoms[i] + " ");
            if (randoms[i] % 2 == 0) {
                ints[j] = randoms[i];
                j++;
            }
        }
        //Выведем второй массив
        System.out.println();
        System.out.println("Второй массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    public static void main6() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] randoms = new int[n];
        Random random = new Random();

        int j = 0;
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(50);
            System.out.print(randoms[i] + " ");
            if (i % 2 == 0) {
                randoms[i] = 0;
            }
        }
        //Выведем второй массив
        System.out.println();
        System.out.println("Второй массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(randoms[i] + " ");
        }
    }

    public static void main7() {
        String[] names = new String[]{"Margo", "Darua", "Riri", "Bella", "Avrora", "Dacota"};
        Arrays.sort((names));
        System.out.println(Arrays.toString(names));
    }

    public static void main8() {
        int[] mas = {15, 3, 1, 24, 16};

        boolean Sorted = false;
        int x;
        while (!Sorted) {
            Sorted = true;
            for (int i = 0; i < 4; i++) {
                if (mas[i] > mas[i + 1]) {
                    Sorted = false;
                    x = mas[i];

                    mas[i] = mas[i + 1];

                    mas[i + 1] = x;

                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void main9() {
        int[] mas = new int[]{1, 1, 1, 3, 4, 5, 6, 7};
        boolean R = false;


        for (int t : mas) {
            System.out.print(mas[t] + " ");
            if ((mas[t] == mas[t + 1]) && (mas[t + 1] == mas[t + 2])) {
                R = true;
                break;
            }
        }
        System.out.println();
        System.out.println(R);

    }


    public static void main10() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        for (int t : ints) {
            if ((t % b != 0) && (t % a != 0)) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }


    public static void main11() {
        double max = Integer.MIN_VALUE;
        int[] a = new int[]{6, 7, 8, 9, 10, 12};
        int n = 6;
        int[] ints = new int[n];
        int s = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0) {
                ints[j] = a[i];
                j++;
            }
        }
        //Выведем второй массив
        System.out.println();
        System.out.println("Второй массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(ints[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (ints[i] > max) {
                max = ints[i];
                s = i;
            }
        }
        System.out.println();
        System.out.println(s + 1);
    }


    public static void main12() {
        int[] arr = new int[10];
        Random rng = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rng.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println();

        int[] torem = new int[10];

        for (int i = 0; i < 10; i++) {
            int tbr = i; //Сколько удалить придётся
            int last = Integer.MIN_VALUE;//с чем сравниваем
            for (int j = i; j < 10; j++) {
                if (arr[j] > last) {
                    last = arr[j];
                } else {
                    tbr++;
                    System.out.println("arr[" + j + "]=" + arr[j]);
                }
            }
            torem[i] = tbr;
            System.out.println(tbr);
            System.out.println();
        }


        System.out.println("Result: " + Arrays.stream(torem).min().getAsInt());

    }


// Вроде правильно но не работает

    public static void main13() {
        int ints[] = new int[]{1, 2, 3, 4, 3, 3, 5, 57, 0, -1};
        Arrays.sort(ints);

        int perv = ints[0];
        int popular = ints[0];
        int x = 1;
        int max = 1;

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] == perv) {
                x++;
            } else {
                if (x > max) {
                    popular = ints[i - 1];
                    max = x;
                }
                perv = ints[i];
                x = 1;
            }
            if (ints[i] > max) {
                System.out.println(ints[ints.length - 1]);
            } else System.out.print(popular);

        }

    }


    //Почему K увеливается на 1 даже когда число не соответствует условию
    public static void main14() {
        int k = 0;
        int sr = 0;
        int sum = 0;
        int[] randoms = new int[]{-3, -1, 0, 7, 11, 1, 8, 4};
        Random random = new Random();
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] > (-2)) {
                if (randoms[i] < 10) {
                    System.out.print(randoms[i] + " ");
                    sum = sum + randoms[i];
                    k = i;

                }
                System.out.println();
                System.out.println(k);
                sr = sum / k;
            }
        }
        System.out.println();
        System.out.println(sr);
    }

    public static void main15() {
        int sum = 0;
        int[] arr = new int[30];
        Random rng = new Random();
        for (int i = 0; i < 30; i++) {
            arr[i] = rng.nextInt(500) + 500;
            System.out.print(arr[i] + " ");
            if (arr[i] % 5 == 0) {
                if (arr[i] % 8 == 0) {
                    sum = sum + arr[i];
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    //что надо сделать в последней......


    public static void main16() {
        int[] arr = new int[10];
        fillArray(arr);
        int max = findMaxElement(arr);
        int[] indexes = findIndexesOfMaxElement(arr, max);
        int[] nextArr = new int[arr.length + indexes.length];
        fillNextArray(arr, nextArr, indexes);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        for (int i : nextArr) System.out.print(i + " ");
    }

    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(5);
        }
    }

    public static int findMaxElement(int[] arr) {
        int max = 0;
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static int[] findIndexesOfMaxElement(int[] arr, int max) {
        int[] indexes = new int[10];
        int indexesCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) indexes[indexesCounter++] = i;
        }
        int[] correctIndexes = new int[indexesCounter];
        for (int i = 0; i < indexesCounter; i++) {
            correctIndexes[i] = indexes[i];
        }
        return correctIndexes;
    }

    public static void fillNextArray(int[] arr, int[] nextArr, int[] indexes) {
        int indexesCounter = 0;
        for (int i = 0; i < nextArr.length; i++) {
            if (indexesCounter >= indexes.length) {
                nextArr[i] = arr[i - indexesCounter];
            } else if (i - indexesCounter == indexes[indexesCounter]) {
                nextArr[i] = arr[i - indexesCounter];
                nextArr[++i] = indexes[indexesCounter++];
            } else {
                nextArr[i] = arr[i - indexesCounter];
            }
        }
    }
}











