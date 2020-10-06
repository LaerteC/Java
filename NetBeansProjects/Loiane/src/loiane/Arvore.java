package loiane;

public class Arvore {

    private Elemento element;

    private Arvore direita;

    private Arvore esquerda;

    public Arvore() {

        this.element = null;
        this.esquerda = null;
        this.direita = null;

    }

    public Arvore(Elemento elemento) {
        this.element = elemento;
        this.direita = null;
        this.esquerda = null;

        System.out.println(" Criei a Arvore com o Elemento " + element.getValor());

    }

    public boolean isEmpty() {

        return (this.element == null);

    }

    public void inserir(Elemento novo) {

        if (isEmpty()) {
            this.element = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValor() < this.element.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;

                    System.out.println(" Inseri o elemento " + novo.getValor() + " à esquerda :" + this.element.getValor());

                } else {

                    this.esquerda.inserir(novo);

                }
            } else if (novo.getValor() > this.element.getValor()) {
                if (this.direita == null) {
                    this.direita = novaArvore;

                    System.out.println(" Inseri o elemento " + novo.getValor() + " à Direita : " + this.element.getValor());

                } else {

                    this.direita.inserir(novo);

                }
            }
        }
    }

    public boolean buscar(int valor) {

        if (isEmpty()) {
            return false;
        }

        if (this.element.getValor() == valor) {
            return true;
        } else {
            if (valor < this.element.getValor()) {
                if (this.esquerda == null) {
                    return false;
                } else {
                    return this.esquerda.buscar(valor);

                }
            } else if (valor > this.element.getValor()) {
                if (this.direita == null) {
                    return false;
                } else {
                    return this.direita.buscar(valor);
                }
            }
            return false;
        }

    }

    public void imprimirPreOrdem() {

        if (!isEmpty()) {
            System.out.println(this.element.getValor());

            if (this.esquerda != null) {
                this.esquerda.imprimirPreOrdem();
            }
            if (this.direita != null) {
                this.direita.imprimirPreOrdem();
            }

        }
    }

    // Getters e Setters
    public void setElement(Elemento elemento) {

        this.element = elemento;

    }

    public void setDireita(Arvore direita) {

        this.direita = direita;

    }

    public void setEsquerda(Arvore esquerda) {

        this.esquerda = esquerda;

    }

    public Elemento getElement() {

        return this.element;
    }

    public Arvore getDireita() {

        return this.direita;
    }

    public Arvore getEsquerda() {

        return this.esquerda;
    }
}
