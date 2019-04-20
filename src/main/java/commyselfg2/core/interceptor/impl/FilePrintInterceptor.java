package commyselfg2.core.interceptor.impl;

import commyselfg2.core.interceptor.FileInterceptor;

import java.io.File;

public class FilePrintInterceptor implements FileInterceptor {
    @Override
    public void apply(File file) {
        System.out.println(file.getAbsolutePath());
    }
}
