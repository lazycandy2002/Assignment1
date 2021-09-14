
package store;
import java.util.Scanner;

public class STORE {
    
    public static Scanner input = new Scanner(System.in);
    public static String answer,add;
    public static double  bolt,nut,washer,cabletie,electricaltape;
    public static char ch;
    public static double total4,total,total1,total6;
    public static int total2,t1,t2,t3,t4,t5,a,b,c,d,e;
    public static void menu(){
        System.out.println("=====================ITEM MENU======================");
        
        System.out.println("             ₱ 10.00 pesos per BOLT");
        System.out.println("             ₱  8.00 pesos per NUT");    
        System.out.println("             ₱  5.00 pesos per WASHER");
        System.out.println("             ₱  2.00 pesos per CABLE TIE");
        System.out.println("             ₱ 12.00 pesos per ELECTRICAL TAPE");
        System.out.println("====================================================");
    }
    public static void order(){ 
        do {
                System.out.println("Type any item"); 
            String Item =input.next();
        
        switch (Item) {
            
            case "bolt":
                     Scanner scan = new Scanner(System.in);
                     System.out.println("HOW MANY BOLT/S DO YOU WANT TO BUY?");
                      a = scan.nextInt();   
                     bolt   = a * 10 ;
                     total1 = total +(a*10);
                     t1 =t1 +a;
                     break;
            case "nut":
                     System.out.println("HOW MANY NUT/S DO YOU WANT TO BUY?");
                     b = input.nextInt();
                     nut   = b *  8 ;
                     total1 = total + (b*8);
                     t2 = t2 +b;
                     break;
            case "washer":
                     System.out.println("HOW MANY WASHER/S DO YOU WANT TO BUY?");
                      c = input.nextInt();
                     washer = c *  5 ;
                     total1 = total +(c*5);
                     t3 = t3 + c;
                     break;
            case "cabletie":
                    System.out.println("HOW MANY Cable Tie DO YOU WANT TO BUY?");
                      d = input.nextInt();
                     cabletie = d * 2;
                     total1 = total +(d*2);
                     t4 = t4 + d;
                     break;
            case "electricaltape":
                     System.out.println("HOW MANY Electrical Tape DO YOU WANT TO BUY?");
                     e = input.nextInt();  
                     electricaltape = e * 1 ;
                     total1 = total +(e*12);
                     t5 = t5 +e;
                     break;
            default : System.out.println("Item Invalid.");
                 order ();
                   break;}
             System.out.println("DO YOU WANT TO BUY ANOTHER ITEMS? Yes or NO");
             answer = input.next();
             if (answer.equalsIgnoreCase("NO")){
                 place ();}if(answer.equalsIgnoreCase("YES")){
                 menu ();
                     order();} }
        while(answer.equalsIgnoreCase("=="));}
    public static void place (){
    System.out.println("-------------------ITEM TO BUY----------------------");
    if (a>0) {
        System.out.println("          BOLT : "+t1);}
    if (b>0){
        System.out.println("           NUT : "+t2);}
    if (c>0){
        System.out.println("        WASHER : "+t3);}
    if (d>0){
        System.out.println("     CABLE TIE : "+t4);}
    if (e>0){
        System.out.println("ELECTICAL TAPE : "+t5);}
    total2 = t1 + t2 + t3 + t4 + t5 ;
    System.out.println("            ------------");
    System.out.println("   Total Items : "+ total2);
    System.out.println("DO YOU WANT MORE? YES or NO");
    add = input.next();
    if (add.equalsIgnoreCase("YES")){ 
        order ();}
    if(add.equalsIgnoreCase("NO")) {pack();}}
     
public static void pack(){
        System.out.println("-------------OKAY..ITEMS PACKED---------------------");
        double z1 = t1 * 10;
        double z2 = t2 * 8;
        double z3 = t3 * 5;
        double z4 = t4 * 2;
        double z5 = t5 * 12;
        total6 = z1 + z2 + z3 + z4 + z5;
        if (a>0) {
    System.out.println("BOLTS           : ₱ "+ z1);}
        if (b>0) {
    System.out.println("NUTS            : ₱ "+ z2);}
        if (c>0) {
    System.out.println("WASHER          : ₱ "+ z3);}
        if (d>0) {
    System.out.println("CABLETIE        : ₱ "+ z4);}
        if (e>0) {
    System.out.println("ELECTRICAL TAPE : ₱ "+ z5);}
    System.out.println("                -----------------");
    System.out.println("TOTAL           : ₱ "+total6);
    System.out.println("----------------------------------------------------");
   money ();}
         
    
    public static void money (){
    System.out.println("ENTER YOUR CASH TO PROCEED :");
    Scanner scan = new Scanner(System.in);
    double f = scan.nextInt();
    total4 = f - total6;
    if (f <=total6){
        System.out.println("Not enough payment");
    }else{
    System.out.println("I received             :   ₱ "+f);
    System.out.println("     Total             : - ₱ "+total6);
    System.out.println("                       :---------------");
    System.out.println(" IMONG SUKLI PAKI KUHA :   "+ total4);
    quit();}}
    public static void quit(){
    System.out.println("-----------THANK YOU BY CPE-1 SY 2021-2022--------------");}
    
    
    
    
    public static void main(String[] args) {
              System.out.println("        |  JARED BAWAL UTANG HARDWARE STORE   |     ");
        System.out.println("----------------------WELCOME-----------------------");
        menu ();
                System.out.println("                     GOOD DAY");
     order ();
    
} 
}