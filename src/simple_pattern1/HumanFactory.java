package simple_pattern1;

/**
 * <p> Date             :2018/4/23 </p>
 * <p> Module           : </p>
 * <p> Description      : </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
public class HumanFactory {
    public static IHuman createHuan(Class c) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须制定人种的肤色");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的肤色的人种");
        } catch (IllegalAccessException e) {
            System.out.println("指定人种有错误");
        }
        return human;
    }
}
