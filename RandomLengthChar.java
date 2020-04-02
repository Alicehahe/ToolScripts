package ToolScripts;

/**
 * @Author：HanLu
 * @Description:生成任意长度的字符数据用于测试
 * @Date:Created in 11:45 AM 2020/4/2
 */
public class RandomLengthChar {

    public static void main(String[] args) {
        RandomLengthChar.randomLength(200);
    }


    static void randomLength(int length){

        for (int i = 1; i<=length;i++){
            System.out.print(1);
        }
    }
}
