public class Example2 {
    /*
        structuri decizionale
        if
        switch

        operatori logici scurtcircuitati:
        &&
        ||

        &
        |
     */

    public static void main(String[] args) {
        int x = 10;

        if(x % 2 == 0 || x > 0){
            System.out.println("x este divizibil cu 2 sau pozitiv");
        } else {
            System.out.println("x nu divizibil cu 2");
        }

        String day = "Sunday";

        switch(day) {
            case "Monday" : System.out.println("Today is Monday");
                break;
            case "Tuesday" : System.out.println("Today is Tuesday");
                break;
            case "Saturday", "Sunday" : System.out.println("Today is weekend");
                break;
            default : System.out.println(":)");
        }
    }
}
