public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder name = new StringBuilder("S");

        // name.setCharAt(0, 'H');
        // System.out.println(name);

        // name.delete(0, 1);
        // System.out.println(name);

        // name.insert(3, 'm');
        // System.out.println(name);

        // name.insert(0, 'S');
        // System.out.println(name);

        // name.delete(3, 5);
        // System.out.print(name);d

        name.append('o');
        name.append('u');
        name.append('m');
        name.append('i');
        name.append('k');

        System.out.print(name);
    }
}
