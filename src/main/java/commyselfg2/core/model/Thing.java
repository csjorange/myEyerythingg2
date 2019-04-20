package commyselfg2.core.model;

import lombok.Data;

@Data
public class Thing {

    /*文件名称*/
    private String name;
    /*文件路径*/
    private String path;
    /*文件深度*/
    private Integer depth;
    /*文件类型*/
    private FileType fileType;



}

