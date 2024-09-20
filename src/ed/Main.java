package ed;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ana");
        Student s2 = new Student("Bia");
        Student s3 = new Student("Leo");

        Vector list = new Vector();

        System.out.println(list.size());
        list.add(s1);
        System.out.println(list.size());
        list.add(s2);
        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.contains(s3));

        System.out.println(list.get(1));

        list.add(2, s3);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < 400; i++) {
            Student s = new Student("Student " + i);
            list.add(s);
        }


    }
}
