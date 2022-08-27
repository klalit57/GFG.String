package GFG;

public class PatternSearching {
    public static void patternSearching1(String text, String pat){
        int m=pat.length();
        int n=text.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=text.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void distinctPatternSearching2(String text, String pat){ //improoved Naive
        int m=pat.length();
        int n=text.length();

        for(int i=0;i<=(n-m);){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=text.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
            if(j==0){
                i=i+1;
            }else{
                i=(i+j);
            }
        }
        System.out.println();
    }


    public static void main(String [] args){
        String s1= "GEEKSFORGEEKS";
        String pat1="EKS";

        String s2= "AAAAA";
        String pat2="AAA";

        String s3= "ABCABCD";
        String pat3="ABD";

        patternSearching1(s1,pat1);
        patternSearching1(s2,pat2);
        patternSearching1(s3,pat3);

        distinctPatternSearching2(s1,pat1);
        distinctPatternSearching2(s2,pat2);
        distinctPatternSearching2(s3,pat3);
    }
}
