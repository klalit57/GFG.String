package GFG;
import java.util.*;

public class ReverseWordsInString {
    public static void reverseWordsInString1(String str){  //GFG Naive using stack
        Stack<String>  s= new Stack<>();
        String temp="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') {
                s.push(temp);
                temp="";
            }else{
                temp=temp+str.charAt(i);
            }
        }
        s.push(temp);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
    }

    public static void reverseWordsInString2(String str){  //GFG inspace
        int start=0;
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                reverse(arr,start,i-1);
                start=i+1;
            }
        }

        reverse(arr,start,arr.length-1);
        reverse(arr,0,arr.length-1);
        String revString = new String(arr); //convert char array to string
        System.out.println(arr); //print char Array
        System.out.println(revString);  //print string
    }

    public static void reverse(char [] arr, int low, int high){
        while(low<high){
            char temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }

    public static void main(String [] args){
        String str1="Welcome to gfg";
        String str2="I love coding";
        String str3="abc";

        reverseWordsInString1(str1);
        reverseWordsInString1(str2);
        reverseWordsInString1(str3);

        reverseWordsInString2(str1);
        reverseWordsInString2(str2);
        reverseWordsInString2(str3);
    }
}
