package org.l2csl.java.restaurant.appliance;

import org.l2csl.java.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public interface IAppliance {
    void placeCookware(ICookware cookware);
    void cook();
}
