/*
 * Copyright (C) 2015 eersya
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package mx.eersya.calculadora;

/**
 *
 * @author eersya
 */
public interface Operaciones {
    
    public static final int VACIO = 0;
    public static final int CON_NUMERO = 1;
    public static final int REALIZANDO_OPERACION = -1;
    public static final int SIGNO = 2;
    public static final int NUMERO = -2;
    public static final int EN_PUNTO = -3;
    public static final int DESPLEGAR = 3;
    public static final int NO_PRESIONADO = 0;
    public static final int PRESIONADO = 1;
    
    public static final String SUMAR = "+";
    public static final String RESTAR = "-";
    public static final String MULTIPLICAR = "*";
    public static final String DIVIDIR = "/";
    public static final String IGUAL = "=";
    
    public static final String PUNTO = ".";
    
}
