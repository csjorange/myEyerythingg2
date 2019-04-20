package commyselfg2.core.index;

import commyselfg2.config.EverythingConfig;
import commyselfg2.core.interceptor.FileInterceptor;

import java.io.File;
import java.util.LinkedList;
import java.util.Set;

public class FileScanImpl implements FileScan {


    private final LinkedList<FileInterceptor> interceptors = new LinkedList<>();

    private EverythingConfig config = EverythingConfig.getInstance();

    @Override
    public void index(String path) {

        Set<String> excludePaths = config.getHandlerPath().getExcludepath ();
        //C:\Windows
        //C:Windows  C:\Windows\system32
        //判断 A path 是否在 B path中
        for(String excludePath : excludePaths){
            if(path.startsWith(excludePath)){
                return;
            }
        }
        File file = new File(path);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files != null){
                for(File f:files){
                    index(f.getAbsolutePath());
                }
            }
        }
        for(FileInterceptor interceptor : this.interceptors){
            interceptor.apply(file);
        }
    }

    @Override
    public void interceptor(FileInterceptor interceptor) {
        this.interceptors.add(interceptor);
    }

}
