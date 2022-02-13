package com.company;
/*Создать класс Weapon (Оружие), с приватными полями тип оружия и название
оружия.
● Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
● Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
геттеры и сеттеры для этого поля.
● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
полям). Затем распечатать всю информацию о боссе*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Weapon weapon = new Weapon();
        weapon.setTypeOfWeapon("Sword");
        weapon.setNameOfTheWeapon("Frostmourne");
        Boss boss = new Boss();
        boss.setHealthPoints(100);
        boss.setDamage(50);
        boss.setWeapon(weapon);
        System.out.println("Type of the weapon: " + boss.getWeapon().getTypeOfWeapon());
        System.out.println("Name of the weapon: " + boss.getWeapon().getNameOfTheWeapon());
        System.out.println("Boss's Health points: "+ boss.getHealthPoints());
        System.out.println("Boss's Damage: "+ boss.getDamage());



    }
}
