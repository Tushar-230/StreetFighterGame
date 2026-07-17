package com.streetfighter.command;

/**
 * Command Pattern
 * ----------------
 * Wraps an action as an object. Instead of a keyboard listener calling
 * fighter.pressAttack() directly, it holds a Command object and calls
 * execute() — so which key does what can change without touching the
 * listener's logic.
 */
public interface InputCommand {
    void execute();
}
