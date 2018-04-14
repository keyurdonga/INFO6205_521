/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolution;

import entities.City;
import entities.Routes;
import population.Population;
import static tsp.Evaluate.top_route;
import static tsp.Evaluate.tournament_size;

/**
 *
 * @author keyur_donga
 */
public class Breeding {
    
    public static final double mRatio = 0.25;
    
    public Population crossbreedPop(Population pop){
        Population cbp = new Population(pop.getRouteList().size(),this);
        for(int i=0;i<top_route;i++){
            cbp.getRouteList().set(i, pop.getRouteList().get(i));
        }
        for(int i = top_route;i<cbp.getRouteList().size();i++){
            Routes r1 = tournamentPop(pop).getRouteList().get(0);
            Routes r2 = tournamentPop(pop).getRouteList().get(0);
            cbp.getRouteList().set(i, crossbreedRoute(r1, r2));
        }
        return cbp;
    }
    
    public Population mutatePop(Population pop){
        for(Routes r:pop.getRouteList()){
            if(pop.getRouteList().indexOf(r) >= top_route){
                mutateRoute(r);
            }
        }
        return pop;
    }
    
    public Population evolveIndividual(Population pop){
        return mutatePop(crossbreedPop(pop));
    }
    
    public Population tournamentPop(Population pop){
        Population tPop = new Population(tournament_size, this);
        for(int i=0;i<tournament_size;i++){
            int rNum = (int) (pop.getRouteList().size() * Math.random());
            tPop.getRouteList().set(i, pop.getRouteList().get(rNum));
        }
        tPop.sortRouteList();
        return tPop;
    }
    
    public Routes crossbreedRoute(Routes r1, Routes r2){
        Routes cbr = null;
        int len = cbr.getCityList().size()/2;
        for(int i=0;i<len;i++){
            cbr.getCityList().set(i, r1.getCityList().get(i));
        }
        
        for(City c: r2.getCityList()){
            if(!cbr.getCityList().contains(c)){
                cbr.getCityList().add(c);
            }
        }
        return cbr;
    }
    
    public Routes mutateRoute(Routes r){
        for(City c: r.getCityList()){
            if(Math.random() < mRatio){
                int rNum = (int) (Math.random() * r.getCityList().size());
                City rCity = r.getCityList().get(rNum);
                r.getCityList().set(r.getCityList().indexOf(c), rCity);
                r.getCityList().set(rNum, c);                
            }
        }
        return r;
    }
    
    
}
