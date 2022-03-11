package geeks;
import java.util.Scanner;
public class rev {
    public static void  main(String[] args) {
        Scanner out = new Scanner(System.in);
        String n = out.nextLine();
        String n1[]=n.split("\\.");
        String  ans="";
            for(int i=n1.length-1;i>=0;i--) {
                ans += n1[i];
                if(i>0){
                    ans+=".";
                }
            }
        System.out.print(ans);
    }}