package commyselfg2.core.model;

import lombok.Data;

/*
*Condition： 检索条件的模型类型
*/
@Data
public class Condition {
    /**
     * 文件名
     */
    private String name;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 限制的数量
     */
    private Integer limit;


    /**
     * 是否按照dept进行升序
     */
    public Boolean orderByDepthAsc;

}
