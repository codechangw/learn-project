package com.example.redisdemo.model.bo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname UserDetailBO
 * @Description TODO
 * @Date 2023/10/27 17:24
 * @Author ChangWang
 */
@Data
@ApiModel("用户详情BO类")
public class UserDetailBO implements Serializable {

    /**
     * 序列化
     */
    private static final long serialVersionUID = 8073662434406951441L;

    @ApiModelProperty(value = "用户ID")
    private String uid;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String password;

}