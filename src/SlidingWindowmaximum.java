import java.util.Scanner;
public class SlidingWindowmaximum {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        int k=readme.nextInt();
        for (int i = 0; i < arr.length-(k-(arr.length%k)); i++) {// with O(n^2) complexity...
            int max=0;
            for (int j = i; j < k+i; j++) {
                try {
                    if (max < arr[j]) {
                        max = arr[j];
                    }

                }
                catch (Exception e)
                {

                }
            }
            System.out.print(max+" ");


        }
    }
}
