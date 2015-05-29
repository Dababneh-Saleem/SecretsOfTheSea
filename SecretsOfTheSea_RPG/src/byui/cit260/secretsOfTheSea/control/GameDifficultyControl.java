/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import java.util.Random;

/**
 *
 * @author Nathan
 */
public class GameDifficultyControl {
    
    public void calcMapSize ( Map mapOne, CurrentStatus status ){
        char difficulty = mapOne.getDifficulty();
        int xMax = mapOne.getxMax();
        int yMax = mapOne.getyMax();
        if (difficulty == 'E' || difficulty == 'e'){
            mapOne.setxMax(xMax * 1);
            mapOne.setyMax(yMax * 1);
            return;
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            mapOne.setxMax(xMax * 2);
            mapOne.setyMax(yMax * 2);
            return;
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            mapOne.setxMax(xMax * 3);
            mapOne.setyMax(yMax * 3);
            return;
        }
        else{
            status.setStatusMessage("Invalid Entry. Please input an E, N, or H.");
            return;
        }
    }
  
    public void populateMap( Map myMap, LocationDetails locationOne, LocationDetails locationTwo, 
            LocationDetails locationThree, LocationDetails locationFour,
                LocationDetails locationFive, LocationDetails locationSix, 
                LocationDetails locationSeven, LocationDetails locationEight, CurrentStatus status){
        int xMax = myMap.getxMax();
        int yMax = myMap.getyMax();
        if ( (xMax != 4 && xMax != 8 && xMax != 12) || (yMax != 4 && yMax != 8 && yMax != 12) )
            status.setStatusMessage("Error Populating Map. Contact programmers");
        else {
        int tempX;
        int tempY;
        Random xRand = new Random();
        Random yRand = new Random();
        int[][] mapGrid = new int[xMax][yMax];
        //Creates an array of size xMax, each of which holds an array of size Ymax.  it may help to think of arrays as list
        //The main list is broken into xMax categories.  The categories have yMax items each
        for (int i=0; i<8; i++){
            tempX = xRand.nextInt(xMax);
            tempY = yRand.nextInt(yMax);
            if (mapGrid[tempX][tempY] == 0) {
                mapGrid[tempX][tempY] = 1;
		switch (i) {
                    case 1: {
                        locationOne.setXCoordinate(tempX);
                        locationOne.setYCoordinate(tempY);
                    }
                    case 2: {
                        locationTwo.setXCoordinate(tempX);
                        locationTwo.setYCoordinate(tempY);
                    }
                    case 3: {
                        locationThree.setXCoordinate(tempX);
                        locationThree.setYCoordinate(tempY);
                    }
                    case 4: {
                        locationFour.setXCoordinate(tempX);
                        locationFour.setYCoordinate(tempY);
                    }
                    case 5: {
                        locationFive.setXCoordinate(tempX);
                        locationFive.setYCoordinate(tempY);
                    }
                    case 6: {
                        locationSix.setXCoordinate(tempX);
                        locationSix.setYCoordinate(tempY);
                    }
                    case 7: {
                        locationSeven.setXCoordinate(tempX);
                        locationSeven.setYCoordinate(tempY);
                    }
                    case 8: {
                        locationEight.setXCoordinate(tempX);
                        locationEight.setYCoordinate(tempY);
                    }
                }
            }
            else i--;
        }
        }
    }
}
