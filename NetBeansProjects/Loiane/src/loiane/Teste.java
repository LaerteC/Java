
package loiane;

public class Teste{
    
    public static void main(String [] args){
        
        
        usandoContantes();
    }
    
    private static void usandoContantes(){
        
        int segunda=Enumerador.SEGUNDA;
        int terca=Enumerador.TERCA;
        int quarta=Enumerador.QUARTA;
        int quinta=Enumerador.QUINTA;
        int sexta=Enumerador.SEXTA;
        int sabado=Enumerador.SABADO;
        int domingo=Enumerador.DOMINGO;
        
        System.out.println(" Teste utilizando Constantes no JAVA");
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);
        
        System.out.println(" Usando ENUM ");
        
        usandoEnum();
        
    }
    
    private static void imprimirDiaSemana(int dia){
        
        switch(dia){
            
            case 1: 
                System.out.println(" Segunda- Feira");
                break;
            case 2:
                System.out.println(" Terça -Feira");
                break;
            case 3:
                System.out.println(" Quarta -Feira");
                break;
            case 4:
                System.out.println(" Quinta - Feira");
                break;
            case 5:
                System.out.println(" Sexta - Feira");
                break;
            case 6:
                System.out.println(" Sábado");
                break;
            case 7:
                System.out.println(" Domingo");
                break;
                
        }
    }
    
    private static void usandoEnum(){
        
        DiaSemana segunda=DiaSemana.SEGUNDA;
        DiaSemana terca=DiaSemana.TERCA;
        DiaSemana quarta=DiaSemana.QUARTA;
        DiaSemana quinta =DiaSemana.QUINTA;
        DiaSemana sexta=DiaSemana.SEXTA;
        DiaSemana sabado=DiaSemana.SABADO;
        DiaSemana domingo=DiaSemana.DOMINGO;
        
        System.out.println(" Utilizando Enum em JAVA");
        
        
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);
        
        
    }
    
    private static void imprimirDiaSemana(DiaSemana dia){
        
        switch(dia){
            
            case SEGUNDA:
                System.out.println(" Segunda-Feira");
                break;
            case TERCA:
                System.out.println(" Terça-Feira");
                break;
            case QUARTA:
                System.out.println(" Quarta-Feira");
                break;
            case QUINTA:
                System.out.println(" Quinta-Feira");
                break;
            case SEXTA:
                System.out.println(" Sexta-Feira");
                break;
            case SABADO:
                System.out.println(" Sábado ");
                break;
            case DOMINGO:
                System.out.println(" Domingo");
                break;
        }
    }
}