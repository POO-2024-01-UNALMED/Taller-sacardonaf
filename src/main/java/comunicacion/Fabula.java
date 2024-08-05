package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza=enseñanza;
		this.interpretacion=interpretacion;
	}
	
	public int palabrasTotales(int a) {
		return this.getPaginas()*a*1;
	}
	
	public String interpretacion() {
		return interpretacion;
		
	}
	
	public String toString() {
		String r=this.getOrigen()+"\n";
		r+=this.getTitulo()+"\n";
;		r+=this.getAutor()+"\n";
		r+=this.getPaginas()+"\n";
		r+=ensenanza;
		return r;
		}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
