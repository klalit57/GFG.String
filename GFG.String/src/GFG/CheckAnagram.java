package GFG;
import java.util.*;


public class CheckAnagram{
    public static boolean isAnagram1(String s1, String s2){ //GFG Naive
          if(s1.length()!=s2.length()){
              return false;
          }
          char [] a1= s1.toCharArray();  //toCharArray Method string=>char array
          Arrays.sort(a1);
          s1= new String(a1);
        char [] a2= s2.toCharArray();  //toCharArray Method string=>char array
        Arrays.sort(a2);
        s2= new String(a2);

        return s1.equals(s2);  //string equal Method
        //return Arrays.equals(a1,a2);   //Arrays equal function
    }

    public static boolean isAnagram2(String s1, String s2){ //GFG efficient
        if(s1.length()!=s2.length()){
            return false;
        }
        int [] count= new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(isAnagram1("listen", "silent"));
        System.out.println(isAnagram2("listen", "silent"));
    }
}
