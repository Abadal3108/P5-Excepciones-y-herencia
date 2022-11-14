package EX_05;

public class MiHelper {
    MiHelper() {

    }

    //validar la contraseña
    public void validarPassword(String pass, String rpass) throws CustomException {
        //mirar si son iguales
        if (!pass.equals(rpass)){
            throw new CustomException("no son iguales");
        }
        if (pass.length()<8){
            throw new CustomException("La longitud no es correcta");
        }
    }
}

