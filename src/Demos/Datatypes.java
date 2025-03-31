package Demos;



/*
 1.primitive(inbuilt/predefined datatypes)
c=> int,float,char,double,short,long 
cpp=> int,float,char,double,short,long ,bool(true or false)
java=> int,float,char,double,short,long ,boolean ,byte    => 8  primitive datatypes

***numeric datatypes
byte(1),short(2byte),int(4 byte),long(8 bytes)   => whole number
float(4),double(8),          =>floating point number

***non-numeric datatype
char(2), boolean (1 bit)  1

2.non-primitive(user defined datatypes)
c =>    array,pointer,structure,union
cpp  => array,pointer,class
java  =>  array,class,String , interface


*/
public class Datatypes {

    public static void main(String[] args) {

        
        byte a=120;                    //size=> 1byte     //0-127 , -128 to +127 //    -128 ....-2,-1, 0,1,2,3....127
        System.out.println(a);
        
        short b=32767;             //size=>  2byte              //-32768 to 32767
        System.out.println(b);
        
        int rollno=672;                      //size=>  4byte 
        System.out.println(rollno);          // -2147483648 to 2147483647   
        
        long phoneno=7833737373l;         //size=>  8byte 
        System.out.println(phoneno);     //9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        float x=89.33656566565663876f;      //size=>  4byte  //3.4e-038 to 3.4e+038
        
        double y=89.33656566565663876;      //size=>  8byte       //1.7e-308 to 1.7e+308
        
    System.out.println("float = "+x);        //+ is called as concatenation operator
        System.out.println("double  = "+y);
        
        char ch='j';                        //size=>  2byte 
        System.out.println("char  ="+ch);
        
        boolean bl=true;        //true= 1,false =0  //size=>  1 bit => 0,1
        System.out.println(bl);
        
        //String => as a class(non-primitive) and as a datatype(primitive)
        String s="hello";
        System.out.println(s);
               
    }   
}
