package commyselfg2.config;


import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 配置信息
 */
@ToString
public class EverythingConfig {

    private static volatile EverythingConfig config;

    /**
     * 索引目录
     */
    @Getter
    private HandlerPath handlerPath = HandlerPath.getDefaultHandlerPath();

    /**
     * 最大检索返回的结果数
     */
    @Getter
    @Setter
    private Integer maxReturn = 30;

    /**
     * 是否开启构建索引
     * 默认：程序运行不开启构建索引
     * 1.运行程序时指定参数
     * 2.通过运行功能命令index
     */
    @Getter
    @Setter
    private Boolean enableBuildIndex = false;

    /**
     * 检索时depth深度的排序规则
     * true:表示降序
     * false:表示升序
     * 默认是降序
     */
    @Getter
    @Setter
    private Boolean orderByDesc = false;

    /**
     * 文件监控的间隔时间10s
     */
    @Setter
    @Getter
    private Integer interval = 6000*10;

    private EverythingConfig(){

    }

    public static EverythingConfig getInstance(){
        if(config == null){
            synchronized (EverythingConfig.class){
                if(config == null){
                    config = new EverythingConfig();
                }
            }
        }
        return config;
    }


}
