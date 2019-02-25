import java.util.Date;

public class MetasDiarias {
	private int idMD;
	private Date hora;
	
	public int getIdMD() {
		return idMD;
	}
	public void setIdMD(int idMD) {
		this.idMD = idMD;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + idMD;
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
		MetasDiarias other = (MetasDiarias) obj;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (idMD != other.idMD)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MetasDiarias [idMD=" + idMD + ", hora=" + hora + "]";
	}
	public MetasDiarias(int idMD, Date hora) {
		super();
		this.idMD = idMD;
		this.hora = hora;
	}
	
	
	
	
}
