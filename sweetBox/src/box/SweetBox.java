package box;

public interface SweetBox {
    void addSweet(Sweets sweet); //добавление сладости
    void getInfoSweetBox(); //вывести информацию о коробке сладости
    double getTotalWeight(); //получить общий вес
    double getTotalPrice(); //получить общую цену
    void removeSweet(); //удаление сладости по индексу
    void removeSweetLast(); //удаление сладости последней
    void optimizeWeightBoxByPrice(double minWeight); //оптимизация коробки по весу с удалением сладостей по меньшей цене
    void optimizeWeightBoxByWeight(double minWeight); //оптимизация коробки по весу с удалением сладостей по меньшему весу
}

