
public class RetrieveVlaues {
	
	public static void main(String[] args) {
		
		BeanClass beanClass = new BeanClass();
		
		beanClass.setScore(90);
		beanClass.setName("John");
		
		System.out.println("Name is " + beanClass.getName() + " score is " + beanClass.getScore());
		
		
	}

}
