/*Copyright 2021 Javier Martínez
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/
package dominio;
import java.util.ArrayList;

public class Municipio{
    private String nombre;
    private ArrayList<Localidad> localidades = new ArrayList<>();

//getters y setters correspondientes
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addLocalidad(Localidad localidad){
        localidades.add(localidad);
    }
    /*
    * método para contar el número total
    * de habitantes de cualquier municipio. Este número será la suma de los
    * habitantes de las localidades que forman parte del municipio
    */
    public int calcularNumeroHabitantes(){
        int numeroDeHabitantes = 0;
        for(int i = 0; i < localidades.size(); i++){
            numeroDeHabitantes += localidades.get(i).getNumeroDeHabitantes();
        }
        return numeroDeHabitantes;
    }

    public String toString(){
        String datos = "Municipio, " + nombre + " con " + 
            calcularNumeroHabitantes() + " habitantes con las siguientes localidades:";
        for (Localidad loc : localidades){
            datos += "\n" + loc;
        }
        return datos;
    }
}