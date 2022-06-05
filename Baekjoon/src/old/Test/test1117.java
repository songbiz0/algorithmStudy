package old.Test;

public class test1117 {
    public static void main(String[] args) {
        System.out.println(parseStringToInt("a", 0));
    }

    public static int parseStringToInt (String str, int defVal) {
        try {
            return Integer.parseInt(str);
        } catch(Exception e) {
            return defVal;
        }
    }
}
