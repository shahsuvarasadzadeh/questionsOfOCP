package l_DataTypes;

public class Q_2 {
    public static void main(String[] args) {
        // What is the value of tip after executing the following code snippet?
        int meal=5;
        int tip=2;
        var total=meal+(meal>6 ? tip++:--tip);
        var total1=meal+(meal>6 ? tip++:--tip);
        System.out.println(total);
        System.out.println(total1);
    }
}
