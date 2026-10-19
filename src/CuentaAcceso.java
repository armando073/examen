public class CuentaAcceso {
    private int inum;
    private String username;
    private static int errores = 0;
    private static int cuentas = 0;
    public CuentaAcceso( int Inum, String username){
        this.username = username;
        this.inum = inum ;
        errores++;
        cuentas++;

    }

    public int getInum() {
        if (inum>0){
            return inum;
        }

    }

    public String getUsername() {
        if (username = null) {
            return null;
        } else {
            return username;

        }

    }

    public static int getErrores() {
        if (errores == 3 &&  errores >=0){
            return errores;
        } else {
            return 0;

        }

    }

    public static boolean getCuentas() {
        if ( cuentas== 3 ){

        }else{
            return false;
        }

    }
}
