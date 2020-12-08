//package com.company;
////https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
//public class smallestWindow {
//    static final int noOfCards = 256;
//
//    public static String findString(String str, String ptr) {
//        int len1 = str.length();
//        int len2 = ptr.length();
//        if (len1 < len2) {
//            System.out.println("no such window is there");
//        }
//        int hashPtr[] = new int[noOfCards];
//        int hashStr[] = new int[noOfCards];
//
//        for (int i = 0; i < len2; i++) {
//            hashPtr[ptr.charAt(i)]++;
//        }
//        int start = 0, minLength = Integer.MAX_VALUE;
//
//        //traversing the string
//        int count = 0;
//        for (int j = 0; j < len1; j++) {
//            //count occurance of character of string
//            hashStr[str.charAt(j)]++;
//        }
//
//    }
//}
