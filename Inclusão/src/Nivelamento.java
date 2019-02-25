
public class Nivelamento {
	private String avancado;
	private String medio;
	private String basico;
	
	public String getAvancado() {
		return avancado;
	}
	public void setAvancado(String avancado) {
		this.avancado = avancado;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	public String getBasico() {
		return basico;
	}
	public void setBasico(String basico) {
		this.basico = basico;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avancado == null) ? 0 : avancado.hashCode());
		result = prime * result + ((basico == null) ? 0 : basico.hashCode());
		result = prime * result + ((medio == null) ? 0 : medio.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nivelamento other = (Nivelamento) obj;
		if (avancado == null) {
			if (other.avancado != null)
				return false;
		} else if (!avancado.equals(other.avancado))
			return false;
		if (basico == null) {
			if (other.basico != null)
				return false;
		} else if (!basico.equals(other.basico))
			return false;
		if (medio == null) {
			if (other.medio != null)
				return false;
		} else if (!medio.equals(other.medio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Nivelamento [avancado=" + avancado + ", medio=" + medio + ", basico=" + basico + "]";
	}
	public Nivelamento(String avancado, String medio, String basico) {
		super();
		this.avancado = avancado;
		this.medio = medio;
		this.basico = basico;
	}
	
	

}
