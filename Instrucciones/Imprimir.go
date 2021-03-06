package Instrucciones

import (
	"fmt"
	"io/ioutil"
	"log"
	"reflect"

	"github.com/emivnajera/Abstract"
	"github.com/emivnajera/TS"
)

type Imprimir struct {
	Expresion Abstract.Instruccion
	Fila      int
	Columna   int
}

func (this Imprimir) Interpretar(table *TS.TablaSimbolos, Funciones *[]interface{}) interface{} {
	bytesLeidos, err := ioutil.ReadFile("consola.txt")
	if err != nil {
		log.Fatal(err)
	}

	value := this.Expresion.Interpretar(table, Funciones)
	if reflect.TypeOf(value).Name() == "Excepcion" {
		fmt.Println(value)
		return value
	}

	cadena := fmt.Sprintf("%v", value)

	cadena = string(bytesLeidos) + cadena + "\n"

	b := []byte(cadena)
	err = ioutil.WriteFile("consola.txt", b, 0644)
	if err != nil {
		log.Fatal(err)
	}

	return 0
}

func (this Imprimir) GetTipo() TS.TIPO {
	return TS.INSTRUCCION
}

func (this Imprimir) SetTipo(tipo TS.TIPO) {
	fmt.Println("No se debe usar")
}

func NewImprimir(expresion Abstract.Instruccion, fila int, columna int) Imprimir {
	return Imprimir{Expresion: expresion, Fila: fila, Columna: columna}
}
