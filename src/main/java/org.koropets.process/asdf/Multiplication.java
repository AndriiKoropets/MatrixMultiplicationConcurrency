package org.koropets.process.asdf;

import java.math.BigInteger;

public class Multiplication {

    private static final int SIZE = 50;
    private static final int SEED = 1000;

    public static void main(String[] args) {
        Matrix matrix_1 = new Matrix(SIZE, SEED);
        Matrix matrix_2 = new Matrix(SIZE, SEED);

        System.out.println("First matrix");
        matrix_1.printMatrix();
        System.out.println();
        System.out.println("Second matrix");
        matrix_2.printMatrix();
        System.out.println();
        System.out.println("Result matrix");
        multiplicationBruteForce(matrix_1, matrix_2).printMatrix();
    }

    private static Matrix multiplicationBruteForce(Matrix matrix_1, Matrix matrix_2){
        Matrix resultMatrix = new Matrix(SIZE);
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < SIZE; i++){
            for (int k = 0; k < SIZE; k++){
                for (int j = 0; j < SIZE; j++){
                    sum = sum.add(matrix_1.getMatrix()[i][j].multiply(matrix_2.getMatrix()[j][k]));
                }
                resultMatrix.getMatrix()[i][k] = sum;
                sum = new BigInteger("0");
            }
        }

        return resultMatrix;
    }

    private static Matrix strassenAlgorithm(Matrix matrix_1, Matrix matrix_2){
        Matrix resultMatrix = new Matrix(SIZE);

        return resultMatrix;
    }
}
