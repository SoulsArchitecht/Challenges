package ru.sshibko;

public class IsPalindrome_5 {

    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

/** 5. Проверить, является ли строка палиндромом.    */
}
