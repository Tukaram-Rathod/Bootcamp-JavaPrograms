package com.bridgelabz.BRP.day4.Utility;

import java.util.Arrays;

public class Utility {
    //Method to check if two Strings are anagram of each other or not
    public static void checkAnagram(String s1, String s2)
    {
        boolean match = true;
        if (s1.length() != s2.length()) {
            match = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            match = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (match) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //Method to check if the given Strings are palindrome or not
    public static void checkPalindrome(String str)
    {
        String rev = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
    public static boolean is_LeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }

    public int calculateDayOfWeek(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
    public static int calculateDay_Of_Week(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
    public static void printCalendar(int day, int days) {
        String[][] cal = new String[6][7];
        int temp;
        String weekdaystr = "SUN MON TUE WED THU FRI SAT";
        System.out.println(weekdaystr);
        switch (day) {
            case 0:
                temp = 1;
                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (temp <= 9) {
                            cal[i][j] = temp + "   ";
                        } else {
                            cal[i][j] = temp + "  ";
                        }
                        temp++;
                        if (temp == days + 1) {
                            break;
                        }
                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 1:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0) {
                            cal[i][j] = "    ";
                        } else {
                            if (i <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 2:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0 || i == 0 && j == 1) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 3:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 2) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 4:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 3) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 5:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 4) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 6:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 5) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
        }
        for (int i = 0; i < cal.length; i++) {
            for (int j = 0; j < cal[i].length; j++) {
                if (cal[i][j] == null)
                    break;
                System.out.print(cal[i][j]);
            }
            if (cal[i] == null)
                break;
            System.out.println();
        }
    }
}
