package com.company;

public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            //Вывод - если число простое
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int n){
        // Проверяем является ли число простым
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}