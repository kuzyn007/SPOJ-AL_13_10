/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_13_10/
 */

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] tab1 = new int[1000];
		int[] tab2 = new int[1000];
		int t = readInt(br);
		//System.out.println(t);
		
		for(int i=0; i<t; i++)
		{		
			int pozycja1=0;
			int pozycja2=0;
			int znak = br.read();
			while (znak<'A' || 'Z'<znak)
			{
				znak = br.read();
			}
			while (znak>='A' && 'Z'>=znak)
			{
				tab1[pozycja1] = znak;
				pozycja1++;
				znak = br.read();
			}
			while (znak<'A' || 'Z'<znak)
			{
				znak = br.read();
			}

			while (znak>='A' && 'Z'>=znak)
			{
				tab2[pozycja2] = znak;
				pozycja2++;
				znak = br.read();
			}
		
			
			/*for(int e : tab1)
			{
				System.out.print((char) e);
			}
			System.out.print(" ");
			for(int e : tab2)
			{
				System.out.print((char) e);
			}
			System.out.println();*/

			int x=0;
			for(int j=0; j<pozycja1; j++)
			{
				if(x != pozycja2 && tab1[j] == tab2[x])
				{
					x++;
				}
				if(x==pozycja2)
				{
					break;
				}
			}
			if(x == pozycja2)
			{
				System.out.println("Tak");
			}
			else
			{
				System.out.println("Nie");
			}
		}
	}
	public static int readInt(BufferedReader br) throws IOException
	{
		//Wczytywaj znaki (spacje, entery i takie tam) az bedzie jakas cyfra (minus zmienia na ujemna)
		int znak;
		int wynik = 0;
		int znakLiczby = 1;
		do 
		{
			znak = br.read();
			if (znak == '-')
			{
				znakLiczby = -1;
				continue;
			}
		} while (znak < '0' || znak > '9');
		wynik = 0;
		//Wczytywaj cyfry i tworz inta, az napotkasz inny znak
		while ( (znak >= '0' && znak <= '9'))
		{
			wynik = wynik * 10 + znak - '0';
			znak = br.read();
		}
		return wynik * znakLiczby;
	}


}

