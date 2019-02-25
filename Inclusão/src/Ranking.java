
public class Ranking {
	private int IdR;
	private double colocacao;
	
	public int getIdR() {
		return IdR;
	}
	public void setIdR(int idR) {
		IdR = idR;
	}
	public double getColocacao() {
		return colocacao;
	}
	public void setColocacao(double colocacao) {
		this.colocacao = colocacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdR;
		long temp;
		temp = Double.doubleToLongBits(colocacao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Ranking other = (Ranking) obj;
		if (IdR != other.IdR)
			return false;
		if (Double.doubleToLongBits(colocacao) != Double.doubleToLongBits(other.colocacao))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ranking [IdR=" + IdR + ", colocacao=" + colocacao + "]";
	}
	public Ranking(int idR, double colocacao) {
		super();
		IdR = idR;
		this.colocacao = colocacao;
	}
	
	
	
	

}
