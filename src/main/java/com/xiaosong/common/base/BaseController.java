package com.xiaosong.common.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.jfinal.core.Controller;

/**
* @author xiaojf
* @version 创建时间：2019年12月4日 上午11:31:56
* 类说明
*/
public class BaseController extends Controller{


    /**
     * 把请求参数 转换为map
     *
     * @Date 2016/7/25 17:03
     * @Author linyb
     */
    public Map<String, Object> getParamsToMap(HttpServletRequest request) {

        Map<String,Object>  res = new HashMap<String,Object>();
        Map<String,String[]>  parameter = request.getParameterMap();
        Iterator<String> it = parameter.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String[]  val = parameter.get(key);
            if(val!=null&&val.length>0){
                if(val[0]!=null&&!"".equals(val[0])){
                    res.put(key, val[0].trim());
                    System.out.println(key+"="+ val[0].trim());
                }
            }
        }
        return res;
    }

}
