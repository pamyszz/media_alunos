package javacondicionais;
import java.util.Scanner;

public class medialunos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do 1º bimestre: ");
        float nota1 = scanner.nextFloat();
        
        System.out.print("Digite a nota do 2º bimestre: ");
        float nota2 = scanner.nextFloat();
        
        System.out.print("Digite a nota do 3º bimestre: ");
        float nota3 = scanner.nextFloat();
        
        System.out.print("Digite a nota do 4º bimestre: ");
        float nota4 = scanner.nextFloat();
        

        System.out.println("A nota do 1º bimestre é: " + nota1);
        System.out.println("A nota do 2º bimestre é: " + nota2);
        System.out.println("A nota do 3º bimestre é: " + nota3);
        System.out.println("A nota do 4º bimestre é: " + nota4);
        float mediaAnual = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média anual é: " + mediaAnual);
        
        if (mediaAnual >=6) {
        	 System.out.println("Aluno aprovado!");
        }
        
        else if (mediaAnual >=4) {
       	 System.out.println("Aluno está de recuperação!");
        }
        
        else {
        	 System.out.println("Aluno reprovado!");
        }
        	
        scanner.close();
    }
}
