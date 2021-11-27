public class Electronic implements HouseholdItem{
	
	String name;
	
	int length;
	int width;
	int height;

	int weight;
	
	Boolean fragile;
	


	public Electronic(String name, int length, int width, int height, int weight, Boolean fragile) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
	}

	
//Getters and Setters

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLength() {
		return length;}

	public void setLength(int length) {
		this.length = length;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(int weight) {
		this.weight = weight;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	public Boolean getFragile() {
		return fragile;}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;}

	public double getCost() {
		return fragile ? weight*0.5 : weight/3;
	}

	@Override
	public void printPackaging(){
		System.out.println("should be covered with Polyethylene foam and packed in a box with dimension : "
				+ this.length + "x" + this.width + "x" + this.height );
	};

}
