package fr.ufrsciencestech.panier;

/**
 *
 * @author roudet
 */
 
public class Pamplemousse implements Fruit{
    private double prix;
    private String origine;
	
    /**
     * Constructeur par défaut
     */
    public Pamplemousse() 
    {
        this.prix = 1.8;  //prix en euros
        this.origine="Afrique du Sud";
    }
    
    /**
     * Constructeur standard
     * @param prix prix du Pamplemousse
     * @param origine origine du Pamplemousse
     */
    public Pamplemousse(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Afrique du Sud";  //Afrique du Sud par défaut
	else
            this.origine = origine;   
    }

    /**
     * accesseur du prix du Pamplemousse
     * @return prix du Pamplemousse
     */
    @Override
    public double getPrix(){
	return prix;
    }

    /**
     * mutateur du prix du Pamplemousse
     * @param prix nouveau prix du Pamplemousse
     */
    public void setPrix(double prix){
	this.prix=prix;
    }

    /**
     * accesseur de l'origine du Pamplemousse
     * @return origine du Pamplemousse
     */
    @Override
    public String getOrigine(){
	return origine;
    }
 
    /**
     * mutateur de l'origine du Pamplemousse
     * @param origine nouvelle origine du Pamplemousse
     */
    public void setOrigine(String origine){
	this.origine=origine;
    }

    /**
     * descriptif du Pamplemousse (son prix, son origine)
     * @return descriptif du Pamplemousse sous la forme d'une chaîne de caractère
     */
    @Override
    public String toString(){
        return "Pamplemousse de " + origine + " a " + prix + " euros";
    }

    /**
     * prédicat pour tester si 2 Pamplemousses sont équivalents
     * @param o Objet à comparer
     * @return <strong>true</strong> si les deux Pamplemousses sont identiques <strong>false</strong> sinon
     */
    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 pamplemousses sont equivalents
        if(o != null && getClass() == o.getClass()){
            Pamplemousse p = (Pamplemousse) o;
            return (prix == p.prix && origine.equals(p.origine));
        }
        return false;
    }

    /**
     * predicat indiquant qu'un pamplemousse a des pepins
     * @return <strong>true</strong> si le Pamplemouuse a des pépins <strong>false</strong> sinon
     */
    @Override
    public boolean isSeedless() {  //predicat indiquant qu'un pamplemousse a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Pamplemousse o = new Pamplemousse();
        System.out.println("premier test Pamplemousse");
        double prix = o.getPrix();
        String origine = o.getOrigine();
        if(prix==1.8)
            System.out.println("getPrix OK");
        else
            System.out.println("getPrix FALSE");
        
        if(origine.equals("Afrique du Sud"))
            System.out.println("getOrigine OK");
        else
            System.out.println("getOrigine FALSE");
        
        o.setPrix(1.5);
        prix = o.getPrix();
        if(prix==1.5)
            System.out.println("setPrix OK");
        else
            System.out.println("setPrix FALSE");
        
        o.setOrigine("Chine");
        origine = o.getOrigine();
        if(origine.equals("Chine"))
            System.out.println("setOrigine OK");
        else
            System.out.println("setOrigine FALSE");
        
        String desc = o.toString();
        if(desc.equals("Pamplemousse de Chine a 1.5 euros"))
            System.out.println("toString OK");
        else
            System.out.println("toString FALSE");    
   }
}
