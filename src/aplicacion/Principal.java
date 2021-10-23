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
package aplicacion;
import dominio.*;
//La clase inicial servirá para iniciar el programa
public class Principal{
	public static void main(String[] args){
		//nota:los habitantes de las localidades no son cifras reales
		String[] nombre_municipios = {"Pozuelo", "Boadilla"};
		String[] nombre_localidades = {"Pozuelo centro", "Pozuelo estacion", "Pozuelo La Finca","Boadilla centro", "Boadilla estacion", "Boadilla Las Lomas"};
		int[] habitantes_localidades = {1123, 3535, 7976, 1231, 2132, 1234};

		Provincia provincia = new Provincia();
		provincia.setNombre("Madrid");
		//bucle que recorre desde i=o hasta todo los municipios
		for (int i = 0; i < nombre_municipios.length; i++){
			Municipio mun = new Municipio();
			mun.setNombre(nombre_municipios[i]);
			/*
			* dentro de cada municipio crea una localidad, variables distintas!
			* la primera vez la i vale 0 y devuelve 3, la siguiente...
			* la primera vez quiero que empiece en 0 pero no siempre
			* quiero que empiece en 0, j=i*3 (valor inical de la j)
			*/
			for (int j = 0; j < (i+1)*3;j++){
				Localidad loc = new Localidad();
				loc.setNombre(nombre_localidades[j]);
				loc.setNumeroDeHabitantes(habitantes_localidades[j]);
				mun.addLocalidad(loc);
		}
			provincia.addMunicipio(mun);
		}
		System.out.println(provincia);
		


	}
}
