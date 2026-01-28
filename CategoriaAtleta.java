package Categoria;

import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

      if (idade >= 10 && idade <= 12) {
        System.out.println("Você está no grupo Mirim.");
      }else if (idade >= 13 && idade <= 15) {
        System.out.println("Você está no grupo Infantil.");
      }else if (idade >= 16 && idade <= 18) {
        System.out.println("Você está no grupo Juvenil.");
      }else {
        System.out.println("Idade não compatível com o programa.");
      }
      
        scanner.close();
    }  
}
