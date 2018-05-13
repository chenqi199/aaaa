package com.bshinfo.cl.service;

import com.bshinfo.cl.model.BaseDisqualificationType;

import java.util.List;
import java.util.Map;

/**
 * @version : 1.0
 * @description :
 * Created by  chen_q_i@163.com on 2017/9/2 : 0:04.
 */
public interface BaseDisqualificationTypeServiceI {
    int deleteByPrimaryKey(String id);

    int insert(BaseDisqualificationType record);

    int insertSelective(BaseDisqualificationType record);

    BaseDisqualificationType selectByPrimaryKey(String id);
    List<Map<String,Object>> selectByPidKey(String pid);

    int updateByPrimaryKeySelective(BaseDisqualificationType record);

    int updateByPrimaryKey(BaseDisqualificationType record);
}
