package com.processing.sketches;

import com.physics.Particle;
import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet sketch;
    private final int NUM = 20;

    private float spacing;

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {
        spacing = width/NUM;
        colorMode(HSB);
    }

    public void draw() {
        background(20);

        calcForces();
        drawForceVectors();
        drawParticles();
    }

    private void calcForces() {

    }

    private Vector columbsLaw(Vector position) {

    }

    private void drawForceVectors() {

    }

    private void drawParticles() {

    }

    public void mousePressed() {
        Vector position = new Vector(mouseX, mouseY);
        int charge = 0;
        if (mouseButton == LEFT) {
            charge = 1;
        } else if (mouseButton == RIGHT) {
            charge = -1;
        }
        addParticle(new Particle(position, charge));
    }

    public void keyPressed() {
        if (keyCode == BACKSPACE) {
            removeParticle();
        }
    }

    private void addParticle(Particle p) {

    }

    private void removeParticle() {

    }

    public static void main(String... args) {
        PApplet.main("com.processing.sketches.Main");
    }
}
