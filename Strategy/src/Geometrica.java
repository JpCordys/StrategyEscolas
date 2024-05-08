public class Geometrica implements ICalcMedia {
    double Media;

    @Override
    public double CalculoMedia(double a, double b) {
        Media = Math.sqrt(a * b); // Fórmula para média geométrica
        return Media;
    }

    @Override
    public String Situacao() {
        if (Media > 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}