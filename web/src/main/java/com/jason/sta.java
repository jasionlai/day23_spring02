package com.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/26.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.jason.services","com.jason.servlet"})
@MapperScan("com.mll.operation.core2.mapper")
public class sta extends SpringBootServletInitializer{

}
