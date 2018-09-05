package structurePattern.adapterPattern.player.impl;

import structurePattern.adapterPattern.player.AdvancedMediaPlayer;

/**
 * @author zxf
 * @date 2018/9/5 8:46
 */
//步骤2：创建实现了 AdvancedMediaPlayer 接口的实体类。
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么都不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
