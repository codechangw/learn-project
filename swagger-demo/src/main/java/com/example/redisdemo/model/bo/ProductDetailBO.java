package com.example.redisdemo.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname ProductDetailBO
 * @Description TODO
 * @Date 2023/10/27 17:21
 * @Author ChangWang
 */
@Data
@ApiModel("产品详情BO类")
public class ProductDetailBO implements Serializable {

    /**
     * 序列化
     */
    private static final long serialVersionUID = 8073662434406951441L;

    @ApiModelProperty(value = "产品ID")
    private String pid;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "价格")
    private String price;

}
