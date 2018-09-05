package structurePattern.adapterPattern.adapter;

import structurePattern.adapterPattern.player.AdvancedMediaPlayer;
import structurePattern.adapterPattern.player.MediaPlayer;
import structurePattern.adapterPattern.player.impl.Mp4Player;
import structurePattern.adapterPattern.player.impl.VlcPlayer;

/**
 * @author zxf
 * @date 2018/9/5 8:48
 */
//步骤3：创建实现了 MediaPlayer 接口的适配器类。将MediaPlayer和AdvancedMediaPlayer适配起来
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String autoType){
        if (autoType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if (autoType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
