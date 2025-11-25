package rv.missoes_lunares.view;

import java.util.Scanner;

public class Main {
	public static void Main(String[] args) {
		System.out.println("========================================================");
		System.out.println("|             Bem vindo ao Sistema Lunar               |");
		System.out.println("========================================================");
		Wait(1000);
		Menu();
	}
	
	public static void Menu() {
		while(true) {
			
		}
	}
	
	public static void Wait(int time) {
		try {Thread.sleep(time);} catch (InterruptedException e) {Thread.currentThread().interrupt();};
	}
}

