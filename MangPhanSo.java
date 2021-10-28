package vn.edu.hcmus.student.sv19127640.lab02.Exercise05;

import vn.edu.hcmus.student.sv19127640.lab02.Exercise04.PhanSo;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise05
 * Created by ADMIN
 * Date 10/24/2021 - 8:17 PM
 * Description: MangPhanSo
 */
public class MangPhanSo {
    private PhanSo[] arr;

    /**
     * default constructor
     */
    public MangPhanSo(){
        this.arr = null;
    }

    /**
     * constructor with parameters
     * @param arr Fractions
     */
    public MangPhanSo(PhanSo...arr){
        this.arr = new PhanSo[arr.length];
        for (int i = 0; i < arr.length; i++){
            this.arr[i] = new PhanSo(arr[i]);
        }
    }

    /**
     * copy constructor
     * @param arrFraction MangPhanSo
     */
    public MangPhanSo(MangPhanSo arrFraction){
        this.arr = new PhanSo[arrFraction.arr.length];
        for (int i = 0; i < arrFraction.arr.length; i++){
            this.arr[i] = new PhanSo(arrFraction.arr[i]);
        }
    }

    /**
     * getter Fraction array
     * @return MangPhanSo
     */
    public PhanSo[] getArr() {
        return this.arr;
    }

    /**
     * setter Fraction array
     * @param arr PhanSo
     */
    public void setArr(PhanSo...arr) {
        this.arr = new PhanSo[arr.length];
        for (int i = 0; i < arr.length; i++){
            this.arr[i] = new PhanSo(arr[i]);
        }
    }

    /**
     * getter a Fraction at specified index in Fraction array
     * @param index integer
     * @return obj PhanSo
     */
    public PhanSo get(int index){
        PhanSo obj = null;
        if (0 <= index && index < this.arr.length){
            obj = new PhanSo(this.arr[index]);
        }
        return obj;
    }

    /**
     * setter an value at specified index of Fraction array to another value
     * @param index integer
     * @param value PhanSo
     */
    public void set(int index, PhanSo value){
        if (0 <= index && index < this.arr.length){
            this.arr[index] = new PhanSo(value);
        }
    }

    /**
     * input Fraction array method
     */
    public void input(){
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter the number of elements: ");
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("N is invalid. Please, input again!");
            }
        }while(n <= 0);
        this.arr = new PhanSo[n];
        for (int i = 0; i < n; i++){
            System.out.println("Fraction[" + i + "]:");
            this.arr[i] = new PhanSo();
            this.arr[i].input();
        }
    }

    /**
     * output Fraction array method
     */
    public void output(){
        int n = this.arr.length;
        System.out.println("Fraction array has " + n + " elements: ");
        for (int i = 0; i < this.arr.length; i++){
            this.arr[i].output();
        }
    }

    /**
     * Find sum of all Fraction in array
     * @return result PhanSo
     */
    public PhanSo sum(){
        PhanSo result = new PhanSo();
        for (int i = 0; i < this.arr.length; i++){
            result = result.plus(this.arr[i]);
        }
        result.reduce();
        return result;
    }
    /**
     * multiply all Fraction in array
     * @return result PhanSo
     */
    public PhanSo multiply(){
        PhanSo result = new PhanSo(1, 1);
        for (int i = 0; i < this.arr.length; i++){
            result = result.multiply(this.arr[i]);
        }
        result.reduce();
        return result;
    }

    /**
     * find the largest element in Fraction array
     * @return result PhanSo
     */
    public PhanSo largestElement(){
        PhanSo result = new PhanSo(this.arr[0]);
        for (int i = 1; i < this.arr.length; i++){
           if (this.arr[i].isGreater(result)){
               result = new PhanSo(this.arr[i]);
           }
        }
        return result;
    }

    /**
     * find all indexs of the largest element in Fraction array
     */
    public void indexOfLargestElements(){
        System.out.print("The largest Fraction element in array = ");
        PhanSo largestElement = new PhanSo(this.largestElement());
        largestElement.output();
        System.out.print("All index of the largest element is: ");
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i].isEqual(largestElement))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * reduce all element in Fraction array
     */
    public void reduceFractionArray(){
        for (int i = 0; i < this.arr.length; i++){
            this.arr[i].reduce();
        }
    }

    /**
     * Sort Fraction array in ascending order
     */
    public void sortAscending(){
        for (int i = 0; i < this.arr.length - 1; i++){
            for (int j = i + 1; j < this.arr.length; j++){
                if (this.arr[i].isGreater(this.arr[j])){
                    PhanSo temp = new PhanSo(this.arr[i]);
                    this.arr[i] = new PhanSo(this.arr[j]);
                    this.arr[j] = new PhanSo(temp);
                }
            }
        }
    }
    /**
     * Sort Fraction array in descending order
     */
    public void sortDescending(){
        for (int i = 0; i < this.arr.length - 1; i++){
            for (int j = i + 1; j < this.arr.length; j++){
                if (this.arr[j].isGreater(this.arr[i])){
                    PhanSo temp = new PhanSo(this.arr[i]);
                    this.arr[i] = new PhanSo(this.arr[j]);
                    this.arr[j] = new PhanSo(temp);
                }
            }
        }
    }

    /**
     * Update value of element at k index
     * @param index integer
     * @param f PhanSo
     */
    public void updateKElement(int index, PhanSo f){
        for(int i = 0; i < this.arr.length; i++){
            if (i == index){
                this.arr[i] = new PhanSo(f);
            }
        }
    }

    /**
     * add a Fraction to specified index of array
     * @param index integer
     * @param f PhanSo
     */
    public void addFraction(int index, PhanSo f){
        int n = this.arr.length;
        MangPhanSo old_arr = new MangPhanSo(this.arr);
        this.arr = new PhanSo[n + 1];
        for (int i = 0; i < n + 1; i++){
            if (i < index){
                this.arr[i] = new PhanSo(old_arr.arr[i]);
            }else if (i == index){
                this.arr[i] = new PhanSo(f);
            }else{
                this.arr[i] = new PhanSo(old_arr.arr[i - 1]);
            }
        }
    }
    /**
     * delete a Fraction to specified index of array
     * @param index integer
     */
    public void deleteFraction(int index){
        int n = this.arr.length;
        MangPhanSo old_arr = new MangPhanSo(this.arr);
        this.arr = new PhanSo[n - 1];
        for (int i = 0; i < n - 1; i++){
            if (i < index){
                this.arr[i] = new PhanSo(old_arr.arr[i]);
            }else{
                this.arr[i] = new PhanSo(old_arr.arr[i + 1]);
            }
        }
    }

    /**
     * Parse Fraction array from string with any delimiter
     * @param s String
     * @return fa MangPhanSo
     */
    public static MangPhanSo parseMangPhanSo(String s){
        MangPhanSo fa = new MangPhanSo();
        String[] arrStr = s.split("[^0-9-]");
        fa.arr = new PhanSo[arrStr.length/2];
        int index = 0;
        for (int i = 0; i < arrStr.length; i+=2){
            String temp = String.format("%s/%s", arrStr[i], arrStr[i+1]);
            fa.arr[index++] = PhanSo.parsePhanSo(temp);
        }
        return fa;
    }

    /**
     * overload method to calculate sum of 2 Fraction array
     * @param object MangPhanSo
     * @return result PhanSo
     */
    public PhanSo sum(MangPhanSo object){
        PhanSo sum_1 = this.sum();
        PhanSo sum_2 = object.sum();
        PhanSo result = sum_1.plus(sum_2);
        result.reduce();
        return result;
    }
    /**
     * overload method to calculate multiply of 2 Fraction array
     * @param object MangPhanSo
     * @return result PhanSo
     */
    public PhanSo multiply(MangPhanSo object){
        PhanSo product_1 = this.multiply();
        PhanSo product_2 = object.multiply();
        PhanSo result = product_1.multiply(product_2);
        result.reduce();
        return result;
    }
    /**
     * static input method of Fraction array
     * @param arr PhanSo
     * @return f MangPhanSo
     */
    public static MangPhanSo input(PhanSo...arr){
        MangPhanSo f = new MangPhanSo();
        f.arr = new PhanSo[arr.length];
        for (int i = 0; i < arr.length; i++){
            f.arr[i] = new PhanSo(arr[i]);
        }
        return f;
    }

    /**
     * create a random Fraction array
     * @param n integer
     * @return result MangPhanSo
     */
    public static MangPhanSo randomFractionArray(int n){
        MangPhanSo result = new MangPhanSo();
        result.arr = new PhanSo[n];
        for (int i = 0; i < result.arr.length; i++){
           result.arr[i] = PhanSo.random(-100,100);
        }
        return result;
    }

    /**
     * static method to create a sorted Fraction array to another Fraction array. if type = 1: ascending, type = 0: descending
     * @param object MangPhanSo
     * @param type integer
     * @return result MangPhanSo
     */
    public static MangPhanSo sort(MangPhanSo object, int type){
        MangPhanSo result = new MangPhanSo();
        result.arr = new PhanSo[object.arr.length];
        for (int i = 0; i < result.arr.length; i++){
            result.arr[i] = object.arr[i];
        }
        if (type == 1){
            result.sortAscending();
        }else{
            result.sortDescending();
        }
        return result;
    }
}
