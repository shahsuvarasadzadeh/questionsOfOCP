package l_DataTypes;

public class Q_5 {
    public static void main(String[] args) {
        // What is the output of the following?
        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }
}