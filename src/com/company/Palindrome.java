package com.company;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        // Проверка на палиндромость
        String[] mass;
        mass = new String[8];
        mass[0] = "java";
        mass[1] = "Palindrome";
        mass[2]= "madam";
        mass[3] = "racecar";
        mass[4] = "apple";
        mass[5] = "kayak";
        mass[6] = "song";
        mass[7] = "noon";

        for (int i = 0;i < 8;i++){
            if(isPalindrome(mass[i])) System.out.println(" Слово " + mass[i] + " является палиндромом.");
            else System.out.println(" Слово " + mass[i] + " не является палиндромом.");
        }
    }
    //Функия переворота слова
    public static String reverseString(String jdm) {
        String reversed = "";
        int len = jdm.length();
        for (int i = 0; i < len; i++) {
            reversed = jdm.charAt(i) + reversed;
        }
        return reversed;
    }

//функция проверки на палиндромость
    public static boolean isPalindrome(String s){
        boolean qq = false;
        String reversed = reverseString(s);
        if (s.equals(reversed)) qq = true;
        return qq;
    }
}
