package otherPattern.interceptingFilterPattern.target;

/**
 * @author zxf
 * @date 2018/9/19 13:32
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
