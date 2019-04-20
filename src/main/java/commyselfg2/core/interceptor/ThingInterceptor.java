package commyselfg2.core.interceptor;


/**
 * 检索结果thing的拦截器
 */
import commyselfg2.core.model.Thing;

public interface ThingInterceptor {

    void apply(Thing thing);

}
