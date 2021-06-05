// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        String opcao = "melancia";

        switch (opcao){
            case "ifSimples":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;
        }


    }

    public static void ifSimples(){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }
    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Areas Modo Curto");

        // Calcula de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }

}
