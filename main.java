import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class main {	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		loc l = new loc();
		pot p = new pot();
		win wi = new win();
		
		//time t = new time();
		
		Watch w = new Watch();
		mainthread main = new mainthread(w,l,p,wi);
		//Harry h = new Harry();
		Hermione her = new Hermione(l,p,wi);
	
		
	}
}
