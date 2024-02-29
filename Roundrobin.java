import java.util.*;
class Roundrobin
{
	public static int n;
	public static int x;
	public int bt;
	public int wt;
	public int tat;
	public int id;
	public int gantt;
	public static float avgwt=0;
	public static float avgtat=0;
	public static int sum=0;
	public static int t=0;

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of tasks:");
	n = sc.nextInt();
	Roundrobin T[]= new Roundrobin[n];
	for(int i=0;i<n;i++)
	{
		T[i]=new Roundrobin();
	}
	System.out.println("Enter your data about task.\n");
	T[0].wt=0;
	for(int i=0;i<n;i++)
	{
		T[i].id=i+1;
		System.out.println("Enter task burst time:");
		T[i].bt=sc.nextInt();
		T[i].gantt=T[i].bt;
		sum +=T[i].bt;
	}
	System.out.println("Enter quantum time:");
	x = sc.nextInt();
	
	while (t!=sum) 
	{ 
		
		for (int i = 0 ; i < n; i++) 
		{ 
			if (T[i].gantt > 0) 
			{ 
				
				if (T[i].gantt > x) 
				{ 
					t += x; 
					T[i].gantt -= x; 
				} 
		
				else
				{ 
					t = t + T[i].gantt; 
					T[i].wt = t - T[i].bt; 
					T[i].gantt = 0; 
				} 
			} 
		} 
	
	} 
	
	for(int i=0;i<n;i++)
	{
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
