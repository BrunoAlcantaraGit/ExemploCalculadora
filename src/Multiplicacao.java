public class Multiplicacao {
  private long valorM1;
  private   long valorM2;
   private long resultadoMult;
public void multiplicar (int opcao){
  if (opcao == 2){
     this.resultadoMult = this.valorM1 * this.valorM2;
    }

  }
public void imprimiResultado(){
    System.out.println(valorM1 + " * " +  valorM2 +" = "+ resultadoMult);
 }



    public void setValorM1(long valorM1) {
        this.valorM1 = valorM1;
    }



    public void setValorM2(long valorM2) {
        this.valorM2 = valorM2;
    }
}
