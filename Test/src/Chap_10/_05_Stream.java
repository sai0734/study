package Chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class _05_Stream {
	public static void main(String[] args) {
		// 스트림 생성
		
		// Arrays.stream(); 이용
		int[] scores = {100, 95, 90, 85, 80};
		IntStream scorestream = Arrays.stream(scores);
		
		String[] langs = {"python", "Java", "javascript", "c", "c++", "c#"};
		Stream<String> langStream = Arrays.stream(langs);
		
		// Collection.stream(); 이용
		List<String> langList = new ArrayList<>();
//		langList.add("python");
//		langList.add("Java");
		// asList를 통해 한번에 값을 넣을 수 있다.
		langList = Arrays.asList("python", "Java", "javascript", "c", "c++", "c#"); 
//		System.out.println(langList.size());
		Stream<String> langListStream = langList.stream();
		
		// Stream.of(); 이용
		Stream<String> langListOfStream = Stream.of("python", "Java", "javascript", "c", "c++", "c#");
		
		
		// 스트림 사용
		// 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip,...
		// 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, antMatch, allMatch, ...
		
		// 90 점 이상인 점수만 출력
		Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//		Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); // 똑같다
		 
		System.out.println("----------------------------");
		
		// 90 점 이상인 사람의 수
		int count = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
		System.out.println(count);
		
		System.out.println("----------------------------");
		
		// 90 점 이상인 점수들의 함
		int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
		System.out.println(sum);
		
		System.out.println("----------------------------");
		
		// 90 점 이상인 점수들의 정렬
		Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
		
	}

}
