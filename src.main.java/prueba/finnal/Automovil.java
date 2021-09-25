package prueba.finnal;

public class Automovil {
	
	private String marcaAuto;
	private String modeloAuto;
	private String placaAuto;
	private String añoAuto;
	private String kilometraje;
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
	public String getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "Automovil [MARCA: " + marcaAuto + ", MODELO: " + modeloAuto + ", PLACA: " + placaAuto
				 + ", KILOMETRAJE: " + kilometraje + "]";
	}
	
	

}
