/**九九乘法表
 * Created by Administrator on 2019/1/5.
 */
public class ninetonine {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j =1;j<=i;j++){
                System.out.print(i +"*" +j +"="+ i*j+"  ");
                if (i==j){
                    System.out.println();
                }
            }
        }
//        int i = 1;
//        for (;i<=5;i++){
//            System.out.println(i);
//        }
//        System.out.println("跳出循环时的i:"+i);
    }
}
