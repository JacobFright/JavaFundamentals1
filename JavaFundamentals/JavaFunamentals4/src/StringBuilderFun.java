public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("bob bobson");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(4, "bobington ");
        System.out.println(sb);

        sb.replace(24,31, "amazing");
        System.out.println(sb);

        sb.delete(4, 14);
        System.out.println(sb);

        sb.replace(0,3, "Dr.");
        System.out.println(sb);
    }
}
