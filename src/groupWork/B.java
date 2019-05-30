package groupWork;

class B extends Marks{
	   int a;
	   int b;
	   int c;
	   int d;
	   B(int a,int b,int c,int d){
	       this.a=a;
	       this.b=b;
	       this.c=c;
	       this.d=d;
	   }

	   @Override
	   public void getPercentage() {
	       int result=((a+b+c+d)/4);
	       System.out.println("The percentage of a student A is "+ result);

	   }

	}