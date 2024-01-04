package MathodsExpresionsStatements;

public class StringClass {
    public static void main(String[] args) {
        //String literals java 14
        String s = "abc";
        String t = "abc";
        System.out.println("=========>String literals");
        System.out.println(s==t);
        System.out.println("abc" == t);

        //String objects
        String s1 = new String("abc");
        String t1 = new String("abc");


        System.out.println("\n\n=========>String objects");
        System.out.println(s1==t1 );
        System.out.println("abc" == t1);
        System.out.println("abc" == t1.intern());
        System.out.println(t1 == "abc"); //t1 is a different object and not the literal


        //Text blocks
        //Old version
        String html =   "<html>\n"+
                        "   <body>\n"+
                        "       <p>Hello world.</p>\n" +
                        "   </body>\n" +
                        "</html>\n";

        //After Java 15
        String html1 = """
                 <html>
                   <body>
                       <p>Hello world.
                   </body>
                </html>
                """;

        System.out.println("\n\n=========>String text blocks");
        System.out.println(html1);
        System.out.println(html);

        //String Imutability
        String str1 = "abc";
        String r1 = str1;
        str1 = str1 + "def";
        String r2 = str1;
        System.out.println("\n\n=========>String immutability");
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));

    }
}
