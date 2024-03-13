package com.example.mybatis.entity;

import lombok.Data;

@Data
public class Img {

  private long id;
  private String name;
  private String path;
  private java.sql.Date loadTime;
  private java.sql.Date updateTime;

}
