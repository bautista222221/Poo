package Contrasenas;

import java.util.Random;
import java.util.Scanner;
public class Password {
    private String password;
    private final int longitud;
    private boolean segura;
    public Password(int longitud){
        this.longitud=longitud;
        generarPassword();
    }
    public Password(){
        this(8);
        generarPassword();
    }
    private void generarPassword(){
        String aleatorio="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder constructor=new StringBuilder();
        Random random=new Random();
        while (constructor.length()<longitud){
            char rand=aleatorio.charAt(random.nextInt(aleatorio.length()));
            constructor.append(rand);
        }
        password=constructor.toString();
        esSegura();
    }
    private void esSegura(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        this.segura= (mayusculas >= 2) && (minusculas >= 1) && (numeros >= 1);
    }
    public String getPassword(){
        return password;
    }
    public int getLongitud(){
        return longitud;
    }
    public boolean getSegura(){
        return segura;
    }
    public void regenerarPassword(){
        generarPassword();
    }
    public boolean regenerar() {
        Scanner sc = new Scanner(System.in);
        int reintentar;
        do {
            if (segura) {
                System.out.println("La contraseña: " + password + " es segura");
                return true;
            } else {
                System.out.println("La contraseña: " + password + " NO es segura");
                System.out.println("Quiere generar una nueva? (1-Si 2-No)");
                reintentar = sc.nextInt();
                if (reintentar == 1) {
                    generarPassword();
                }
            }
        } while (reintentar == 1);
        return false;
    }
}