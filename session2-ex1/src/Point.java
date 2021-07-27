public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // calcul distanta intre 2 puncte cu un comportament (instance method)
    // Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) )
    // x1 si y1 sunt coordonatele primului punct
    // x2 si y2 sunt coordonatele celui de-al doilea punct
    double calculateDistance(int x2, int y2) {
        return Math.sqrt( (this.x - x2) * (this.x - x2) +
                (this.y - y2) * (this.y - y2) );
    }

    static double calculateDistanceStatic(int x1, int y1, int x2, int y2) {
        return Math.sqrt( (x1- x2) * (x1 - x2) +
                (y1 - y2) * (y1 - y2) );
    }

}
