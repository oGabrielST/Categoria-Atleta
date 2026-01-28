# Classificador de Categorias de Atletas

Este projeto é um programa simples em Java que identifica a categoria de um atleta com base na sua idade.

## 🚀 Funcionalidades
O sistema recebe a idade via terminal e retorna uma das seguintes classificações:
- **Mirim**: 10 a 12 anos
- **Infantil**: 13 a 15 anos
- **Juvenil**: 16 a 18 anos
- **Não compatível**: Idades fora desses intervalos

## 🛠️ Como executar
1. Tenha o Java (JDK) instalado.
2. Compile o arquivo:
   ```bash
   javac CategoriaAtleta.java
## 🧠 Lógica de Implementação
O código utiliza operadores lógicos para definir os intervalos:
- **&& (E)**: Garante que a idade esteja entre o valor mínimo e máximo.
- **scanner.close()**: Boa prática para liberar o recurso de leitura de dados após o uso.
