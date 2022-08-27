package GFG;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {
    public static int leftmostNonRepeatingCharacter1(String s){  //GFG Naive
        for(int i=0;i<s.length();i++){
            boolean flag=true;
                for(int j=0;j<s.length();j++){
                    if(i!=j && s.charAt(i)==s.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    return i;
                }
        }
        return -1;
    }

    public static int leftmostNonRepeatingCharacter2(String s){ //GFG Better approach
        final int CHAR=256;
        int [] count= new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }

    public static int leftmostNonRepeatingCharacter3(String s){ //GFG efficient-1
        final int CHAR=256;
        int [] fIndex= new int[CHAR];
        Arrays.fill(fIndex,-1); //Arrays.fill() method

        int res=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            int fi=fIndex[s.charAt(i)];
            if(fi==-1){
                fIndex[s.charAt(i)]=i;
            }else{
                fIndex[s.charAt(i)]=-2;
            }
        }

        for(int i=0;i<256;i++){
            if(fIndex[i]>=0){
                res=Math.min(res,fIndex[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }

    public static void main(String [] args){
        String s="geeksforgeeks";
        System.out.println(leftmostNonRepeatingCharacter1(s));
        System.out.println(leftmostNonRepeatingCharacter2(s));
        System.out.println(leftmostNonRepeatingCharacter3(s));
    }
}
