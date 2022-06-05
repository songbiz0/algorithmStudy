package old.Test;

public class MondayJson {
    public static void main(String[] args) {
        String year = String.valueOf(1997);
        String month = String.format("%02d", 2);
        String day = String.format("%02d", 17);
        String com = String.format("%s-%s-%s", year, month, day);
        System.out.println(com);
    }
}