public class Boletin9_3 {
    private static Boletin9_3 instance = null;

    public Boletin9_3() {
    }

    public static Boletin9_3 getInstance() {
        if (instance == null) {
            instance = new Boletin9_3();
        }
        return instance;
    }

    public float areaRectangulo(float base,float altura){
        float area=0;
        if (base>0 && altura>0){
            area=base*altura;
        }
        return area;
    }
}
