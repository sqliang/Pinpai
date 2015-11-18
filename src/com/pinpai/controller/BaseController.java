package com.pinpai.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pinpai.exception.handler.MessageException;
import com.pinpai.util.string.StringUtil;
@SuppressWarnings("all")
public class BaseController {
    
	public Map<String,Object> generateFailureMsg(Exception e,String defaultMsg){
		Map<String,Object> map=new HashMap<String,Object>();
		if(e instanceof MessageException ){
			map.put("msg", ((MessageException)e).getMsg());
		}else if(!StringUtil.isEmpty(defaultMsg)){
			map.put("msg", defaultMsg);
		}
		map.put("success",false);
		e.printStackTrace();
		return map;
	}
	public Map<String,Object> generateFailureMsg(String defaultMsg){
		Map<String,Object> map=new HashMap<String,Object>();
		if(!StringUtil.isEmpty(defaultMsg)){
			map.put("msg", defaultMsg);
			map.put("success",false);
			return map;
		}
		return map;
	}
	public Map<String,Object> generateSuccessMsg(String defaultMsg){
		Map<String,Object> map=new HashMap<String,Object>();
		if(!StringUtil.isEmpty(defaultMsg)){
			map.put("msg", defaultMsg);
			map.put("success",true);
			return map;
		}
		return map;
	}
    
}
