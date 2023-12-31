package ait.tr.menus;

import ait.tr.models.Food;
import ait.tr.models.Order;
import ait.tr.repositories.FoodRepositoryBurger;
import ait.tr.repositories.FoodRepositoryDessert;
import ait.tr.repositories.FoodRepositoryDrink;

import java.util.List;

public class MenuView {

    private FoodRepositoryBurger foodRepositoryBurger;
    private FoodRepositoryDrink foodRepositoryDrink;
    private FoodRepositoryDessert foodRepositoryDessert;

    public MenuView(FoodRepositoryBurger foodRepositoryBurger, FoodRepositoryDrink foodRepositoryDrink, FoodRepositoryDessert foodRepositoryDessert) {

        this.foodRepositoryBurger = foodRepositoryBurger;
        this.foodRepositoryDessert = foodRepositoryDessert;
        this.foodRepositoryDrink = foodRepositoryDrink;
    }

    public void printMenuDrink() {
        List<Food> list = foodRepositoryDrink.findAll();
        System.out.println("---- Drinks menu ----");
        for (Food food : list) {
            System.out.println(list.indexOf(food) + 1 + ". " +
                    food.getTitle() + " " + food.getPrice());
        }
    }

    public void printMenuDessert() {
        List<Food> list = foodRepositoryDessert.findAll();
        System.out.println("---- Desserts menu ----");
        for (Food food : list) {
            System.out.println(list.indexOf(food) + 1 + ". " +
                    food.getTitle() + " " + food.getPrice());
        }
    }

    public void printMenuBurger() {
        List<Food> list = foodRepositoryBurger.findAll();
        System.out.println("----Burgers menu ----");
        for (Food food : list) {
            System.out.println(list.indexOf(food) + 1 + ". " +
                    food.getTitle() + " " + food.getPrice());
        }
    }

    public void finalMessage(Order order) {
        System.out.println("Thank you, your order has been paid successfully. " + System.lineSeparator() +
                "Your order number: " + order.getNumber());
    }

    public void printOrder(Order order){
        System.out.println("_________________");
        System.out.println("Your order number: " + order.getNumber());
        List<Food> list = order.getOrderList();
        for (Food food: list
        ) {
            System.out.println(food.getTitle() + " " + food.getPrice());
        }
        System.out.println("_________________");
    }

    //TODO
    public void printAllOrders(){}

}