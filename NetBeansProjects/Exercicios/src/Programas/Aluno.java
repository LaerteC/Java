/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author laerte
 */
public class Aluno {
    
   private String nome;
   private String matricula;
   private String nomeCurso;
   private String [] nomeDisciplina;
   private double [][]notaDisciplina;
   
   public Aluno(){
       nomeDisciplina=new String[3];
       notaDisciplina=new double[3][4];
   }
   
   public Aluno(String nome,String matricula,String nomeCurso,String nomeDisciplina[],double notaDisciplina[][]){
       this.nome=nome;
       this.matricula=matricula;
       this.nomeCurso=nomeCurso;
       this.nomeDisciplina=nomeDisciplina;
       this.notaDisciplina=notaDisciplina;
   }
   
   public String getNome(){
       
       return this.nome;
   }
   public void setNome(String nome){
       this.nome=nome;
   }
   public String getMatricula(){
       return this.matricula;
   } 
   public void setMatricula(String matricula){
       this.matricula=matricula;
   }
   public String getNomeCurso(){
       return this.nomeCurso;
   }
   public void setNomeCurso(String nomeCurso){
       this.nomeCurso=nomeCurso;
   }
   public String getNomeDisciplina(){
       return this.nomeDisciplina[3];
   }
   public void setNomeDisciplina(String nomeDisciplina[]){
       this.nomeDisciplina=nomeDisciplina;
   }
   
   public double getNotaDisciplina(){
       return this.notaDisciplina[3][4];
   }
   public void setNotaDisciplina(double notaDisciplina[][]){
       this.notaDisciplina=notaDisciplina;
   }
  
   
   public void mostraInfo(){
       
       System.out.println(" Nome :" +nome);
       System.out.println(" Matricula :"+ matricula);
       System.out.println(" Nome do Curso : " +nomeCurso);
       
       for(int i=0;i<notaDisciplina.length;i++){
           System.out.println(" Notas das disciplinas : "+nomeDisciplina[i]);
           for(int j=0;j<notaDisciplina[i].length;j++){
               System.out.println( notaDisciplina[i][j]+" ");
           }
           System.out.println();
       }
   }
   
   public boolean verificarAprovado(int indice){
       
       if(obterMedia(indice)>=7){
           return true;
       }
       
       return false;
   }
   
   private double obterMedia(int indice){
       double soma=0;
       
       for(int i=0;i<notaDisciplina[indice].length;i++){
        soma+=notaDisciplina[indice][i];
        
   }
       double media=soma/4;
       
       return media;
       
   }
   
   public void setNomeDisciplinaPos(int pos,String nomeDisciplina){
       this.nomeDisciplina[pos]=nomeDisciplina;
   }
   
   public void setNotaDisciplina(int posI,int posJ,double notaDisciplina){
       this.notaDisciplina[posI][posJ]=notaDisciplina;
   }
    
}
