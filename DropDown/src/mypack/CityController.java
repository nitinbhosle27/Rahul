package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/city")
public class CityController
{

	@Autowired
	CityDAOImpl ref;
	
	List<City> li;

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<City> before(@RequestParam("citymap")String statename)
	{
		//System.out.println(a);
		li=new ArrayList<City>();
		 li=ref.getcity(statename);
		 return li;
		
}
}
