package GFG;

public class PalindromCheck {
    public static boolean palindromCheck1(String str){ //MyCode using forloop
        int mid= (str.length()-1)/2;
        int last=(str.length()-1);
        for(int i=0;i<=mid;i++){
            if(str.charAt(i)!=str.charAt(last-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindromCheck2(String str){ //MyCode using whileloop , GFG efficient
        int low=0;
        int high=str.length()-1;

        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static boolean palindromCheck3(String str){  //GFG Naive
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();  //reverse method

        return str.equals(rev.toString());  //toString method string equivalent of stringBuilder
    }

    public static void main(String [] args){
        String str1= "ABCDCBA";
        String str2= "ABBA";
        String str3= "geeks";

        System.out.println(palindromCheck1(str1));
        System.out.println(palindromCheck1(str2));
        System.out.println(palindromCheck1(str3));


        System.out.println(palindromCheck2(str1));
        System.out.println(palindromCheck2(str2));
        System.out.println(palindromCheck2(str3));

        System.out.println(palindromCheck3(str1));
        System.out.println(palindromCheck3(str2));
        System.out.println(palindromCheck3(str3));
    }
}
