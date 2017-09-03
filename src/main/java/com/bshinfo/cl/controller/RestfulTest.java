package com.bshinfo.cl.controller;

import com.bshinfo.cl.service.BaseDisqualificationTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈奇 on 2017/5/3 0003.
 */
@Controller
@RequestMapping("/rest")
public class RestfulTest {

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String index(@PathVariable("id") String id) throws UnsupportedEncodingException {
//       return new    String(id.getBytes("iso8859-1"),"utf-8");
//    }
@Autowired
private BaseDisqualificationTypeServiceI baseDisqualificationTypeServiceI;

 @RequestMapping(value = "/htmlDemo", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public ModelAndView index() {
     Map<String,String> data = new HashMap();
//     data.put("name","chenqi");
//     data.put("aga","27");
//     data.put("aa","bb");
//     data.put("cc","dd");
     return new ModelAndView("/jsTreeDemo" );
    }


 @RequestMapping(value = "/baseData")
 @ResponseBody
    public List<Map<String,Object>> baseData(String pid) {
     List<Map<String, Object>> maps = baseDisqualificationTypeServiceI.selectByPidKey(pid);

     if (!maps.isEmpty()) {
         for (int i = 0; maps.size() > i; i++) {
             Map<String,Object> attr = new HashMap<>();
             Map<String, java.lang.Object> map = maps.get(i);

            attr.put("data-pid",map.get("pid").equals("")?0:map.get("pid")) ;
            attr.put("data-hah","haha") ;




             map.put("children", map.get("children") .equals("true"));
             map.put("a_attr", attr);
             maps.set(i, map);
         }
     }
     return maps ;
    }





}
