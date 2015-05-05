package pp_lab3;

import java.io.*;

public class lab3 {
    private static String digit[] = {"[��]���", "[��]�...?", "[��]�..?", "[��]�..?", "[��]����..?",
            "[��]��..?", "[��]���..?", "[��]��..?", "[��]����..?", "[��]����..?" };
    private static String teen[] = {"[��]����..?", "[��]���������..?", "[��]��������..?", "[��]��������..?", "[��]����������..?",
            "[��]��������..?", "[��]���������..?", "[��]��������..?", "[��]����������..?", "[��]����������..?" };
    private static String ten[] = {"0", "1" , "[��]������..?", "[��]������..?", "[��]����.?",
            "[��]��[��]�����.?.?", "[��]���[��]�����.?.?", "[��]��[��]�����.?.?", "[��]����[��]�����.?.?", "[��]�������."};
    private static String houndred[] = {"0", "[��]�..?", "[��]�[��].?�.?�.?", "[��]�[��].?�.?�.?", "[��]����[�].?�.?�.?",
            "[��]��[��]�.?�.?", "[��]���[��]�.?�.?", "[��]��[��]�.?�.?", "[��]����[��]�.?�.?", "[��]����[��]�.?�.?"};
    
    private static boolean flag = false;
    private static int num = 0;
    public static void print(String word) {
        for (int i = 0; i < 10; i++) {
            if (word.matches(houndred[i])) {
                num += i * 100;
                flag = true;
                return;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (word.matches(ten[i])) {
                num += i * 10;
                flag = true;
                return;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (word.matches(teen[i])) {
                num += 10 + i;
                flag = true;
                return;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (word.matches(digit[i])) {
                num += i;
                flag = true;
                return;
            }
        }
        if (word.matches("[тТ]ысяч.?")) {
            num *= 1000;
            return;
        }
        if (flag) {
            System.out.print(num + " " );
            num = 0;
            flag = false;
        }
        System.out.print(word + " ");
    }
}


