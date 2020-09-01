public abstract class Forma {
    private double medida[];
    
    public Forma(int numM){
        medida = new double[numM];
    }
    
    public double getMedida(int i){
        if((i > 0) || (i < medida.length)){
            return medida[i];
        }else{
            return -1;
        }
    }
    
    protected void setMedida(int i, double m){
        if((i > 0) || (i < medida.length) || (m < 0)){
            medida[i] = m;
        }
    }
    
    public int getNumMedidas(){
        return medida.length;
    }
    
    public abstract double cm2();
}
