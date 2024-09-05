package gato;

import entidade.Animal;

public class  Gato extends Animal {
	
public String emitirsom() {
	return super.emitirsom() + "Miau Miau Miau ";
}

}
