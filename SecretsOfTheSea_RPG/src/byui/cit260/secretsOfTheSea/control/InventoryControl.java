/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.Cargo;
import byui.cit260.secretsOfTheSea.model.Items;
import byui.cit260.secretsOfTheSea.model.Storage;
import java.util.ArrayList;

/**
 *
 * @author Nathan
 */
public class InventoryControl {
    
    ArrayList<Items> cargo = null;
    ArrayList<Items> storage = null;
    
    public InventoryControl(ShipSelectionControl playerShip){
        //Cargo and Storage constructors setup the baseline.  Not the adjusted values
        //based on ship.  For now diff cargo size, perhaps adjustments to startup
        //cargo and storage supplies as well.
        startupInventory();
        
        
        //shipAdjustments(playerShip); Use if diff startup inventory per ship 

    }
    
    public void startupInventory(){
        cargo = new ArrayList<>();
        cargo.add(new Items('F', "Food", 25));
        cargo.add(new Items('W', "Water", 25));
        cargo.add(new Items('U', "Fuel", 25));
        cargo.add(new Items('M', "Munitions", 5));
        cargo.add(new Items('C', "Coin", 200));
        cargo.add(new Items('A', "Artifacts", 1));
        cargo.add(new Items('G', "Gems", 1));
            
        storage = new ArrayList<>();
        storage.add(new Items('F', "Food", 25));
        storage.add(new Items('W', "Water", 25));
        storage.add(new Items('U', "Fuel", 25));
        storage.add(new Items('M', "Munitions", 5));
        storage.add(new Items('C', "Coin", 100));
        storage.add(new Items('A', "Artifacts", 1));
        storage.add(new Items('G', "Gems", 1));
    }
    
//    public void shipAdjustments(ShipSelectionControl playerShip){
//        int ship = playerShip.getShipChoice();            
//    }
    
    public String cargoToString(){
        String cargoString = "";
            for (Items item: cargo)
                cargoString += item.toString();
        return cargoString;
    }
    
    public String storageToString(){
        String storageString = "";
            for (Items item: storage)
                storageString += item.toString();
        return storageString;
    }
}
