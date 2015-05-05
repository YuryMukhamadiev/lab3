package pp_lab3;

import java.io.*;

public class lab3 {
    private static String digit[] = {"[нЌ]оль", "[оќ]д...?", "[дƒ]в..?", "[т“]р..?", "[ч„]етыр..?",
            "[пѕ]€т..?", "[шЎ]ест..?", "[с—]ем..?", "[в¬]осем..?", "[дƒ]ев€т..?" };
    private static String teen[] = {"[дƒ]ес€т..?", "[оќ]диннадцат..?", "[дƒ]венадцат..?", "[т“]ринадцат..?", "[ч„]етырнадцат..?",
            "[пѕ]€тнадцат..?", "[шЎ]естнадцат..?", "[с—]емнадцат..?", "[в¬]осемнадцат..?", "[дƒ]ев€тнадцат..?" };
    private static String ten[] = {"0", "1" , "[дƒ]вадцат..?", "[т“]ридцат..?", "[с—]орок.?",
            "[пѕ]€т[ьи]дес€т.?.?", "[шЎ]ест[ьи]дес€т.?.?", "[с—]ем[ьи]дес€т.?.?", "[в¬]осем[ьи]дес€т.?.?", "[дƒ]ев€ност."};
    private static String houndred[] = {"0", "[с—]т..?", "[дƒ]в[еу].?с.?т.?", "[т“]р[еЄи].?с.?т.?", "[ч„]етыр[еЄ].?с.?т.?",
            "[пѕ]€т[иь]с.?т.?", "[шЎ]ест[иь]с.?т.?", "[с—]ем[ьи]с.?т.?", "[в¬]осем[ьи]с.?т.?", "[дƒ]ев€т[ьи]с.?т.?"};
    
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
        if (word.matches("[—В–Ґ]—Л—Б—П—З.?")) {
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


