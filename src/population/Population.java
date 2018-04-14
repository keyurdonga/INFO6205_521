/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package population;

import entities.City;
import entities.Routes;
import evolution.Breeding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author keyur_donga
 */
public class Population {
    
    public static final int pop_size = 10;    
    private ArrayList<Routes> routeList = new ArrayList<>(pop_size);
    
    public Population(ArrayList<City> cl){
        for(int i=0 ;i<pop_size;i++){
            routeList.add(new Routes(cl));
        }
        System.out.println(routeList.toString());
    }

    public Population(int size, Breeding br) {
        
    }

    public ArrayList<Routes> getRouteList() {
        return routeList;
    }

    public void setRouteList(ArrayList<Routes> routeList) {
        this.routeList = routeList;
    }
    
    public void sortRouteList(){
        Collections.sort(routeList, (r1,r2) -> r1.getFitnessScore().compareTo(r2.getFitnessScore()));
    }
}
