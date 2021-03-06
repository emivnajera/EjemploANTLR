package TS

type TablaSimbolos struct {
	Tabla    []Simbolo
	Anterior *TablaSimbolos
}

func (this *TablaSimbolos) SetTabla(sim Simbolo) interface{} {
	for _, n := range this.Tabla {
		if sim.Id == n.Id {
			return Excepcion{"Semantico", "Variable Ya Existe", sim.Fila, sim.Columna}
		}
	}
	this.Tabla = append(this.Tabla, sim)
	return 0
}

func (this *TablaSimbolos) GetTabla(id string) interface{} {
	tablaActual := this
	encontrado := false
	for tablaActual != nil {
		for _, n := range tablaActual.Tabla {
			if id == n.Id {
				encontrado = true
				return n
			}
		}
		if !encontrado {
			tablaActual = tablaActual.Anterior
		}
	}
	return nil
}

func (this *TablaSimbolos) ActualizarTabla(id string, value interface{}, fila int, columna int) interface{} {
	contador := 0
	tablaActual := this
	for tablaActual != nil {
		for _, n := range tablaActual.Tabla {
			if id == n.Id {
				this.Tabla[contador].Valor = value
				return n
			}
			contador++
		}
		tablaActual = this.Anterior
	}
	return Excepcion{"Semantico", "Variable No Existe", fila, columna}
}

func NewTabla(anterior *TablaSimbolos) TablaSimbolos {
	return TablaSimbolos{Anterior: anterior}
}
