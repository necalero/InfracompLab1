package infracompLab1;

import java.util.Scanner;

public class Main {

	public static RunThread[] rt;
	public static ExtendThread[] et;
	
	public static void main(String[] args) 
	{
		int intNum = 0;
		int threadNum = 2;
		int sleepTime = 500;
		int option = -1;
		try 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Elija una opcion: \n1. Runnable \n2. Extends");
			option = scan.nextInt();
			System.out.println("Inserte la cantidad de numeros que desea imprimir");
			intNum = scan.nextInt();
			System.out.println("Inserte la cantidad de milisegundos que desea que duerma el thread");
			sleepTime = scan.nextInt();
			
			
			
			scan.close();
		} catch (Exception e) {e.printStackTrace();}
		
		
		if(option==1)
		{
			rt = new RunThread[threadNum];
			rt[0] = new RunThread(true, intNum, 1, sleepTime);
			rt[1] = new RunThread(false, intNum, 2, sleepTime);
			rt[0].runThread();
			rt[1].runThread();
		}
		else if(option ==2)
		{
			et = new ExtendThread[threadNum];
			et[0] = new ExtendThread(true, intNum, 1, sleepTime);
			et[1] = new ExtendThread(false, intNum, 2, sleepTime);
			et[0].runThread();
			et[1].runThread();
		}
		
		
		/*
		for (int i = 0; i < threadNum; i++) 
		{
			rt[i].runThread();
		}
		*/

	}

}
