package pers.webpage000.myblog.mybatis.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.Properties;

/**
 * @author 王思涵
 * @Description MyBatis 拦截器，为实现通用mapper注册
 * @time 2020/7/15 0:42
 **/
@Component
@Intercepts(
        @Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class})
)
public class BasicMapperInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
