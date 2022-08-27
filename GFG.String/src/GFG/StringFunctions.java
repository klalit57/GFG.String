package GFG;

public class StringFunctions {
    public static void stringDefine(){
        //Method-1
        char [] arr={'g','e','e','k','s'};
        System.out.println(arr);

        //Method-2
        //Thread saved
        String str1 ="geeks";  // This method is immutable: "geeks" created once is also used by str2 because it
                               // has the same characters
        System.out.println(str1);
                          //or
        String str2 =new String("Mygeeks");
        System.out.println(str2);

        //Method-3
        StringBuffer str3= new StringBuffer("geeks");  //Multithreaded mutable string
        System.out.println(str3);

        //Method-4
        StringBuilder str4= new StringBuilder("geeks");  //Single threaded mutable string
        System.out.println(str4);
    }
    public static void stringCompare(){
        String s1="geeks";
        String s2="geeks"; //s1 and s2 are same string and refers to same string location where "geeks"
        if(s1==s2){  //this equation compares the string location not the string itself
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        String s3= new String("geeks");  //As new keyword a New string  "geeks" created at another location
        if(s1==s3){  //as s1 and s3 location different it is false no matter if there content are same
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

    public static void stringClassFunction1(){
        String str= "geeks";

        System.out.println(str.length()); //length function

        System.out.println(str.charAt(3));  //charAt function at given index

        System.out.println(str.substring(2));  //print substring from index 2 to last

        System.out.println(str.substring(2,4));  //print substring from index 2 to 4, because last index not included

    }

    public static void stringClassFunction2(){
        String s1="geeksforgeeks";
        String s2="geeks";

        System.out.println(s1.contains(s2)); //contains function True or false
        System.out.println(s1.contains("geeky"));

        System.out.println(s2.equals(s2));  //equals function check character by character return boolean
        System.out.println(s2.equals("geeks"));

        int res=s1.compareTo(s2);  //compareTo function  s1-s2
        if(res==0){
            System.out.println("same");
        }
        if(res>0){
            System.out.println("s2 is smaller");
        }
        if(res<0){
            System.out.println("s1 is smaller");
        }

        System.out.println(s1.indexOf(s2)); //indexOf function return start index
        System.out.println(s1.indexOf(s2,1));

    }

    public static void stringClassFunction3(){
        String s1="geeks";
        String s2=s1;

        System.out.println(s1);
        s1=s1+"forgeeks";  //concatenation

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }



    public static void main(String [] args){
        stringDefine();
        System.out.println();
        stringCompare();
        System.out.println();
        stringClassFunction1();
        System.out.println();
        stringClassFunction2();
        System.out.println();
        stringClassFunction3();
        System.out.println();

    }
}
