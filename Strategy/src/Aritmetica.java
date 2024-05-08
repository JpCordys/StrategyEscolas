public class Aritmetica implements ICalcMedia{
    double Media;
    @Override
    public double CalculoMedia(double a, double b){
        Media = (a+b)/2;
        return Media;
    }

    @Override
    public String Situacao() {
        if(Media>5){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
