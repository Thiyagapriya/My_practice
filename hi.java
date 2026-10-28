import java.util.Arrays;
class Anagram {
    public static void main(String[] args) {
String s="hello";
String t="llohe";
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
                System.out.println(Arrays.equals(a,b));
        }
    }
