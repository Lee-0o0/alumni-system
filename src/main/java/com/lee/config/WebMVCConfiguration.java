package com.lee.config;

import com.lee.interceptor.AuthInterceptor;
import com.lee.interceptor.UserAuthInterceptor;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMVCConfiguration extends WebMvcConfigurerAdapter implements ErrorPageRegistrar {

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                //访问 / 地址将跳转到 /login
                registry.addViewController("/").setViewName("user-login");
                registry.addViewController("/admin").setViewName("admin-login");
                registry.addViewController("/admin/login").setViewName("admin-login");
                registry.addViewController("/index").setViewName("index");
                registry.addViewController("/login").setViewName("user-login");
            }
        };
        return adapter;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin","/admin/login","/admin/login.do");
        registry.addInterceptor(new UserAuthInterceptor())
                .addPathPatterns(("/**"))
                .excludePathPatterns("/admin/**","/","/login","/login.do")
                .excludePathPatterns("/css/**","/js/**","/assets/**","/dataTables/**","/font-awesome/**","/fonts/**","/images/**");
        //注意放行静态资源
        super.addInterceptors(registry);
    }

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[2];
        errorPages[0] = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
        errorPages[1] = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500");

        registry.addErrorPages(errorPages);
    }
}
