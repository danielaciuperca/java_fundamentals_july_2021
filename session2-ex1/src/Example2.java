public class Example2 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(7, 3);

        System.out.println("distanta intre p1 si p2: " +
                p1.calculateDistance(p2.x, p2.y));

        System.out.println("distanta intre p1 si p2 " +
                "cu metoda statica: " +
                Point.calculateDistanceStatic(p1.x, p1.y, p2.x, p2.y));
    }
}
