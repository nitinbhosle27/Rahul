package mypack;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class StateDAOImpl implements StateDAO {

	ArrayList<State> list;
	@Autowired
	private HibernateTemplate template;
	@Override
	public ArrayList<State> getState() {
		
		list=new ArrayList<State>();
		list=(ArrayList<State>) template.find("select k.statename from State k");
		System.out.println(list);
		return list;
	}

}
