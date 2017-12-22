import java.util.*;
 
/*in this i have used a type class which is inherited by all type of people
and they are also represented by class breaker,VIPs,commoners,event promoters 
,brand promoters .
*/
abstract class type{
//type class is used for inheriting the type of people
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
class commoners extends type{//class commoner
 
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
abstract class bench_type{
 
String type_bench;
bench_type(String type_bench){
this.type_bench=type_bench;
}
abstract String getbench_type();
}
 
class backbencher extends bench_type{
 
backbencher(String type_bench) {
super(type_bench);
}
String getbench_type() {
return this.type_bench;
}
 
}
class celebrity extends bench_type{
 
celebrity(String type_bench) {
super(type_bench);
}
String getbench_type() {
return this.type_bench;
}
}
 
class crowdloving extends bench_type{
 
crowdloving(String type_bench) {
super(type_bench);
}
String getbench_type() {
return this.type_bench;
}
}
class sparseloving extends bench_type{
 
sparseloving(String type_bench) {
super(type_bench);
}
String getbench_type() {
return this.type_bench;
}
}
class entranceloving extends bench_type{
entranceloving(String type_bench) {
super(type_bench);
}
String getbench_type() {
return this.type_bench;
}
}
 
 class q2{//class q1 
 
 static type[][] arrangeseat(type[][] ans,type typ){
     
     int m=ans.length,n=ans[0].length;
     if(typ.getbench().equals("BB")){
         int f=0;
        for(int r=m-1;r>=0 ;r--){
 
          for(int k=n-1;k>=0;k--){
 
            if(ans[r][k] == null){
 
              ans[r][k] = typ;
                f=1;
              break;
           }
 
       }
       if(f==1)break;
     }
   }
     
 if(typ.getbench().equals("EL")){
         
int r=0,f=0;
while(r<n){
for(int g=0;g<m;g++){
if(ans[g][r] == null){
ans[g][r] = typ;
f=1;
break;
}
}
r++;
if(f==1)break;
} 
}
 if(typ.getbench().equals("SL")){
          
int index_r=0,index_c=0,max=0,val=0,c1=0;
for(int r=0;r<m;r++){
for(int c=0;c<n;c++){
 
if(ans[r][c]==null){
int temp = c,r1=r;
c1=c;
int ct = 0;
while(temp<n && ans[r][temp] == null){
ct++;
temp++;
}
if(max < ct){
max=ct;
index_r = r;
index_c = c;
}
} 
}
val=max;
}
int mid = ((index_c+val-1)+index_c)/2;
ans[index_r][mid]=typ;
     
 }
 if(typ.getbench().equals("CL")){
         int temp=0,val=0,maxm = -1,index_r=0,index_c=0 ; 
for(int r=0;r<m;r++){
for(int c=0;c<n;c++){
if(ans[r][c]==null){
temp = 1;
 
for(int d=c+1;d<n;d++){
 
if(ans[r][d] != null){
temp++;
 
}
else 
break;
 
}
for(int d=c-1;d>=0;d--){
if(ans[r][d] != null){
temp++;
 
}
else 
break;
 
} 
 
}
if(temp > maxm){
maxm=temp;
index_r = r;
index_c = c;
 
}
}
}
ans[index_r][index_c] = typ;
     
 }
if(typ.getbench().equals("C")){
          
int v=n,f=0;
if(v % 2 == 0 ){//number of columns are even
for(int g=0;g<m;g++){
 
int cent = (v-1)/2;
int r=cent,k=r+1;
if(ans[g][cent] == null)
{
ans[g][cent]=typ;
f=1;
break;
}
else{
while(r<k){
if(r<0)
break;
 
if(r>=0 && ans[g][r]==null){
ans[g][r]=typ;
f=1;
break;
}
if(ans[g][k] == null&&k<=v-1){
ans[g][k]=typ;
f=1;
break;
}
 
 
k++;
r--;
}
 
}
if(f==1)
break;
}
}
else {//number of columns are odd
 
for(int g=0;g<m;g++){
 
int cent = n/2;
int r=cent-1,k=cent+1;
if(ans[g][cent] == null){
ans[g][cent]=typ;
f=1;
break;
}
else{
while(r<k){
if(r<0)
break;
 
if(r>=0 && ans[g][r]==null){
ans[g][r]=typ;
f=1;
break;
}
if(ans[g][k] == null&&k<=(v-1)){
ans[g][k]=typ;
f=1;
break;
}
r--;
k++;
}
}
 
if(f==1)
break;
}
}
}
     return ans;
 }
public static void main(String args[] ) throws Exception {//main class
 
Scanner s=new Scanner(System.in);//scanner to take input
 
int t=s.nextInt();//testcases
 
for(int i=0;i<t;i++){//loop runnig for number of testcases
 
int m=s.nextInt();//seating area rows
int n=s.nextInt();//person in each row
 
int a=s.nextInt();//no. of audience
 
type typ[]=new type[a+5];//array of type class to contain all people 
type ans[][]=new type[m][n];
 
for(int j=0;j<a;j++){
String st=s.next();//st=category
 
//scan all attributes of different types of people 
 
if(st.equals("breaker")){
String bench=s.next();
typ[j]=new breaker("breaker",bench,s.next(),s.nextInt(),s.nextInt());
 arrangeseat(ans,typ[j]);
}
if(st.equals("VIP")){
String bench=s.next();
String name=s.next();
int e=s.nextInt();
int dd[]=new int[e+10], mm[]=new int[e+10],yy[]=new int[e+10];
String event[]=new String[e+10],venue[] = new String[e+10];
 
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
 
 
arrangeseat(ans,typ[j]);
}
if(st.equals("commoner")){
typ[j]=new commoners("commoner",s.next(),s.next());
arrangeseat(ans,typ[j]);
}
 
if(st.equals("event")){
typ[j]=new eventpromo("event",s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.next(),s.next());
 arrangeseat(ans,typ[j]);
 
}
if(st.equals("brand")){
String bench=s.next();
typ[j]=new brandpromo("brand",bench,s.next(),s.next(),s.next());
 arrangeseat(ans,typ[j]);
}
}
int r=s.nextInt();// number of receptionists
for(int l=0;l<r;l++){
String fi=s.next();//type of receptionists
String nm=s.next();//name of receptionists
}
int log=s.nextInt();//log determining if to print log or no
 
 
for(int gg=0;gg<m;gg++){
for(int ff=0;ff<n;ff++){
ans[gg][ff].print();
}
}
 
}
}
 
}
