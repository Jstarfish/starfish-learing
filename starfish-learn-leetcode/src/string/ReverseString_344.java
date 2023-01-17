package string;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 */
public class ReverseString_344 {


    public static void reverseStrings(char[] s){
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left ++;
            right --;
        }
    }




    public static void reverseString1(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while (left < right){
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                ++ left ;
                -- right;
            }
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

    public static void main(String[] args) {
        //char[] str = new char[]{'h','e','l','l','o'};
        char[] str = new char[]{'H','a','n','n','a','h'};
        reverseString1(str);
        System.out.println(str);
    }


}
