public class Example3 {
    /*
        structuri repetitive:
        for
        while
        do while

     */
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);


        int sum2 = 0;
        int i;
        for(i = n; i > 0; i--) {
            sum2 += i; //sinonim cu: sum2 = sum2 + i
            System.out.println("sum2 = " + sum2 + ", i = " + i);
        }


        int x = 20;
        int result = 1;
        for(int index = 1; index < x; index++) {
            if(index < 15 && index % 3 == 0) {
                result *= index;
            } else {
                continue;
            }
            System.out.println("result = " + result);
        }
    }
}
