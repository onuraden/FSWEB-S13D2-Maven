package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num = num*(-1);
        }
        int baslangic = num;
        int ters = 0;
        while(num > 0) {
            int basamak = num%10;
            ters = (ters*10) + basamak;
            num /= 10;

        }
        return baslangic == ters;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) {
            return false;
        } else {
            int toplam = 0;
            for(int i = 1; i < num; i++) {
                if(num%i == 0) {
                    toplam += i;
                }
            }
            return toplam == num;
        }
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        } else {
            String numberStr = String.valueOf(num);
            String[] digits = numberStr.split("");
            String result = "";

            for (String digitStr : digits) {
                switch (digitStr) {
                    case "0":
                        result += "Zero ";
                        break;
                    case "1":
                        result += "One ";
                        break;
                    case "2":
                        result += "Two ";
                        break;
                    case "3":
                        result += "Three ";
                        break;
                    case "4":
                        result += "Four ";
                        break;
                    case "5":
                        result += "Five ";
                        break;
                    case "6":
                        result += "Six ";
                        break;
                    case "7":
                        result += "Seven ";
                        break;
                    case "8":
                        result += "Eight ";
                        break;
                    case "9":
                        result += "Nine ";
                        break;
                }
            }
            return result.trim();
        }

    }


}
