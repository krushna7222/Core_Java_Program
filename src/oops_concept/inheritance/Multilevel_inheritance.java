package oops_concept.inheritance;


//parent class  =>  Society,Wing,Flat
//child class   => Wing,Flat,Room

//
//Multilevel inheritance  => in  Multilevel_inheritance, the child most class
//is derived from another child class and that another child class is derived 
//from parent class



class Society             //Society =>grandParent
{
  protected String s_name;  //protected  => members can be accessible from outside the class but within child class only
  protected String city;
}

class Wing  extends Society       //Wing => PArent
{
  protected char    w_name;

}

class Flat     extends Wing        //Flat=> child
{
    protected String type;
    //String s_name;
    //String city;
  //  char    w_name;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
  public char getW_name() {
      return w_name;
  }
  
  public void setW_name(char w_name) {
      this.w_name = w_name;
  }
  
 

  public String getS_name() {
      return s_name;
  }
  public void setS_name(String s_name) {
      this.s_name = s_name;
  }
  public String getCity() {
      return city;
  }
  public void setCity(String city) {
      this.city = city;
  }
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flat f1= new Flat(  );
        f1.setS_name("shreenath palza");
        f1.setCity("pune");
        f1.setW_name('A');
        f1.setType("1BHK");
      
       System.out.println(f1.getCity());
       System.out.println(f1.getS_name());
       System.out.println( f1.getW_name());
       System.out.println( f1.getType());

	}

}
