package Observer;

/**
 * Created by Alex on 28/10/2014.
 */
public interface Observer {

    /**
     * Méthode appellée par le <i>subject</i> pour mettre à jour l'<i>observer</i>.
     */
    void maj(Subject s);

}
