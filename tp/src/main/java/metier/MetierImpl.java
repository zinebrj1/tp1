package metier;
import dao.IDao;
public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double resultat = temp * 20;
        return resultat;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }


}
