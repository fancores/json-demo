package fan.tutorial.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fan.core.json.JsonHttpUtil;
import fan.core.json.JsonUtil;
import fan.tutorial.model.Person;

public class PersonServelt extends HttpServlet {

	private static final long serialVersionUID = 5586344927777757698L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> personList = new ArrayList<Person>();
		personList = new ArrayList<Person>();
		personList.add(new Person("叶水燕", "女", new Date(), "广东省茂名市"));
		personList.add(new Person("杨忠杰", "男", new Date(), "广东省广州市"));
		personList.add(new Person("杨晓婷", "女", new Date(), "广东省湛江市"));
		JsonHttpUtil.toWriteOut(response, JsonUtil.toJsonMap("personList", personList));
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}