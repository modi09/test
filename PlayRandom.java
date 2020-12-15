package Play;

import java.util.Scanner;
/**
*干嘛听苦情歌以为多浪漫  芜湖!!!!!
*/
public class PlayRandom {
    public static void main(String[] args) {
        int you = (int) (100*Math.random());
        System.out.println(you);
        System.out.println("欢迎来到猜数游戏");
        System.out.println("此游戏为随机取0~99之间的数字");
        System.out.println("现在开始依靠运气来获得正确答案吧!");
        Scanner sca1 = new Scanner(System.in);
        int in;  //输入内容
        int number = 1;
        one:for (int i = 0; i  < 1;){
            Scanner sca2 = new Scanner(System.in);
            in = sca2.nextInt();
            simple:if(in > 99 || in < 0){
                System.out.println("范围溢出");
                number = number +1;
                continue one;
            }
            else if(in > you){
                System.out.println("猜大了");
                number = number +1;
                continue one;
            }else if(in < you){
                System.out.println("猜小了");
                number = number +1;
                continue one;
            }else{
                System.out.println("恭喜正确");
                System.out.println("本次游戏共计猜了"+number+"次数");
                break;
            }
        }

//        Scanner sca1 = new Scanner(System.in);

    }
}
