package sk.dneperska.work;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int i, j;
		String line = "";
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(System.getProperty("user.home")+ "\\file.txt", true)));
		for(i=0; i<n; i++)
		{
			for(j=2*(n-i)-3; j>=0; j--)
			{
				line = line + " ";
			}
			for(j=0; j<=i; j++)
			{
				line = line + "* ";
			}
			out.println(line+"\n");
			line = "";
		}
		out.close();
}}
