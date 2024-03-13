package com.chang.bingbingweb.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Data   //lombok注解，自动生成getter、setter、toString 方法
@Repository
public class Img {
    private int ID;
    private String name;
    private String path;
    private Date load_time;
    private Date update_time;
}
