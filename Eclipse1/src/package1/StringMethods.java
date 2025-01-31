package package1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Hello my name is Hari";
int size = a.length();
System.out.println(size);          //length method

char get = a.charAt(4);
System.out.println(get);         //charAt method

int b = 52;
String c = String.valueOf(b);      //valueOf method
System.out.println(c);

String d = "I like apples";
String e = "I like apples";
String f = "i like APPles";
System.out.println(d.equals(e));          //equals method
System.out.println(d.equals(f));
System.out.println(d.equalsIgnoreCase(f));

String g = "Hello";
String h = g.concat(" World");          //concat method
String i = h.concat(" Day");
System.out.println(i);

String Array[] = a.split(" ");           //split method
/*for(int j=0; j<=4; j++)                
{
	System.out.println(Array[j]);          //this will split the entire string
}
*/

System.out.println(Array[4]);              //this will split only 1 word
	}

}
