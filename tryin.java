import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tryin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<Integer> l=new ArrayList<Integer>();
int n,q,x,y;
n=sc.nextInt();
for(int i=0;i<n;i++) {
	int enter=sc.nextInt();
	l.add(enter);
	}
q=sc.nextInt();
sc.nextLine();
while(q>0) {
	String op=sc.next();

	if(op.equalsIgnoreCase("Insert"))
	{
		x=sc.nextInt();
		y=sc.nextInt();
		l.add(x,y);
		}
	
	else if(op.equalsIgnoreCase("Delete"))
	{x=sc.nextInt();
	l.remove(x);
	}
	else
		System.out.println("invalid");
	q--;
		}
for(int i=0;i<n;i++)
System.out.print(l.get(i) + " ");
sc.close();
	}
	
}

