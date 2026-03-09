package Chap_09;

import java.util.*;

public class _05_LinkedList {
	public static void main(String[] args) {
		// 링크드 리스트
		LinkedList<String> list = new LinkedList<>();
		
		// 데이터 추가
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		
		// 데이터 조회 (인텓스)
		System.out.println(list.get(0)); // 유재석
		System.out.println(list.get(1)); // 조세호
		System.out.println(list.getFirst()); // 유재석
		System.out.println(list.getLast()); // 강호동
		
		System.out.println("------------------");
		
		// 추가
		list.addFirst("서장훈"); // 처음에 추가
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------");
		
		list.addLast("김희철"); // 끝에 추가
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------");
		
		System.out.println("학생 추가 전 : " + list.get(1)); // 유재석
		list.add(1, "김영철"); // 중간에 추가
		System.out.println("학생 추가 후 : " + list.get(1)); // 김영철
		System.out.println("학생 추가 후 : " + list.get(2)); // 유재석
		
		System.out.println("------------------");
		
		// 삭제
		System.out.println("남은 학생 수 (제외 전) : " + list.size());
		list.remove(list.size() - 1);
		System.out.println("남은 학생 수 (제외 후) : " + list.size());
		
		System.out.println("------------------");
		
		// 처음 학생과 마지막 학생이 전학
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("남은 학생 수 (전학 전) " + list.size());
		list.removeFirst(); // 처음 데이터
		list.removeLast(); // 마지막 데이터
		System.out.println("남은 학생 수 (전학 후) " + list.size());
		
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------");

		// 변경 (수강권 양도)
		System.out.println(list.get(0)); // 김영철
		list.set(0, "이수근");
		System.out.println(list.get(0)); // 이수근
		
		// 확인
		list.indexOf("깅종국");
		if (list.contains("김종국")) {
			System.out.println("수강신청 성공");
		} else {
			System.out.println("수강신청 실패");
		}
		
		System.out.println("------------------");
		
		// 전체 삭제
		list.clear();
		if (list.isEmpty()) {
			System.out.println("학생 수 : " + list.size());
			System.out.println("리스트가 비었습니다.");
		} 
		
		System.out.println("------------------");
		
		// 새로운 학기 시작
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		list.add("강호동");
		list.add("강호동");
		list.add("강호동"); // 중복 처리가 가능
		
		Collections.sort(list); // 정렬
		for (String s : list) {
			System.out.println(s);
			
		}
	}

}
