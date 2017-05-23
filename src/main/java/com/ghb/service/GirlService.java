package com.ghb.service;

import com.ghb.Exception.GirlException;
import com.ghb.entity.Girl;
import com.ghb.dao.GirlRepository;
import com.ghb.enums.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ASUS on 2017/5/3.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertGirls(){
        Girl girl = new Girl();
        girl.setCupSize("E");
        girl.setAge(18);
        girlRepository.save(girl);

        Girl girl1 = new Girl();
        girl.setCupSize("F");
        girl.setAge(20);
        girlRepository.save(girl1);
    }

    public Girl getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age =girl.getAge();
        if (age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age>10 && age<16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }else {
            return  girl;
        }
    }

    /**
     * 根据Id查找信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
