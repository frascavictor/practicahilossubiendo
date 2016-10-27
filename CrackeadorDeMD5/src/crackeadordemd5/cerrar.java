/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackeadordemd5;


public class cerrar {
    int todo;
    int cont;
    
    public cerrar(int a,int con){
    cont=con;
    todo=a;
    }
    public int main(){
    cont++;
    if(todo<=cont)
        return 1;
    return 0;
    }
    
    
    
}
