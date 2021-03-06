public class HabitacionEmpresario extends Habitacion
{
	private boolean mesaInterior;
	
	public HabitacionEmpresario(int num, double sup, double prem2, boolean mesa)
	{
		super(num,sup,prem2,false);
		this.setMesaInterior(mesa);
	}

	public boolean isMesaInterior()
	{
		return mesaInterior;
	}

	public void setMesaInterior(boolean mesaInterior)
	{
		this.mesaInterior = mesaInterior;
	}
	
	@Override
	public void setVistasexteriores(boolean vistasexteriores)
	{

	}
	
	@Override
	public String toString()
	{
		String cadena = super.toString();
		
		cadena += (isMesaInterior()?"\nTiene una mesa interior":"\nNo tiene una mesa interior");
		
		return cadena;
	}
}
