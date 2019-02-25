
public class Xp {
	private int IdX;
	private int quantidade;
	
	public int getIdX() {
		return IdX;
	}
	public void setIdX(int idX) {
		IdX = idX;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdX;
		result = prime * result + quantidade;
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
		Xp other = (Xp) obj;
		if (IdX != other.IdX)
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Xp [IdX=" + IdX + ", quantidade=" + quantidade + "]";
	}
	public Xp(int idX, int quantidade) {
		super();
		IdX = idX;
		this.quantidade = quantidade;
	}
	
	

}
