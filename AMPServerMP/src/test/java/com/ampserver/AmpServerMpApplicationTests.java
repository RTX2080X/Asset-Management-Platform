/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class AmpServerMpApplicationTests {
    @Autowired
    private Environment environment;

    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    @Test
    void contextLoads() {
        // 参数说明：https://baomidou.com/pages/981406/#数据库配置-datasourceconfig
        // BUG 参照 https://blog.csdn.net/qq_39609151/article/details/82855305
        FastAutoGenerator.create(
                        new DataSourceConfig.Builder(
                                environment.getProperty("spring.datasource.url"),
                                environment.getProperty("spring.datasource.username"),
                                environment.getProperty("spring.datasource.password"))
                                .dbQuery(new MySqlQuery())
                                .schema("mybatis-plus")
                                .typeConvert(new MySqlTypeConvert())
                                .keyWordsHandler(new MySqlKeyWordsHandler())
                )
                .globalConfig((scanner, builder) -> builder.author("nnn")
                        .enableSwagger()
                        .outputDir(System.getProperty("user.dir") + "/src/main/java")
                        .fileOverride()
                )
                .packageConfig((scanner, builder) -> builder
                        .parent("com")
                        .moduleName("ampserver")
                        .entity("mbg.model")
                        .service("service")
                        .serviceImpl("service.impl")
                        .controller("controller")
                        .mapper("mbg.mapper")
                        .xml("mapper")
                        .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/src/main/resources/mapper"))
                ).strategyConfig((scanner, builder) -> builder
                        .addInclude(Collections.emptyList())
                        .enableCapitalMode()
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        .entityBuilder()
                        .enableTableFieldAnnotation()
                        .enableLombok()
                        .controllerBuilder()
                        .formatFileName("%sController")
                        .enableRestStyle()
                        .mapperBuilder()
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sMapper")
                        .enableMapperAnnotation()
                        .formatXmlFileName("%sMapper")
                ).execute();
    }
}
