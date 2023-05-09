package edu.cesarivan666.RetoFinal.ui;

import edu.cesarivan666.RetoFinal.process.Heroe;
import edu.cesarivan666.RetoFinal.process.Mago;
/**

 La clase Juego representa un juego entre un héroe y un mago en el que el héroe intenta rescatar hadas capturadas por el mago.
 */
public class Juego {

    Heroe heroe;
    Mago mago;

    /**

     Crea un nuevo juego con los parámetros dados.
     @param hVida La cantidad de vidas del héroe.
     @param mVida La cantidad de vidas del mago.
     @param dificulty La dificultad del juego, determina la habilidad inicial de los personajes.
     @param mLimite El límite para que el mago capture un hada.
     @param hLimite El límite para que el héroe rescate un hada.
     */
    public Juego(int hVida, int mVida, double dificulty, int mLimite, int hLimite){
        this.heroe= new Heroe(hVida, 1 - dificulty/10, cap -> cap%mLimite== 0);
        this.mago = new Mago(mVida, dificulty/10, cap -> cap%hLimite == 0);
    }
    /**

     Comienza el juego.
     */
    public void comenzar() {
        while (true) {
            mago.obtenerHabilidad();
            heroe.obtenerHabilidad();
            if (heroe.estaMuerto()) {
                Logger.log("Perdiste: El héroe murió.");
                break;
            }
            if (mago.estaMuerto()) {
                Logger.log("Ganaste: El mago murió.");
                break;
            }
            avanzar();
        }

        mostrarEstadisticas();
    }

    /**

     Muestra las estadísticas del juego.
     */
    private void mostrarEstadisticas() {
        Logger.log("Estadísticas del juego:");
        Logger.log("Hadas rescatadas: " + heroe.obtenerHadas());
        Logger.log("Hadas capturadas: " + mago.obtenerHadas());
    }
    /**

     Avanza el juego.
     */
    private void avanzar() {

        if(Math.random() < mago.obtenerHabilidad()){
            mago.ganarHadas();
            Logger.log("El mago capturó un hada; el mago tiene " + mago.obtenerVida() + " vidas. Y " + mago.obtenerHadas() + " hadas capturadas.");
        }

        if(Math.random() < heroe.obtenerHabilidad()){
            if(mago.obtenerHadas() == 0){
                Logger.log("No hay hadas capturadas, intento de rescate terminado.");
                return;
            }
            if(Math.random() > heroe.obtenerHabilidad()){
                heroe.recibirDaño();
                Logger.log("¡Un troll te golpeó mientras intentabas rescatar un hada!; tienes: " + heroe.obtenerVida() + " vidas.");
            }

            heroe.ganarHadas();
            mago.pierdeHadas(heroe.obtenerHadas());

            Logger.log("¡El héroe rescató un hada y la llevo a vivir a una casa protegida!; tienes: " + heroe.obtenerVida() + " vidas. El mago tiene: " + mago.obtenerVida() + " vidas.");
            Logger.log("El héroe ha rescatado " + heroe.obtenerHadas() + " hadas.");
        }
    }
}