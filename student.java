class student1
{
	public int rollno;
	public String name;
	public String course;
	public int m1,m2,m3;
	
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
		s.m1=80;
		s.m2=70;
		s.m3=55;
		s.course="Artificial Intelligence";
		s.name="Ajith Kumar.K";
		s.rollno=1;
		
		System.out.println("Details:"+s.details());
		System.out.println("Total marks: "+s.total());
		System.out.println("Average of marks: "+s.avg());
		System.out.println("The grade is: "+s.grade());
	}

}
