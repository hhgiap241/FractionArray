package vn.edu.hcmus.student.sv19127640.lab02.Exercise05;

import vn.edu.hcmus.student.sv19127640.lab02.Exercise04.PhanSo;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise05
 * Created by ADMIN
 * Date 10/24/2021 - 8:17 PM
 * Description: main function
 */
public class Exercise05 {
    /**
     * main function
     * @param argv console parameters
     */
    public static void main(String[] argv){
        Integer chosse = null;
        do{
            System.out.println("===================================================================");
            System.out.println("0. Exit");
            System.out.println("1. Using constructor methods");
            System.out.println("2. Using get/set methods");
            System.out.println("3. Using input/output methods");
            System.out.println("4. Sum all Fraction in array");
            System.out.println("5. Product all Fraction in array");
            System.out.println("6. Find the largest Fraction in array");
            System.out.println("7. Find all index of the largest Fraction in array");
            System.out.println("8. Reduce a Fraction array");
            System.out.println("9. Sort Fraction array in ascending order");
            System.out.println("10. Sort Fraction array in descending order");
            System.out.println("11. Update Fraction at index K");
            System.out.println("12. Add new Fraction to index K");
            System.out.println("13. Delete a Fraction at index K");
            System.out.println("14. Using static method parseMangPhanSo");
            System.out.println("15. Using static methods");
            System.out.println("16. Using overload methods");
            System.out.println("===================================================================");
            System.out.print("Input your choose: ");
            Scanner scan = new Scanner(System.in);
            chosse = scan.nextInt();
            switch (chosse){
                case 0: return;
                case 1: {
                    // use default constructor
                    MangPhanSo obj_1 = new MangPhanSo();
                    // use constructor with parameters
                    System.out.println("Use constructor with parameters:");
                    MangPhanSo obj_2 = new MangPhanSo(new PhanSo(2, 3),
                            new PhanSo(4, 5),
                            new PhanSo(5,9));
                    System.out.println("First Fraction array:");
                    obj_2.output();
                    PhanSo[] arr_1 = new PhanSo[3];
                    arr_1[0] = new PhanSo(1, 2);
                    arr_1[1] = new PhanSo(3, 4);
                    arr_1[2] = new PhanSo(4, 5);
                    MangPhanSo obj_3 = new MangPhanSo(arr_1);
                    System.out.println("Second Fraction array:");
                    obj_3.output();
                    // use copy constructor
                    System.out.println("Use copy constructor:");
                    MangPhanSo obj_4 = new MangPhanSo(obj_3);
                    obj_4.output();
                    break;
                }
                case 2: {
                    // use setter and getter methods
                    MangPhanSo obj_5 = new MangPhanSo(new PhanSo(1,2),
                            new PhanSo(3,4),
                            new PhanSo(5,6));
                    System.out.println("Fraction array:");
                    obj_5.output();
                    System.out.println("Using getter:");
                    PhanSo[] arr_2 = obj_5.getArr();
                    int index = 1;
                    PhanSo f_obj = obj_5.get(index);
                    System.out.println("Fraction at index = 1 of array is ");
                    f_obj.output();
                    System.out.println("Using setter:");
                    PhanSo[] arr_3 = new PhanSo[2];
                    arr_3[0] = new PhanSo(2,3);
                    arr_3[1] = new PhanSo(4,5);
                    obj_5.setArr(arr_3);
                    System.out.println("Fraction array before using setter: ");
                    obj_5.output();
                    index = 0;
                    System.out.println("Fraction array after using setter index 0 to another Fraction: ");
                    obj_5.set(index, new PhanSo(12,5));
                    obj_5.output();
                    break;
                }
                case 3:{
                    // use input and output method
                    MangPhanSo obj_1 = new MangPhanSo();
                    System.out.println("Using input and output method: ");
                    obj_1.input();
                    obj_1.output();
                    break;
                }
                case 4:{
                    // use find the sum of all element in Fraction array
                    MangPhanSo obj_1 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Fraction array:" );
                    obj_1.output();
                    System.out.print("Sum of all element in Fraction array = ");
                    PhanSo result = obj_1.sum();
                    result.output();
                    break;
                }
                case 5:{
                    MangPhanSo obj_1 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Fraction array:" );
                    obj_1.output();
                    // use find the product of all element in Fraction array
                    System.out.print("Product of all element in Fraction array = ");
                    PhanSo result = obj_1.multiply();
                    result.output();
                    break;
                }
                case 6: {
                    MangPhanSo obj_1 = MangPhanSo.randomFractionArray(8);
                    System.out.println("Fraction array:" );
                    obj_1.output();
                    // use find the largest Fraction in array
                    System.out.print("The largest Fraction element in array = ");
                    PhanSo result = obj_1.largestElement();
                    result.output();
                    break;
                }
                case 7: {
                    // use find index of all largest element in Fraction array
                    System.out.println("Using find index of all largest element in Fraction array: ");
                    MangPhanSo obj_6 = new MangPhanSo(new PhanSo(1,2),
                            new PhanSo(5,6),
                            new PhanSo(25,30),
                            new PhanSo(125,150),
                            new PhanSo(-5,6),
                            new PhanSo(1,-2),
                            new PhanSo(114,212));
                    obj_6.output();
                    obj_6.indexOfLargestElements();
                    break;
                }
                case 8: {
                    // use reduce Fraction array
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Before reduce: ");
                    obj_6.output();
                    System.out.println("After reduce: ");
                    obj_6.reduceFractionArray();
                    obj_6.output();
                    break;
                }
                case 9:{
                    // use sort Fraction array
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(8);
                    System.out.println("Before sort Fraction array in ascending order: ");
                    obj_6.output();
                    System.out.println("After sort Fraction array in ascending order: ");
                    obj_6.sortAscending();
                    obj_6.output();
                    break;
                }
                case 10:{
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(8);
                    System.out.println("Before sort Fraction array in descending order: ");
                    obj_6.output();
                    System.out.println("After sort Fraction array in descending order: ");
                    obj_6.sortDescending();
                    obj_6.output();
                    break;
                }
                case 11:{
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Fraction array: ");
                    obj_6.output();
                    // use update value of element at k index
                    System.out.printf("Input the index to update: ");
                    int index = scan.nextInt();
                    System.out.println("Input the new Fraction value:");
                    PhanSo f = new PhanSo();
                    f.input();
                    System.out.println("After update element at index " + index + ":");
                    obj_6.updateKElement(index, f);
                    obj_6.output();
                    break;
                }
                case 12:{
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Fraction array: ");
                    obj_6.output();
                    // use add new element at k index
                    System.out.printf("Input the index to add new Fraction to array: ");
                    int index = scan.nextInt();
                    System.out.println("Input the new Fraction value:");
                    PhanSo f = new PhanSo();
                    f.input();
                    System.out.println("After add new element at index " + index +":");
                    obj_6.addFraction(index, f);
                    obj_6.output();
                    break;
                }
                case 13:{
                    MangPhanSo obj_6 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Fraction array: ");
                    obj_6.output();
                    // use delete a element at k index
                    System.out.printf("Input the index delete: ");
                    int index = scan.nextInt();
                    System.out.println("After delete element at index " + index +":");
                    obj_6.deleteFraction(index);
                    obj_6.output();
                    break;
                }
                case 14:{
                    System.out.println("Fraction array after parse from string: ");
                    MangPhanSo obj_7 = MangPhanSo.parseMangPhanSo("10&20&-100^50*567%-665%43#23");
                    obj_7.output();
                    break;
                }
                case 15:{
                    // use static methods
                    System.out.println("Using static method to create a new Fraction array:");
                    MangPhanSo obj_1 = MangPhanSo.input(new PhanSo(2,3),
                            new PhanSo(4,5),
                            new PhanSo(6,7));
                    System.out.println("Fraction array:");
                    obj_1.output();
                    System.out.println("Using static method to create Random Fraction array:");
                    MangPhanSo obj_2 = MangPhanSo.randomFractionArray(10);
                    System.out.println("Fraction array:");
                    obj_2.output();
                    System.out.println("Using static method to create sorted Fraction array in ascending order:");
                    MangPhanSo obj_3 = MangPhanSo.sort(obj_2, 1);
                    System.out.println("Fraction array:");
                    obj_3.output();
                    System.out.println("Using static method to create sorted Fraction array in descending order:");
                    MangPhanSo obj_4 = MangPhanSo.sort(obj_2, 0);
                    System.out.println("Fraction array:");
                    obj_4.output();
                    break;
                }
                case 16:{
                    // use overload method
                    MangPhanSo obj_7 = MangPhanSo.randomFractionArray(5);
                    System.out.println("First Fraction array:");
                    obj_7.output();
                    MangPhanSo obj_8 = MangPhanSo.randomFractionArray(5);
                    System.out.println("Second Fraction array:");
                    obj_8.output();
                    System.out.println("Using overload method on obj_7 and obj_8: ");
                    System.out.print("Sum of obj_7 and obj_8: ");
                    PhanSo result = obj_7.sum(obj_8);
                    result.output();
                    System.out.print("Product of obj_7 and obj_8: ");
                    result = obj_7.multiply(obj_8);
                    result.output();
                    break;
                }
                default: return;
            }
            System.out.print("Press enter to continue...");
            try{System.in.read();}
            catch(Exception e){}
        }while(0 < chosse && chosse <= 16);
    }
}
