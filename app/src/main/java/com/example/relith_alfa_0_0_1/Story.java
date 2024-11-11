package com.example.relith_alfa_0_0_1;

public class Story {

    GameScreen gs;
    String nextPosition;

    public Story(GameScreen gs){
        this.gs = gs;
    }

    public void selectPosition(String position){
        switch(position){
            case "startingPoint": startingPoint(); break;
            case "pos1": dialogue1(); break;
            case "pos2": dialogue2(); break;
            case "pos3": dialogue3(); break;
            case "pos4": dialogue4(); break;
            case "pos5": dialogue5(); break;
            case "pos6": dialogue6(); break;
            case "pos7": dialogue7(); break;
            case "pos8": dialogue8(); break;
            case "pos9": dialogue9(); break;
            case "pos10": dialogue10(); break;
            case "pos11": dialogue11(); break;
            case "pos12": dialogue12(); break;
            case "pos13": dialogue13(); break;
            case "pos14": dialogue14(); break;
            case "pos15": dialogue15(); break;
            case "pos16": dialogue16(); break;
            case "pos17": dialogue17(); break;
            case "pos18": dialogue18(); break;
            case "pos19": dialogue19(); break;
            case "pos20": dialogue20(); break;
            case "pos21": dialogue21(); break;
            case "pos22": dialogue22(); break;
            case "pos23": dialogue23(); break;
            case "pos24": dialogue24(); break;
            case "pos25": dialogue25(); break;
            case "pos26": dialogue26(); break;
            case "pos27": dialogue27(); break;
            case "pos28": dialogue28(); break;
            case "pos29": dialogue29(); break;
            case "pos30": dialogue30(); break;
            case "pos31": dialogue31(); break;
            case "pos32": dialogue32(); break;
            case "pos33": dialogue33(); break;
            case "pos34": dialogue34(); break;
            case "pos35": dialogue35(); break;
            case "pos36": dialogue36(); break;
            case "pos37": dialogue37(); break;
            case "pos38": dialogue38(); break;
            case "pos39": dialogue39(); break;
            case "pos40": dialogue40(); break;
            case "pos41": dialogue41(); break;
            case "pos42": dialogue42(); break;
            case "pos43": dialogue43(); break;
            case "pos44": dialogue44(); break;
            case "pos45": dialogue45(); break;
            case "pos46": dialogue46(); break;
            case "pos47": dialogue47(); break;
            case "pos48": dialogue48(); break;
            case "pos49": dialogue49(); break;
            case "pos50": dialogue50(); break;
            case "pos51": dialogue51(); break;
            case "pos52": dialogue52(); break;
            case "pos53": dialogue53(); break;
            case "pos54": dialogue54(); break;
            case "pos55": dialogue55(); break;
            case "pos56": dialogue56(); break;
            case "pos57": dialogue57(); break;
            case "pos58": dialogue58(); break;
            case "pos59": dialogue59(); break;
            case "pos60": dialogue60(); break;
            case "pos61": dialogue61(); break;
            case "pos62": dialogue62(); break;
            case "pos63": dialogue63(); break;
            case "pos64": dialogue64(); break;
            case "pos65": dialogue65(); break;
            case "pos66": dialogue66(); break;
            case "pos67": dialogue67(); break;
            case "pos68": dialogue68(); break;
            case "pos69": dialogue69(); break;
            case "pos70": dialogue70(); break;
            case "pos71": dialogue71(); break;
            case "pos72": dialogue72(); break;
            case "pos73": dialogue73(); break;
            case "pos74": dialogue74(); break;
            case "pos75": dialogue75(); break;
            case "pos76": dialogue76(); break;
            case "pos77": dialogue77(); break;
            case "pos78": dialogue78(); break;
            case "pos79": dialogue79(); break;
            case "pos80": dialogue80(); break;
            case "pos81": dialogue81(); break;
            case "pos82": dialogue82(); break;
            case "pos83": dialogue83(); break;
            case "pos84": dialogue84(); break;
            case "pos85": dialogue85(); break;
            case "pos86": dialogue86(); break;
            case "pos87": dialogue87(); break;
            case "pos88": dialogue88(); break;
            case "pos89": dialogue89(); break;
            case "pos90": dialogue90(); break;
            case "pos91": dialogue91(); break;
            case "pos92": dialogue92(); break;
            case "pos93": dialogue93(); break;
            case "pos94": dialogue94(); break;
            case "pos95": dialogue95(); break;
            case "pos96": dialogue96(); break;
            case "pos97": dialogue97(); break;
            case "pos98": dialogue98(); break;
            case "pos99": dialogue99(); break;
            case "pos100": dialogue100(); break;
            case "pos101": dialogue101(); break;
            case "pos102": dialogue102(); break;
            case "pos103": dialogue103(); break;
            case "pos104": dialogue104(); break;
            case "pos105": dialogue105(); break;
            case "pos106": dialogue106(); break;
            case "pos107": dialogue107(); break;
            case "pos108": dialogue108(); break;
            case "pos109": dialogue109(); break;
            case "pos110": dialogue110(); break;
            case "pos111": dialogue111(); break;
            case "pos112": dialogue112(); break;
            case "pos113": dialogue113(); break;
            case "pos114": dialogue114(); break;
            case "pos115": dialogue115(); break;
            case "pos116": dialogue116(); break;
            case "pos117": dialogue117(); break;
            case "pos118": dialogue118(); break;
            case "pos119": dialogue119(); break;
            case "pos120": dialogue120(); break;
            case "pos121": dialogue121(); break;
            case "pos122": dialogue122(); break;
            case "pos123": dialogue123(); break;
            case "pos124": dialogue124(); break;
            case "pos125": dialogue125(); break;
            case "pos126": dialogue126(); break;
            case "pos127": dialogue127(); break;
            case "pos128": dialogue128(); break;
            case "pos129": dialogue129(); break;
            case "pos130": dialogue130(); break;
            case "pos131": dialogue131(); break;
            case "pos132": dialogue132(); break;
            case "pos133": dialogue133(); break;
            case "pos134": dialogue134(); break;
            case "pos135": dialogue135(); break;
            case "pos136": dialogue136(); break;
        }
    }

    public void startingPoint(){
        gs.image.setImageResource(R.drawable.worldstart);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Czterech śmiałków zostało poproszonych o uratowanie mieszkańców małej miejscowości, którzy są nękani przez grupę strasznych potworów.");

        nextPosition = "pos1";
    }

    public void dialogue1(){
        gs.image.setImageResource(R.drawable.villagestart);
        gs.textCh.setText("Wieśniak");
        gs.textD.setText("Proszę was mężni bohaterowie, zapłacimy wam ale musicie nam pomóc, coraz więcej z nas zostaje zabitych przez tych szmulów.");

        nextPosition = "pos2";
    }

    public void dialogue2(){
        gs.image.setImageResource(R.drawable.villagestart);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("... no K.");

        nextPosition = "pos3";
    }

    public void dialogue3(){
        gs.image.setImageResource(R.drawable.villagestart);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Zbierzmy nasz oręż i wróćmy tu by rozprawić się z tymi dzikusami.");

        nextPosition = "pos4";
    }
    public void dialogue4(){
        gs.image.setImageResource(R.drawable.campstart);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Następnego dnia, wieczór.");

        nextPosition = "pos5";
    }
    public void dialogue5(){
        gs.image.setImageResource(R.drawable.campstart);
        gs.textCh.setText("Deend");
        gs.textD.setText("Wszystko mamy?");

        nextPosition = "pos6";
    }
    public void dialogue6(){
        gs.image.setImageResource(R.drawable.campstart);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Ajej kaptan!");

        nextPosition = "pos7";
    }
    public void dialogue7(){
        gs.image.setImageResource(R.drawable.campstart);
        gs.textCh.setText("Witold");
        gs.textD.setText("No to idziemy kurwa.");

        nextPosition = "pos8";
    }
    public void dialogue8(){
        gs.image.setImageResource(R.drawable.forestedge);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Na skraju lasu, obok wioski.");

        nextPosition = "pos9";
    }
    public void dialogue9(){
        gs.image.setImageResource(R.drawable.forestedge);
        gs.textCh.setText("???");
        gs.textD.setText("*DŹWIĘKI UMIERAJĄCEGO WIELORYBA W ODDALI*");

        nextPosition = "pos10";
    }
    public void dialogue10(){
        gs.image.setImageResource(R.drawable.forestedge);
        gs.textCh.setText("Vabl");
        gs.textD.setText("To chyba jeden z nich.");

        nextPosition = "pos11";
    }
    public void dialogue11(){
        gs.image.setImageResource(R.drawable.forestedge);
        gs.textCh.setText("Deend");
        gs.textD.setText("Przygotujmy się.");

        nextPosition = "pos12";
    }
    public void dialogue12(){
        gs.image.setImageResource(R.drawable.forestedge);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Dobra jedziemy z kurwami!");

        nextPosition = "pos13";
    }
    public void dialogue13(){
        gs.image.setImageResource(R.drawable.gigantrock);
        gs.textCh.setText("NeRo");
        gs.textD.setText("Spójrzcie moje dzikusy, idą nas najebać.");

        nextPosition = "pos14";
    }
    public void dialogue14(){
        gs.image.setImageResource(R.drawable.gigantrock);
        gs.textCh.setText("Karna");
        gs.textD.setText("*Niezrozumiały mamrot*");

        nextPosition = "pos15";
    }
    public void dialogue15(){
        gs.image.setImageResource(R.drawable.gigantrock);
        gs.textCh.setText("NyS");
        gs.textD.setText("Nie mają z nami szans.");

        nextPosition = "pos16";
    }
    public void dialogue16(){
        gs.image.setImageResource(R.drawable.partiesencounterfirst);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Dwie drużyny zebrały się naprzeciw siebie.");

        nextPosition = "pos17";
    }
    public void dialogue17(){
        gs.image.setImageResource(R.drawable.gnazzeangryfirst);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Najebe was!");

        nextPosition = "pos18";
    }
    public void dialogue18(){
        gs.image.setImageResource(R.drawable.karnadodgeone);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Gnazze rzuca swoim toporkiem w strone Karnej...");

        nextPosition = "pos19";
    }
    public void dialogue19(){
        gs.image.setImageResource(R.drawable.karnadodgetwo);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...lecz ona upada w rów i unika jego ataku.");

        nextPosition = "pos20";
    }
    public void dialogue20(){
        gs.image.setImageResource(R.drawable.neronys);
        gs.textCh.setText("Nero");
        gs.textD.setText("Atakuj moje zwierze!");

        nextPosition = "pos21";
    }
    public void dialogue21(){
        gs.image.setImageResource(R.drawable.neronys);
        gs.textCh.setText("Narrator");
        gs.textD.setText("NyS dziko wydziera morde i szarżuje w strone Witolda i Vabla.");

        nextPosition = "pos22";
    }
    public void dialogue22(){
        gs.image.setImageResource(R.drawable.vablvitoldnys);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Kurwa unik!");

        nextPosition = "pos23";
    }
    public void dialogue23(){
        gs.image.setImageResource(R.drawable.vablvitoldnys);
        gs.textCh.setText("Witold");
        gs.textD.setText("Ale mu jebne!");

        nextPosition = "pos24";
    }
    public void dialogue24(){
        gs.image.setImageResource(R.drawable.vitoldbackflipshot);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Podczas przewrotu w tył, Witold wystrzeliwuje strzałę...");

        nextPosition = "pos25";
    }
    public void dialogue25(){
        gs.image.setImageResource(R.drawable.nyseyesore);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...prosto w oko ogromnego dzikusa.");

        nextPosition = "pos26";
    }
    public void dialogue26(){
        gs.image.setImageResource(R.drawable.deendbravo);
        gs.textCh.setText("Deend");
        gs.textD.setText("Brawo Witold, teraz moja kolej.");

        nextPosition = "pos27";
    }
    public void dialogue27(){
        gs.image.setImageResource(R.drawable.deendtakeoff);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Deend siada na miotle i wystrzeliwuje w stronę czarnoksiężnika...");

        nextPosition = "pos28";
    }
    public void dialogue28(){
        gs.image.setImageResource(R.drawable.deendabouttobehit);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...ale dostaje lute z jego wyjebanej magicznej pałki...");

        nextPosition = "pos29";
    }
    public void dialogue29(){
        gs.image.setImageResource(R.drawable.deendhitfull);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...poczym upada na ziemię.");

        nextPosition = "pos30";
    }
    public void dialogue30(){
        gs.image.setImageResource(R.drawable.deendhitcloseup);
        gs.textCh.setText("Deend");
        gs.textD.setText("Eughghugh!");

        nextPosition = "pos31";
    }
    public void dialogue31(){
        gs.image.setImageResource(R.drawable.gnazzeangryafterhitcloseup);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("O chuj, jebli Deenda! Macie przejebane, mojego ziomeczka najebać to już za dużo.");

        nextPosition = "pos32";
    }
    public void dialogue32(){
        gs.image.setImageResource(R.drawable.gnazzeaxekratos);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Gnazze wyciąga rękę do której wraca topór...");

        nextPosition = "pos33";
    }
    public void dialogue33(){
        gs.image.setImageResource(R.drawable.gnazzeclosesuptonero);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...i podbiega do NeRa po czym zadaje cios.");

        nextPosition = "pos34";
    }
    public void dialogue34(){
        gs.image.setImageResource(R.drawable.nerognazzepizdanalebwnoge);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Nero dostaje pizde na łeb w nogę...");

        nextPosition = "pos35";
    }
    public void dialogue35(){
        gs.image.setImageResource(R.drawable.nerognazzeareyouapproachingme);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...ale odskakuje i uchodzi z życiem.");

        nextPosition = "pos36";
    }
    public void dialogue36(){
        gs.image.setImageResource(R.drawable.gnazzemunakurwi);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Następnym razem cię nakurwie!");

        nextPosition = "pos37";
    }
    public void dialogue37(){
        gs.image.setImageResource(R.drawable.vitoldgoestohelp);
        gs.textCh.setText("Witold");
        gs.textD.setText("Biegnę pomóc Deendowi!");

        nextPosition = "pos38";
    }
    public void dialogue38(){
        gs.image.setImageResource(R.drawable.vitoldhelpsdeend);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Witold pomaga odejść Deendowi od pola walki.");

        nextPosition = "pos39";
    }
    public void dialogue39(){
        gs.image.setImageResource(R.drawable.vitolddeendkupipicie);
        gs.textCh.setText("Deend");
        gs.textD.setText("Dzięki Witold, kupie ci kiedyś picie.");

        nextPosition = "pos40";
    }
    public void dialogue40(){
        gs.image.setImageResource(R.drawable.vitolddeendkupipicie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Witold i Deend uciekają na miotle w bezpieczne miejsce.");

        nextPosition = "pos41";
    }
    public void dialogue41(){
        gs.image.setImageResource(R.drawable.nyshowlrushcharge);
        gs.textCh.setText("Narrator");
        gs.textD.setText("NyS wydaje z siebie straszny ryk i wstaje z ziemi po nie udanej szarży.");

        nextPosition = "pos42";
    }
    public void dialogue42(){
        gs.image.setImageResource(R.drawable.nysrushchargequote);
        gs.textCh.setText("NyS");
        gs.textD.setText("Dojade was małe pojeby!");

        nextPosition = "pos43";
    }
    public void dialogue43(){
        gs.image.setImageResource(R.drawable.gnazzecocky);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("To dawaj pedale, tylko się nie zesraj lol.");

        nextPosition = "pos44";
    }
    public void dialogue44(){
        gs.image.setImageResource(R.drawable.nysrushstart);
        gs.textCh.setText("Narrator");
        gs.textD.setText("NyS odpala dziką szarżę w stronę Gnazze...");

        nextPosition = "pos45";
    }
    public void dialogue45(){
        gs.image.setImageResource(R.drawable.nyshowlsandchargesatgnazze);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...tylko, że tym razem drze pizde i ogłusza bohatera.");

        nextPosition = "pos46";
    }
    public void dialogue46(){
        gs.image.setImageResource(R.drawable.nyshowlsandchargesatgnazze);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("O chuj, ale głośno.");

        nextPosition = "pos47";
    }
    public void dialogue47(){
        gs.image.setImageResource(R.drawable.nyshitsgnazze);
        gs.textCh.setText("Narrator");
        gs.textD.setText("NyS wjeżdża w Gnazze jak w wolne miejsce parkingowe obok biedronki...");

        nextPosition = "pos48";
    }
    public void dialogue48(){
        gs.image.setImageResource(R.drawable.gnazzezajebalwdrzewo);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...i wykurwia go o drzewo.");

        nextPosition = "pos49";
    }
    public void dialogue49(){
        gs.image.setImageResource(R.drawable.vablsupersayian);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Ty szmulu, jak ci zaraz przypierdole!");

        nextPosition = "pos50";
    }
    public void dialogue50(){
        gs.image.setImageResource(R.drawable.vablhogrider);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Vabl bierze rozpęd i wskakuje na plecy giganta.");

        nextPosition = "pos51";
    }
    public void dialogue51(){
        gs.image.setImageResource(R.drawable.vablmrbeastsietelepie);
        gs.textCh.setText("Vabl");
        gs.textD.setText("O kurwa, ale się telepie!");

        nextPosition = "pos52";
    }
    public void dialogue52(){
        gs.image.setImageResource(R.drawable.vablnysback);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Vabl wbija swój miecz w tył głowy pojebańca...");

        nextPosition = "pos53";
    }
    public void dialogue53(){
        gs.image.setImageResource(R.drawable.nysdeath);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...i ześlizguje się rozpoławiając bestie na dwie części.");

        nextPosition = "pos54";
    }
    public void dialogue54(){
        gs.image.setImageResource(R.drawable.nysdeathcloseup);
        gs.textCh.setText("NyS");
        gs.textD.setText("*wydaje z siebie ostatnie dźwięki*");

        nextPosition = "pos55";
    }
    public void dialogue55(){
        gs.image.setImageResource(R.drawable.nysdeath);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Zwierz czarnoksiężnika umarł.");

        nextPosition = "pos56";
    }
    public void dialogue56(){
        gs.image.setImageResource(R.drawable.karnawstajezrowu);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna wstaje z rowu i po rozejrzeniu się, bierze butelkę w rękę i ma zamiar rzucić w leżącego Gnazze.");

        nextPosition = "pos57";
    }
    public void dialogue57(){
        gs.image.setImageResource(R.drawable.karnawpadadorowuznowu);
        gs.textCh.setText("Witold");
        gs.textD.setText("Prosto w cel.");

        nextPosition = "pos58";
    }
    public void dialogue58(){
        gs.image.setImageResource(R.drawable.karnawrowieznowu);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna dostaje strzałę w ramie i wpada do rowu ponownie.");

        nextPosition = "pos59";
    }
    public void dialogue59(){
        gs.image.setImageResource(R.drawable.vitoldpopostrzeleniukarnej);
        gs.textCh.setText("Witold");
        gs.textD.setText("Nic z tego Szmulico, leż i nie wstawaj.");

        nextPosition = "pos60";
    }
    public void dialogue60(){
        gs.image.setImageResource(R.drawable.deendpodlecmydognazze);
        gs.textCh.setText("Deend");
        gs.textD.setText("Podlećmy do Gnazze, jest obity!");

        nextPosition = "pos61";
    }
    public void dialogue61(){
        gs.image.setImageResource(R.drawable.deendvitoldgnazzeprzydrzewie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Witold i Deend na miotle podlatują do leżącego przy drzewie Gnazze.");

        nextPosition = "pos62";
    }
    public void dialogue62(){
        gs.image.setImageResource(R.drawable.gnazzeprzydrzewiecloseup);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Ale mnie łeb boli.");

        nextPosition = "pos63";
    }
    public void dialogue63(){
        gs.image.setImageResource(R.drawable.deendvitoldgnazzeprzydrzewie);
        gs.textCh.setText("Deend");
        gs.textD.setText("Mam kogoś kto Ci pomoże tak jak nam.");

        nextPosition = "pos64";
    }
    public void dialogue64(){
        gs.image.setImageResource(R.drawable.deendwyciagabialka);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Deend wyciąga z kieszeni małego ludzika.");

        nextPosition = "pos65";
    }
    public void dialogue65(){
        gs.image.setImageResource(R.drawable.deendwyciagabialka);
        gs.textCh.setText("Białek");
        gs.textD.setText("Połóż mnie na ziemi a go ulecze.");

        nextPosition = "pos66";
    }
    public void dialogue66(){
        gs.image.setImageResource(R.drawable.deendvitoldgnazzebialekprzydrzewie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Mały człowiek okazuje się być biallkiem - miejscowym healerem.");

        nextPosition = "pos67";
    }
    public void dialogue67(){
        gs.image.setImageResource(R.drawable.bialekprzydrzewiecloseup);
        gs.textCh.setText("Białek");
        gs.textD.setText("Uleczę Cię ale to może troche zająć.");

        nextPosition = "pos68";
    }
    public void dialogue68(){
        gs.image.setImageResource(R.drawable.gnazzehealingpoddrzewem);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("...k.");

        nextPosition = "pos69";
    }
    public void dialogue69(){
        gs.image.setImageResource(R.drawable.deenddoklepmynero);
        gs.textCh.setText("Deend");
        gs.textD.setText("Skończmy to i doklepmy Nero!");

        nextPosition = "pos70";
    }
    public void dialogue70(){
        gs.image.setImageResource(R.drawable.vabldoklepmynera);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Dobra tylko gdzie on jest?");

        nextPosition = "pos71";
    }
    public void dialogue71(){
        gs.image.setImageResource(R.drawable.bohaterowiedostrzeglinera);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Bohaterowie dostrzegają w oddali NeRa...");

        nextPosition = "pos72";
    }
    public void dialogue72(){
        gs.image.setImageResource(R.drawable.bohaterowiedostrzegliodpierdalajacegoszajsy);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...odpierdalającego jakieś szajsy.");

        nextPosition = "pos73";
    }
    public void dialogue73(){
        gs.image.setImageResource(R.drawable.deendmgs);
        gs.textCh.setText("Deend");
        gs.textD.setText("Idziemy, tylko w stylu Metal Gear Solid.");

        nextPosition = "pos74";
    }
    public void dialogue74(){
        gs.image.setImageResource(R.drawable.bohaterowiepopodejsciudonera);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Po podejściu Nero odwraca się i ukazuje co on odkurwiał.");

        nextPosition = "pos75";
    }
    public void dialogue75(){
        gs.image.setImageResource(R.drawable.gnazzepopodejsciuokurwa);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("O kurwa!");

        nextPosition = "pos76";
    }
    public void dialogue76(){
        gs.image.setImageResource(R.drawable.bohaterowieneropentagram);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Na ziemi jest narysowany wyjebany pentagram z krwi czarnoksiężnika.");

        nextPosition = "pos77";
    }
    public void dialogue77(){
        gs.image.setImageResource(R.drawable.vitoldspierdalamyodpentagramu);
        gs.textCh.setText("Witold");
        gs.textD.setText("Spierdalamy!");

        nextPosition = "pos78";
    }
    public void dialogue78(){
        gs.image.setImageResource(R.drawable.neroaftersummonorders);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Pentagram zaczyna się świecić i wydawać dziwne dźwięki.");

        nextPosition = "pos79";
    }
    public void dialogue79(){
        gs.image.setImageResource(R.drawable.neroaftersummonorders);
        gs.textCh.setText("???");
        gs.textD.setText("Wezwałeś mnie, co mam zrobić?");

        nextPosition = "pos80";
    }
    public void dialogue80(){
        gs.image.setImageResource(R.drawable.nerozniszczichdoah);
        gs.textCh.setText("NeRo");
        gs.textD.setText("Zniszcz ich.");

        nextPosition = "pos81";
    }
    public void dialogue81(){
        gs.image.setImageResource(R.drawable.hitlerbottomflying);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Nad pentagramem lata nie kto inny jak...");

        nextPosition = "pos82";
    }
    public void dialogue82(){
        gs.image.setImageResource(R.drawable.hitlertopflying);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...sam przywódca III Rzeszy, Adolf Hitler.");

        nextPosition = "pos83";
    }
    public void dialogue83(){
        gs.image.setImageResource(R.drawable.hitlercloseupflying);
        gs.textCh.setText("Hitler");
        gs.textD.setText("ICH WERDE DEINE ARME UND BEINE ERNTEN!");

        nextPosition = "pos84";
    }
    public void dialogue84(){
        gs.image.setImageResource(R.drawable.hitlernapierdalalaserami);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Hitler zaczyna napierdalać laserami z oczu gdzie popadnie.");

        nextPosition = "pos85";
    }
    public void dialogue85(){
        gs.image.setImageResource(R.drawable.deendvitoldzadrzewamipodostrzalem);
        gs.textCh.setText("Deend");
        gs.textD.setText("Chowajcie się za drzewami!");

        nextPosition = "pos86";
    }
    public void dialogue86(){
        gs.image.setImageResource(R.drawable.deendvitoldzadrzewamipodostrzalem);
        gs.textCh.setText("Witold");
        gs.textD.setText("Zestrzele tego pojeba!");

        nextPosition = "pos87";
    }
    public void dialogue87(){
        gs.image.setImageResource(R.drawable.hitlerstrzalapolesilowe);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Witold wystrzeliwuje strzałę w Hitlera lecz ona odbija się od jego pola siłowego.");

        nextPosition = "pos88";
    }
    public void dialogue88(){
        gs.image.setImageResource(R.drawable.bialekidziestad);
        gs.textCh.setText("Białek");
        gs.textD.setText("Dobra, idę stąd.");

        nextPosition = "pos89";
    }
    public void dialogue89(){
        gs.image.setImageResource(R.drawable.bialekteleportujesiedowioski);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Białek teleportuje się do wioski.");

        nextPosition = "pos90";
    }
    public void dialogue90(){
        gs.image.setImageResource(R.drawable.vabljakmamygopokonac);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Jak my go mamy pokonać?");

        nextPosition = "pos91";
    }
    public void dialogue91() {
        gs.image.setImageResource(R.drawable.deendmapomysl);
        gs.textCh.setText("Deend");
        gs.textD.setText("Mam pomysł, ale nie wiem czy zadziała.");

        nextPosition = "pos92";
    }
    public void dialogue92() {
        gs.image.setImageResource(R.drawable.gnazzezrobcokolwiekbonasnajebie);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Zrób cokolwiek, pls bo nas najebie.");

        nextPosition = "pos93";
    }
    public void dialogue93() {
        gs.image.setImageResource(R.drawable.bohaterowielashitlerwtle);
        gs.textCh.setText("Deend");
        gs.textD.setText("Dajcie mi cały wasz hajs.");

        nextPosition = "pos94";
    }
    public void dialogue94() {
        gs.image.setImageResource(R.drawable.deendpieniadze);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Deend dostał razem 10 złoty 45 groszy.");

        nextPosition = "pos95";
    }
    public void dialogue95() {
        gs.image.setImageResource(R.drawable.bohaterowielasdeenduciekkuoicpicie);
        gs.textCh.setText("Deend");
        gs.textD.setText("Zaraz wracam.");

        nextPosition = "pos96";
    }
    public void dialogue96() {
        gs.image.setImageResource(R.drawable.gnazzeosound);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("O!");

        nextPosition = "pos97";
    }
    public void dialogue97() {
        gs.image.setImageResource(R.drawable.bohaterowielasdeenduciekkuoicpicie);
        gs.textCh.setText("Witold");
        gs.textD.setText("Uwierz w niego.");

        nextPosition = "pos98";
    }
    public void dialogue98() {
        gs.image.setImageResource(R.drawable.bohaterowielasdeenduciekkuoicpicie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Hitler w tle drze pizdę po niemiecku.");

        nextPosition = "pos99";
    }
    public void dialogue99() {
        gs.image.setImageResource(R.drawable.hitlerwtledrzepizdeponiemiecku);
        gs.textCh.setText("Hitler");
        gs.textD.setText("ARSCHLÖCHER KOMMEN AUF! BEKÄMPFE MICH!");

        nextPosition = "pos100";
    }
    public void dialogue100() {
        gs.image.setImageResource(R.drawable.hitlerwtledrzepizdeponiemiecku);
        gs.textCh.setText("Hitler");
        gs.textD.setText("DU VERDAMMTE SLAWISCHE MUSCHI!");

        nextPosition = "pos101";
    }
    public void dialogue101() {
        gs.image.setImageResource(R.drawable.deendwracazwinem);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Po paru minutach wraca Deend.");

        nextPosition = "pos102";
    }
    public void dialogue102() {
        gs.image.setImageResource(R.drawable.gnazzegdzietybyles);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Gdzie ty byłeś?");

        nextPosition = "pos103";
    }
    public void dialogue103() {
        gs.image.setImageResource(R.drawable.deendmamrot);
        gs.textCh.setText("Deend");
        gs.textD.setText("Nie zadawaj pytań tylko patrz.");

        nextPosition = "pos104";
    }
    public void dialogue104() {
        gs.image.setImageResource(R.drawable.deendwskakujedorowu);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Deend wskakuje do pobliskiego rowu.");

        nextPosition = "pos105";
    }
    public void dialogue105() {
        gs.image.setImageResource(R.drawable.deendwskakujedorowu);
        gs.textCh.setText("Deend");
        gs.textD.setText("Gdzie ona jest?");

        nextPosition = "pos106";
    }
    public void dialogue106() {
        gs.image.setImageResource(R.drawable.karnajeszczejedenijeszczeraz);
        gs.textCh.setText("Karna");
        gs.textD.setText("Jeszcze jeden, jeszcze raz.");

        nextPosition = "pos107";
    }
    public void dialogue107() {
        gs.image.setImageResource(R.drawable.deendkarnawrowie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Deend dostrzega Karną leżącą w rowie dwa metry od niego.");

        nextPosition = "pos108";
    }
    public void dialogue108() {
        gs.image.setImageResource(R.drawable.deendkarnawrowie);
        gs.textCh.setText("Deend");
        gs.textD.setText("Mam coś dla ciebie.");

        nextPosition = "pos109";
    }
    public void dialogue109() {
        gs.image.setImageResource(R.drawable.deendkarnawrowie);
        gs.textD.setText("Powiedział i rzucił w stronę Karnej, najlepsze tanie wino jakie znalazł w wiosce.");

        nextPosition = "pos110";
    }
    public void dialogue110() {
        gs.image.setImageResource(R.drawable.karnapodnosibutelke);
        gs.textCh.setText("Karna");
        gs.textD.setText("O! Moje ulubione!");

        nextPosition = "pos111";
    }
    public void dialogue111() {
        gs.image.setImageResource(R.drawable.karnapodnosibutelke);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna wzieła trunek i napiła się...");

        nextPosition = "pos112";
    }
    public void dialogue112() {
        gs.image.setImageResource(R.drawable.karnaupadapopiciu);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...po czym upuściła butelkę i upadła na ziemię.");

        nextPosition = "pos113";
    }
    public void dialogue113() {
        gs.image.setImageResource(R.drawable.bohaterowieprzedtransformacjakarnej);
        gs.textCh.setText("Deend");
        gs.textD.setText("Chyba działa.");

        nextPosition = "pos114";
    }
    public void dialogue114() {
        gs.image.setImageResource(R.drawable.gnazzecodziala);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Co działa?");

        nextPosition = "pos115";
    }
    public void dialogue115() {
        gs.image.setImageResource(R.drawable.deendslyszalhistorie);
        gs.textCh.setText("Deend");
        gs.textD.setText("Słyszałem historię, że jak dasz jednemu z potworów, dobre tanie wino to stanie się coś co może nam pomóc, po prostu patrz.");

        nextPosition = "pos116";
    }
    public void dialogue116() {
        gs.image.setImageResource(R.drawable.karnalewitujeiswieci);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna nagle zaczęła lewitować nad ziemią i świecić się.");

        nextPosition = "pos117";
    }
    public void dialogue117() {
        gs.image.setImageResource(R.drawable.vablmozesieschowajmy);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Może się schowajmy za czymś?");

        nextPosition = "pos118";
    }
    public void dialogue118() {
        gs.image.setImageResource(R.drawable.karnamutuje);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Potwór zaczął rosnąć i mutować z dużą prędkością zamieniając się w coś ogromnego i przerażającego.");

        nextPosition = "pos119";
    }
    public void dialogue119() {
        gs.image.setImageResource(R.drawable.gnazzelokurwanamutacje);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Ło kurwa!");

        nextPosition = "pos120";
    }
    public void dialogue120() {
        gs.image.setImageResource(R.drawable.karnamonstrum);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna zamieniła się w ogromne monstrum które tylko czeka na rozkazy.");

        nextPosition = "pos121";
    }
    public void dialogue121() {
        gs.image.setImageResource(R.drawable.deendorderskarna);
        gs.textCh.setText("Deend");
        gs.textD.setText("Zaatakuj Hitlera tak jak byś była żydem podczas II Wojny Światowej!");

        nextPosition = "pos122";
    }
    public void dialogue122() {
        gs.image.setImageResource(R.drawable.karnaszarzanahitlera);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Karna odpaliła szarżę jakiej nawet NyS nie odpalił. Biegła z prędkością pendolino i wykurwiła w Hitlera tak...");

        nextPosition = "pos123";
    }
    public void dialogue123() {
        gs.image.setImageResource(R.drawable.hitlerprzebijasieprzezdrzewa);
        gs.textCh.setText("Narrator");
        gs.textD.setText("..że przebił się przez cztery drzewa...");

        nextPosition = "pos124";
    }
    public void dialogue124() {
        gs.image.setImageResource(R.drawable.hitlerwbijasiewziemie);
        gs.textCh.setText("Narrator");
        gs.textD.setText("...i wbił się w ziemię.");

        nextPosition = "pos125";
    }
    public void dialogue125() {
        gs.image.setImageResource(R.drawable.hitlerneinnein);
        gs.textCh.setText("Hitler");
        gs.textD.setText("NEIN NEIN NEIN NEIN");

        nextPosition = "pos126";
    }
    public void dialogue126() {
        gs.image.setImageResource(R.drawable.hitlerdisappears);
        gs.textCh.setText("Narrator");
        gs.textD.setText("I w tym momencie Hitler wrócił do piekieł.");

        nextPosition = "pos127";
    }
    public void dialogue127() {
        gs.image.setImageResource(R.drawable.gnazzedeendgdziejestnero);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Dobra kurwa, gdzie jest Nero. Kończymy to.");

        nextPosition = "pos128";
    }
    public void dialogue128() {
        gs.image.setImageResource(R.drawable.deendfindsnero);
        gs.textCh.setText("Deend");
        gs.textD.setText("Tam za drzewem!");

        nextPosition = "pos129";
    }
    public void dialogue129() {
        gs.image.setImageResource(R.drawable.bohaterowieznajdujanero);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Nero siedział za drzewem wykończony po rytuale przyzywania Hitlera.");

        nextPosition = "pos130";
    }
    public void dialogue130() {
        gs.image.setImageResource(R.drawable.vablcoznimrobimy);
        gs.textCh.setText("Vabl");
        gs.textD.setText("Co z nim robimy?");

        nextPosition = "pos131";
    }
    public void dialogue131() {
        gs.image.setImageResource(R.drawable.bohaterowieznajdujanero);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Mam pomysł.");

        nextPosition = "pos132";
    }
    public void dialogue132() {
        gs.image.setImageResource(R.drawable.bohaterowieznajdujanero);
        gs.textCh.setText("Gnazze");
        gs.textD.setText("Gnazze krul nero huj.");

        nextPosition = "pos133";
    }
    public void dialogue133() {
        gs.image.setImageResource(R.drawable.neroheadless);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Gnazze zadał ostatni cios.");

        nextPosition = "pos134";
    }
    public void dialogue134() {
        gs.image.setImageResource(R.drawable.villageend);
        gs.textCh.setText("Narrator");
        gs.textD.setText("Tak oto zakończyła się jedna z wielu przygód bohaterów zwalczających szmuli w różnych częściach świata.");

        nextPosition = "pos135";
    }
    public void dialogue135() {
        gs.image.setImageResource(R.drawable.blankscreen);
        gs.textCh.setText("");
        gs.textD.setText("");

        nextPosition = "pos136";
    }
    public void dialogue136() {
        gs.image.setImageResource(R.drawable.villageend);
        gs.textCh.setText("Deend");
        gs.textD.setText("Gdzie jest nasza zapłata?");

        nextPosition = "posCredits";
    }
}