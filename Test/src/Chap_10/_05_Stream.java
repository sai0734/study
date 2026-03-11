package Chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
	public static void main(String[] args) {
		// 스트림
		
		// Arrays.stream(); 이용
		int[] scores = {100, 95, 85, 80};
		IntStream scorestream = Arrays.stream(scores);
		
		String[] langs = {"python", "Java", "javascript", "c", "c++", "c#"};
		Stream<String> langStream = Arrays.stream(langs);
		
		// Collection.stream(); 이용
		List<String> langList = new ArrayList<>();
//		langList.add("python");
//		langList.add("Java");
		// asList를 통해 한번에 값을 넣을 수 있다.
		langList = Arrays.asList("python", "Java", "javascript", "c", "c++", "c#"); 
		System.out.println(langList.size());
		Stream<String> langListStream = langList.stream();
		
		// Stream.of(); 이용
		Stream<String> langListOfStream = Stream.of("python", "Java", "javascript", "c", "c++", "c#");
		
	}

}
