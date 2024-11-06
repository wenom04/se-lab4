package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
  * Tries to fire the torpedo stores of the ship.
  *
  * @param firingMode how many torpedo bays to fire
  *     SINGLE: fires only one of the bays.
  *             - For the first time the primary store is fired.
  *             - To give some cooling time to the torpedo stores, torpedo stores are fired
  *               alternating.
  *             - But if the store next in line is empty, the ship tries to fire the other
  *               store.
  *             - If the fired store reports a failure, the ship does not try to fire the
  *               other one.
  *     ALL: tries to fire both of the torpedo stores.
  *
  * @return whether at least one torpedo was fired successfully
  */
  
class GT4500Test {

    private GT4500 ship;

    @BeforeEach
    public void init() {
        this.ship = new GT4500();
    }

    @Test
    void fireTorpedo_Single_Success() {
        // Arrange

        // Act
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fireTorpedo_All_Success() {
        // Arrange

        // Act
        boolean result = ship.fireTorpedo(FiringMode.ALL);

        // Assert
        assertEquals(true, result);
    }
}
