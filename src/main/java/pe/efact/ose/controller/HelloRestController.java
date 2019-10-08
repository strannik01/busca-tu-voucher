package pe.efact.ose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.efact.ose.model.Event;

@RestController
public class HelloRestController {

	@GetMapping("/events")
	public List<Event> getEvents() {
		List<Event> events = new ArrayList<>();
		
		Event event1 = new Event();
		event1.setName("Java User Group");
		
		Event event2 = new Event();
		event2.setName("Angular User Group");
		
		events.add(event1);
		events.add(event2);

		return events;
	}
}
