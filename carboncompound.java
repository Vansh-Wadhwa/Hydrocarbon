package hydrocarbons;


import java.util.Scanner;
public class carboncompound {

    public static int c=0,h=0 ;
    public static String natureofbond;
    public static void main (String [] args){
        System.out.println();
        System.out.println("\t\t\tHYDROCARBONS  GENERATOR");
        System.out.println();
        Scanner input = new Scanner(System.in);
        
        System.out.print("\tENTER THE NUMBER OF CARBON ATOMS    : ");
        c=input.nextInt();
        System.out.print("\tENTER THE NUMBER OF HYDROGEN ATOMS  : ");
        h=input.nextInt();
        System.out.println();
System.out.println();
        if(h==(2*c+2)){
            natureofbond="ane";
            alkane();
        }
        if(h==(2*c-2)){
            
            natureofbond="yne";
            alkyne();
        }
        if(h==(2*c)){
            natureofbond="ene";
            alkene();
        }
    
System.out.println();
    
    
        System.out.println("\n\nTHE MOLECULAR MASS OF THE COMPOUND IS   : "+molecularmass());
System.out.println();

        System.out.println("\tI HOPE YOU LIKED IT :) ");
    }
    public static String compoundname(){
        
        String     wordroot[]={"meth","eth","prop","bute","pent","hex","hept","oct","non","dec","undec","dodec","tridec","tetrodec","pentadec","hexadec","heptadec","octadec","nondec","icos"};

                
        return String.format((wordroot[c-1])+natureofbond);
    }
    public static  int molecularmass(){
        return (c*12)+(h*1);
    }
    public  static void  alkane(){
        System.out.println("STRUCTURAL FORMULA OF ' "+compoundname()+" '");
        for(int i = 1;i<=c;i++){
            System.out.print("\tH");
        }
        System.out.println();    
        for(int i = 1;i<=c;i++){
            System.out.print("\t|");
            }
        System.out.println();
        System.out.print("H");
        for(int i = 1;i<=c;i++){
            System.out.print("  ---- C");
//            System.out.println();
            }
        System.out.print("  ----  H");
    
    System.out.println();    
    for(int i = 1;i<=c;i++){
        System.out.print("\t|");
        }
    System.out.println();    
    for(int i = 1;i<=c;i++){
        System.out.print("\tH");
        }
    System.out.println();

    System.out.println();
    }

    public  static void  alkyne(){
    
        System.out.println("STRUCTURAL FORMULA OF ' "+compoundname()+" '");
        if(c==2) { System.out.print("H  ---- C =_=_  C ---- H");}
        else{
            System.out.print("\t\t");
            for(int i = 1;i<=(c-2);i++){
                System.out.print("\tH");
            }
        
        System.out.println();
        System.out.print("\t\t");

        for(int i = 1;i<=(c-2);i++){
            System.out.print("\t|");
        }System.out.println();
        
        System.out.print("H  ---- C =_=_  C ---- ");
        
             for(int a=1;a<=(c-2);a++){
            System.out.print("C  ---- ");
            }
            System.out.println("H");
            System.out.print("\t\t");
            for(int i = 1;i<=(c-2);i++){
                System.out.print("\t|");
            }            
            System.out.println("");

            System.out.print("\t\t");
            for(int i = 1;i<=(c-2);i++){
                System.out.print("\tH");
            }System.out.println();
            
        }
        }
            public  static void  alkene(){
                
                System.out.println("STRUCTURAL FORMULA OF ' "+compoundname()+" '");
                
                for(int i = 1;i<=c;i++){
                    System.out.print("\tH");
                }System.out.println();
                for(int i = 1;i<=c;i++){
                    System.out.print("\t|");
                }System.out.println();
                
                    System.out.print("H  ---- C ====  C ---- ");
                    if(c==2) { System.out.println("H"); }else{ for(int a=1;a<=(c-2);a++){
                    System.out.print("C  ---- ");
                    }
                    System.out.println("H");
                    System.out.print("\t\t");
                    for(int i = 1;i<=(c-2);i++){
                        System.out.print("\t|");
                    }            
                    System.out.println("");

                    System.out.print("\t\t");
                    for(int i = 1;i<=(c-2);i++){
                        System.out.print("\tH");
                    }System.out.println();
                    
                    }
            }
    }
    

