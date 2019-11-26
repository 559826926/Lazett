public class Main {
public static void main(String args[]) {
    String[] coolbeans = Lexer.main("ExampleCode.zfa");
    //System.out.println(coolbeans);

    for (int i = 0; i < coolbeans.length-1;i++){
        System.out.println(coolbeans[i]);

    }


}

}
