package com.example.demo.wordpostget;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class WordfileService {

	private List<Wordfile> word = new ArrayList<>(Arrays.asList(
			new Wordfile("abcd")));
	
	public List<Wordfile> getwordfile(){
		return word;
	}


	public void addWordfile(Wordfile wordfile) {
		word.add(wordfile);
		
	}


	public void updateWordfile(Wordfile wordfile) {
		word.set(0, wordfile);
		
	}


	


	
}
