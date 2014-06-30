package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import cn.itcast.dao.PersonDao;
import cn.itcast.service.PersonService;

public class PersonServiceBean implements PersonService {
	private PersonDao personDao;
	private String name;
	private Integer id ;
    private Set<String> sets = new HashSet<String>();
    private List<String> lists= new ArrayList<String>();
    private Properties properties= new Properties();
    private Map<String,String> maps = new HashMap<String,String>();
	public PersonServiceBean(){
		System.out.println("实例化");
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public Set<String> getSets() {
		return sets;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void init(){
		System.out.println("我被初始化了");
	}

	@Override
	public void save(){
//		System.out.println("保存成功");
//		System.out.println("__"+this.getName());
		personDao.add();
	}
	public void destroy(){
		System.out.println("关闭打开的资源");		
	}
}
