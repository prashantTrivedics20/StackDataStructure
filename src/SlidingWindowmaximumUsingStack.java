import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowmaximumUsingStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int k=Integer.parseInt(br.readLine());
        //code
        // nextgreater element
        Stack<Integer> st=new Stack<>();
        int []nge=new int[arr.length];
        st.push(arr.length-1);
        nge[arr.length-1]=arr.length;
        for (int i = arr.length-2; i >=0; i--) {
            while(st.size()>0&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0)
            {
                nge[i]=arr.length;
            }
            else
            {
                nge[i]=st.peek();
            }
            st.push(i);

        }
        for (int i = 0; i <nge.length ; i++) {// next greater index
            System.out.println(nge[i]);
        }
        int j=0;
        for (int i = 0; i <=arr.length-k; i++) {
            // Enter the loop to find the maximum of window starting at i;
            if(j<i)
            {
                j=i;
            }
            while(nge[j]<i+k)
            {
                j=nge[j];

            }
            //System.out.print(j);// index element of the maximum windows
            System.out.print(arr[j]);// maximum value of for each slide
        }


    }
}
