package com.pinpai.exception.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
  
/**
 * @ClassName: MyExceptionResolver
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author jsf
 */
public class MyExceptionResolver extends SimpleMappingExceptionResolver {
  
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception e) {
    	
        HandlerMethod method = (HandlerMethod) handler;
        ResponseBody body = method.getMethodAnnotation(ResponseBody.class);
        ModelAndView modelAndView=new ModelAndView();
            //判断有没有@ResponseBody的注解没有的话调用父方法
        if (body == null){
        	modelAndView=new ModelAndView("error");
        	if(e instanceof MessageException){
        		modelAndView.addObject("msg",((MessageException)e).getMsg());
        	}else{
        		modelAndView.addObject("msg","服务器异常");
        	}
        	modelAndView.addObject("success",Boolean.FALSE);
        	e.printStackTrace();
            return modelAndView; 
        }else{
        	//或者使用view视图返回
        	FastJsonJsonView view = new FastJsonJsonView();
        	Map<String, Object> attributes = new HashMap<String, Object>();
        	attributes.put("success", Boolean.FALSE);
        	if(e instanceof MessageException){
        		attributes.put("msg", ((MessageException)e).getMsg());
        	}else{
        		attributes.put("msg","服务器异常");
        	}
        	view.setAttributesMap(attributes);
        	modelAndView.setView(view);
        	e.printStackTrace();
        	return modelAndView;
        }
    }
  
}
