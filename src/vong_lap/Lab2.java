/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vong_lap;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Amin
 */
public class Lab2 {

    private String[] branchNames;
    private int[] sumOfStaff;

    public Lab2(int count) {
        this.branchNames = new String[count];
        this.sumOfStaff = new int[count];
    }

    public static void main(String[] args) {
    	int totalOfBranch = enterTotalOfBranch();
        Lab2 o = new Lab2(totalOfBranch);
        o.enter();
        o.displayInfo();
    }
    public static int enterTotalOfBranch() {
    	 Scanner reader = new Scanner(System.in);
    	 int count = 0;
         boolean check = true;
         while (check) {
             try {
                 System.out.println("Enter sum of branch : ");
                 String line = reader.nextLine();
                 Scanner sc = new Scanner(line);
                 count = sc.nextInt();
                 if (count > 0) {
                     check = false;
                 } else {
                     System.out.println("Number must greater than 0");

                 }
             } catch (InputMismatchException e) {
                 System.out.println("Wrong input ! please Enter Again!");

             } catch (NoSuchElementException e) {
             	System.out.println("Wrong input ! please Enter Again!");

 			}
         }
         return count;
    }
    public void enter() {
        for (int i = 0; i < this.branchNames.length; i++) {
            this.branchNames[i] = this.enterBranch("name of branch " + (i + 1));
            this.sumOfStaff[i] = this.enterStaff("sum of staff " + (i + 1));
        }
    }
    public String enterBranch(String messString) {
    	String nameBranch = "";
    	String regex = "^[a-zA-Z][\\w]+((\\s[\\w])+)?";
    	boolean check =false;
    	while(!check) {
    		nameBranch = enterInput(messString);
    		if(!nameBranch.matches(regex)) {
    			System.out.println("Name Brach cointain special character or has number in start!!");
    		}else {
    			check = true;
    		}
    		
    	}
    	return nameBranch;
    	
    }
    public String enterInput(String messString) {
        boolean check = false;
        String input = "";
        while (!check) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + messString + " :");
            input = sc.nextLine();
            if (!input.isEmpty()) {
                check = true;
                
            }else {
            	System.out.println("Your input Is Empty");
            }
        }
        return input;
    }

    public int enterStaff(String message) {
        boolean check = false;
        int temp = 0;
        while (!check) {
        	try {
        		temp = Integer.parseInt(this.enterInput(message));
        		if (!this.validatorStaff(temp)) {
        			System.out.println("Sum of staffs must greater than 50 and less than 1000");
        			
        		} else {
        			check = true;
        		}
				
			} catch (NumberFormatException e) {
				System.out.println("Your Input Not A Number !!");
			}
        }

        return temp;
    }

    public void displayInfo() {
        for (int i = 0; i < this.branchNames.length; i++) {
            System.out.println("-----------");
            System.out.println("Branch name : " + this.getBranchNames()[i]);
            System.out.println("Sum of staff : " + this.getSumOfStaff()[i]);
            System.out.println("Invest Fee : " + this.investFee(this.getSumOfStaff()[i]));
            System.out.println("-----------");

        }
    }

    public int investFee(int sumOfStaff) {
        int investFee = 0;
        if (sumOfStaff > 800) {
            investFee = sumOfStaff * 3800;
        } else if (sumOfStaff > 600) {
            investFee = sumOfStaff * 3000;
        } else if (sumOfStaff > 400) {
            investFee = sumOfStaff * 1500;
        } else if (sumOfStaff > 200) {
            investFee = sumOfStaff * 1000;
        } else {
            investFee = sumOfStaff * 500;
        }
        return investFee;
    }

    public boolean validatorStaff(int sumOfStaff) {
        boolean isValid = true;
        if (sumOfStaff < 50 || sumOfStaff > 1000) {
            isValid = false;
        }

        return isValid;
    }

    public String[] getBranchNames() {
        return branchNames;
    }

    public void setBranchNames(String[] branchNames) {
        this.branchNames = branchNames;
    }

    public int[] getSumOfStaff() {
        return sumOfStaff;
    }

    public void setSumOfStaff(int[] sumOfStaff) {
        this.sumOfStaff = sumOfStaff;
    }

}
