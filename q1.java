import java.util.*;
 
 
/*in this i have used a type class which is inherited by all type of people
and they are also represented by class breaker,VIPs,commoners,event promoters 
,brand promoters .
*/
abstract class type{
    //type  class is used for  inheriting the type of people
    String name ;
     String category;
    String bench;
    type(String category,String bench,String name){//constructor of type class
    	this.category=category;
    	this.bench=bench;
    	this.name=name;
    }
    abstract String getcategory();
    abstract String getbench();
    abstract String getname();
    abstract void print();
}
 
class breaker extends type{//class breaker
    
	private int experties;
	private int horoscope;
	
	//attributes of class are category ,name,becnch,experties ,horoscope
	breaker(String category,String bench,String name,int experties,int horoscope){
	    //constructor of class breaker
	 super(category,bench,name);
	  this.experties=experties;
	  this.horoscope=horoscope;
	 }
	 
	 //getters and setters 
	int getexpert(){
		return experties;
	}
	int gethoroscope(){
		return horoscope;
	}
	@Override
	String getcategory() {
		return category;
	}
	@Override
	String getbench() {
		return bench;
	}
	@Override
	String getname() {
		return name;
	}
	@Override
	void print() {
		System.out.println(this.name+" "+this.experties+" "+this.horoscope);
	}
}
 
class VIP extends type{
    
//VIP class containig number of events, date,month,year array ,venue and event name array of string type
 
	 private int n;
	  private int date[]=new int[100], month[]=new int[100], year[]=new int[100];
	  private String event[]=new String[100],venue[]=new String[100];
	  
	VIP(String category, String bench, String name,int n,int[] date,int[] month,int[] year,String[] event,String[] venue) {
		super(category, bench, name);
		this.n=n;
		for(int i=0;i<n;i++){
			this.date[i]=date[i];
			this.month[i]=month[i];
			this.year[i]=year[i];
			this.event[i]=event[i];
			this.venue[i]=venue[i];
		}
	}
    int getdate(int i){
    	return date[i];
    }
    int getmonth(int i){
    	return month[i];
    }
    int getyear(int i){
    	return year[i];
    }
    String getvenue(int i){
    	return venue[i];
    }
    String getevent(int i){
    	return event[i];
    }
 //below is overriden methods 	
 
	@Override
	String getcategory() {
		return category;
	}
 
	@Override
	String getbench() {
		return bench;
	}
 
	@Override
	String getname() {
		return name;
	}
	@Override
	void print() {
		System.out.println(this.name);
		for(int i=0;i<n;i++){
			System.out.println(this.date[i]+"-"+this.month[i]+"-"+this.year[i]+" "+this.event[i]+" "+this.venue[i]);
		}
	}
}
class commoners extends type{
 
	commoners(String category, String bench, String name) {
		super(category, bench, name);
	}
 
 //below is overriden methods 
	@Override
	String getcategory() {
		return category;
	}
 
	@Override
	String getbench() {
		return bench;
	}
 
	@Override
	String getname() {
		return name;
	}
 
	@Override
	void print() {
		System.out.println(name);
	}
}
 
class eventpromo extends type{
 //event promoters type of people
 
	private int dd,mm,yy;
	private String eventname,venue;
	
	eventpromo(String category, String bench, String name,int dd,int mm,int yy,String eventname,String venue) {
		super(category, bench, name);
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		this.eventname=eventname;
		this.venue=venue;
	}
    int getdate(){
    	return dd;
    }
    int getmonth(){
    	return mm;
    	
    }
    int getyear(){
    	return yy;
    }
    String getvenue(){
    	return venue;
    }
    String getevent(){
    	return eventname;
    }
 
 //below is overriden methods 
	@Override
	String getcategory() {
		return category;
	}
 
	@Override
	String getbench() {
		return bench;
	}
 
	@Override
	String getname() {
		return name;
	}
	@Override
	void print() {
		System.out.println(this.name+" "+this.dd+"-"+this.mm+"-"+this.yy+" "+this.eventname+" "+this.venue);
	}
	
}
 
class brandpromo extends type{
    
    //brand promoters type of people
    
	private String brandname,office;
	brandpromo(String category, String bench, String name,String brandname,String office) {
		super(category, bench, name);
		this.brandname=brandname;
		this.office=office;
	}
   String getbrand(){
	   return brandname;
   }
   String getoffice(){
	   return office;
   }
   
 
 //below is overriden methods 
   
	@Override
	String getcategory() {
		return category;
	}
 
	@Override
	String getbench() {
		return bench;
	}
 
	@Override
	String getname() {
		return name;
	}
	@Override
	void print() {
		System.out.println(this.name+" "+this.brandname+" "+this.office);
	}
		
}
public class q1 {//class q1 
 
	public static void main(String args[] ) throws Exception {//main class
	
	     Scanner s=new Scanner(System.in);//scanner to take input
	     
	     int t=s.nextInt();//testcases
	     
	     for(int i=0;i<t;i++){//loop runnig for number of testcases
	     
	          int m=s.nextInt();//seating area rows
	          int n=s.nextInt();//person in each row
	          
	          int a=s.nextInt();//no. of audience
	          
	          type typ[]=new type[a+5];//array of type class to contain all people 
	          
	          for(int j=0;j<a;j++){
	              String st=s.next();//st=category
	              
	              //scan all attributes of different types of people 
	              
	              if(st.equals("breaker")){
	            	  typ[j]=new breaker("breaker",s.next(),s.next(),s.nextInt(),s.nextInt());
	              }
	              if(st.equals("VIP")){
                      String bench=s.next();
                      String name=s.next();
                      int e=s.nextInt();
                      int dd[]=new int[e], mm[]=new int[e],yy[]=new int[e];
                      String event[]=new String[e],venue[] = new String[e];
                      for(int k=0;k<e;k++){//loop running till number of events
                          
                    	  int da=s.nextInt();
                    	  int mo=s.nextInt();
                    	  int yr=s.nextInt();
                    	  String eve=s.next();
                    	  String ven=s.next();
                    	  dd[k]=da;
                    	  mm[k]=mo;
                    	  yy[k]=yr;
                    	  event[k]=eve;
                    	  venue[k]=ven;
                      }
	            	 typ[j]=new VIP("VIP",bench,name,e,dd,mm,yy,event,venue); 
	              }
	              if(st.equals("commoner")){
	            	  typ[j]=new commoners("commoner",s.next(),s.next());
	              }
	              if(st.equals("event")){
	            	  typ[j]=new eventpromo("event",s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.next(),s.next());
	              }
	              if(st.equals("brand")){
	            	  typ[j]=new brandpromo("brand",s.next(),s.next(),s.next(),s.next());
	              }
	          }
	          
	          int r=s.nextInt();// number of receptionists
	          for(int l=0;l<r;l++){
	        	  String fi=s.next();//type of receptionists
	        	  String nm=s.next();//name of receptionists
	          }
	          int log=s.nextInt();//log determining if to print log or no
	          
	          for(int sv=a-1;sv>=0;sv--)
	          {
	        	  typ[sv].print(); //print function called to print .
	          }
	     }
	    }
}
