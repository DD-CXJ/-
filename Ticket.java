package 车票购票程序;

import java.util.Scanner;

/**
 * @author 迪迪
 * @date 2020/4/25
 *
 **/
public class Ticket {
    public static void main(String[] args) {
        /**售票机1.0
         * 1·打印车票（输出）
         * 2·输入金额信息（输入）
         * 3·条件判断if
         * 4·循环while for
         * */
       int money,price,amount;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入您需要购买几张车票");
        System.out.println("请投币");
        money=in.nextInt();//接收键盘输入的值
        price=10;//车票价格10元
        amount=money;//把键盘输入的值赋值给amount
        //判断amout是否小于车票10元
        while (amount<price){
            System.out.println("投币不足,请继续投币");
            money=in.nextInt();
            amount=amount+money;
        }
        System.out.println("****************");
        System.out.println("**  迪迪铁路   **");
        System.out.println("*车票   "  +price+"    元*");
        System.out.println("****************");
        int change=amount-price;
        System.out.println("找您"+change+"元");
    }
}
