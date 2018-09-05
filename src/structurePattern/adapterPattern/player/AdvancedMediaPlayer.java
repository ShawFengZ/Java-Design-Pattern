package structurePattern.adapterPattern.player;

/**
 * @author zxf
 * @date 2018/9/5 8:43
 */
//步骤1：为媒体播放器和更高级的媒体播放器创建接口。
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
