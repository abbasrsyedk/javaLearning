class getsmallestandlargest{
    public static String getSmallestAndLargest(String s, int k) {
        
        //taking a default string for further replacement
        String sus = s.substring(0, k);
        String smallest = sus;
        String largest = sus;
        int a = s.length();
        
        for(int i = 1; i <= (a-k); i++){
            sus = s.substring(i, (i + k));

            if(sus.compareTo(smallest) < 0){   //comaparing the previous smallest to the current substring taken and replacing the smallest value to the variable
                smallest = sus;
            }
            if(sus.compareTo(largest) > 0){ //comaparing the previous largest to the current substring taken and replacing the largest value to the variable
                largest = sus;
            }            
        }
        
        
        return smallest + "\n" + largest;
    }
}