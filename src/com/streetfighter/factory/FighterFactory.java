package com.streetfighter.factory;

import com.streetfighter.fighter.ChunLi;
import com.streetfighter.fighter.Fighter;
import com.streetfighter.fighter.Ken;
import com.streetfighter.fighter.Ryu;

/**
 * Factory Method Pattern
 * -----------------------
 * Centralizes fighter creation so the rest of the game (GamePanel, Main, etc.)
 * never needs to know which concrete Fighter subclass it's instantiating —
 * it just asks the factory for a fighter by type.
 */
public class FighterFactory {

    public enum FighterType {
        RYU,
        KEN,
        CHUN_LI
    }

    public static Fighter createFighter(FighterType type) {
        switch (type) {
            case RYU:
                return new Ryu();
            case KEN:
                return new Ken();
            case CHUN_LI:
                return new ChunLi();
            default:
                throw new IllegalArgumentException("Unknown fighter type: " + type);
        }
    }
}
