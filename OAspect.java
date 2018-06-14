package stanford;

public class OAspect {
	double Score ;
	String name ;
	String sentivalue ; 
	public OAspect ( double Score,String name  )
	{
		this.Score=Score ;
		this.name=name ; 
		if (Score>0)
			this.sentivalue="positive";
		else if (Score<0)
			this.sentivalue="negative";
		else 
			this.sentivalue="neutre";
	}
	@Override
	public String toString() {
		return "SAspect [Score=" + Score + ", name=" + name + ", sentivalue=" + sentivalue + "]";
	}

}
