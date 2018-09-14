package behaviorPattern.templatePattern.game;

import behaviorPattern.templatePattern.template.Game;

/**
 * @author zxf
 * @date 2018/9/14 9:43
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy your play!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
