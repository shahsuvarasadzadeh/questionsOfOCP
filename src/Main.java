import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int [] arr={6,25,23,15,5};
        int max=arr[0];
        int index =0;
        int index1 =0;
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
                index1=i;
            }
        }
        arr[index]=min;
        arr[index1]=max;
        System.out.println(Arrays.toString(arr));
        List<int[]> list;
        list = Collections.singletonList(arr);
        System.out.println(list);
    }
}