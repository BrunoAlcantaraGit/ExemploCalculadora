public class Subtracao {
    private long valorSub1;
    private   long valorSub2;
    private long resultadoSub;

    public void subitrair (int opcao){
        if (opcao == 4){
            this.resultadoSub = this.valorSub1 / this.valorSub2;
        }

    }
    public void imprimiResultado(){
        System.out.println(valorSub1 + " - " +  valorSub2 +" = "+ resultadoSub);
    }

    public void setValorSub1(long valorSub1) {
        this.valorSub1 = valorSub1;
    }


    public void setValorSub2(long valorSub2) {
        this.valorSub2 = valorSub2;
    }
}
