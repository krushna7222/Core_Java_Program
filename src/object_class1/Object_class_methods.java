package object_class1;


import java.util.Objects;

//Q.List out different methods of an object class
//=> wait(),clone(),notify(),notifyAll(),getClass(),hashCode(),equals(), toString()

class Emp2
{
    int eid;
    String name;
    double salary;
    
    public Emp2(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emp2 other = (Emp2) obj;
        return eid == other.eid && Objects.equals(name, other.name)
                && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
    }
    
    
}
public class Object_class_methods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Emp2 e1= new Emp2(34,"harsh", 72772.2);
        System.out.println("e1 = "+e1);
        
    //     System.out.println(e1.getClass());  //getClass() => returns class information about an object
    
    //      System.out.println(e1.hashCode());
        
        
        Emp2 e2= new Emp2(34,"harsh", 72772.2);
        System.out.println(e1.equals(e2));   //if we want to check equality between 2 objects then we must have to override hashCode() and equals() method from an object class
        
         System.out.println("hashcode of e1 = "+e1.hashCode());
         System.out.println("hashcode of e2 = "+e2.hashCode());
                
        
        
    
    }

}
