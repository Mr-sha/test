import java.util.Scanner;

/**
 * @Author: shashuai
 * @Date: 2021/10/18/19:43
 * @Description:
 */
public class Solution_476 {//数字补数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        Solution_476 sl = new Solution_476();
        sl.findComplement(num);

    }
    public int findComplement(int num){
        int s=0;//s为首个是1的数所在的位置
        for (int i=31;i>=0;i--){//  >>号表示右移 如4>>2 = 1 左/右移表示除/乘 2的(移动位数)次方
            if((num>>i)==1) {
                s=i;
                break;
            }
        }
        int count=0;//count为所要进行异或运算的1
        for (int i = 0; i <=s; i++) {
            count|=(1<<i);//count| = (1<<i)  ==  count = count | (1 << i) == count | (1* 2的i次方)
        }
        int sum = num ^ count;//进行异或运算求补码
        System.out.println(sum);
        return 0;
        //该问题的关键点在于：直接进行异或运算时，因为int类型为32位储存，所以前边0零会变为一，从而改变数字实际大小
        //故先寻找有效的位数，即从最高位开始，首位为一的数，然后再构造对应位数的count，最后进行异或运算，再输出

    }



    }

