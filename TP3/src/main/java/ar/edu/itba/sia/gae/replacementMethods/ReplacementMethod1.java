package ar.edu.itba.sia.gae.replacementMethods;

import ar.edu.itba.sia.gae.Configuration;
import ar.edu.itba.sia.gae.models.GameCharacter;

import java.util.List;

public class ReplacementMethod1 extends ReplacementMethod {

    @Override
    public List<GameCharacter> replace(Configuration configuration, List<GameCharacter> population, long generation ) {
        return getChildren(configuration, population,generation, population.size());
    }
}
