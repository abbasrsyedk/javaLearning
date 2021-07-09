public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //i created a temporary empty string temp
        String temp = "";
        //for loop to iterate over the words in the string
        //this for loop is in reverse so the charat stores the letters one by one in reverse order of what it was before
        for(int i=(A.length()-1); i>=0;i--){
            //temp gets stored with the reverse string 
            temp += A.charAt(i);  
        }
        // here the .equals method compares both the strings letter by letter by the index and returns true if they are same
            if(temp.equals(A)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
        }
    }