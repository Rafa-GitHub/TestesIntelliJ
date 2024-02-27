import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);


        /*System.out.print("Digite sua idade: ");
        int idade = tc.nextInt();

        if(idade < 16){
            System.out.printf("Com %d anos! %nVC NAO pode votar!", idade);
        }else if( idade >= 18 && idade <= 70){
            System.out.printf("Com %d anos! %nVC eh obrigado a votar!", idade);
        }else{
            System.out.printf("Com %d anos! %nVC NAO eh obrigado a votar!", idade);
        }*/

        /*System.out.print("Digite um valor entre 1 e 3: ");
        int valor = tc.nextInt();

        switch (valor){
            case 1:
                System.out.print("UM");
                break;
            case 2:
                System.out.print("DOIS");
                break;
            case 3:
                System.out.print("TRES");
                break;
            default:
                System.out.print("Valor invalido");
        }*/

        System.out.print("Digite um valor: ");
        int controle = tc.nextInt();
        int cont = 0;

        while (cont <= controle){
            System.out.println(cont);
            cont++;
        }



        tc.close();
    }
}