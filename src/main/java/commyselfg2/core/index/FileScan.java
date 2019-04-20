package commyselfg2.core.index;

import commyselfg2.core.interceptor.FileInterceptor;

public interface FileScan {

    //path -> File -> Thing -> DataBase Record

    /**
     * 将指定path路径下的所有目录文件以及子目录和文件递归扫描
     * 索引到数据库
     */
    void index(String path);

    /**
     * 拦截器对象
     */
    void interceptor(FileInterceptor interceptor);


}
