package myPack;

import java.util.ArrayList;
import java.util.Iterator;

public class Mycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=445;
		boolean status = true;
		for (int i=2; i < k; i++) {
			System.out.println();
			
			if(k%i==0) {
				status=false;
				String k2="check";
				break;
			}
			
		}
		if(status) {
			System.out.println(k+"  Prime number");
		}else{
			System.out.println(k+" Not Prime number");
		}
		
		
System.out.println("------check----------");
String p="MOMK";
String revers="";
for (int i = p.length()-1; i>=0; i--) {
	revers=revers+p.charAt(i);
}
System.out.println(revers);
if(p.equals(revers)) {
	System.out.println("palidrom");
}else {
	System.out.println("Not");
}

System.out.println("---check2------");
int a=0,b=1,c;
System.out.print(a+" "+b);
for (int i = 1; i < 10; i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(" "+c);
	
}
System.out.println();
System.out.println("-----check3------");
ArrayList list=new ArrayList();
list.add("aaa");
list.add("bbb");
list.add("ccc");
list.add(10);

Iterator itr=list.iterator();
System.out.println("--whileloop--");
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("--using for each loop--");
for (Object object : list) {
	System.out.println(object);
}
System.out.println("--using for loop--");
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}

System.out.println("----check4-----");
int h=153,m,x = 0,z = 0,temp=h;

while(h>0) {
	m=h%10;
	h=h/10;
	x=x+(m*m*m);
}
System.out.println(z);
System.out.println(x);
if(temp==x) {
	System.out.println("yes");
}else {
	System.out.println("No");
}
	}

}
