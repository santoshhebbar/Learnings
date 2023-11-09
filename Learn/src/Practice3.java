public class Practice3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ram");
        sb.append("raj");
        sb.append(3);
        sb.deleteCharAt(6);
        sb.insert(6,"HIA");
        System.out.println(sb);



        StringBuilder sbr=new StringBuilder("kill");
        String str=sbr.toString();
        StringBuffer sss=new StringBuffer(str);
        System.out.println(sss);
    }
}
