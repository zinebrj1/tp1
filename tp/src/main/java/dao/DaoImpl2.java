package dao;

public class DaoImpl2 implements IDao{
    @Override
    public double getData(){
        System.out.println("afficher resultat La Version Capteur");
        double data=50;
        return data;
    }
}
