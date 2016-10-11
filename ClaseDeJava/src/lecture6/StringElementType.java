package lecture6;

public class StringElementType extends ElementType {
	
	private String theString;
	
	public boolean greaterThan(ElementType e){
		StringElementType eString = (StringElementType) e;
		
		return (this.theString.compareTo(eString.theString) > 0);
	}
	
	public long valueOf(){
		return this.theString.length();
	}
	
	public boolean equals(ElementType e){
		
		StringElementType eString = (StringElementType) e;
		
		return (this.theString.equals(eString.theString));
	}

}
