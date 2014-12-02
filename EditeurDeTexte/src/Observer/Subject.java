package Observer;

import java.util.Collection;

/**
 * Created by Alex on 28/10/2014.
 */
public interface Subject {

    /**
     * Notifie tous les <i>Observers</i> enregistrés.
     */
    void notifyObservers();

    /**
     * Inscrit un nouvel <i>Observer</i>.
     *
     * @param o l'ibserver à enregistrer
     *
     */
    void registerObserver(Observer o);

    /**
     * Désinscrit un <i>Observer</i> précédemment inscrit.
     *
     * @param o  l'observer à désinscrire ; si o n'est pas dans observers,
     *            cette méthode ne fait rien.
     *
     */
    void unregisterObserver(Observer o);


}
