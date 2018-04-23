import simple_pattern1.BlackMan;
import simple_pattern1.HumanFactory;
import simple_pattern1.IHuman;
import simple_pattern1.YellowMan;

/**
 * 测试
 */
public class Main {

    public static void main(String[] args) {
        //创建黑色人种
        IHuman blackMan = HumanFactory.createHuan(BlackMan.class);
        blackMan.cry();
        blackMan.say();
        blackMan.smile();

        //创建黄色人种
        IHuman yellowMan = HumanFactory.createHuan(YellowMan.class);
        yellowMan.cry();
        yellowMan.say();
        yellowMan.smile();

    }
}
