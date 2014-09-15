/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api;

/**
 * Top to bottom order of the life cycle.
 */
public enum GameState {
    
    /**
     * The state where the Game is still loading and constructing the world. 
     */
    CONSTRUCTION,
    
    /**
     * The state where the Game has completed loading world data. 
     */ 
    LOAD_COMPLETE,
    
    /**
     * The state where the Game is waiting for the initialization process to begin. 
     */
    PRE_INITIALIZATION,
    
    /**
     * The state where the Game is initializing the World, Entitys,
     * Game Play Mechanics and Plugins. 
     */
    INITIALIZATION,
    
    /**
     * The state where the Game is finished initializing but not yet started. 
     */ 
    POST_INITIALIZATION,
    
    /**
     * The state where the Game is waiting for anything still needed in order
     * to start. 
     */ 
    SERVER_ABOUT_TO_START,
    
    /**
     * The state where the Game is in the process of beginning to start. 
     */ 
    SERVER_STARTING,
    
    /**
     * The state where the Game has started and will now accept incoming connections
     */ 
    SERVER_STARTED,
    
    /**
     * The state where the Game is stopping and disconnecting Players, saving worlds 
     * and disconnecting players. 
     */ 
    SERVER_STOPPING,
    
    /**
     * The state where the Game is fully stopped where no worlds are loaded, Players and all 
     * files are saved. 
     */ 
    SERVER_STOPPED
}
