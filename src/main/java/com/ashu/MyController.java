package com.ashu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("addDetails")
	public String showForm()
	{
		return "details.jsp";
	}
	
	@RequestMapping("IntrestCalculator")
	public void calculateIntrest(@RequestParam int time,@RequestParam int amount,HttpServletResponse response)
	{
		int intrest=(time*amount)*10/100;
		System.out.println("Testing successed........................."+intrest);
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("Your Simple Intrest Is "+intrest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
