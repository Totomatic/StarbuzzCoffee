package com.example.thoma.starbuzzcoffee;

/**
 * Created by thoma on 26/09/2016.
 */
public class Drink {

    private String name;
    private String description;
    private int imageRessourceId;

    //drinks in an array of drinks
    public static final Drink[] drinks =
            {
                    new Drink("Latte","a couple of espresso shotss with steamed milk", R.drawable.latte),
                    new Drink("Cappuccino","Espresso, hot milk and steamed milk foam", R.drawable.cappuccino),
                    new Drink("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter),
            };

    private Drink (String name,String description, int imageRessourceId)
    {
        this.name=name;
        this.description=description;
        this.imageRessourceId=imageRessourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    
}
