package za.co.dstv.subjectapiapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	private List<Subject> subjects = new ArrayList<> (Arrays.asList(
		
	
				new Subject("java", "java-tutorial,", "core java"),
				new Subject("pythom", "pythom-tutorial,", "pythom lessons"),
				new Subject("PHP", "PHP-tutorial,", "PHP lessons"),
				new Subject("javaScript", "javaScript-tutorial,", "javaScript for beginners")
				
				
				));
	
		public List<Subject> getAllSujects(){
			
			return subjects;
			
		}
		
		
		public Subject getSubject(String id) {
	return subjects.stream().filter(s-> s.getId().equals(id)).findFirst().get();
		
		
		}


		public void addSubject(Subject b) {
			subjects.add(b);
			
		}


		public void updateSubject(String id, Subject b) {
			for(int i = 0; i<subjects.size(); i++) {
				Subject sub = subjects.get(i);
				if(sub.getId().equals(id)) {
				subjects.set(i, b);
				
				return;
				
			}
			
		}
		}

}
