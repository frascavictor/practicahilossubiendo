package crackeadordemd5;

/**
 *
 * @author overmachine
 */
public class proceso extends Thread {

    int p;
    int ite;
    String clave[];
    String usuario[];
    cerrar cierre;
    int ban = 0;

    public proceso(int a, int b, String cl[], String usu[], cerrar cier) {

        clave = cl;
        usuario = usu;
        p = a;
        ite = b;
        cierre = cier;

    }

    public void run() {
        int compareTo = 0;

        char[] vector = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

//--------------------------------------------------------------  1
       
            for (int i = p; i < vector.length; i += ite) {
                char c = vector[i];
                String aux = "" + c;
                String auxmd5 = MD5.encriptaEnMD5(aux);
                int j = 0;

                revisar(auxmd5, compareTo, aux, "", "", "", "", "", j);
                   
               
            }
        
        //----------------------------------------------------------------------- 2
       
            for (int i = p; i < vector.length; i += ite) {
                for (int k = 0; k < vector.length; k++) {
                    char c = vector[i];
                    char cc = vector[k];
                    String aux = "" + c;
                    String aux2 = "" + cc;
                    String auxmd5 = MD5.encriptaEnMD5(aux + aux2);
                    int j = 0;

                    revisar(auxmd5, compareTo, aux, aux2, "", "", "", "", j);
                    
                }

            }
        

        //---------------------------------------------------------------------------  3
        
            for (int i = p; i < vector.length; i += ite) {
                for (int k = 0; k < vector.length; k++) {
                    for (int l = 0; l < vector.length; l++) {
                        char c = vector[i];
                        char cc = vector[k];
                        char ccc = vector[l];

                        String aux = "" + c;
                        String aux2 = "" + cc;
                        String aux3 = "" + ccc;
                        String auxmd5 = MD5.encriptaEnMD5(aux + aux2 + aux3);
                        int j = 0;

                        revisar(auxmd5, compareTo, aux, aux2, aux3, "", "", "", j);
                           
                        

                    }

                }

            
        }
        //------------------------------------------------------------------  4
        
            for (int i = p; i < vector.length; i += ite) {
                for (int k = 0; k < vector.length; k++) {
                    for (int l = 0; l < vector.length; l++) {
                        for (int m = 0; m < vector.length; m++) {
                            char c = vector[i];
                            char cc = vector[k];
                            char ccc = vector[l];
                            char c4 = vector[m];

                            String aux = "" + c;
                            String aux2 = "" + cc;
                            String aux3 = "" + ccc;
                            String aux4 = "" + c4;
                            String auxmd5 = MD5.encriptaEnMD5(aux + aux2 + aux3 + aux4);
                            int j = 0;

                           revisar(auxmd5, compareTo, aux, aux2, aux3, aux4, "", "", j);
                            
                        }

                    

                }
            }
        }
        //---------------------------------------------------------------  5
      
            for (int i = p; i < vector.length; i += ite) {
                for (int k = 0; k < vector.length; k++) {
                    for (int l = 0; l < vector.length; l++) {
                        for (int m = 0; m < vector.length; m++) {
                            for (int n = 0; n < vector.length; n++) {
                                char c = vector[i];
                                char cc = vector[k];
                                char ccc = vector[l];
                                char c4 = vector[m];
                                char c5 = vector[n];

                                String aux = "" + c;
                                String aux2 = "" + cc;
                                String aux3 = "" + ccc;
                                String aux4 = "" + c4;
                                String aux5 = "" + c5;
                                String auxmd5 = MD5.encriptaEnMD5(aux + aux2 + aux3 + aux4 + aux5);
                                int j = 0;

                                revisar(auxmd5, compareTo, aux, aux2, aux3, aux4, aux5, "", j); 
                                   
                                
                            }

                        }

                    
                }
            }
        }
        //----------------------------------------------------------------------  6
        
        for (int i = p; i < vector.length; i += ite) {
            for (int k = 0; k < vector.length; k++) {
                for (int l = 0; l < vector.length; l++) {
                    for (int m = 0; m < vector.length; m++) {
                        for (int n = 0; n < vector.length; n++) {
                            for (int o = 0; o < vector.length; o++) {

                                char c = vector[i];
                                char cc = vector[k];
                                char ccc = vector[l];
                                char c4 = vector[m];
                                char c5 = vector[n];
                                char c6 = vector[o];

                                String aux = "" + c;
                                String aux2 = "" + cc;
                                String aux3 = "" + ccc;
                                String aux4 = "" + c4;
                                String aux5 = "" + c5;
                                String aux6 = "" + c6;
                                String auxmd5 = MD5.encriptaEnMD5(aux + aux2 + aux3 + aux4 + aux5 + aux6);
                                int j = 0;
                                
                               revisar(auxmd5,compareTo,aux,aux2,aux3,aux4,aux5,aux6,j);
                              


                            }
                        }

                    

                }
            }

            if (compareTo == 0) {
                System.out.println("no fue encontrada ninguna clave ");
            }

        }
      }
         
    }

    public int revisar(String auxmd5, int compareTo, String aux, String aux2, String aux3, String aux4, String aux5, String aux6, int j) {
        int validar = 0;
        do {

            if (auxmd5 == null ? clave[j] == null : auxmd5.equals(clave[j])) {
                compareTo = 1;
                System.out.println(usuario[j] + "\t " + aux + aux2 + aux3 + aux4 + aux5 + aux6);
                validar = cierre.main();

            }

            j++;
        } while (j < 99);

        return validar;

    }

}
