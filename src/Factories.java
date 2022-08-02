public class Factories {
    public static IData CreateData(){
        return new DummyData();
//        return new Data();
    }
}
