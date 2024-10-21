package tst;

/**
 *
 * @author leona
 */
public class Test {

    private static int contador = 0;
    private static final String[] name = {"GuardianOriginal", "HeroeLegal", "ProtectorCreativo", "CazadorAutentico", "DefensorDigital", "ArtGuardian", "OriginalHero", "ValorProtector", "JustoDigital", "LegadoLegal", "AntiPirata", "ArteDefensor", "GuardianDeArte", "HonestoJugador", "CazaPiratas", "LegalWarrior", "DigitalProtector", "ProtegeValor", "AntiPirateria", "ArteProtector", "GuardianDeCodigo", "ProtegeOriginal", "GuardianDigital", "CazaFalsos", "ProtectorDeArte", "LegalDefender", "GuardianDeLegado", "HeroeDeCodigo", "DefensaDigital", "CazadorLegal", "OriginalProtector", "ProtectorHonesto", "ValorOriginal", "GuardianContraPiratas", "CodigoProtegido", "HonestoDigital", "AntiPirateo", "ProtectorDeLegado", "DigitalDefensor", "DefensorDeArte", "CazaPirateria", "ProtectorDelCodigo", "LegalGuardian", "CazadorDeFalsos", "DefensorCreativo", "GuardianHonesto", "DigitalCazaFalsos", "ArteLegal", "ProtectorDelArte", "GuardianDelCodigo", "ProtectorDelValor", "HeroeDelArte", "CazaPirata", "GuardianDeProteccion", "DefensorOriginal", "ProtectorJusto", "LegalOriginal", "DigitalCazador", "ValorCreativo", "ProtectorContraPiratas", "GuardianDeHonestidad", "CodigoLegal", "DigitalHeroe", "ProtectorDelLegado", "CazaFalsificaciones", "OriginalDefender", "ProtectorDelOriginal", "LegalCazador", "DigitalGuardian", "ProtectorDeHonestidad", "CazaPiratasOriginal", "DefensorDeLegado", "GuardianLegal", "AntiPirateriaHeroe", "ProtectorContraFalsos", "CazadorDeOriginales", "ArteProtegido", "ProtectorDeCodigo", "GuardianDeValor", "LegalProtector", "DigitalValor", "OriginalCazador", "ProtectorDeFalsificaciones", "CazaOriginal", "HeroeCreativo", "GuardianContraFalsos", "ProtectorLegal", "DefensorHonesto", "ArteGuardian", "ProtectorDeHonesto", "CazadorDeCodigo", "ValorOriginalHeroe", "GuardianCreativo", "LegalHeroe", "ProtectorDeArteLegal", "DefensorDelOriginal", "CazaPirataOriginal", "ProtectorCreativoDigital", "GuardianDePirateria", "ProtectorDeAutenticidad"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (String string : name) {
            System.out.println(contador + ": " + string + "\n");
            contador++;
        }
        System.out.println(name[0]);
    }
    
}
