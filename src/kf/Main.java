package kf;
import calculate.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author coenv
 */
public class Main {

    public static void main(String[] args) {
        /**
         * We gaan nu de coördinaten van alle edges van de fractal van level 1 uitrekenen en in het console tonen. Doe dit door in de main methode:
         het KochFractal object te maken,
         het level op 1 in te stellen en tenslotte
         de 3 generate...Edge methodes één voor één aan te roepen.
         */
        KochFractal kochFractal = new KochFractal();
        kochFractal.setLevel(1);
        kochFractal.generateBottomEdge();
        kochFractal.generateLeftEdge();
        kochFractal.generateRightEdge();

    }
}
