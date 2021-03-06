package com.example.MenuService.Model;

import java.util.ArrayList;

public class Menu {
    private String menuId;
    private String memberId;
    private String foodName;
    private int time;
    private ArrayList ingredients;
    private ArrayList directions;
    private String category;

    public Menu(){}

    public Menu(String menuId, String memberId, String foodName, int time, ArrayList ingredients, ArrayList directions, String category) {
        this.menuId = menuId;
        this.memberId = memberId;
        this.foodName = foodName;
        this.time = time;
        this.ingredients = ingredients;
        this.directions = directions;
        this.category = category;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList getDirections() {
        return directions;
    }

    public void setDirections(ArrayList directions) {
        this.directions = directions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String type) {
        this.category = type;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMenuId() {
        menuId = "f0000001";
        return menuId;
    }

    private void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}