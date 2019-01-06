import org.testng.annotations.Test;

/**
 * 研究for循环
 * Created by Administrator on 2019/1/5.
 */
public class fortest {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (;i<=j;i++){
            System.out.println(i);
        }
        System.out.println(i);
    }

    @Test
    public void test(){
        int i = 1;
        if (i<=5){
            System.out.println(i);
            i=i+1;
            System.out.println(i);
        }
        System.out.println(i);
    }
}



