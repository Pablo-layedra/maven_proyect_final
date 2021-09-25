package prueba.finnal;

public class Automovil {
	
	private String marcaAuto;
	private String modeloAuto;
	private String placaAuto;
	private String añoAuto;
	private int kilometraje;
	private AutoNacional autoNacional;
	private AutoImportado autoImportado;
	
	
	public AutoNacional getAutoNacional() {
		return autoNacional;
	}
	public void setAutoNacional(AutoNacional autoNacional) {
		this.autoNacional = autoNacional;
	}
	public AutoImportado getAutoImportado() {
		return autoImportado;
	}
	public void setAutoImportado(AutoImportado autoImportado) {
		this.autoImportado = autoImportado;
	}
	public String getMarcaAuto() {
		return marcaAuto;
	}
	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}
	public String getModeloAuto() {
		return modeloAuto;
	}
	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}
	public String getPlacaAuto() {
		return placaAuto;
	}
	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}
	public String getAñoAuto() {
		return añoAuto;
	}
	public void setAñoAuto(String añoAuto) {
		this.añoAuto = añoAuto;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public int compareTo(Automovil o) {
		// TODO Auto-generated method stub
		
		if (this.kilometraje< o.getKilometraje()) {
			return -1;
		}else if (this.kilometraje==o.getKilometraje()) {
			return 0;
		}else{
			return (1);
		}
	}	
	
	@Override
	public String toString() {
		return "Automovil [MARCA: " + marcaAuto + ", MODELO: " + modeloAuto + ", PLACA: " + placaAuto
				 + ", KILOMETRAJE: " + kilometraje + "]";
	}
	
	

}
