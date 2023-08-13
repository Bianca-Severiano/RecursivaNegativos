package view;
import controller.ControllerNegativos;
public class PrincilapNegativos {

	public static void main(String[] args) {
		int veta[] = {-1, 0, 3, -1, -5, -6};
		int tamanho = veta.length;
		
		ControllerNegativos cn = new ControllerNegativos();
		int res = cn.contaNegativos(veta, tamanho);
		
		System.out.println(res);
	}

}
