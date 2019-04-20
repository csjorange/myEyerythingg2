package commyselfg2.core.dao;


/**
 * 数据库访问的对象
 */

import commyselfg2.core.model.Condition;
import commyselfg2.core.model.Thing;

import java.util.List;

public interface FileIndexDao {
    /**
     * 插入
     */
    void insert(Thing thing);

    /**
     * 删除
     */
    void delete(Thing thing);

    /**
     * 查询
     */
    List<Thing> query(Condition condition);

}
