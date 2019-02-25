
public class Mascote {
	private int IdMA;
	private String roupas;
	private String acessorios;
	
	public int getIdMA() {
		return IdMA;
	}
	public void setIdMA(int idMA) {
		IdMA = idMA;
	}
	public String getRoupas() {
		return roupas;
	}
	public void setRoupas(String roupas) {
		this.roupas = roupas;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdMA;
		result = prime * result + ((acessorios == null) ? 0 : acessorios.hashCode());
		result = prime * result + ((roupas == null) ? 0 : roupas.hashCode());
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
		Mascote other = (Mascote) obj;
		if (IdMA != other.IdMA)
			return false;
		if (acessorios == null) {
			if (other.acessorios != null)
				return false;
		} else if (!acessorios.equals(other.acessorios))
			return false;
		if (roupas == null) {
			if (other.roupas != null)
				return false;
		} else if (!roupas.equals(other.roupas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mascote [IdMA=" + IdMA + ", roupas=" + roupas + ", acessorios=" + acessorios + "]";
	}
	public Mascote(int idMA, String roupas, String acessorios) {
		super();
		IdMA = idMA;
		this.roupas = roupas;
		this.acessorios = acessorios;
	}
	
	
}
