public class Main {
    public void main() {
        IData data = Factories.CreateData();
            String str = data.getData();
            System.out.println(str);
    }
}
