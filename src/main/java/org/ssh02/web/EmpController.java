package org.ssh02.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssh02.pojo.Emp;
import org.ssh02.service.EmpService;

@Controller
public class EmpController {

	@Resource
	private EmpService es;

	@RequestMapping("/abc")
	public String fn1() {
		String sql = "select * from emp";
		List<Emp> el = es.selectAll(sql, new Emp());
		System.out.println(el);
		return null;
	}
}
