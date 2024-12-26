package com.arindam.androidmemorygame.models

/**
 * Enum class representing the different board sizes for the memory game.
 *
 * @property numCards The total number of cards on the board.
 */
enum class BoardSize(val numCards: Int) {
    EASY(8),
    MEDIUM(18),
    HARD(24);

    /**
     * Returns the width of the board based on the board size.
     *
     * @return The width of the board.
     */
    fun getWidth(): Int {
        return when (this) {
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
        }
    }

    /**
     * Returns the height of the board based on the board size.
     *
     * @return The height of the board.
     */
    fun getHeight(): Int {
        return numCards / getWidth()
    }

    /**
     * Returns the number of pairs of cards on the board.
     *
     * @return The number of pairs of cards.
     */
    fun getNumPairs(): Int {
        return numCards / 2
    }
}