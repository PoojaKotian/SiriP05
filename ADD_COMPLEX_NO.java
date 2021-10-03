public class ComplexNumber{
   
   double real, img; //for real and imaginary parts of complex numbers
	
   
   ComplexNumber(double r, double i)//constructor to initialize the complex number
   {
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	
        ComplexNumber t = new ComplexNumber(0, 0); //creating a temporary complex number 
        t.real = c1.real + c2.real;
        t.img = c1.img + c2.img;
        
        return temp;  //returning the output 
    }
    public static void main(String args[]) 
    {
	ComplexNumber cn1 = new ComplexNumber(5.5, 4);
	ComplexNumber cn2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = sum(cn1, cn2);
        System.out.printf("Sum is: "+ t.real+" + "+ t.img +"i");
    }
}
