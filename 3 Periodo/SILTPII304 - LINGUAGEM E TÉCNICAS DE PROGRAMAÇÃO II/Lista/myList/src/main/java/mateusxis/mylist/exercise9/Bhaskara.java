package mateusxis.mylist.exercise9;

import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author mateusxis
 */
public class Bhaskara {
    private Term termA;
    private Term termB;
    private Term termC;
    private ArrayList<Double> roots;

    public Bhaskara(double a, double b, double c) {
        termA = new Term(a);
        termB = new Term(b);
        termC = new Term(c);
        roots = new ArrayList<Double>();
    }

    public ArrayList<Double> getRoots() {
        return this.roots;
    }

    public void addRoots(double root) {
        this.roots.add(root);
    }

    private double calculateDelta() {
        double _termA = termA.getTerm();
        double _termB = termB.getTerm();
        double _termC = termC.getTerm();

        double delta = (_termB * _termB) - (4 * _termA * _termC);

        return delta;
    }

    public ArrayList<Double> calculateRoots() {
        double _termA = termA.getTerm();
        double _termB = termB.getTerm();
        double delta = this.calculateDelta();
        if (delta >= 0) {
            double root1 = (- _termB + Math.sqrt(delta)) / (2 * _termA);
            double root2 = (- _termB - Math.sqrt(delta)) / (2 * _termA);

            this.addRoots(root1);
            this.addRoots(root2);
        } else {
            System.out.println("Delta is negative");
        }

        ArrayList<Double> _roots = this.getRoots();
        return _roots;
    }
}
