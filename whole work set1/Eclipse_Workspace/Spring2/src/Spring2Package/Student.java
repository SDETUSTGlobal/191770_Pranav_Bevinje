package Spring2Package;

public class Student 
{
private String stdName;
private int id;

/*public void setId(int id) {
	this.id = id;
}


public void setStdName(String stdName)
{
	this.stdName = stdName;
}*/

public Student(String stdName, int id) 
{
	super();
	this.stdName = stdName;
	this.id = id;
}
public void display()
{
System.out.println("Name: "+stdName+"\n ID: "+id);
}
}
