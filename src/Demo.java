public class Demo {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("i는 = " + i);
            sum += i;
            sum2 += sum;

            System.out.println("sum은 = " + sum);
            System.out.println("sum2은 = " + sum2);
            System.out.println();

        }

    }

}
