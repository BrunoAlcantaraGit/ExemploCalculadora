public class Divisao {
    private long valorDiv1;
    private   long valorDiv2;
    private long resultadoDiv;

    public void dividir (int opcao){
        if (opcao == 3){
            this.resultadoDiv = this.valorDiv1 / this.valorDiv2;
        }

    }
    public void imprimiResultado(){
        System.out.println(valorDiv1 + " / " +  valorDiv2 +" = "+ resultadoDiv);
    }


    public void setValorDiv1(long valorDiv1) {
        this.valorDiv1 = valorDiv1;
    }


    public void setValorDiv2(long valorDiv2) {
        this.valorDiv2 = valorDiv2;
    }
}
