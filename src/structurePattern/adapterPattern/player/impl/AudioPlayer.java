package structurePattern.adapterPattern.player.impl;

import structurePattern.adapterPattern.adapter.MediaAdapter;
import structurePattern.adapterPattern.player.MediaPlayer;

/**
 * @author zxf
 * @date 2018/9/5 8:53
 */
//步骤4：创建实现了 MediaPlayer 接口的实体类。
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放MP3音乐的内置支持
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
