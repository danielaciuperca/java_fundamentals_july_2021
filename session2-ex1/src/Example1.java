public class Example1 {
    /*
        static:
        - modifier applied to instance variables (attributes) changes them from attributes
            to class variables. you can access them using the class name. they don't need
            an instance to be created in memory
        - modifier applied to instance methods changes them from instance methods to class
            methods. you can access them using the class name. they won't have access to any
            attribute of other instance methods. they will only have access to other
            static variables or static methods

     */
    public static void main(String[] args) {
        System.out.println("max: " + Math.max(1, 7));

    }
}
