package structurePattern.adapterPattern.player;

/**
 * @author zxf
 * @date 2018/9/5 8:42
 */
//步骤1：为媒体播放器和更高级的媒体播放器创建接口。
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
