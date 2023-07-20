import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CheckPalindrome {
    public static boolean Pal(String S, int start, int end){
        if(start>end){
            return true;
        }
        if(start!=end){
            return false;
        }
        return Pal(S,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int start=S.charAt(0);
        int n=S.length();
         int end=S.charAt(n-1);
        System.out.println(CheckPalindrome.Pal(S,start,end));
    }
}