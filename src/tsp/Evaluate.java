/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import entities.City;
import java.util.ArrayList;

/**
 *
 * @author keyur_donga
 */
public class Evaluate {
    
    public static final int tournament_size = 4;
    public static final int top_route = 1;
    public static final int generation_count = 50;
    
    public ArrayList<City> firstRoute = null;
    
    
    public Evaluate(ArrayList<City> route){
        this.firstRoute = route;
    }

    public ArrayList<City> getFirstRoute() {
        return firstRoute;
    }

    public void setFirstRoute(ArrayList<City> firstRoute) {
        this.firstRoute = firstRoute;
    }
        
}
