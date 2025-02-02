package strategie.strategia2za1;

import sklepy.Produkt;
import strategie.strategiapromocji.StrategiaPromocji;

import java.io.Serializable;

public class Rabat2za1BezAnalizy implements StrategiaPromocji {

    private static final long serialVersionUID = 4L;

    private final double minSuma;

    public Rabat2za1BezAnalizy(double minSuma) {
        this.minSuma = minSuma;
    }

    @Override
    public double naliczRabat(Produkt produkt, int ilosc) {
        double sumaBezRabatu = produkt.getCena() * ilosc;

        if (minSuma >= sumaBezRabatu) {
            if (ilosc % 2 == 0) return sumaBezRabatu * 0.5;
            return (produkt.getCena() * (ilosc - 1) * 0.5) + produkt.getCena();
        }
        return sumaBezRabatu;
    }

}
