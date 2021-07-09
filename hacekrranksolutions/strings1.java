public class Solution {
    
    //creating a method to capitalize only the first letter of the String
    public static String capitalize(String str){
        if(str == null){                            // || str.isEmpty()
            return str;
        }
        else{
        return (str.substring(0,1).toUpperCase() + str.substring(1));
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
    
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length()+B.length();
        System.out.println(a); //firstLine
        
        if(A.compareTo(B)>0){
            // return b;
            System.out.println("Yes"); //secondLine           
        }
        else{
            System.out.println("No"); //secondLine
            // b = "No";
            // return b;
        }
        // String c = A.toUpperCase() + B.toUpperCase();
        // System.out.println(b);
        
        System.out.println(capitalize(A) + " " + capitalize(B));//thirdline
        
        
        
        
        
    }
}
