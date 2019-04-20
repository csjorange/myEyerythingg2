package commyselfg2.core.interceptor.impl;

import commyselfg2.core.common.FileConvertThing;
import commyselfg2.core.dao.FileIndexDao;
import commyselfg2.core.interceptor.FileInterceptor;
import commyselfg2.core.model.Thing;

import java.io.File;


/**
 * 将File转换为Thing然后写入数据库
 */
public class FileIndexInterceptor implements FileInterceptor {

    private  final FileIndexDao  fileIndexDao;

    public FileIndexInterceptor(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
    }

    /**
     * 打印
     * [ 转换、写入（Thing）]
     */
    @Override
    public void apply(File file) {
        Thing thing  = FileConvertThing.convert(file);
        this.fileIndexDao.insert(thing);
    }
}
