package com.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dto.BrandDTO;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    private BrandService service;

    @Test
    void contextLoads() {
        BrandDTO brand = new BrandDTO();
        brand.setLogo("Nike");
        brand.setDescript("Just do it!");
        service.save(brand);
    }

    @Test
    void list(){
        List<BrandDTO> list = service.list((Map<String, Object>) new QueryWrapper<BrandDTO>().eq("brand_id",1L));
    }

}
