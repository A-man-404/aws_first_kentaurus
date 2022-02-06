package com.example.demo.wordpostget;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class WordfileController {

	@Autowired
	private WordfileService wordfileService;
	
	@RequestMapping("/word")
	public List<Wordfile> getWordfile(){
		return wordfileService.getwordfile();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/word")
	public void addWordfile(@RequestBody Wordfile wordfile) {
		wordfileService.updateWordfile(wordfile);
		
	}
	
	
	
}
