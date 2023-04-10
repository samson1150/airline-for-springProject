package za.co.dstv.subjectapiapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
@GetMapping("/subjects") //URL
	public List<Subject> getAllSubjects(){
		return service.getAllSujects();
	}


@RequestMapping("/subjects/{id}")
public Subject getSubject(@PathVariable String id) {
	return service.getSubject(id);
}

@PostMapping("/subjects")
public void addSubject(@RequestBody Subject b) {
	service.addSubject(b);
	
}
@PutMapping("/subjects/{id}")
public void updateSubject(@PathVariable String id, @RequestBody Subject b) {
	service.updateSubject(id,b);

}}