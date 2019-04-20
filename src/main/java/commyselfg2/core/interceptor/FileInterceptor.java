package commyselfg2.core.interceptor;

import java.io.File;

public interface FileInterceptor {

    /**
     * 文件拦截器
     */
    void apply(File file);
}
