

package loiane;

public class TesteEnum{
    
   public static void main(String [] args){
       
       DiaWeek[] dias=DiaWeek.values();
       
       
       
       for(int i=0;i<dias.length;i++){
           
           System.out.println(dias[i]);
           
       }
       
       System.out.println(" =====================");
       
       for( DiaWeek dia: DiaWeek.values()){
           
           System.out.println(" "+dia);
           
       }
       
       DiaSemana day=Enum.valueOf(DiaSemana.class, "SABADO");
       
       System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
       
       System.out.println(day);
   }
}