package com.al.josev.lockteacher.Clases;

/**
 * Clase creada por Manuel Escorza Quinto, para la gestion de preguntas,
 * revisado por David Liqiu Hu
 *
 * @author Manu
 */
public class Pregunta {

    private String sAsignatura;
    private String sPregunta;//enunciado
    private int iRespuesta;//indica la posición de la respuesta correcta en el array de respuestas
    private String sRuta; //ruta del background
    private String[] aRespuestas;//conjunto de Strings con las 4 respuestas.

    /**
     * Constructor de la clase pregunta
     *
     * @param Asignatura: Asignatura a la que pertenece la pregunta
     * @param Pregunta: Enunciado de la pregunta
     * @param Ruta: Ruta de la imagen que aparecerá como background en la
     * pregunta
     * @param Respuesta: Posicion que ocupa la respuesta correcta en el array de
     * posibles respuestas
     * @param opciones: Array de Strings con todas las posibles respuestas
     */
    public Pregunta(String Asignatura, String Pregunta, String Ruta, int Respuesta, String[] opciones) { //constructor avanzado
        sAsignatura = Asignatura;
        sPregunta = Pregunta;
        sRuta = Ruta;
        iRespuesta = Respuesta;
        aRespuestas = new String[opciones.length];
        System.arraycopy(opciones, 0, aRespuestas, 0, aRespuestas.length);
    }

    /**
     * Constructor que inicia todo a null y iRespuesta a -1
     */
    public Pregunta() {
        sAsignatura = null;
        sPregunta = null;
        iRespuesta = -1;
        sRuta = null;
    }

    /**
     * Devuelve la respuesta posible.
     *
     * @param posOpcion int - posicion
     * @return String - Respuesta
     */
    public String getOpcion(int posOpcion) {
        return (aRespuestas[posOpcion]);
    }

    /**
     * Reemplaza la respuesta posible en la posicion indicada
     *
     * @param posOpcion int - posicion
     * @param Opcion String - opcion
     */
    public void setOpcion(int posOpcion, String Opcion) {
        aRespuestas[posOpcion] = Opcion;
    }

    /**
     * Cambia el enunciado de la pregunta
     *
     * @param Pregunta String
     */
    public void setPregunta(String Pregunta) {
        sPregunta = Pregunta;
    }

    /**
     * Devuelve el enunciado de la pregunta
     *
     * @return String - Enunciado
     */
    public String getPregunta() {
        return (sPregunta);
    }

    /**
     * Cambia la respuesta correcta segun posicion en el array.
     *
     * @param Respuesta int - Posicion en el array
     */
    public void setRespuesta(int Respuesta) {
        iRespuesta = Respuesta;
    }

    /**
     * Devuelve la respuesta correcta
     *
     * @return String - Respuesta correcta
     */
    public String getRespuesta() {
        return (aRespuestas[iRespuesta]);
    }

    /**
     * Cambia la ruta de la imagen.
     *
     * @param Ruta String - Ruta
     */
    public void setRuta(String Ruta) {
        sRuta = Ruta;
    }

    /**
     * Devuelve la ruta de imagen
     *
     * @return String - Ruta de imagen
     */
    public String getRuta() {
        return (sRuta);
    }

    /**
     * Cambia la asignatura de las preguntas
     *
     * @param Asignatura String - Nueva asignatura
     */
    public void setAsignatura(String Asignatura) {
        sAsignatura = Asignatura;
    }

    /**
     * Devuelve a que asignatura pertenece las preguntas
     *
     * @return String - Asignatura actual
     */
    public String getAsignatura() {
        return (sAsignatura);
    }
}
