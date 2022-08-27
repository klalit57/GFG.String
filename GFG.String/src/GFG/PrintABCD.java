package GFG;

public class PrintABCD {
    public static void printABCD(){
        for(int i=0;i<26;i++){
            System.out.print((char)(i+97)+" ");
        }
        System.out.println();
        for(int i=0;i<26;i++){
            System.out.print((char)(i+65)+" ");
        }
    }
    public static void main(String [] args){
        printABCD();
    }
}
