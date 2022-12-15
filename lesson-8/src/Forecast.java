public interface Forecast {
    float temperature();
    class Fake implements Forecast{
        @Override
        public float temperature(){
            return 21.37f;
        }
    }
}
