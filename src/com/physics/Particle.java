package com.physics;

import processing.core.PApplet;
import com.processing.sketches.Main;

public class Particle {
    private static final PApplet p = Main.sketch;

    private Vector position;
    private int charge;

    public Particle(Vector position, int charge) {
        this.position = position;
        this.charge = charge;
    }

    public Particle() {
        this.position = new Vector();
        this.charge = 0;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public void drawSelf() {
        p.noStroke();

        if (charge > 0) {
            p.fill(0, 255, 255);
        } else {
            p.fill(180, 255, 255);
        }

        p.ellipse(position.getX(), position.getY(), charge*25, charge*25);
    }
}
