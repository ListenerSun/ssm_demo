package com.sqt.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUpController {
	@RequestMapping("/upload")
	public String updateItem( Model m , MultipartFile picFile) throws Exception {

		// 图片新名字
		String name = UUID.randomUUID().toString();
		// 图片原名字
		String oldName = picFile.getOriginalFilename();
		// 后缀名
		String exeName = oldName.substring(oldName.lastIndexOf("."));

		File pic = new File("F:\\upload\\" + name + exeName);
		// 保存图片到本地磁盘
		picFile.transferTo(pic); 
		// 更新商品图片信息
		m.addAttribute("msg", "上传成功");

		
		return "";
	}

}
