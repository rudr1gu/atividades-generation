package atividadesvetores.lista02;

import java.util.Arrays;


//Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.

public class Atividade04 {
    public static void main(String[] args) {
        System.out.println("Atividade 04 - Vetores");

        float[][] notas = {
            {4.0f, 5.0f, 7.0f, 3.0f},
            {2.5f, 6.5f, 4.7f, 8.0f},
            {10.0f, 8.5f, 9.5f, 8.0f},
            {9.0f, 6.5f, 7.6f, 8.2f},
            {5.0f,5.0f, 5.0f, 6.3f},
            {7.0f, 8.0f, 9.0f, 8.5f},
            {5.5f, 3.5f, 2.5f, 1.0f},
            {8.0f, 9.0f, 10.0f, 9.5f},
            {5.6f, 5.8f, 6.5f, 7.0f},
            {7.5f, 8.5f, 9.5f, 10.0f}
        };
        
        float soma = 0;
        float[] medias = new float[10];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
            soma = 0;
        }

        System.out.println("Médias dos participantes: ");
        System.out.println(Arrays.toString(medias));
    }
}