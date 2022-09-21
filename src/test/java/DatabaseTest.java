import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {
    Database superheroes;

    @BeforeEach
    public void setup() {
        superheroes = new Database();
        superheroes.addSuperHero("s1", "c1", "p1", "Human", 1, 1);
        superheroes.addSuperHero("s2", "c2", "p2", "Human", 2, 2);
        superheroes.addSuperHero("s3", "c3", "p3", "Human", 3, 3);
    }

    @Test
    void addOneSuperhero() {
        //Arrange
        int expectedSize = 4;

        //Act
        superheroes.addSuperHero("s4", "c4", "p4", "true", 4, 4);

        int actualSize = superheroes.getAllSuperheroes().size();

        //Assert
        assertEquals(expectedSize, actualSize);
    }
}
