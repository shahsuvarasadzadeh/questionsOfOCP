package l_DataTypes;

public class Q_4 {
    /*   What is the output of the following?
               12: var b = "12";
   13: b += "3";
   14: b.reverse();
   15: System.out.println(b.toString());
       A. 12
       B. 123
       C. 321
       D. The code does not compile.*/
    public static void main(String[] args) {
        var b="12";
        b+="3";
       // b.reverse();
        System.out.println(b.toLowerCase());
    }
}
