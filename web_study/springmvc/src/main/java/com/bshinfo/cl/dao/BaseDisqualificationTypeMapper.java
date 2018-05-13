package com.bshinfo.cl.dao;

import com.bshinfo.cl.model.BaseDisqualificationType;

import java.util.List;
import java.util.Map;

public interface BaseDisqualificationTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseDisqualificationType record);

    int insertSelective(BaseDisqualificationType record);

    BaseDisqualificationType selectByPrimaryKey(String id);
    List<Map<String,Object>> selectByPidKey(String pid);
    int updateByPrimaryKeySelective(BaseDisqualificationType record);

    int updateByPrimaryKey(BaseDisqualificationType record);
}