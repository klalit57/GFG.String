package GFG;

public class RabinKarpAlgorithm {
    static final int d=256;
    static final int q=101;

    public static void rabinKarpSearch1(String text, String pat){
        int m= pat.length();
        int n= text.length();

        int h=1;

        for(int i=1;i<m;i++){
            h=(h*d)%q;  //d= distinct element in text , q= large prime number
        }
        int p=0;
        int t=0;

        for(int i=0;i<m;i++){
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+text.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++){
             if(p==t){
                 boolean flag=true;
                 for(int j=0;j<m;j++){
                     if(text.charAt(i+j)!=pat.charAt(j)){
                         flag=false;
                         break;
                     }
                 }
                 if(flag==true){
                     System.out.print(i+" ");
                 }
             }
             if(i<n-m){
                 t=((d*(t-text.charAt(i)*h))+text.charAt(i+m))%q;
                 if(t<0){
                     t=t+q;
                 }
             }
        }

    }
    public static void main(String [] args){
        String s1= "GEEKSFORGEEKS";
        String pat1="EKS";

        String s2= "AAAAA";
        String pat2="AAA";

        String s3= "ABCABCD";
        String pat3="ABD";

        rabinKarpSearch1(s1,pat1);

        rabinKarpSearch1(s2,pat2);

        rabinKarpSearch1(s3,pat3);

    }
}
