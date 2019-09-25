import java.util.Scanner;
public class Type{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("请输入数字:");
	int type = scan.nextInt();
	
	switch(type){
	case 1:
	    System.out.print("你好");
		break;
	case 2:
	    System.out.print("我好");
	    break;
	case 3:
	    System.out.print("大家好");
		break;
    default:
	    System.out.print("啊，什么啊？");
	}
	}









}