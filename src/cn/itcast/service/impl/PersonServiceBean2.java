package cn.itcast.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import junit.test.ItcastResource;
import cn.itcast.dao.PersonDao;
import cn.itcast.service.PersonService2;


/**
 * 
 * 通过构造器注入
 * @author young
 *
 */

/**
 * @Service用于标注业务层组件
 * @author YOUNG
 *
 */
@Service("personService")// @Scope("prototype") //是否每次获取一个新的对象
public class PersonServiceBean2 implements PersonService2 {
	//@ItcastResource 
	//@Resource 
	//@Autowired(required=false|@Qualifier("personDaoxxx")) private PersonDao personDao;
	//require 如果是true 找不打PersonDao类型报错  如果是falue 找不到PersonDao则为null
	
	@Autowired(required=false)@Qualifier("personDao") private PersonDao personDao;
	private String name;
	public PersonServiceBean2(){}
	
	@PostConstruct //实例化后调用这个方法
	public void init(){
		System.out.println("初始化");
	}
	@PreDestroy  //关闭实例调用
	public void destroy(){
		System.out.println("被销毁");
	}
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
