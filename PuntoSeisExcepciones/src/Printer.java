import java.lang.*;
public class Printer 
{
	protected double Tinta;
	protected int Papel;
	protected boolean conectada;
	protected boolean online;
	
	
	
	
	public Printer(double tinta, int papel, boolean conectada, boolean online) 
	{
		this.Tinta = tinta;
		this.Papel = papel;
		this.conectada = conectada;
		this.online = online;
	}

	protected double getTinta() {
		return Tinta;
	}

	protected void setTinta(double tinta) {
		Tinta = tinta;
	}

	protected int getPapel() {
		return Papel;
	}

	protected void setPapel(int papel) {
		Papel = papel;
	}

	public boolean isConectada() {
		return conectada;
	}

	protected void setConectada(boolean conectada) {
		this.conectada = conectada;
	}

	protected boolean isOnline() {
		return online;
	}

	protected void setOnline(boolean online) {
		this.online = online;
	}
	
	void cargarTinta (double t)
	{this.Tinta=t;}
	
	void cargarPapel(int c) 
	{this.Papel=c;}
	
	void conectar(boolean c) 
	{this.conectada=c;}
	
	void desconectar(boolean d) 
	{this.conectada=d;}

	void on_line (boolean o) 
	{this.online=o;}
	
	void of_line (boolean of) 
	{this.online=of;}
	
	void print(Document d) throws PrinterException
	{
		if(!this.isOnline())
		{throw new PrinterException("No está conectada");}
		if(!this.isConectada()) 
		{throw new PrinterException("No está online");}
		for(int h=1;h<=d.getCantidadHojas();h=h+1)
		{
			if(this.getPapel()==0) 
			{throw new PrinterException("No hay papel",h);}
			if(this.getTinta()==0) 
			{throw new PrinterException("No hay tinta",h);
			}else 
				{System.out.println("Imprimiendo hoja "+h);
				setTinta((this.Tinta)-(0.008));
				setPapel(Papel-1);}
		}
	}
		
		
		
	
	

}
