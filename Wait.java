import java.util.*;
class Wait
{
	public static int n;
	public int bt;
	public int wt;
	public int tat;
	public int id;
	public static float avgwt=0;
	public static float avgtat=0;

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of tasks:");
	n = sc.nextInt();
	Wait T[]= new Wait[n];
	for(int i=0;i<n;i++)
	{
		T[i]=new Wait();
	}
	System.out.println("Enter your data about task.\n");
	T[0].wt=0;
	for(int i=0;i<n;i++)
	{
		T[i].id=i+1;
		System.out.println("Enter task burst time:");
		T[i].bt=sc.nextInt();
		if(i<n-1){
		T[i+1].wt=T[i].wt+T[i].bt;}
		T[i].tat=T[i].wt+T[i].bt;
		avgwt +=T[i].wt;
		avgtat +=T[i].tat;
	}
	System.out.println("Task  Burst time ::: Wait time  Turn around");
	for(int i=0;i<n;i++){
	System.out.println(" T"+T[i].id+"     "+T[i].bt+"   :::    "+T[i].wt+"      "+T[i].tat);
	}
	System.out.println("Average waiting time is:"+avgwt/n+"\nAverage turn around time is:"+avgtat/n);
}
}
