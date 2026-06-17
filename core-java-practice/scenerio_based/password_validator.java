import java.util.Scanner;
public class password_validator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(password(s, 0));

    }
    private static boolean password(String s,int idx){
        if(s==null || idx>=s.length()-1){
            return false;
        }
        if(Character.isLowerCase(s.charAt(idx))){
            return true;
        }
        return password(s,idx+1);

    }
}
