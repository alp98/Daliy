import  java.util.Scanner;
public class DivideExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         try {
             System.out.print("나눌 숫자 1을 입력하세요:");
             int num1 = scanner.nextInt();
             System.out.print("나눌 숫자 2를 입력하세요:");
             int num2=scanner.nextInt();

             int result = num1/num2;
             System.out.println("결과:" + result);
         } catch(ArithmeticException e){
             System.out.println("오류: 0으로 나눌 수 없습니다.");
         } catch (Exception e){System.out.println("예기치 못한 오류 발생:"+e.getMessage());
    }finally {
             System.out.println("프로그램 종료");
             scanner.close();
         }

         }
}
