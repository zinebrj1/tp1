package pres;
import metier.IMetier;
import metier.MetierImpl;
import dao.IDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class presentation {
    public static void main(String[] args)throws FileNotFoundException, ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException { Scanner s = new Scanner(new File("C:\\Users\\hp\\IdeaProjects\\tp\\config.txt"));
        /*"newInstance" pour l'instanciation dynamique */
        String DaoClass = s.nextLine();
        Class cDao = Class.forName(DaoClass);
        IDao dao =(IDao) cDao.newInstance();

        String metierClass =s.next();
        Class CMetier = Class.forName(metierClass);
        IMetier metier = (IMetier) CMetier.newInstance();

        Method m = CMetier.getMethod("setDao",IDao.class);
        //invoke pour executon de la methode
        m.invoke(metier,dao);

        System.out.println("resultat="+metier.calcul());



    }
}
