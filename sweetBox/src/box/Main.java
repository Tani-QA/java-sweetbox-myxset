package box;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        SweetBoxComplected sweetBoxComplected = new SweetBoxComplected();

        sweetBoxComplected.addSweet(new СhocolateСandies("Red poppy", 12.0,16.0, UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new Lollipops("Greed apple", 5.0,4.0,UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new СhocolateСandies("Bear clubfoot", 1.0,10.0,UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new Cracker("Cracker with sesame", 3.0,5.0,UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new Cracker("Cracker with cheese", 6.0,5.5,UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new Lollipops("Orange", 5.0,3.5,UUID.randomUUID().toString()));
        sweetBoxComplected.addSweet(new Lollipops("Lemon", 1.0,4.5,UUID.randomUUID().toString()));

        sweetBoxComplected.getInfoSweetBox();
        System.out.println("\nTotal weight of the sweet-box: " + sweetBoxComplected.getTotalWeight());
        System.out.println("Total price of the sweet-box: " + sweetBoxComplected.getTotalPrice()+"\n");

        System.out.println("\nRemove sweet from sweet-box by last index: ");
        sweetBoxComplected.removeSweetLast();
        sweetBoxComplected.getInfoSweetBox();
        System.out.println("\nTotal weight of the sweet-box: " + sweetBoxComplected.getTotalWeight());
        System.out.println("Total price of the sweet-box: " + sweetBoxComplected.getTotalPrice()+"\n");

        System.out.println("\nRemove sweet from sweet-box by random index: ");
        sweetBoxComplected.removeSweet();
        sweetBoxComplected.getInfoSweetBox();
        System.out.println("\nTotal weight of the sweet-box: " + sweetBoxComplected.getTotalWeight());
        System.out.println("Total price of the sweet-box: " + sweetBoxComplected.getTotalPrice()+"\n");

        System.out.println("\nOptimization sweet-box by the total weight by removing sweets with a lower price: ");
        sweetBoxComplected.optimizeWeightBoxByPrice(22.0);
        sweetBoxComplected.getInfoSweetBox();
        System.out.println("\nTotal weight of the sweet-box: " + sweetBoxComplected.getTotalWeight());
        System.out.println("Total price of the sweet-box: " + sweetBoxComplected.getTotalPrice()+"\n");

        System.out.println("\nOptimization sweet-box by the total weight by removing sweets with less weight: ");
        sweetBoxComplected.optimizeWeightBoxByWeight(19.0);
        sweetBoxComplected.getInfoSweetBox();
        System.out.println("\nTotal weight of the sweet-box: " + sweetBoxComplected.getTotalWeight());
        System.out.println("Total price of the sweet-box: " + sweetBoxComplected.getTotalPrice()+"\n");
    }


}