public class wiher{
	public static void main(String[] args){
		System.out.println("To jest moj samodzielny program");
		
		Pracownik ola = new Pracownik("Ola","Srola",10);
		System.out.println("Moj niewolnik to: "+ola.getImie());

		Pielegniarka gosia = new Pielegniarka("Gosia","Srosia",2);
		System.out.println("Moja obslugo to: "+gosia.getImie()+" Pracowala: "+gosia.getNadgodziny());
		
		Lekarz lukasz = new Lekarz("Lukasz","Pukasz",222222);
		System.out.println("ja to: "+lukasz.getImie()+" Dostal: "+lukasz.getPremia());
		
		Lekarz arek = new Lekarz("Arek","Sralek",123123,2020);
		System.out.println("ja to: "+arek.getImie()+" Dostal: "+arek.getPremia());
		
		
	}
}