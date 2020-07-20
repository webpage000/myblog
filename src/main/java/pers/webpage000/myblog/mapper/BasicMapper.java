package pers.webpage000.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.webpage000.myblog.entity.BasicEntity;

import java.util.List;

/**
 * @author 王思涵
 * @Description 公共Mapper，
 * @time 2020/6/4 23:49
 **/
@Mapper
public interface BasicMapper<T extends BasicEntity> {

    public Class<T> getBasicEntity();

    /**
     * 新增实体
     *
     * @param entity
     * @return
     */
    public int insert(T entity);

    /**
     * 根据PK查询实体
     *
     * @param id
     * @return
     */
    @Select("single")
    public T queryByID(String id);

    /**
     * 根据PK查询指定字段的值
     *
     * @param selectKeys 查询的字段
     * @param id
     * @return
     */
    public T queryByID(String[] selectKeys, String id);

    /**
     * 根据PK数组查询实体集合
     *
     * @param id
     * @return
     */
    public List<T> queryListByIDs(String[] id);

    /**
     * 根据PK集合查询实体集合
     *
     * @param id
     * @return
     */
    public List<T> queryListByIDs(List<String> id);

    /**
     * 指定字段根据PK数组查询实体集合
     *
     * @param selectKeys 查询的字段
     * @param id
     * @return
     */
    public List<T> queryListByIDs(String[] selectKeys, String[] id);

    /**
     * 指定字段根据PK集合查询实体集合
     *
     * @param selectKeys 查询的字段
     * @param id
     * @return
     */
    public List<T> queryListByIDs(String[] selectKeys, List<String> id);

    /**
     * 修改实体
     *
     * @param entity
     * @return
     */
    public int update(T entity);

    /**
     * 删除实体
     *
     * @param entity
     * @return
     */
    public int delete(T entity);

    /**
     * 根据id删除实体
     *
     * @param id
     * @return
     */
    public int deleteByID(String id);
}
