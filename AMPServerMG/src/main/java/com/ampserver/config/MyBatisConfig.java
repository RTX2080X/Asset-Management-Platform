package com.ampserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;

@Controller
@MapperScan("com.ampserver.mbg.mapper")
public class MyBatisConfig {
}
