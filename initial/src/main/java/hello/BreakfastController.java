package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BreakfastController {
	
	private final List<Breakfast> lsBreakfasts = new ArrayList<>();
	
	@RequestMapping(value = "/breakfasts", method = RequestMethod.GET)
	public List<Breakfast> getBreakfasts() {
		initBreakfastList();
		return lsBreakfasts;
	}
	
	@RequestMapping(value = "/breakfasts/{id}", method = RequestMethod.GET)
	public Breakfast getBreakfast(@PathVariable("id") int id ) {
		return lsBreakfasts.get(id);
	}
	
	@RequestMapping(value = "/breakfasts", method = RequestMethod.POST)
	public void addBreakfasts(@RequestBody Breakfast br ) {
		lsBreakfasts.add(br);
	}
	
	@RequestMapping(value = "/breakfasts/{id}", method = RequestMethod.DELETE)
	public void delBreakfast(@PathVariable("id") int id ) {
		lsBreakfasts.remove(id);
	}
	
	private void initBreakfastList() {
		Breakfast br1 = new Breakfast();
		br1.setId(1);
		br1.setName("banh my");
		br1.setPrice(15000);
		br1.setNumsOfCalories(16);
		
		lsBreakfasts.add(br1);
		
		
	}
}
