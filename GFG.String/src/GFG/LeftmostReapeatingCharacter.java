package GFG;
import java.util.*;

public class LeftmostReapeatingCharacter {
    public static int leftmostRepeatingChar1(String s){  //MyCode
       int i=0;
       int j=1;
       while(i<s.length()-1){
           if(s.charAt(i)==s.charAt(j)){
               return i;
           }else{
               j++;
           }
           if(j==s.length()){
               i++;
               j=i+1;
           }
           if(i==s.length()-1){
               return -1;
           }
       }
       return -2;
    }

    public static int leftmostRepeatingChar2(String s){  //GFG Naive
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int leftmostRepeatingChar3(String s){ //GFG Better approach
        final int CHAR=256;
        int [] count= new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    public static int leftmostRepeatingChar4(String s){ //GFG efficient-1
        final int CHAR=256;
        int [] fIndex= new int[CHAR];
        Arrays.fill(fIndex,-1); //Arrays.fill() method

        int res=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            int fi=fIndex[s.charAt(i)];
            if(fi==-1){
                fIndex[s.charAt(i)]=i;
            }else{
                res=Math.min(res,fi);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }

    public static int leftmostRepeatingChar5(String s){  //GFG efficient-2
        boolean [] visited= new boolean[256];
        int res=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(visited[s.charAt(i)]){
                res=i;
            }else{
                visited[s.charAt(i)]=true;
            }
        }
        return res;
    }
    public static void main(String [] args){
        String s= "geeksforgeeks";
        System.out.println(leftmostRepeatingChar1(s));
        System.out.println(leftmostRepeatingChar2(s));
        System.out.println(leftmostRepeatingChar3(s));
        System.out.println(leftmostRepeatingChar4(s));
        System.out.println(leftmostRepeatingChar5(s));

    }
}
