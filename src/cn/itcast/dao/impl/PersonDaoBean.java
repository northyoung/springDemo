package cn.itcast.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.PersonDao;
/**
 * @Repository���ڱ�ע���ݷ����������DAO���
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
		System.out.println("ִ��PersonDaoBean�е�add");
	}
}
