
public class Diamantes {
	private int idD;
	private int quantidadeD;
	
	public int getIdD() {
		return idD;
	}
	public void setIdD(int idD) {
		this.idD = idD;
	}
	public int getQuantidadeD() {
		return quantidadeD;
	}
	public void setQuantidadeD(int quantidadeD) {
		this.quantidadeD = quantidadeD;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idD;
		result = prime * result + quantidadeD;
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
		Diamantes other = (Diamantes) obj;
		if (idD != other.idD)
			return false;
		if (quantidadeD != other.quantidadeD)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Diamantes [idD=" + idD + ", quantidadeD=" + quantidadeD + "]";
	}
	public Diamantes(int idD, int quantidadeD) {
		super();
		this.idD = idD;
		this.quantidadeD = quantidadeD;
	}
	
	

}
