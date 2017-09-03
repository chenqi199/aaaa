package com.bshinfo.cl.service;

import com.bshinfo.cl.dao.BaseDisqualificationTypeMapper;
import com.bshinfo.cl.model.BaseDisqualificationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version : 1.0
 * @description :
 * Created by  chen_q_i@163.com on 2017/9/2 : 0:04.
 */
@Service("baseDisqualificationTypeServiceI")
public class BaseDisqualificationTypeServiceImp implements BaseDisqualificationTypeServiceI {

    @Autowired
    private BaseDisqualificationTypeMapper baseDisqualificationTypeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(BaseDisqualificationType record) {
        return 0;
    }

    @Override
    public int insertSelective(BaseDisqualificationType record) {
        return 0;
    }

    @Override
    public BaseDisqualificationType selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectByPidKey(String pid) {
        return baseDisqualificationTypeMapper.selectByPidKey(  pid);
    }

    @Override
    public int updateByPrimaryKeySelective(BaseDisqualificationType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BaseDisqualificationType record) {
        return 0;
    }
}
