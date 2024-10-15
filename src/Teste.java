public class Teste {
    public static void main(String[] args) {
        ProvaUCB provaucb = new ProvaUCB(8, 8);
        System.out.println(String.format("""
                Notas da Prova UCB
                Nota AV1: %.2f
                Nota AV2: %.2f
                Média: %.2f""", provaucb.getAV1(), provaucb.getAV2(), provaucb.calcularMedia()));

        provaucb.aprovado();

        ProvaFafifo provafafifo = new ProvaFafifo(5,5.5);
        System.out.println(String.format("""
                Notas da Prova Fafifo
                Nota AV1: %.2f
                Nota AV2: %.2f
                Média: %.2f""", provafafifo.getAV1(), provafafifo.getAV2(), provafafifo.calcularMedia()));

        provafafifo.aprovado();
    }
}
