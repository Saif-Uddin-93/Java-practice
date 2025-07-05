public class LearnJava {
    public static void main (String[] args){
        // Primitive type
        int a = 5;
        char b = 'b';
        long c = 400;
        double d = 3.2;
        float e = 3.14f;

        // non-primitive
        String name = "Saif";

        System.out.println(addExclamationPoint(name));
    }

    public static String addExclamationPoint(String s){
        return s+"!";
    }
}
