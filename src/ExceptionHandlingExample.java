import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    try{
        System.out.print("0이 아닌 정수를 입력하세요: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int result=10/number;
    System.out.println("결과:10"+number+"="+result);
    }
catch(ArithmeticException e){
        System.out.println("0으로 나눌 수 없습니다.");
} catch (NumberFormatException e) {
        System.out.println("숫자가 아닌 값을 입력하셨습니다!");
    }catch (Exception e){
        System.out.println("예상하지 못한 오류가 발생했습니다:"+e.getMessage());
    }finally {
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
    }
}
