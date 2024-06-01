
        import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
//задание 1,1

                int[] numbers = new int[12];
                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                System.out.print(numbers[0]);
                System.out.print(numbers[1]);
                System.out.print(numbers[2]);
                System.out.print(numbers[3]);
                System.out.print(numbers[4]);
                System.out.print(numbers[5]);
                System.out.print(numbers[6]);
                System.out.print(numbers[7]);
                System.out.print(numbers[8]);
                System.out.print(numbers[9]);
                System.out.print(numbers[10]);
                System.out.println(numbers[11]);
                System.out.print(" ");
                System.out.print(" ");

                //задание 1.2

                double[] numbers2 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                System.out.println(numbers2[2]);
                System.out.println(" ");

                //задание 1.3

                int[] box = {10, 9, 8};
                System.out.println(box[0]);
                System.out.println(" " + " ");

                //задание 2

                int[] numberss = new int[]{1, 2, 3};
                for (int i = 0; i < 12; i++) {
                    System.out.print(numbers[i]);
                    if (i < 11) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" ");


                //задание 2.1

                double[] numbersss = {1.57, 7.654, 9.986};

                for (int i = 0; i < 3; i++) {
                    System.out.print(numbersss[i]);
                    if (i < 2) {
                        System.out.print(", ");
                    }
                }

                System.out.println(" ");

                //задание 2.2

                int[] boxs = {10, 9, 8};

                for (int i = 0; i < 3; i++) {
                    System.out.print(boxs[i]);
                    if (i < 2) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" ");
                System.out.println(" ");

                //задание 3

                int[] numberssss = new int[]{1, 2, 3};
                for (int i = numberssss.length - 1; i >= 0; i--) {
                    System.out.print(numberssss[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" ");
                System.out.println(" ");
                //задание 3.1


                double[] numbersssss = new double[]{1.57, 7.654, 9.986};

                for (int i = numbersssss.length - 1; i >= 0; i--) {
                    System.out.print(numbersssss[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println(" ");
                System.out.println(" ");
                //задание 4

                int[] numbers7 = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
                for (int i = 0; i < numbers7.length; i++) {
                    System.out.println((numbers7)[i]);
                    if (numbers7[i] % 2 != 0) {
                        numbers7[i] = numbers7[i] + 1;
                    } else {
                        numbers7[i] = 0;
                    }

                }
                System.out.println(Arrays.toString(numbers7));
            }
        }




