import java.util.Random;
import java.util.Scanner;

public class Password {
    private String password;
    private int longitud;
    public Password(int longitud){
        this.longitud=longitud;
    }

    public Password(){
        this(8);
    }
    public void generarPassword(){
        String aleatorio="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder constructor=new StringBuilder();
        Random random=new Random();
        while (constructor.length()<longitud){
            char rand=aleatorio.charAt(random.nextInt(aleatorio.length()));
            constructor.append(rand);
        }
        password=constructor.toString();
    }

    public String getPassword(){
        return password;
    }

    public int getLongitud(){
        return longitud;
    }

    public void regenerarPassword(){
        generarPassword();
    }

    public boolean esSegura(){
        int mayusculas=0;
        int minusculas=0;
        int numeros=0;
        for (char c:password.toCharArray()) {
            if(Character.isUpperCase(c)){
                mayusculas++;
            }
            else if(Character.isLowerCase(c)){
                minusculas++;
            }
            else if(Character.isDigit(c)){
                numeros++;
            }
        }
        if((mayusculas>2)&&(minusculas>1)&&(numeros>1)){
            System.out.println("La contraseña: "+password+" es segura");
        }
        else{
            Scanner sc=new Scanner(System.in);
            int reintentar=1;
            System.out.println("La contraseña: "+password+" NO es segura");
            System.out.println("Quiere generar una nueva? (1-Si 2-No)");
            reintentar=sc.nextInt();
            if (reintentar==1){
                generarPassword();
                esSegura();
            }
            return reintentar!=2;
        }
        return true;
    }

}
