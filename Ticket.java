package 车票购票程序;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 迪迪-CXJ
 * @date 2020/4/25
 **/
public class Ticket {
    public static void main(String[] args) {
        /**售票机3.0
         * 1·打印车票（输出）
         * 2·输入金额信息（输入）
         * 3·条件判断if
         * 4·循环while for
         * */
        Main m = new Main();
        int money, amount;
        String information;
        Scanner in = new Scanner(System.in);
        System.out.println("一张车票价格是10元\n请问您需要购买几张车票？");
        System.out.println();
        m.setCalculation(in.nextInt());
        System.out.println("您选择购买" + m.getCalculation() / 10 + "张车票\n车票数量正确的话请输入是（yes），不正确输入否（no）");
        information = in.next();
        while (information.equals("否") || information.equals("no")) {//修改购票数量
            System.out.println("请输入新的信息，需要几张车票？");
            m.setCalculation(in.nextInt());
            System.out.println("您选择购买" + m.getCalculation() / 10 + "张车票\n车票数量正确的话请输入是（yes），不正确输入否（no）");
            information = in.next();
        }
        System.out.println("您选择了" + m.getCalculation() / 10 + "张车票，车票金额为：" + m.getCalculation() + "元，请投币");
        money = in.nextInt();//接收键盘输入的值
        amount = money;//把键盘输入的值赋值给amount
        //判断amout是否小于车票10元*人数
        while (amount < m.getCalculation()) {
            System.out.println("投币不足,请继续投币");
            money = in.nextInt();
            amount = amount + money;
        }
        for (int y=1;y <= m.getCalculation() / 10;y++) {//循环打印c.getCalculation()/10张车票
            System.out.println("****************");
            System.out.println("**车票编码01000" + y + "*");
            System.out.println("**  迪迪铁路   **");
            System.out.println("*车票   10    元*");
            System.out.println("****************");
        }
        int change = amount - m.getCalculation();
        System.out.println("您成功购买了" + m.getCalculation() / 10 + "张车票");
        System.out.println("找您" + change + "元");
        System.out.println("谢谢您的使用");
    }
}
