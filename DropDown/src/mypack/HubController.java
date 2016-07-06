package mypack;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@RequestMapping("/hub")
	public class HubController 
	{
		@Autowired
		HubDAO ref;
		List<Hub> lhub;
		@RequestMapping(method = RequestMethod.GET)
		public String hubdetailsbefore(ModelMap model,HttpSession s)
		{
			State se=(State) s.getAttribute("stateobj");
			
			String sname=se.getStatename();
			System.out.println(sname);
			lhub=new ArrayList<Hub>();
		    lhub=ref.gethub(sname);
			//System.out.println(lhub);
			model.addAttribute("myloc", lhub);
			return "hubdisp"; 
			
		}
		
		/*@RequestMapping(method = RequestMethod.POST)
		public String hubdetailsafter(ModelMap model)
		{
			return "success";
			
		}*/

	}


