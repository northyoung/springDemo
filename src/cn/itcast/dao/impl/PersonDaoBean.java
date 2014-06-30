package cn.itcast.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.PersonDao;
/**
 * @Repository用于标注数据访问组件，即DAO组件
 * @author YOUNG
 *
 */
@Repository
public class PersonDaoBean implements PersonDao {
	/* (non-Javadoc)
	 * @see cn.itcast.dao.impl.PersonDao#add()
	 */
	@Override
	public void add(){
		System.out.println("执行PersonDaoBean中的add");
	}
}
