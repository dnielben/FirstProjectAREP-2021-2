package edu.escuelaing.arep.stat;

import java.util.List;

/**
 * A calss with statistical functions
 * @author dnielben
 */
public class Stat {
    
    
    public static Double mean(List<Double> lval){
        Double suma = 0.0;
        for(Double e: lval){
            suma = suma + e;
        }
        return suma / lval.size();
    }
    
    public static Double stddev(List<Double> lval){
        return 0.0;
    }
    
    
}
