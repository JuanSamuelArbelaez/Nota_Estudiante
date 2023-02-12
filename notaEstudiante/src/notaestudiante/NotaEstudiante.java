package notaestudiante;

import javax.swing.JOptionPane;

public class NotaEstudiante
{
    public static float leerFloat(String mensaje)
    {
        return (Float.parseFloat(JOptionPane.showInputDialog(mensaje)));
    }
    
    public static void imprimirMensaje(String mensaje) //Funcion que imprime un mensaje
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void imprimirMensajeDesicion(String t1, String t2, String t3, float n)
    {
        if (n>=3)
        {
            imprimirMensaje(t1); //Aprobado
        }
        else if (n<2)
        {
            imprimirMensaje(t2); //Reprobado
        }
        else
        {
            imprimirMensaje(t3); //Puede habilitar
        }
    }
    
    public static void main(String[] args)
    {
        float n;
        String m1, m2, m3;
        
        n=leerFloat("Ingrese la nota definitiva: ");
        
        m1="El estudiante aprobó";
        m2="El estudiante reprobó";
        m3="El estudainte puede habilitar";
        
        imprimirMensajeDesicion(m1, m2, m3, n);
    }   
}
