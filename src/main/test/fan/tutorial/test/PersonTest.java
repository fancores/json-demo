package fan.tutorial.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;
import com.google.gson.reflect.TypeToken;
import fan.core.json.JsonUtil;
import fan.tutorial.model.Person;

public class PersonTest {

	private static String json;
	private static String jsonList;
	private static String jsonMap;
	private static Person person;
	private static List<Person> personList;
	
	@BeforeClass
	public static void beforeClass(){
		personList = new ArrayList<Person>();
		personList.add(new Person("叶水燕", "女", new Date(), "广东省茂名市"));
		personList.add(new Person("杨忠杰", "男", new Date(), "广东省广州市"));
		personList.add(new Person("杨晓婷", "女", new Date(), "广东省湛江市"));
		person = personList.get(0);
		json = JsonUtil.toJson(person);
		jsonList = JsonUtil.toJson(personList);
		jsonMap = JsonUtil.toJsonMap("person", person);
	}
	
	@Test
	public void toJson(){
		System.out.println(json);
	}
	
	@Test
	public void toJson_format(){
		String jsonText = JsonUtil.formatJson(json);
		System.out.println(jsonText);
	}
	
	@Test
	public void toJson_map(){
		System.out.println(jsonMap);
		/*//format json
		System.out.println(JsonUtil.formatJson(jsonMap));*/
	}
	
	@Test
	public void toJson_list(){
		System.out.println(jsonList);
		/*//format json
		System.out.println(JsonUtil.formatJson(jsonList));*/
	}
	
	@Test
	public void toJson_map_list(){
		String json = JsonUtil.toJsonMap("persons", personList);
		System.out.println(json);
		/*//format json
		System.out.println(JsonUtil.formatJson(json));*/
	}
	
	@Test
	public void toJson_exclusion_class(){
		String json = JsonUtil.toJson(person, Date.class);
		System.out.println(json);
		/*//format json
		System.out.println(JsonUtil.formatJson(json));*/
	}
	
	@Test
	public void toJson_exclusion_field(){
		//注意这里要将字段名称的值转换成Object类型, 否则会调用到其他重载的方法导致出错
		String json = JsonUtil.toJson(person, (Object)"birthdate");
		System.out.println(json);
		/*//format json
		System.out.println(JsonUtil.formatJson(json));*/
	}
	
	@Test
	public void fromJson(){
		Person person = JsonUtil.fromJson(json, Person.class);
		System.out.println(person);
	}
	
	@Test
	public void fromJson_list(){
		System.out.println(jsonList);
		List<Person> persons = JsonUtil.fromJson(jsonList, new TypeToken<List<Person>>(){}.getType());
		for(Person p : persons){
			System.out.println(p);
		}
	}
	
	@Test
	public void fromJson_map(){
		Map<String, Person> personMap = JsonUtil.fromJson(jsonMap, new TypeToken<Map<String, Person>>(){}.getType());
		System.out.println(personMap.get("person"));
	}
}