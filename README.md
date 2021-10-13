# Magnetic Vector Fields

In this project we will use the `Vector` class you made
to simulate a magnetic field.

You will place `Particle`s on the canvas and use a grid of
`Vector`s to show the lines of form between the magnetic
particles.

If you've ever seen collection of iron filings reacting to
the presence of a bar magnet, then you've seen a physical
version of what we are creating.

# Instructions

1. Start by importing your `Vector` class into the com.physics
package.
1. Take some time to look at the `Particle` class
1. Create a 2D array of `Vector` type named vectorField.
1. Initialize the array with default constucted vectors.
1. Create the `drawForceVectors` method.
    - use a nested for loop to iterate through the vectorField.
    - use the `spacing` variable to convert the `i,j` indexes
    to `x,y` coordinates. (`x = i*spacing` and `y = j*spacing`).
    - draw each vector from the origin point `(x,y)` to the tip
    of the vector `(x + vector.getX(), y + vector.getY()`.
        - you'll notice that each Vector currently has a length
        of 0.
        - normalize each vector and multiply its length by 10
        before drawing it.
1. Each of these vectors need to point in the direction of force according to the
charged particles.
    - First we need some Particles.
1. Create a Particle array
    - initialize with a positive and negative particle.
1. Complete `drawParticles` method.
    - This method should call the `drawSelf` method on every
    particle.
1. Create the `columbsLaw` method following the physics in 
the Physics section of this README.
1. Now we can complete the `calcForces` method according to 
Coloumb's law.
    - Each Vector in vectorField should be set to a new Vector
    which can be returned by the `coloumbsLaw` method.
    - `position` can be determined using the `i,j` iterators
    and the `spacing` variable.
1. Set the stroke color for the lines in the `drawForceVectors`
method to `stroke(220, force, 255)` where `force` is the 
magnitude of the vector.
    
## Extension

Complete the `addParticle` and `removeParticle` method so that
users can add positive/negative particles with left/right 
mouse buttons, and remove the last added particle with 
`BACKSPACE`.

## A Completed Project Will

Display the following magnetic force diagram when a positive
particle is placed at position `(,)` and a negative particle
is placed at position `(,)`.


## Physics

Culoumb's Law of Magnetism relates the magnetic charge of two 
particles to the Force felt between them.

In our project we may have many different Particles, so the
resulting force is the summation of all forces felt by one
particle from all others.

We can write the formula as:

### F = k * q1*q2 / (r^2)

Where `q1` and `q2` are the magnetic charges of the two particles
in question, `r` is the distance between them, and `k` is a
constant which we can ignore in our simulation, but in real life
is known as the "magnetic constant" or the permeability of free space.

For our simulation we will set:

```java
float kb = 1000000.0f;
```

Remember as well you will need to return a `Vector` whose
magnitude is equal to the force `F`.

1. First obtain the direction Vector by subtracting the position
of the first particle from the position of the second.
1. Then normalize this Vector.
1. Finally, multiply the direction vector by the force `F`.
