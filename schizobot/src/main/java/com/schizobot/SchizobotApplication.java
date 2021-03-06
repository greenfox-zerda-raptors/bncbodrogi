package com.schizobot;

import edu.stanford.nlp.simple.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SchizobotApplication {

	public static void main(String[] args) {
		// Create a document. No computation is done yet.
		Document doc = new Document("add your text here! It can contain multiple sentences.");
		for (Sentence sent : doc.sentences()) {  // Will iterate over two sentences
			// We're only asking for words -- no need to load any models yet
			System.out.println("The second word of the sentence '" + sent + "' is " + sent.word(1));
			// When we ask for the lemma, it will load and run the part of speech tagger
			System.out.println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2));
			// When we ask for the parse, it will load and run the parser
			System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse());
		}
	}
}
