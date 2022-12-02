class student1
{
	public int rollno;
	public String name;
	public String course;
	private int m1,m2,m3;
	
	public int getm1()
	{
		return m1;		
	}
	public void setm1(int mark1)
	{
		if(mark1>0)
			m1=mark1;
		else
			m1=0;
	}
	public int getm2()
	{
		return m2;		
	}
	public void setm2(int mark2)
	{
		if(mark2>0)
			m2=mark2;
		else
			m2=0;
	}
	public int getm3()
	{
		return m3;		
	}
	public void setm3(int mark3)
	{
		if(mark3>0)
			m3=mark3;
		else
			m3=0;
	}
	
	public String details()
	{
		return "\n"+"Roll number: "+rollno+"\n"+"Name: "+name+"\n"+"Course Name: "+course;
	}
	public int total()
	{
		return m1+m2+m3;
	}
	public float avg()
	{
		return (float)total()/3;
	}
	public char grade()
	{
		if(avg()>=80)
			return 'A';
		else if(avg()>=60&&avg()<80)
			return 'B';
		else
			return 'F';
		
	}
	
}
public class student {

	public static void main(String[] args) {
		
		student1 s=new student1();
		s.setm1(100);
		s.setm2(75);
		s.setm3(55);
		s.course="Artificial Intelligence";
		s.name="Ajith Kumar.K";
		s.rollno=1;
		
		System.out.println("Details:"+s.details());
		System.out.println("Total marks: "+s.total());
		System.out.println("Average of marks: "+s.avg());
		System.out.println("The grade is: "+s.grade());
	}

}
