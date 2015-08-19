package com.gmail.dmytroivo;

import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	creatList();	
	}

	public static void creatList() {
		LinkedList<Integer> list = new LinkedList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(10));
		}
		System.out.println(list);//Для проверки, вывод первичного списка
		list.poll();
		list.poll();
		list.remove(list.size()-1);
		System.out.println("      "+list);
	}
}
