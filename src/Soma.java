public class Soma {
private long valorSom1;
private long valorSom2;
private long resultadoSoma;
    public void somar (int opcao){
        if (opcao == 1){
            this.resultadoSoma = this.valorSom1 + this.valorSom2;
        }

    }
    public void imprimiResultado(){
        System.out.println(valorSom1 + " + " +  valorSom2 +" = "+ resultadoSoma);
    }

    public void setValorSom1(long valorSom1) {
        this.valorSom1 = valorSom1;
    }

    public void setValorSom2(long valorSom2) {
        this.valorSom2 = valorSom2;
    }
}
