package commyselfg2.config;




import lombok.Getter;
import lombok.ToString;


import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * 处理的目录
 */
@Getter
@ToString
public class HandlerPath {

    /**
     * 包含的目录
     */
    private Set<String> includePath = new HashSet<>();

    /**
     *排除的目录
     */
    private Set<String> excludepath = new HashSet<>();

    private HandlerPath(){

    }

    public void addIncludePath(String path){
        this.includePath.add(path);
    }

    public void addExcludePath(String path){
        this.excludepath.add(path);
    }


    public static HandlerPath getDefaultHandlerPath(){
        /**
         * windows  program files排除
         */
        HandlerPath handlerPath = new HandlerPath();
        Iterable<Path> paths= FileSystems.getDefault().getRootDirectories();
        //默认要包含的目录，即构建索引时要处理的目录
        paths.forEach(path -> {
            handlerPath.addIncludePath(path.toString());
        });

        //默认要排除的目录，即构建索引时不需要处理的目录
        String systemName = System.getProperty("os.name");
        if(systemName.contains("windows")){
            //windows
            handlerPath.addExcludePath("C:\\windows");
            handlerPath.addExcludePath("C:\\Program Files");
            handlerPath.addExcludePath("C:\\Program Files(x86)");
            handlerPath.addExcludePath("C:\\ProgramData");
        }
        else {
            //Linux
            handlerPath.addExcludePath("/root");
            handlerPath.addExcludePath("/temp");
        }
        return handlerPath;
    }

    public static void main(String[] args) {
        System.out.println(HandlerPath.getDefaultHandlerPath());
    }
}
