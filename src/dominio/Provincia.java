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

public class Provincia{
    private String nombre;
    private ArrayList<Municipio> municipios = new ArrayList<>();

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addMunicipio(Municipio municipio){
        municipios.add(municipio);
    }
    /*
    * método para contar su número de
    * habitantes a partir de los habitantes de sus municipios.
    */
    public int calcularNumeroHabitantes(){
        int habitantes = 0;
        for (Municipio municipio : municipios){
            habitantes += municipio.calcularNumeroHabitantes();
        }
        return habitantes;
    }

    public String toString(){
        String datos = "Provincia, " + nombre + " con " + 
            calcularNumeroHabitantes() + " habitantes con los siguientes municipios.";
        for (Municipio municipio : municipios){
            datos += "\n" + municipio;
        }
        return datos;
    }
}
