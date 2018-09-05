package structurePattern.adapterPattern.player.impl;

import structurePattern.adapterPattern.player.AdvancedMediaPlayer;

/**
 * @author zxf
 * @date 2018/9/5 8:44
 */
//步骤2：创建实现了 AdvancedMediaPlayer 接口的实体类。
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么都不做
    }
}
