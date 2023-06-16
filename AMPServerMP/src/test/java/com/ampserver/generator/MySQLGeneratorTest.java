/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
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
public class MySQLGeneratorTest {

    @Autowired
    private Environment environment;

    @Test
//    @ConfigurationProperties
    public void Generator() {
//        DataSourceConfig build = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/ampdatabase?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai", "root", "qwer1234")
//                .build();
        // 参数说明：https://baomidou.com/pages/981406/#数据库配置-datasourceconfig
        FastAutoGenerator.create(
//                        new DataSourceConfig.Builder(
//                                environment.getProperty("spring.datasource.url"),
//                                environment.getProperty("spring.datasource.username"),
//                                environment.getProperty("spring.datasource.password"))
                        new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/ampdatabase?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai", "root", "qwer1234")
//
                                .dbQuery(new MySqlQuery())
                                .schema("mybatis-plus")
                                .typeConvert(new MySqlTypeConvert())
                                .keyWordsHandler(new MySqlKeyWordsHandler())
                )
                .globalConfig((builder) -> builder
                        .enableSwagger()
                        .outputDir("/AMPServerMP/src/main/java/com/ampserver")
                        .fileOverride()
                ).packageConfig((builder) -> builder
                        .parent("com/ampserver")
                        .entity("mbg.model")
                        .service("service")
                        .serviceImpl("service.impl")
                        .mapper("mapper.xml")
                ).strategyConfig((scanner, builder) -> builder
                        .enableCapitalMode()
                        .addInclude(getTables(scanner.apply("all")))
                        .entityBuilder()
                        .enableLombok()
                        .controllerBuilder()
                        .enableRestStyle()
                        .enableHyphenStyle()
                ).execute();

    }

    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    @Test
    public void enTest() {
        System.out.printf(environment.getProperty("spring.datasource.username"));
    }
}
