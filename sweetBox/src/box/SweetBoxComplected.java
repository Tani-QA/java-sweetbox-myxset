package box;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class SweetBoxComplected implements SweetBox{
    private ArrayList<Sweets> sweets = new ArrayList<>();

    //добавление сладости в коробку
    @Override
    public void addSweet(Sweets sweet) {
        sweets.add(sweet);
        System.out.println("Sweet '" +sweet.name+"' is added in the sweet-box");
    }

    //получение информации о сладостях в коробке
    @Override
    public void getInfoSweetBox() {
        System.out.println("\nСurrent information about sweets in the sweet-box:");
        for (Sweets sweet : sweets) {
            System.out.println("Name: " + sweet.getName() + ", Weight: " + sweet.getWeight() + ", Price: " + sweet.getPrice() + ", Unique Parameter: " + sweet.getUniceParametr());
        }
    }

    //получение информации об общем весе сладостей в коробке
    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweets sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    //получение информации об общей стоимости сладостей в коробке
    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Sweets sweet : sweets) {
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    //удаление последней сладости из коробки
    @Override
    public void removeSweetLast() {
        sweets.remove(sweets.size() - 1);
        System.out.println("Sweet last is deleted");
    }


    //удаление сладости по индексу из коробки
    @Override
    public void removeSweet() {
        Random random = new Random();
        int randomIndex = random.nextInt(sweets.size());
        sweets.remove(randomIndex);
        System.out.println("Sweet with index "+randomIndex+" is deleted");
    }


    //оптимизация коробки по весу с удалением сладостей по меньшей цене
    @Override
    public void optimizeWeightBoxByPrice(double minWeight) {
        while (getTotalWeight() >= minWeight) {
            sweets.sort(Comparator.comparing(Sweets::getPrice));
            sweets.remove(0);
        }
    }

    //оптимизация коробки по весу с удалением сладостей по меньшему весу
    @Override
    public void optimizeWeightBoxByWeight(double minWeight) {
        while (getTotalWeight() >= minWeight) {
            sweets.sort(Comparator.comparing(Sweets::getWeight));
            sweets.remove(0);
        }
    }

    }
