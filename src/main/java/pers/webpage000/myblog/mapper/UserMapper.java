package pers.webpage000.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pers.webpage000.myblog.entity.User;

/**
 * @author 王思涵
 * @Description 用户Mapper
 * @time 2020/6/6 1:17
 **/
@Component
@Mapper
public interface UserMapper extends BasicMapper<User> {

}
