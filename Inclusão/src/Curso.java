
public class Curso {
	private int IdC;
	private String descri��o;
	
	public int getIdC() {
		return IdC;
	}
	public void setIdC(int idC) {
		IdC = idC;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdC;
		result = prime * result + ((descri��o == null) ? 0 : descri��o.hashCode());
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
		Curso other = (Curso) obj;
		if (IdC != other.IdC)
			return false;
		if (descri��o == null) {
			if (other.descri��o != null)
				return false;
		} else if (!descri��o.equals(other.descri��o))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Curso [IdC=" + IdC + ", descri��o=" + descri��o + "]";
	}
	public Curso(int idC, String descri��o) {
		super();
		IdC = idC;
		this.descri��o = descri��o;
	}
	
	
}
