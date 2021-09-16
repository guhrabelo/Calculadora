package controller;

import model.PilhaInt;

public class NPRController {
	
	PilhaInt pilha = new PilhaInt();
	
	public NPRController () {
		super();
	}
	
	public void insereValor(PilhaInt pilha, int valor) {
		pilha.push(valor);
	}
	
	public int npr(PilhaInt p, String op) throws Exception {
		if(op.equals("+")|| op.equals("-") || op.equals("*")|| op.equals("/")) {
			int resultado = 0;
			try {
				if(p.size() >= 2) {
					int pri = p.top();
					p.pop();
					int seg = p.top();
					p.pop();
					switch(op){
						case "+":
							resultado = pri + seg;
							break;
						case "-":
							resultado = seg - pri;
							break;
						case "*":
							resultado = pri * seg;
							break;
						default:
							resultado = seg / pri;
					}
				}else {
					throw new Exception("Exception de pilha com valores insuficientes") ;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return resultado;
		}else {
			throw new Exception("A string informada não é uma operação");
		}
		
	}
}
