package pers.webpage000.myblog.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * @author 王思涵
 * @Description Web异常捕获（大概，看帖子应该是用来捕获Web的异常的，比如404这种）
 * @time 2020/5/30 22:32
 **/
@Slf4j
@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class MyErrorController extends AbstractErrorController {

    private final ErrorProperties errorProperties;

    @Autowired
    MyErrorController(ErrorAttributes errorAttributes, ServerProperties serverProperties) {
        this(errorAttributes, serverProperties.getError(), Collections.emptyList());
    }

    MyErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorViewResolvers);
        Assert.notNull(errorProperties, "ErrorProperties must not be null");
        this.errorProperties = errorProperties;
    }

    @GetMapping
    public String handlerError(HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpStatus status = getStatus(request);
        return status.toString();
    }

    @Override
    public String getErrorPath() {
        return this.errorProperties.getPath();
    }
}
