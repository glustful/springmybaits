package cn.com.abel.springProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.abel.springProject.dao.UserModelMapper;
import cn.com.abel.springProject.model.UserModel;
import cn.com.abel.springProject.service.ServiceResult;

@Controller
@RequestMapping("/user")
public class IndexController extends BaseController{
	
	public static final String URL = "/user/";
	
	@Autowired
	private UserModelMapper catDao;
	
	@Override
	protected String getViewPath(String path) {
		return URL + path;
	}
	
	
	@RequestMapping("/index")
	public String index(ModelMap model) {
		
		UserModel catModel = catDao.selectByPrimaryKey(1);
		
		model.addAttribute("catModel", catModel);
	
		model.addAttribute("hello", "hello spring mvc");
		return getViewPath("index");
	}
	
	@ResponseBody
	@RequestMapping("/show")
	public Object show(ModelMap model) {
		
		UserModel catModel = catDao.selectByPrimaryKey(1);
		
		model.addAttribute("catModel", catModel);
	
		model.addAttribute("hello", "hello show mvc");
		return new ServiceResult<UserModel>(true, -1, "", catModel);
	}

}
