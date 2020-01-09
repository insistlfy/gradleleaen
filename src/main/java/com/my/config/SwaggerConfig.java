package com.my.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * SwaggerConfig
 *
 * @author lfy
 * @date 19-11-25
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String HTTP_HEADER_APIKEY = "X-Api-Key";
    private static final String HTTP_HEADER_APP_VERSION = "X-Api-Ver";
    private static final String HTTP_HEADER_TOKEN = "X-Auth-Token";
    private static final String HTTP_HEADER_USERID = "X-User-Id";
    private static final String HTTP_HEADER_HOSID = "X-Hos-Id";

    /**
     * api描述
     */
    private static final String TITLE = "My服务";
    private static final String DESCRIPTION = "My服务服务接口文档";
    private static final String VERSION = "1.0";
    private static final String URL = "https://www.baidu.com/";

    @Bean
    public Docket api() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        ParameterBuilder userIdPar = new ParameterBuilder();
        ParameterBuilder hosIdPar = new ParameterBuilder();
        ParameterBuilder apiKeyPar = new ParameterBuilder();
        ParameterBuilder apiVerPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        //添加头信息
        tokenPar.name(HTTP_HEADER_TOKEN).description("token").modelRef(new ModelRef("string"))
                .parameterType("header").required(false);
        userIdPar.name(HTTP_HEADER_USERID).description("usrId").modelRef(new ModelRef("string"))
                .parameterType("header").required(false);
        hosIdPar.name(HTTP_HEADER_HOSID).description("hosId").modelRef(new ModelRef("string"))
                .parameterType("header").required(false);
        apiKeyPar.name(HTTP_HEADER_APIKEY).description("apiKey").modelRef(new ModelRef("string"))
                .parameterType("header").required(false);
        apiVerPar.name(HTTP_HEADER_APP_VERSION).description("apiVer").modelRef(new ModelRef("string"))
                .parameterType("header").required(false);
        pars.add(tokenPar.build());
        pars.add(userIdPar.build());
        pars.add(hosIdPar.build());
        pars.add(apiKeyPar.build());
        pars.add(apiVerPar.build());

        //这是注意的代码
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .withClassAnnotation(Api.class))
                .paths(PathSelectors.any()).build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(TITLE).description(DESCRIPTION).termsOfServiceUrl(URL).version(VERSION)
                .build();
    }
}
