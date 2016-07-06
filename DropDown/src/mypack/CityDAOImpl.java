package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class CityDAOImpl implements CityDAO {

	
	@Autowired
	private HibernateTemplate template;
	List<City> list;

	
	
	@Override
	public List<City> getcity(String statename) {
		
		System.out.println(statename);
		String stateid="select stateid from State where statename=?";
		List stid=template.find(stateid,statename);
		System.out.println(stid);
		
		Object a=stid.get(0);
		
		String query = "select cityname from City where stateid="+a;
		List list=template.find(query);
		
		System.out.println(list);
		return list;
	}
}

