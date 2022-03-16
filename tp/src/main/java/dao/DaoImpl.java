package dao;

public class DaoImpl  implements IDao{
    @Override
    public double getData(){
        System.out.println("afficher resultat Version donnée");
        double data=50;
        return data;
    }

}
