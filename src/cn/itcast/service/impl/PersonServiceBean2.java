package cn.itcast.service.impl;

import javax.annotation.Resource;

import junit.test.ItcastResource;
import cn.itcast.dao.PersonDao;
import cn.itcast.service.PersonService2;


/**
 * 
 * 通过构造器注入
 * @author young
 *
 */
public class PersonServiceBean2 implements PersonService2 {
	//@ItcastResource 
	//@Resource 
	private PersonDao personDao;
	private String name;
	public PersonServiceBean2(){}
	@ItcastResource
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public PersonServiceBean2(PersonDao personDao,String name){
		this.personDao = personDao;
		this.name = name;
	}
	public void save(){
		personDao.add();
//		System.out.println(name);
	}
}
