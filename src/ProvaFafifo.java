public class ProvaFafifo extends ProvaUniversidade{

    public ProvaFafifo(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean aprovado(){
        double media = calcularMedia();
        boolean aprovacao;

        if (media >= 6){
            aprovacao = true;
            System.out.println("********************");
            System.out.println(" Aprovado na Fafifo");
            System.out.println("********************\n\n");
        } else {
            aprovacao = false;
            System.out.println("*********************");
            System.out.println(" Reprovado na Fafifo");
            System.out.println("*********************\n\n");
        }

        return aprovacao;
    }


}
