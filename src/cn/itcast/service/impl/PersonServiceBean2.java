package cn.itcast.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
	//@Autowired(required=false|@Qualifier("personDaoxxx")) private PersonDao personDao;
	//require 如果是true 找不打PersonDao类型报错  如果是falue 找不到PersonDao则为null
	
	@Autowired(required=false)@Qualifier("personDao") private PersonDao personDao;
	private String name;
	public PersonServiceBean2(){}
//	@ItcastResource
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
