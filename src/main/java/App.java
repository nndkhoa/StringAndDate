public class App {
  public static void main(String[] args) {
    String str = "Hello OneMount Group.";

    // str = str + "123";

    int max = 100;
    str = String.format("MAX = %d\n", max);
    System.out.println(str);

    String s = "    Java     ";
    System.out.println("Chuỗi ban đầu: " + s);
    System.out.println("Sau khi loại bỏ khoảng trắng: " + s.trim()); // method trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi

    String s1 = "Java";
    String s2 = "Java";
    String s3 = "JAVA";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
    System.out.println(s1.equalsIgnoreCase(s3));

    String s4 = "java";
    String s5 = "JAVA".toLowerCase();
    System.out.println(s5);
    System.out.println(s4 == s5);
    System.out.println(s4.equals(s5));

    String s6 = s4.replace('a', 'b');
    System.out.println(s6);
  }
}
