package pl.michalsz.checkers.ui.game.mechanics;

import java.util.LinkedList;

class Move {

    private Pawn pawn;
    private LinkedList<Pair> destination;

    Move(Pawn pawn, LinkedList<Pair> destination) {
        this.pawn = new Pawn(pawn);
        this.destination = destination;
    }

    Pawn getPawn() {
        return new Pawn(pawn);
    }

    LinkedList<Pair> getDestination() {
        LinkedList<Pair> newDestination = new LinkedList<>();
        for (Pair pair : destination) {
            newDestination.add(new Pair(pair));
        }
        return newDestination;
    }
}

