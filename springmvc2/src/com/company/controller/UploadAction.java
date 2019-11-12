package com.company.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author Johnny
 * @category 文件上传控制器1
 */
@Controller
public class UploadAction {
	
	@RequestMapping("/toupload")
	public String toupload(){
		System.out.println("进入上传的页面里面");
		return "upload";
	}

	@RequestMapping("/upload")
	public String upload(@RequestParam("header") CommonsMultipartFile file) throws IllegalStateException, IOException{
		String name = file.getOriginalFilename();
		System.out.println(name);
		String path = "D:"+File.separator + name;
		file.transferTo(new File(path));
		return "success";
	}
}
