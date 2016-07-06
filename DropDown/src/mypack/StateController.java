package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/state")
public class StateController 
{ List<State> lstate;
List<City> lcity;
@Autowired
StateDAO ref;

@RequestMapping(method=RequestMethod.GET)
	public ModelAndView before()
	{
		State s= new State();
		return new ModelAndView ("home","go",s);
	
	}
	@ModelAttribute("statename")
	public List segmentvalue()
	{
		 lstate=new ArrayList<State>();
		 lstate=ref.getState();
		 return lstate;
		
	}
	 @RequestMapping(method=RequestMethod.POST)
	 public ModelAndView after ( @ModelAttribute("go") State a,HttpSession session)
	 {
		 //System.out.println(a);
		 session.setAttribute("stateobj", a);
		return new ModelAndView("redirect:/hub.do");
	 }
	 
}