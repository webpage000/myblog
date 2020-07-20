package pers.webpage000.myblog.entity;

import lombok.Data;

/**
 * @author 王思涵
 * @Description 基础实体类，所有实体都要继承
 * @time 2020/6/4 23:11
 **/
@Data
public abstract class BasicEntity {

    /**
     * 主键 primary key
     */
    private String id;

    /**
     * 删除标志 logic deleted mark
     */
    private int deleted;

    /**
     * 时间戳 timestamp
     */
    private String timestamp;

    /**
     * 实体表名
     *
     * @return
     */
    public abstract String getTableName();
}
