package pers.webpage000.myblog.mapper.provider;

/**
 * @author 王思涵
 * @Description BasicMapper 公共动态SQL提供类
 * @time 2020/6/5 19:46
 **/
public class BasicProvider {

    public String queryByID(String id) {
        return "select id from user_user where id = '" + id + "'";
    }
}