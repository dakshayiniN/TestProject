public class DOWFinder {     /* class */ 
    
    
    String findDOW(int day,int month,int year) {     /*method */ 
        
        int totalDays = (year - 1900) * 365;
        totalDays += (year - 1900)/4;
        if(year % 4 == 0 && month <= 2) {
            totalDays--;
        }
        
        switch(month) {
        case 12:
            totalDays += 30;
        case 11:
            totalDays += 31;
        case 10:
            totalDays += 30;
        case 9: 
            totalDays += 31;
        case 8:
            totalDays += 31;
        case 7: 
            totalDays += 30;
        case 6: 
            totalDays += 31;
        case 5:
            totalDays += 30;
        case 4:
            totalDays += 31;
        case 3:
            totalDays += 28;
        case 2:
            totalDays += 31;
        }
        
        totalDays += day;
        
        int dowIndex = totalDays % 7;
        String[] daysOfWeek = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        return daysOfWeek[dowIndex];
    }

    public static void main(String[] args) {
        DOWFinder finder = new DOWFinder();    /* object */ 
        String dow = finder.findDOW(7,9,2020);
        System.out.println(dow);

    }

}

