public class SuiteNupcial extends Suite
{
	private boolean usuarioboda;
	
	public SuiteNupcial(int num, double sup, double prem2, int numase, boolean usubod)
	{
		super(num,sup,prem2,numase,true);
		this.setUsuarioboda(usubod);
	}

	public boolean isUsuarioboda()
	{
		return usuarioboda;
	}

	public void setUsuarioboda(boolean usuarioboda)
	{
		this.usuarioboda = usuarioboda;
	}
	
	@Override
	public void setJacuzzi(boolean jacuzzi)
	{

	}
	
	@Override
	public double precio()
	{
		double resprecio = super.precio();
		
		if (isUsuarioboda())
			resprecio = resprecio * 0.75;
		
		return resprecio;
	}
}
