
public class AddParanthesis {

    public static void main(String[] args) {

        System.out.println(countAddParenthesis(")))"));
    }

    public static int countAddParenthesis(String parenthesis) {

        int bal = 0;
        int ans = 0;

        for(int i = 0; i < parenthesis.length(); i++) {

            bal += parenthesis.charAt(i) == '(' ? 1: -1;

            if(bal == -1){
                ans+=1;
                bal+=1;
            }
        }
        System.out.println("bal " + bal + " ans" + ans);
        return bal+ans;

    }
}

