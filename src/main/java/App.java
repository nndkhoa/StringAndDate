public class App {
  public static void main(String[] args) {

    String firstString = "Hello OneMount Group.";

    // firstString = firstString + "123";

    int max = 100;
    firstString = String.format("MAX = %d\n", max);
    System.out.println(firstString);

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

    char c = s4.charAt(0);
    System.out.println(c);

    int idx = s4.indexOf('p');
    System.out.println(idx);
    int idxSubStr = s4.indexOf("va");
    System.out.println(idxSubStr);

    String s9 = "Java for OneMount Group!";
    System.out.println(s9.substring(9));

    int bIdx = s9.indexOf("Group");
    int eIdx = "Group".length() + bIdx;
    if (bIdx >= 0) {
      System.out.println(s9.substring(bIdx, eIdx));
    }

    String ps = "1/3";
    String[] parts = ps.split("/");
    System.out.println(parts.length);
    for (String p : parts) {
      System.out.println(p);
    }
  }
}
