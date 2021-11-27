public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int length;
	int width;
	int height;
	
	int weight;

	
	public Furniture(String name, String type, int length, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
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
		return width;	}

	public void setWidth(int width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(int weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public double getCost() {
		return weight * 0.25;
	}

	@Override
	public void printPackaging(){
		System.out.println("should be covered with waterproof covers with area of: "
				+ this.length + "x" + this.width);
	};
}
