public class Allat {
    private String nev="VOID";

    public void beallitNev(String new_name){

        if(new_name.isEmpty()){
            System.out.println("Hiba! Nem adtál nevet");
            System.exit(1);
        }

        nev = new_name;
    }

    public String getName(){
        return nev;
    }

    public void hangotad(String hang){
        System.out.println(hang);
    }

    

}
