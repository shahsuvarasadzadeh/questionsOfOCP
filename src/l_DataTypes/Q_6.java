package l_DataTypes;

public class Q_6 {
    public static void main(String[] args) {
        // What is the output of the following?
        var line = new String("-");
        var anotherLine = line.concat("-");
        System.out.print(line == anotherLine); // false
        System.out.print(" ");
        System.out.print(line.length()); // 1
    }
}
