public class Example4 {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        int i = 0;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum + " , i = " + i);


        int x = 15;
        int sum2 = 0;
        int j = 0;
        do {
            sum2 += j;
            j++;
        } while(j <= x);
        System.out.println("sum2 = " + sum2 + " , j = " + j);

    }
}
