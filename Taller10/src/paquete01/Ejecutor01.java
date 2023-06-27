/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
public class Ejecutor01 {
        public static void main(String[] args) {
            MenuNinos menuNinos1 = new MenuNinos("Tallarines rojos", 10.0, 8.0, 2.0, 1.5);
            MenuNinos menuNinos2 = new MenuNinos("Milanesa", 12.0, 9.0, 2.5, 1.0);
            MenuEconomico menuEconomico1 = new MenuEconomico("Comida del dia", 7.0, 12.0, 6.0);
            MenuDia menuDia1 = new MenuDia("Chaufa", 18.0, 15.0, 8.0, 3.5);
            MenuAcarta menuAcarta1 = new MenuAcarta("Marucahn", 20.0, 40.0, 8.5, 3.5, 9.0);
            Cuenta cuenta = new Cuenta("Blanca", 22.0) {
            };
            cuenta.agregarMenu(menuNinos1);
            cuenta.agregarMenu(menuNinos2);
            cuenta.agregarMenu(menuEconomico1);
            cuenta.agregarMenu(menuDia1);
            cuenta.agregarMenu(menuAcarta1);
            System.out.println(cuenta.toString());
        }
    }

// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/