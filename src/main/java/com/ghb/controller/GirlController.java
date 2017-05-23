package com.ghb.controller;
import com.ghb.Exception.GirlException;
import com.ghb.entity.Girl;
import com.ghb.dao.GirlRepository;
import com.ghb.entity.Result;
import com.ghb.service.GirlService;
import com.ghb.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ASUS on 2017/5/3.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        System.out.println("test------------------");
        return girlRepository.findAll();
    }

    /**
     *
     * @param girl
     * @param bindingResult 如果有错误信息的话 会绑定到BindingResult 对象中
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid  Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
        return ResultUtil.success(girlRepository.save(girl));
    }

    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id")Integer id,Girl girl){

        girl.setId(id);

       return girlRepository.save(girl);
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public  void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
