public class USD implements Convertable{
    private float rate = 28.1f;
    public float convert(float number)
    {
        return this.rate * number;
    }

}
