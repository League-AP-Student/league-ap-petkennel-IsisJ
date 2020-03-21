
public class LoudDog extends Dog {

	public LoudDog(String petName) {
		super(petName);
	}
	public String speak(){
		return dog_sound + dog_sound;
		//suggested answer: return super.speak() + super.speak();
	}

}
