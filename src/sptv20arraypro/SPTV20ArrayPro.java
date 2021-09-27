/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20arraypro;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class SPTV20ArrayPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Массивы");
        int[]nums;
        nums = new int [5];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//        nums[4] = 5;
        for (int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }
        System.out.print("nums = [");
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]);
            if(i<nums.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //или так
        System.out.println("nums = "+Arrays.toString(nums));
        //копирование массива
//        int[] nums2 = new int[7];
//        for (int i = 0;i<nums.length;i++){
//            nums2[i] = nums[i];
//        }    
//        System.arraycopy(nums, 0, nums2, 0, nums.length);
        int[] nums2 = Arrays.copyOf(nums, 7);
        System.out.println("nums2 = " + Arrays.toString(nums2));
        nums = nums2;
        System.out.println("nums = " + Arrays.toString(nums));
        
        System.out.println("Многомерные массивы");
        int[][] matrix = new int[5][5];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=i*j;
                
            }
            
        }
        int[] sumCols = new int [5];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
                sum += matrix[i][j];
                sumCols[j]+=matrix[i][j];
            }
            System.out.println(" | сумма строки = " + sum);
        }
        System.out.println("  -- сумма столбцов --");
        for (int i = 0; i < sumCols.length; i++) {
            System.out.printf("%4d", sumCols[i]);
        }
        System.out.println("");
        
        System.out.println("Зубчатые массивы");
        
        int[][] matrixZ = new int[5][];
        matrixZ[0] = new int[7];
        matrixZ[1] = new int[10];
        matrixZ[2] = new int[3];
        matrixZ[3] = new int[24];
        matrixZ[4] = new int[15];
        Random random = new Random();
        int min = 0, max = 9;
        for (int i = 0; i < matrixZ.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrixZ[i].length; j++) {
                matrixZ[i][j] = random.nextInt(max - min +1) + min;
                System.out.printf("%4d", matrixZ[i][j]);
                sum += matrixZ[i][j];
                
            }
            System.out.println(" | сумма строки = " + sum);
                
        }
        System.out.println("  -- сумма столбцов --");
        for (int i = 0; i < sumCols.length; i++) {
            System.out.printf("%4d", sumCols[i]);
        }
        System.out.println("");
        
        
        System.out.println("Строка");
        String str;
        str = "datsa string";
        System.out.println("str = " + str);
        System.out.println("редактирование строки = новая строка");
        str = str.replace('a', 'p');
        System.out.println("str = " + str);
    }  
    
}
