package principal;

import cachorro.Cachorro;
import entidade.Gato;
import vaca.Vaca;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		System.out.println(c.emitirSom());
		
		Gato G = new Gato();
		System.out.println(G.emitirSom());
		
		Vaca V = new Vaca();
		System.out.println(V.emitirSom());

	}

}
