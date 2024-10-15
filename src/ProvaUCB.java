public class ProvaUCB extends ProvaUniversidade{

    public ProvaUCB(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado(){
        double media = calcularMedia();
        boolean aprovacao;

        if (media >= 7){
            aprovacao = true;
            System.out.println("********************");
            System.out.println("  Aprovado na UCB");
            System.out.println("********************\n\n");

        } else {
            aprovacao = false;
            System.out.println("********************");
            System.out.println(" Reprovado na UCB");
            System.out.println("********************\n\n");
        }
        return aprovacao;
    }

}
