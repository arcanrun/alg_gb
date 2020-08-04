package homeworks.hw05.task02;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private double bagWeight;
    private double price;
    private List<Item> bestSet;

    public Bag(int bagWeight) {
        this.bagWeight = bagWeight;
    }

    public double getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }
    private double calcWeightInSet(List<Item> items)
    {
        double sum = 0;
        for(Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    private double calcPriceInSet(List<Item> items)
    {
        double sum = 0;
        for(Item i: items) {
            sum += i.getPrice();
        }
        return sum;
    }
    private void checkSetIfBest(List<Item> items)
    {
        if (bestSet == null)
        {
            if (calcWeightInSet(items) <= bagWeight) {
                bestSet = items;
                price = calcPriceInSet(items);
            }
        }
        else
        {
            if(calcWeightInSet(items) <= bagWeight && calcPriceInSet(items) > price) {
                bestSet = items;
                price = calcPriceInSet(items);
            }
        }
    }
    public void findBesSet(List<Item> items)
    {
        if (items.size() > 0)
            checkSetIfBest(items);

        for (int i = 0; i < items.size(); i++)
        {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            findBesSet(newSet);
        }

    }
    public List<Item> getBestSet() {
        return bestSet;
    }
}
