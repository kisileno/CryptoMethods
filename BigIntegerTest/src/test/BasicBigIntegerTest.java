import junit.framework.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * User: brainless
 * Date: 24.04.14
 */
public class BasicBigIntegerTest {

    @Test
    public void add1024to1024() {
        BigInteger a = new BigInteger("136249771281568261666886810567019066027206956809001244419612644150603567160976777265738785290935435422893644299842422417543652833322057836327330960388955669298687094334954683728782337063688529806063339716584177071528524212584677946607777259631015586655468190075589798674890415565776382469234863971767790595986", 10);
        BigInteger b = new BigInteger("77761798353519080594342103160824355824575955280685492737098535366897513649331013218023474220854329908214127097873228548917345370383730720064044752229193711973213512960499712435780824613989040596053095119774478935757476623685351472352474781885561309661992639121529533554923828007177228075670655851423362551435", 10);
        BigInteger expResult = new BigInteger("214011569635087342261228913727843421851782912089686737156711179517501080810307790483762259511789765331107771397715650966460998203705788556391375712618149381271900607295454396164563161677677570402116434836358656007286000836270029418960252041516576896317460829197119332229814243572953610544905519823191153147421", 10);
        BigInteger result = a.add(b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void add2048to2048() {
        BigInteger a = new BigInteger("28953436064542794935218264542466596986958417831802638023149835819250520039387176518354825354940754513696765827535944906775204999481463132521607342098116614369649232892195443340127184325761435987659074064131291018014437573876850262262996455765471858708792871940330319232869696880171818133347898941836083414763932171205255400878025031088340137373662007107220993230337174295478031592863383092419809098284874014718679221699536898769737354555901892003222192270613172422073261061390632144685344554707536871301622148805026990697399777894911298484955623588072735426313436591395162611192041282824000338558404385172632870174494", 10);
        BigInteger b = new BigInteger("7129994168232145709199755661955372542941411809596542433021006713373041061821207693275578537453273633630129030543475562528934467265806359177790507363092892612031047560646726750685676314099183506445168207502727676516669608642422666676070241223241070397632500302974643008243897438112138925513995825851281656398628886808627376756141897334723412221662219714118036224295047035644157256261522663661786076476868856731960640286139236363193246161920771887195506236300976752315920860570446464134140742728660022443515469280072777633634525287684965754582174616966769802285144563877327892341491166005826577176723504808185807699664", 10);
        BigInteger expResult = new BigInteger("36083430232774940644418020204421969529899829641399180456170842532623561101208384211630403892394028147326894858079420469304139466747269491699397849461209506981680280452842170090812860639860619494104242271634018694531107182519272928939066696988712929106425372243304962241113594318283957058861894767687365071162561058013882777634166928423063549595324226821339029454632221331122188849124905756081595174761742871450639861985676135132930600717822663890417698506914149174389181921961078608819485297436196893745137618085099768331034303182596264239537798205039505228598581155272490503533532448829826915735127889980818677874158", 10);
        BigInteger result = a.add(b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void multiply512to512() {
        BigInteger a = new BigInteger("3684936888602765618746238908038301769824529458924372050094101857170591990237326687548281648781587779740661085779457555399962622905170253776744759016416550", 10);
        BigInteger b = new BigInteger("9903512025147031911731252789361757998656920966209917366769673423919018866622693971253224106165939879656747386729728717913683899883722820548020835521046425", 10);
        BigInteger expResult = new BigInteger("36493816788185378068850221576502357734566930100383933639018044857401064249231709123466879294526997821570523354974408426271303916883535717185309395163863300071353796311735362805542207001412477640479435766066134757379445958866945803586077617956644165945010710422380416373255360592151025436981261809609688333750", 10);
        BigInteger result = a.multiply(b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void multiply1024to1024() {
        BigInteger a = new BigInteger("153086497635506975744706405769477624856725887492519002365671065670656055035154319739030096670389363457404945835249977900023046235495679813017418480836799505286826505124589303563368695438788208927832697484822262641420268268952194205551265196087088802992781804484491097640191936255793115507918114776255801806075", 10);
        BigInteger b = new BigInteger("126090839716750463778045926676530918802042376683263246242719947912776236750682264828948153552521500456710526876057275902771798895033486819133351929369323925805271754719033703780019529639463660165853359467710547919437694768467292605081830564489173412661687287487016616062855653132043177237089882867475507090898", 10);
        BigInteger expResult = new BigInteger("19302805036157408940409036531378544768536638003863609380940120778382004014769449774456668894111077644308548925761921446278385762825087630300566231498163074999319597628602472380039106417596124081475475896787788916049305972631417393438714238607498410175557461737831641651351315335755745148175478754929476489904893371836080933410959217242782665644639621005945709012437359969955072100510028720078865335840948377673654275606501734078070979026182298840072648463234207314950767900097957726025558023010194317261057010451231932975247541167521121809680086198358887114445666351105436955540809216337095748142663498526177593605350", 10);
        BigInteger result = a.multiply(b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void divide2048to512() {
        BigInteger a = new BigInteger("19302805036157408940409036531378544768536638003863609380940120778382004014769449774456668894111077644308548925761921446278385762825087630300566231498163074999319597628602472380039106417596124081475475896787788916049305972631417393438714238607498410175557461737831641651351315335755745148175478754929476489904893371836080933410959217242782665644639621005945709012437359969955072100510028720078865335840948377673654275606501734078070979026182298840072648463234207314950767900097957726025558023010194317261057010451231932975247541167521121809680086198358887114445666351105436955540809216337095748142663498526177593605350", 10);
        BigInteger b = new BigInteger("5537143274597743522209944928218936699928136514802216640077401867892661036941604851964607821492885836274439405067095517651466543136437714171961834396534328", 10);
        BigInteger expResult = new BigInteger("3486058438240375589549091132167668452718087559610055363833851135464969746574219425552476188493123200959855519282475781719377851714802045587064416937769557185476124766526029411758608769418719060531994637619917202473896118860541891876922987997117250598844224325101634320036898705331440403086302003889257685433145242119041495090509793504702917780967689835068942647587508642746203643040013620408954654166981026623946376565045759161493507597092603868207276098702593706", 10);
        BigInteger result = a.divide(b);
        Assert.assertEquals(expResult, result);
    }
}