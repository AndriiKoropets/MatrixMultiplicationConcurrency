package org.koropets.process.asdf;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by user1022231 on 17.10.17.
 */
public class Matrix {

    private BigInteger[][] matrix;
    private int size;
    private int seed;

    public Matrix(int size){
        this.size = size;
        this.matrix = new BigInteger[size][size];
    }

    public Matrix(int size, int seed){
        this.size = size;
        this.seed = seed;
        generateNewMatrix();
    }

    private void generateNewMatrix(){
        matrix = new BigInteger[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = BigInteger.valueOf(random.nextInt(seed) + 1);
            }
        }
    }

    public void printMatrix(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("  " + matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public BigInteger[][] getMatrix() {
        return matrix;
    }

    public int getSize() {
        return size;
    }

    public int getSeed() {
        return seed;
    }
}
