package GFG;

public class PrintCharFreqLexographically {
    public static void printCharLexo(String str){
        int [] count = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(count[i]>0) {
                System.out.print((char)(i + 'a')+" "+count[i]+"\n");
            }
        }
    }
    public static void main(String [] args){
        printCharLexo("geeksforgeeks");
    }
}
