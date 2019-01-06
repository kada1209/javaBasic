/**
 * 做出等边三角形
 * Created by Administrator on 2019/1/6.
 */
public class Equilateral {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1;i<=num;i++){
            //筛选出奇数
            if (i%2==1){
                // //等腰三角形，所以每行都要“居中”，所以前面几行在打印*号之前，需要输出“ ”空格
                if(i<=num){
                    for (int k =0;k<(num-i)/2;k++){
                        System.out.print(" ");
                    }
                }
                //每行输出j个*号，最大值为i个*号
                for (int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
