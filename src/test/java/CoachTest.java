import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CoachTest {

    Fighter lutador;
    Coach treinador;

    @BeforeEach
    void setUp(){
        lutador = new Fighter("Anderson Silva");
        treinador = new Coach();
    }

    @Test
    void deveAtacar() {
        Training treino = new AttackFighter(lutador);
        treinador.executarTarefa(treino);

        assertEquals("O lutador está treinando combinações de ataque.", lutador.getAction());
    }

    @Test
    void deveDefender() {
        Training treino = new DefenseFighter(lutador);
        treinador.executarTarefa(treino);

        assertEquals("O lutador está treinando suas esquivas.", lutador.getAction());
    }


    @Test
    void deveCancelarAtaque() {
        Training defesa = new DefenseFighter(lutador);
        Training ataque = new AttackFighter(lutador);

        treinador.executarTarefa(defesa);
        treinador.executarTarefa(ataque);

        treinador.cancelarUltimaTarefa();

        assertEquals("O lutador está treinando suas esquivas.", lutador.getAction());
    }

    @Test
    void deveCancelarDefesa() {
        Training defesa = new DefenseFighter(lutador);
        Training ataque = new AttackFighter(lutador);

        treinador.executarTarefa(ataque);
        treinador.executarTarefa(defesa);

        treinador.cancelarUltimaTarefa();

        assertEquals("O lutador está treinando combinações de ataque.", lutador.getAction());
    }
}