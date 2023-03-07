package it.polito.tdp.Lab01.model;

import java.util.*;
import java.util.List;

public class Parole {
		
	private List<String> words;
	public Parole() {
		words = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		words.add(p);
	}
	
	public List<String> getElenco() {
		
		return words;
	}
	
	public void reset() {
		words.clear();
	}
	
	public void cancel(String p) {
		for (int i = 0; i<words.size(); i++) {
			if(words.get(i).equals(p)) {
				words.remove(i);
			}
		}
	}

}