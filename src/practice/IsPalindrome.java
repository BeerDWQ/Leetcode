package practice;

/****************************************************
 *
 * @Description: 回文字符串
 *
 * @Author: DONGWENQI1111
 * @Date: Created in 7:10 PM 2020/3/6
 * @Modified By:
 ****************************************************/
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        // 高层主干逻辑
        // 1.filter out number & chart 2. reverse and compare
        String fileteredS = filterNonNumberAndChart(s);

        String reversedS = reversedString(fileteredS);

        return reversedS.equalsIgnoreCase(fileteredS);
    }

    private String reversedString(String fileteredS) {
        return new StringBuilder(fileteredS).reverse().toString();
    }

    private String filterNonNumberAndChart(String s) {
        return s.replaceAll("[^A-Za-z0-9]]","");
    }
}
