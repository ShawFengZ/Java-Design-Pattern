package behaviorPattern.templatePattern.template;

/**
 * @author zxf
 * @date 2018/9/14 9:54
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing!");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy your play!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
