package ex1;

public class Ex1_const_this {
    String model;
    String color;
    int maxspeed;
    
    
    public Ex1_const_this() {
        System.out.println("기본 생성자");
        model = "기본모델: 소나타";
        color = "검은색";
        maxspeed = 3000;
    }
    
    
    public Ex1_const_this(String model1) {
    	
        this.model = model1;
        color = "검은색";
        maxspeed = 3000;
        System.out.println("매개변수 생성자 호출됨");
    }
    
    
    public Ex1_const_this(String model, String color, int maxspeed) {
        this.model = model; 
        this.color = color;
        this.maxspeed = maxspeed; 
        System.out.println("매개변수 생성자 호출됨");
    }
    
    
    public String printcar() {
        return model + " : " + color + " : " + maxspeed;
    }
    
    public static void main(String[] args) {
        
        Ex1_const_this ref = new Ex1_const_this("마이카");
        System.out.println(ref.printcar());
    }
}