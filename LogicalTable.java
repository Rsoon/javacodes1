public class LogicalTable {
public static void main(String args[]) {
boolean p, q; 
System.out.println("P\tQ\tAND\tOR\tXOR\tNOT"); 
p = true; q = true; 
System.out.println(p +"\t" + q +"\t"); 
System.out.println((p&q) + "\t" + (p|q) + "\t"); 
System.out.println((p^q) + "\t" + (!p)); 

p = true; q = false; 
System.out.println(p +"\t" + q +"\t"); 
System.out.println((p&q) + "\t" + (p|q) + "\t"); 
System.out.println((p^q) + "\t" + (!p)); 

p = false; q = true; 
System.out.println(p +"\t" + q +"\t"); 
System.out.println((p&q) + "\t" + (p|q) + "\t"); 
System.out.println((p^q) + "\t" + (!p)); 

p = false; q = false; 
System.out.println(p +"\t" + q +"\t"); 
System.out.println((p&q) + "\t" + (p|q) + "\t"); 
System.out.println((p^q) + "\t" + (!p)); 

}
}

//this code is also a problem.. does not list all the tables as shown in book 