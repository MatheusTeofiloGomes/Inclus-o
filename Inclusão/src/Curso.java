
public class Curso {
	private int IdC;
	private String descrição;
	
	public int getIdC() {
		return IdC;
	}
	public void setIdC(int idC) {
		IdC = idC;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdC;
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
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
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Curso [IdC=" + IdC + ", descrição=" + descrição + "]";
	}
	public Curso(int idC, String descrição) {
		super();
		IdC = idC;
		this.descrição = descrição;
	}
	
	
}
