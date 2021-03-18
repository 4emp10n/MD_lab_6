public class Euro implements Convertable{
    private float rate = 29.1f;

    public float convert(float number)
    {
        return this.rate * number;
    }
}
