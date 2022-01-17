package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int compCost = 0;
        int lapCost = 0;


        for (int i = 0; i < 10; i++) {
            computers.add(new Computer(65000, Model.Dell, random.nextInt((27 - 17) + 1) + 17));
            computers.add(new Computer(70000, Model.HP, random.nextInt((27 - 17) + 1) + 17));
            computers.add(new Computer(120000, Model.Mac, random.nextInt((27 - 17) + 1) + 17));
            computers.add(new Computer(75000, Model.Lenovo, random.nextInt((27 - 17) + 1) + 17));
            computers.add(new Computer(55000, Model.Sony, random.nextInt((27 - 17) + 1) + 17));
            laptops.add(new Laptop(50000, Model.Dell));
            laptops.add(new Laptop(55000, Model.HP));
            laptops.add(new Laptop(90000, Model.Mac));
            laptops.add(new Laptop(65000, Model.Lenovo));
            laptops.add(new Laptop(55500, Model.Sony));
        }
        for (int i = 0; i < computers.size(); i++){
            compCost = compCost + computers.get(i).getCost();
        }
        for (int i = 0; i < laptops.size(); i++){
            lapCost = lapCost + laptops.get(i).getCost();
        }
        System.out.println("Компы до скидок: " + compCost + "\n" + "Ноуты до скидок: " + lapCost);

        for (int i = 0; i < computers.size(); i++) {
            computers.get(i).discount();
        }
        for (int i = 0; i <= laptops.size(); i++) {
            laptops.get(i).discount();
        }

        for (int i = 0; i < computers.size(); i++){
            compCost = compCost + computers.get(i).getCost();
        }
        for (int i = 0; i < laptops.size(); i++){
            lapCost = lapCost + laptops.get(i).getCost();
        }
        System.out.println("Компы после скидок: " + compCost + "\n" + "Ноуты после скидок: " + lapCost + "\n");

        System.out.println("Что вы хотите найти?" + "\n" + "1 - Ноутбук" + "\n" + "2 - Компьютер" + "\n");
        int search = sc.nextInt();
        if (search == 1){
            System.out.println("Введите модель ноутбука (HP, Mac, Lenovo, Sony, Dell): ");
            String search1 = sc.nextLine();
            for (int i = 0; i < laptops.size(); i++) {
                if(laptops.get(i).getModel().equals(search1)){
                    System.out.println(laptops.get(i));
                }
            }
        } else if(search == 2){
            System.out.println("Введите модель компьютера (HP, Mac, Lenovo, Sony, Dell): ");
            String search1 = sc.nextLine();
            for (int i = 0; i < computers.size(); i++){
                if(laptops.get(i).getModel().equals(search1)){
                    System.out.println(laptops.get(i));
                }
            }
        } else {
            System.out.println("Неправильное значение...");
        }
    }
}
