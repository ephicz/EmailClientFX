package sample;

public class Email {

    private String kdy, hodiny, duvod;
    private String komuEmail, odkohoEmail, kopieEmail, predmetEmail, obsahEmail;

    public Email(String kdy, String hodiny, String duvod, String komuPoslat){
        this.kdy = kdy;
        this.hodiny = hodiny;
        this.duvod = duvod;
        this.komuEmail = komuPoslat;
    }

    public String getKomuEmail(){
        return komuEmail;
    }

    public String getodkohoEmail(){
        odkohoEmail = "siegl226@gmail.com";
        return odkohoEmail;
    }

    public String getkopieEmail(){
        kopieEmail = "";
        return kopieEmail;
    }

    public String getpredmetEmail(){
        predmetEmail = "Omluvenka";
        return predmetEmail;
    }

    public String getObsahEmail(){
        obsahEmail = "Dobrý den, \n omlouvám se, " + kdy + " nepříjdu do školy na " + hodiny + "hodinu/y kvůli" + duvod + "\n Děkuji \n Jan Siegl";
        return obsahEmail;
    }
}
