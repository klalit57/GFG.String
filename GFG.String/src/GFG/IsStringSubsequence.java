package GFG;

public class IsStringSubsequence {
    public static boolean isStringSubsequence1(String s1, String s2){  //mycode
        int n=s1.length();
        int m=s2.length();
        if(n<m){
            return false;
        }else if(m==0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            i++;
        }
        return j==s2.length();
    }

    public static boolean isStringSubsequence2(String s1, String s2){ //gfg using forloop
        int j=0;
        for(int i=0; i<s1.length() && j<s2.length() ; i++){
            if(s1.charAt(i)==(s2.charAt(j))){
                j++;
            }
        }
        return j==s2.length();
    }

    public static boolean isStringSubsequence3(String s1, String s2, int i , int j){  //MyCode Recursive
        if(j==s2.length() && i<=s1.length()){
            return true;
        }else if(j<s2.length() && i==s1.length()){
            return false;
        }else if(i<s1.length() && j<s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                return isStringSubsequence3(s1, s2, i + 1, j + 1);
            } else if (s1.charAt(i) != s2.charAt(j)) {
                return isStringSubsequence3(s1, s2, i + 1, j);
            }
        }
        return false;
    }

    public static boolean isStringSubsequence4(String s1, String s2, int n , int m){  //GFG Recursive
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return isStringSubsequence4(s1,s2,n-1 ,m-1);
        }else{
            return isStringSubsequence4(s1,s2,n-1 ,m);
        }
    }

    public static void main(String [] args){
        String s1="ABCD";
        String s2="AD";

        String s3="GEEKSFORGEEKS";
        String s4="GFRES";

        System.out.println(isStringSubsequence1(s1,s2));
        System.out.println(isStringSubsequence1(s3,s4));

        System.out.println(isStringSubsequence2(s1,s2));
        System.out.println(isStringSubsequence2(s3,s4));

        System.out.println(isStringSubsequence3(s1,s2,0,0));
        System.out.println(isStringSubsequence3(s3,s4,0,0));

        System.out.println(isStringSubsequence4(s1,s2,s1.length(),s2.length()));
        System.out.println(isStringSubsequence4(s3,s4,s3.length(),s4.length()));

    }
}
