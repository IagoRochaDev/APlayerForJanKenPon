package br.edu.ifnmg.aluno.iro.kakashi;

import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;

/**
 *
 * @author IagoRochaDev(GIT)
 */
public class Kakashi
        extends AbstractPlayer {

    int contadorDerrotas;
    Move myPreviousMove;

    public Kakashi() {
        this.contadorDerrotas = 0;
        myPreviousMove = Move.NONE;
    }

    @Override
    public String getDeveloperName() {
        return "Iago Rocha Oliveira";
    }

    @Override
    public Move makeMyMove(Move opponentPreviousMove) {
        if (contadorDerrotas < 0 || contadorDerrotas > 9) {
            contadorDerrotas = 0;
        }
        if (opponentPreviousMove == Move.NONE) {
            return Move.SCISSORS;
        }
        if (myPreviousMove == Move.PAPER) {
            if (opponentPreviousMove == Move.SCISSORS) {
                contadorDerrotas++;
            }
        }
        if (myPreviousMove == Move.ROCK) {
            if (opponentPreviousMove == Move.PAPER) {
                contadorDerrotas++;
            }
        }
        if (myPreviousMove == Move.SCISSORS) {
            if (opponentPreviousMove == Move.ROCK) {
                contadorDerrotas++;
            }
        }
        if (contadorDerrotas < 3) {
            return jogadaQueGanha(opponentPreviousMove);
        }
        if (contadorDerrotas < 6) {
            return jogadaQuePerde(opponentPreviousMove);
        }
        if (contadorDerrotas < 9) {
            return opponentPreviousMove;
        }
        return Move.PAPER;
    }

    public Move jogadaQueGanha(Move ultimaJogada) {
        if (ultimaJogada == Move.PAPER) {
            return Move.SCISSORS;
        }
        if (ultimaJogada == Move.ROCK) {
            return Move.PAPER;
        }
        if (ultimaJogada == Move.SCISSORS) {
            return Move.ROCK;
        }
        return Move.SCISSORS;
    }

    public Move jogadaQuePerde(Move ultimaJogada) {
        if (ultimaJogada == Move.PAPER) {
            return Move.ROCK;
        }
        if (ultimaJogada == Move.ROCK) {
            return Move.SCISSORS;
        }
        if (ultimaJogada == Move.SCISSORS) {
            return Move.PAPER;
        }
        return Move.ROCK;
    }

}
