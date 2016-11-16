import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sample {
    static int count(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
           int j=i+2;
            while(j<=s.length()){
            String s1=s.substring(i,j);
            boolean b;
               b = checkcon(s1);
               if(b== true) count++;//System.out.println(s1);}
                     
            
            j+=2;
           }           
        }
    return count;
    }
    static boolean checkcon(String a)
    {   int i;
        String a1 ="",a2="";
        for(i=0;i<a.length()/2;i++){
            a1=a1.concat("0");
            a2=a2.concat("1");
        }
        for(i=0;i<a.length()/2;i++){
            a1=a1.concat("1");
            a2=a2.concat("0");

        }
        if(a.equals(a1) || a.equals(a2))
                return true;
            else 
                return false;
    }
    public static void main(String[] args) throws IOException{
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        String _s = "101000101001101";
//        try {
//            _s = in.nextLine();
//        } catch (Exception e) {
//            _s = null;
//        }
        
        res = count(_s);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//        
//        bw.close();
System.out.println(res);
    }
}