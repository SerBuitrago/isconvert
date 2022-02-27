package com.isconvert.util;

public class SystemUtil {

    public static final String ADD_VALUE = "0";

    public static final Integer BINARY_BASE = 2;
    public static final String BINARY_VALUE = "01";

    public static final Integer OCTAL_BASE = 8;
    public static final String  OCTAL_VALUE = "01234567";
    public static final Integer  OCTAL_GROUP_VALUE = 3;
    public static final String [] OCTAL_GROUP = {
            "000", "001", "010", "011",
            "100", "101", "110", "111"
    };

    public static final Integer DECIMAL_BASE = 10;
    public static final String DECIMAL_VALUE= "0123456789";

    public static final Integer HEXADECIMAL_BASE = 16;
    public static final String HEXADECIMAL_VALUE = "0123456789ABCDEF";
    public static final Integer  HEXADECIMAL_GROUP_VALUE = 4;
    public static final String [] HEXADECIMAL_GROUP = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    public static <T> boolean isBinary(T number){
        return isValid(number, BINARY_VALUE);
    }

    public static <T> boolean isOctal(T number){
        return isValid(number, OCTAL_VALUE);
    }

    public static <T> boolean isDecimal(T number){
        return isValid(number, DECIMAL_VALUE);
    }

    public static <T> boolean isHexadecimal(T number){
        return isValid(number, HEXADECIMAL_VALUE);
    }

    public static <T> boolean isValid(T number, String value){
        if(number == null || value == null)
            return false;
        String numberToString = String.valueOf(number);
        for(char indexValue: numberToString.toCharArray()){
            if(value.indexOf(indexValue) == -1)
                return false;
        }
        return true;
    }

    public static String flip(String number){
        if(number == null)
            return null;
        String numberResult = "";
        for(int index= number.length()-1; index >= 0; index--)
           numberResult += String.valueOf(number.charAt(index));
        return numberResult;
    }

    public static Integer findArray(String [] array, String value){
        for(int index= 0; index < array.length; index++){
            if(array[index].equalsIgnoreCase(value))
                return index;
        }
        return -1;
    }

    public static String [] toArray(String number){
        String [] array = new String[number.length()];
        for(int index= 0; index < number.length(); index++){
            array[index] = String.valueOf(number.charAt(index));
        }
        return array;
    }

    public static String [] countGroupAndAdd(String number, Integer group, String add, boolean isLeft){
        Integer count = countGroup(number.length(), group);
        number = addGroup(number, count, add, isLeft);
        return arrayGroup(number, group);
    }

    public static Integer countGroup(Integer sizeNumber, Integer group){
        Integer module = sizeNumber % group;
        return  module == 0 ? module : group -module;
    }

    public static String [] arrayGroup(String number, Integer group){
        String [] array = new String[number.length() / group];
        int indexArray = 0;
        String numberGroup = "";
        for(int index = 0; index < number.length(); index++){
            numberGroup += String.valueOf(number.charAt(index));
            if((1+index) % group == 0) {
                array[indexArray++] = numberGroup;
                numberGroup = "";
            }
        }
        return array;
    }

    public static String addGroup(String number, Integer count, String add, boolean isLeft){
        if(count == 0)
            return number;
        number = isLeft  ? add.concat(number) : number.concat(add);
        return addGroup(number, --count, add, isLeft);
    }
}
