    public static String findDay(int month, int day, int year) {
        // Date d=new Date(month,day,year);  
        // String[] weekdays= new String[7];
        // weekdays[3]= "SUNDAY";  
        // weekdays[4]= "MONDAY";   
        // weekdays[5]= "TUESDAY";
        // weekdays[6]= "WEDNESDAY";
        // weekdays[0]= "THURSDAY";
        // weekdays[1]= "FRIDAY";
        // weekdays[2]= "SATURDAY"; 
        // int a = d.getDay();
        // System.out.println(a);
        // return weekdays[a];
        LocalDate LD = LocalDate.of(year, month , day);
        return(LD.getDayOfWeek().toString());
    }