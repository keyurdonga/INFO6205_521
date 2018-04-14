/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import entities.City;
import entities.Routes;
import java.util.ArrayList;
import java.util.Arrays;
import population.Population;

/**
 *
 * @author keyur_donga
 */
public class TSP {

    public ArrayList<City> list = new ArrayList<City>(Arrays.asList(new City("AL",32.361538,-86.279118), new City("AK",58.301935,-134.419740), new City("AZ",33.448457,-112.073844), new City("AR",34.736009,-92.331122), new City("CA",38.555605,-121.468926), new City("CO",39.7391667,-104.984167), new City("CT",41.767,-72.677), new City("DE",39.161921,-75.526755), new City("FL",30.4518,-84.27277), new City("GA",33.76,-84.39), new City("HI",21.30895,-157.826182), new City("ID",43.613739,-116.237651), new City("IL",39.783250,-89.650373), new City("IN",39.790942,-86.147685), new City("IA",41.590939,-93.620866), new City("KS",39.04,-95.69), new City("KY",38.197274,-84.86311), new City("LA",30.45809,-91.140229), new City("ME",44.323535,-69.765261), new City("MD",38.972945,-76.501157), new City("MA",42.2352,-71.0275), new City("MI",42.7335,-84.5467), new City("MN",44.95,-93.094), new City("MS",32.320,-90.207), new City("MO",38.572954,-92.189283), new City("MT",46.595805,-112.027031), new City("NE",40.809868,-96.675345), new City("NV",39.160949,-119.753877), new City("NH",43.220093,-71.549127), new City("NJ",40.221741,-74.756138), new City("NM",35.667231,-105.964575), new City("NY",42.659829,-73.781339), new City("NC",35.771,-78.638), new City("ND",48.813343,-100.779004), new City("OH",39.962245,-83.000647), new City("OK",35.482309,-97.534994), new City("OR",44.931109,-123.029159), new City("PA",40.269789,-76.875613), new City("RI",41.82355,-71.422132), new City("SC",34.000,-81.035), new City("SD",44.367966,-100.336378), new City("TN",36.165,-86.784), new City("TX",30.266667,-97.75), new City("UT",40.7547,-111.892622), new City("VT",44.26639,-72.57194), new City("VA",37.54,-77.46), new City("WA",47.042418,-122.893077), new City("WV",38.349497,-81.633294), new City("WI",43.074722,-89.384444), new City("WY",41.145548,-104.802042)));

    public static void main(String[] args) {
        // TODO code application logic here
        TSP tsp = new TSP();
        Population pop = new Population(tsp.list);
        pop.sortRouteList();
    }
    
    public void result(Population res){
        for(Routes r : res.getRouteList()){
            System.out.println(Arrays.toString(r.getCityList().toArray()));
        }
    }
    
    
}
