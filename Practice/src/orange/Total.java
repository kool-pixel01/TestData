package orange;

import java.util.HashMap;
import java.util.Iterator;

public class Total {

public static void revers(String re) {
String s1[]=re.split(" ");
System.out.println(s1.length);
for (int i = 0; i < s1.length; i++) {
	String w=s1[i];
	for (int j =w.length()-1; j >=0; j--) {
		System.out.print(w.charAt(j));
	}
	System.out.print(" ");
}


}

public static void countCharacterUsingMap(String letter) {
	String[] s=letter.split("");
	System.out.println(letter);
	HashMap<String,Integer>h=new HashMap<String, Integer>();
	//int number=1;
	for (int i = 0; i < s.length; i++) {
		if (h.containsKey(s[i])) {
			int number=h.get(s[i]);
			h.put(s[i], number+1);
			System.out.print(s[i]+" "+number);
		}else {
			h.put(s[i], 1);
		}
		
		
	}
System.out.println(h);
}

public static void countletterUsingchar(String letter) {
	
char c,ch; int i=letter.length(),j,k;

for(c='A';c<='z';c++) {
	k=0;
	for (j = 0; j <i; j++) {
		ch=letter.charAt(j);
		if(ch==c) {
			k++;
		}
		
	}
	if(k>0) {
		System.out.println("The Character "+c+" has occured "+k+" Times");
	}
}


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String kul="Selenium Automation Demo";
for (int i = 0;i<kul.length(); i++) {
	System.out.print(kul.charAt(i));
	
}
System.out.println();
for (int i =kul.length()-1; i>=0; i--) {
	System.out.print(kul.charAt(i));
}
System.out.println();
revers(kul);
System.out.println();

countCharacterUsingMap(kul);
String op="lldeo";
countletterUsingchar(kul);
	}

}
