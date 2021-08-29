package problem_solving;

public class Adding_Big_number {

    static String result = "";

    static void add_big(String str1, String str2, int carry) {

        String temp;
        int x = Integer.parseInt(String.valueOf(str1.charAt(str1.length()-1)));
        int y = Integer.parseInt(String.valueOf(str2.charAt(str2.length()-1)));
        if (str1.length() != 1) {
            result = Integer.toString((x + y + carry) % 10) + result;
        }
        else{
            result = Integer.toString((x + y + carry)) + result;
        }
        if (x + y + carry > 9) {
            temp = Integer.toString(x + y + carry);
            carry = Integer.parseInt(String.valueOf(temp.charAt(0)));
        }
        else carry = 0;
        if (str1.length() != 1) {
            add_big(str1.substring(0, str1.length() - 1), str2.substring(0, str2.length() - 1), carry);
        }
    }
    public static void main(String[] args) {
        add_big("55", "55", 0);
        System.out.println(result);
    }
}
