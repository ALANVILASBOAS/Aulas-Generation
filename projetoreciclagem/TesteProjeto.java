package projetoreciclagem;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialPapel papel = new MaterialPapel();
		//papel.descartar();
		//papel.calcularReciclaveis();
		//papel.danoAmbiente(); // ser� chamado no m�todo calcular
		//papel.reutilizar();
		
		MaterialVidro vidro = new MaterialVidro();
		//vidro.descartar();
		//vidro.calcularReciclaveis();
		//vidro.danoAmbiente(); //ser� chamado no m�todo calcular
		//vidro.reutilizar();
		
		MaterialPlastico plastico = new MaterialPlastico();
		//plastico.descartar();
		plastico.calcularReciclaveis();
		//plastico.danoAmbiente(); //ser� chamado no m�todo calcular
		//plastico.reutilizar();
		
	}

}
