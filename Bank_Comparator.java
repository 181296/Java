import java.util.*;

class Bank{
    private long accNo;
    private double salary;
    private String name;
    
    public Bank(){
        accNo = 0;
        salary = 500.00;
        name = "xyz";
    }
    
    public Bank(long accNo, double salary, String name){
        this.accNo = accNo;
        this.salary = salary;
        this.name = name;
    }
    
    public double getAccNo(){
        return salary;
    }
    
    public String toString(){
        return "\nAccount No. : "+accNo+"\n"+"Name : "+name+"\nSalary : "+salary;
    }
}

class ComparatorBank implements Comparator<Bank>{
    
    @Override
    public int compare(Bank b1, Bank b2){
        if(b1.getAccNo() > b2.getAccNo())
            return 1;
        if(b1.getAccNo() < b2.getAccNo())
            return -1;
        return 0;
    }
}

public class Main{
	public static void main(String[] args) {
	    TreeSet<Bank> t = new TreeSet<Bank>(new ComparatorBank());
	    t.add(new Bank(200320142,50000.00,"Rohan"));
	    t.add(new Bank(200820242,150000.45,"Ravi"));
	    t.add(new Bank(200320048,550000.95,"Ram"));
	    t.add(new Bank(200320182,50500.05,"Rahul"));
	    t.add(new Bank(200325143,510000,"Riya"));
	    
	    //for(Bank b : t)
	    //    System.out.println(b);
	    
	    Iterator<Bank> i = t.iterator();
	    while(i.hasNext())
	        System.out.println(i.next());
	    
	   // Iterator<Bank> i = t.descendingIterator();
	   // while(i.hasNext())
	   //     System.out.println(i.next());
	    
	}
}
