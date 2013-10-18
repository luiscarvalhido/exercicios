public class Conversor{

	public int celsiusParaFahrenheit(){	
		return (9*40)/5 +32;
	}		

	public int celsiusParaFahrenheit(int celsius){
		return (9*celsius)/5 +32;
	}

	public double celsiusParaFahrenheit(double celsius){	
		return (9.0*celsius)/5.0 +32.0;
	}
	
	public int fahrenheitParaCelsius(int fahrenheit){	
		return (fahrenheit -32)*5/9;
	}
	
	public double fahrenheitParaCelsius(double fahrenheit){	
		return (fahrenheit -32.0)*5/ 9.0;
	}
	
	public int kelvinParaCelsius(int kelvin){	
		return kelvin-273;
	}
	
	public double kelvinParaCelsius(double kelvin){	
		return kelvin-273.0;
	}
	
	public int celsiusParaKelvin(int celsius){	
		return celsius+273;
	
	public double celsiusParaKelvin(double celsius){	
		return celsius+273.0;
	}
	
	public int kelvinParaFahrenheit(int kelvin){
		int celsius = kelvin-273;	
		return celsiusParaFahrenheit(celsius);
	}
	
	public double kelvinParaFahrenheit(double kelvin){
		double celsius = kelvin-273.0;	
		return celsiusParaFahrenheit(celsius);
	}
	
	public int fahrenheitParaKelvin(int fahrenheit){
		int celsius = fahrenheitParaCelsius(fahrenheit);	
		return celsiusParaKelvin(celsius);
	}
	
	public double fahrenheitParaKelvin(double fahrenheit){
		double celsius = fahrenheitParaCelsius(fahrenheit);	
		return celsiusParaKelvin(celsius);
	}

