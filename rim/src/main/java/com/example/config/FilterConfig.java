package com.example.config;//package com.example.config;
//
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@SpringBootConfiguration
//public class FilterConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry corsRegistry){
//        /**
//         * 所有请求都允许跨域，使用这种配置就不需要
//         * 在interceptor中配置header了
//         */
//        corsRegistry.addMapping("/**")
//                .allowCredentials(true)
//                .allowedOrigins("http://localhost:8081")
//                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
//                .allowedHeaders("*")
//                .maxAge(3600);
//    }
//
//}