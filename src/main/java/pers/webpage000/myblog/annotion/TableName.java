package pers.webpage000.myblog.annotion;

/**
 * @author 王思涵
 * @Description 数据库表名注解
 * @time 2020/7/14 23:34
 **/
public @interface TableName {

    String value() default "";
}
