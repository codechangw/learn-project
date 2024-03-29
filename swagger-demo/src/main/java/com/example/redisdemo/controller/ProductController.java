package com.example.redisdemo.controller;

import com.example.redisdemo.model.bo.ProductDetailBO;
import com.example.redisdemo.model.vo.DeleteProductVO;
import com.example.redisdemo.response.BaseResponse;
import com.example.redisdemo.response.RespGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "产品接口")
@RestController
@RequestMapping("/productController")
public class ProductController {

    @ApiOperation(value = "获取产品详情信息")
    @GetMapping("/getProductDetail")
    @ApiImplicitParam(name = "pid", value = "产品id", paramType = "String")
    public BaseResponse<ProductDetailBO> getProductDetail(@RequestParam(value = "pid") String pid) {
        return RespGenerator.returnOK("成功");
    }

    @ApiOperation(value = "获取产品列表信息")
    @PostMapping("/getProductList")
    public BaseResponse<List<ProductDetailBO>> getProductList() {
        return RespGenerator.returnOK("成功");
    }

    @ApiOperation(value = "删除产品")
    @PostMapping("/deleteProductList")
    public BaseResponse<Integer> deleteProductList(@RequestBody DeleteProductVO deleteProductVO) {
        return RespGenerator.returnOK("成功");
    }

}
