
public class Modulos {
	private int IdM;
	private String provas;
	
	public int getIdM() {
		return IdM;
	}
	public void setIdM(int idM) {
		IdM = idM;
	}
	public String getProvas() {
		return provas;
	}
	public void setProvas(String provas) {
		this.provas = provas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdM;
		result = prime * result + ((provas == null) ? 0 : provas.hashCode());
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
		Modulos other = (Modulos) obj;
		if (IdM != other.IdM)
			return false;
		if (provas == null) {
			if (other.provas != null)
				return false;
		} else if (!provas.equals(other.provas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Modulos [IdM=" + IdM + ", provas=" + provas + "]";
	}
	public Modulos(int idM, String provas) {
		super();
		IdM = idM;
		this.provas = provas;
	}
	
	
}
