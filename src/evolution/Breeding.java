/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolution;

import entities.Routes;
import population.Population;
import static tsp.Evaluate.top_route;

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
        
        return null;
    }
    
    public Population evolveIndividual(Population pop){
        return mutatePop(crossbreedPop(pop));
    }
    
    public Population tournamentPop(Population pop){
        return null;
    }
    
    public Routes crossbreedRoute(Routes r1, Routes r2){
        
        return null;
    }
    
    public Routes mutateRoute(Routes r){
        
        return null;
    }
    
    
}
