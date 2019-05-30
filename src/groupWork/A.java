package groupWork;

class A extends Marks{
	   int A;
	   int B;
	   int C;
	   A(int a,int b,int c){
	       this.A=a;
	       this.B=b;
	       this.C=c;
	   }

	   @Override
	   public void getPercentage() {
	       int result=((A+B+C)/3);
	       System.out.println("The percentage of a student A is "+ result);
	   }

	}
