package MathodsExpresionsStatements;

public class VaragsMethod {

    public static void main(String... args) {
        someMethod("str", 42,10,17.23,4);
        // Calling the varargs method with
        // different number of parameters

        // one parameter
        fun(100);

        // four parameters
        fun(1, 2, 3, 4);

        // no parameter
        fun();
    }

    private static String someMethod(
            String s, int i, double... arr
    ){
        System.out.println(arr[0] + ", " + arr[1]+ ", " + arr[2]);
        return s;
    }

    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                + a.length);

        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
