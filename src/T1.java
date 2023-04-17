import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        int [] arr={2,25,23,15,5};
        int [] arr1={2,27,26,15,5,6};
        List<Integer> integers=new ArrayList<>();
        integers.add(5);
        integers.add(6);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr1.length;j++){
                if (arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
