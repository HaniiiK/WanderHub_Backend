package wanderhub.server.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public static final String ALLOWED_METHOD_NAMES = "GET,HEAD,POST,PUT,DELETE,TRACE,OPTIONS,PATCH";

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:3000")
                .allowedOrigins("http://wanderhub.s3-website.ap-northeast-2.amazonaws.com")
                .allowedHeaders("*")
                .allowedMethods(ALLOWED_METHOD_NAMES.split(","))
                .exposedHeaders("*")
                .allowCredentials(true)
                .maxAge(3000);
    }



}
