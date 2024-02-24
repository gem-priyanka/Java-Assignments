import java.util.Stack;

public class ValidParenthesis {
    public static boolean isBalanced(String s) {
       
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){

                if((!st.isEmpty())&& (s.charAt(i)==')'&& st.peek()=='(')
                          || ((!st.isEmpty()) &&   s.charAt(i)=='}'&& st.peek()=='{')
                          ||((!st.isEmpty()) && s.charAt(i)==']'&&st.peek()=='[')) {
                    st.pop();
                }
                else
                    st.push(s.charAt(i));
               
          }
        
 return st.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "([a+b]*{c-d})";
        String input2 = "{[a+b)*c]";

        System.out.println("Input: " + input1 + ", Output: " + isBalanced(input1));
        System.out.println("Input: " + input2 + ", Output: " + isBalanced(input2));
    }
}

