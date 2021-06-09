package com.day;

public class Calender_test {
	
	   // ���� ���� üũ
    public static boolean isNumber(String str){
        boolean result = false; 
        try{
            Double.parseDouble(str) ;
            result = true ;
        }catch(Exception e){}
         
         
        return result ;
    }
     
    
    // �޷��� Ÿ��Ʋ�� �ٵ�
    public static void printCalender(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
 
    }
 
    // �ش� �⵵�� �������� �Ǻ�
    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
 
    // �޷� �ٵ� ���
    private static void printMonthBody(int year, int month) {
        int count = 0;
 
        for (int i = 1; i <= getNumberOfDaysInMonth(year, month); i++) {
            if (i < 2) {
                for (int y = 1; y <= getStartDay(year, month); y++) {
                    System.out.print("\t ");
                    count += 1;
                }
            }
 
            System.out.printf("\t %2d", i);
            count += 1;
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }
    }
 
    // �ش� ���� ù ������ ���ؼ� ������.
    private static int getStartDay(int year, int month) {
        int monthSum = 0;
        int leapYear = 0;
        int daySum = 1;
 
        for (int i = 1; i < year; i++) {
            monthSum += 365;
            if (isLeapYear(i) == true) {
                leapYear += 1;
            }
        }
 
        for (int j = 1; j < month; j++) {
            daySum += getNumberOfDaysInMonth(year, j);
        }
 
        return (monthSum + leapYear + daySum) % 7;
 
    }
 
    // ���� ������ ���� ����
    private static int getNumberOfDaysInMonth(int year, int month) {
 
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2 && isLeapYear(year) == true) {
            return 29;
        } else if (month == 2 && isLeapYear(year) == false) {
            return 28;
        } else {
            return 31;
        }
    }
    
    // ���� Ÿ��Ʋ �κ� ���
    private static void printMonthTitle(int year, int month) {
        System.out.println();
        System.out.println("\t" + year + "��\t\t\t\t\t\t" + getMonthName(month));
        System.out.println("\t===================================================");
        System.out.println("\t��\t��\tȭ\t��\t��\t��\t��");
        System.out.println("\t===================================================");
    }
    

    
    private static String getMonthName(int month) {
        String monthName = null;
        switch (month) {
        case 1:
            monthName = "1��";
            break;
        case 2:
            monthName = "2��";
            break;
        case 3:
            monthName = "3��";
            break;
        case 4:
            monthName = "4��";
            break;
        case 5:
            monthName = "5��";
            break;
        case 6:
            monthName = "6��";
            break;
        case 7:
            monthName = "7��";
            break;
        case 8:
            monthName = "8��";
            break;
        case 9:
            monthName = "9��";
            break;
        case 10:
            monthName = "10��";
            break;
        case 11:
            monthName = "11��";
            break;
        case 12:
            monthName = "12��";
            break;
        }
        return monthName;
    }
    
    static String str_calendar(int year, int month) {
//    	int count = 0;
    	String s = "";
        for (int i = 1; i <= getNumberOfDaysInMonth(year, month); i++) {
//            if (i < 2) {
////                for (int y = 1; y <= getStartDay(year, month); y++) {
//////                    System.out.print("\t ");
////                    count += 1;
////                }
//            }
            s += i+"";
        }
		
		return s;
	}
	
    static String str_firstday(int year, int month) {
    	return getMonthName(month);
    	}
    
    static String strMonthTitle(int year, int month) {
    	String s = "";
    	s = "\n" + "\t" + year + "��\t\t\t\t\t\t" + getMonthName(month)+ "\n" + "\t==================================================="
    			+ "\n"+"\t��\t��\tȭ\t��\t��\t��\t��"+"\n\t===================================================";
    	return s;	
    }
    
    static String strMonthBody(int year, int month) {
        int count = 0;
        String s1 = " ";
        for (int i = 1; i <= getNumberOfDaysInMonth(year, month); i++) { //���ڸ� ���� �޼���
            if (i < 2) {
                for (int y = 1; y <= getStartDay(year, month); y++) { // �ſ� ù ���� ���۵Ǵ� ����
//                    System.out.print("\t ");
                    count += 1;
                    s1 += "\t ";
                }
            }
 
//            System.out.printf("\t %2d", i);
            s1 += "\t" + i; 
            count += 1;
            if (count == 7) {
//                System.out.println();
            	s1 += "\n";
                count = 0;
                
            }
        }
		return s1;
        
    }
    static String strCalender(int year, int month) {
        return strMonthTitle(year, month)+"\n" + strMonthBody(year, month);
 
    }
    }

	

