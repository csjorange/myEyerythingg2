package commyselfg2.core.monitior;

import commyselfg2.config.HandlerPath;

/**
 * 文件监控系统
 */
public interface FileMonitor {

    void start();

    /**
     * 监控
     */
    void monitor(HandlerPath handlerPath);

    void stop();
}
