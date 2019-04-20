package commyselfg2.core.search;


/*
* 文件检索业务
* */
import commyselfg2.core.model.Condition;
import commyselfg2.core.model.Thing;

import java.util.List;

public interface ThingSearch {

    /**
     * 根据Condition条件检索数据
     */
    List<Thing> search(Condition condition);
}
