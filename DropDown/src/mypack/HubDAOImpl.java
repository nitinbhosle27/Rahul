package mypack;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;


@Component
public class HubDAOImpl implements HubDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Hub> gethub(String statename) 
	{
		System.out.println(statename);
		String stateid="select stateid from State where statename=?";
		List stid=template.find(stateid,statename);
		System.out.println(stid);
		
		Object a=stid.get(0);
		
		String query = "select k from Hub k where k.stateid="+a;
		List list=template.find(query);
		
		System.out.println(list);
		return list;
	}

	
		
}

