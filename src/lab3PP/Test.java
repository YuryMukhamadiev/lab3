package lab3PP;

import java.io.*;

public class Test {
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
    	num = 0;
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
        if (word.matches("[т“]ыс€ч.?")) {
            num *= 1000;
            return;
        }
      /*  if (!flag) {
           System.out.print(num + " " );
            num = 0;
            flag = false;
        }*/
        System.out.print(word + " ");
    }
    public static void main(String[] args) {
        File file = new File("test.txt" );
        String line = "ќдин";
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF-8"
                    )
            );
            while ((line = br.readLine()) != null) {
                String word[] = line.split(" ");
                for (int i = 0; i < word.length; i++)
                {
                    
                    	print(word[i]);
                    	if(num==0) continue;
                    	System.out.print(num+" ");
                }
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


