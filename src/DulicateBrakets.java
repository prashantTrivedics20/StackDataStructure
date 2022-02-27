// Question -> duplicates brackets in stack
//input 1-for exe->  ((a+b)+(c+d)) it means the string dosen't contains any brackets then you have to return "false"
//input 2-for exe->  (a+b)+((c+d)) it means the string contains duplicate brackets then you have to return "true"
import java.util.*;
public class DulicateBrakets {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        Stack<Character>st=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    System.out.println(true);
                    return;
                }
                else
                {
                    while ((st.peek()!='('))
                    {
                        st.pop();
                    }
                    st.pop();
                }

            }
            else
            {
                st.push(ch);
            }
        }
        System.out.println(false);
    }

}
// Question -> duplicates brackets in stack
//input 1-for exe->  ((a+b)+(c+d)) it means the string dosen't contains any brackets then you have to return "false"
//input 2-for exe->  (a+b)+((c+d)) it means the string contains duplicate brackets then you have to return "true"
