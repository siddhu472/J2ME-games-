/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.Button;
import com.sun.lwuit.ButtonGroup;
import com.sun.lwuit.Command;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Display;
import com.sun.lwuit.Font;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.RadioButton;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.midlet.*;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import vAdEngine.VservManager;
import vAnalyticsEngine.VservAgent;

/**
 * @author home
 */
public class Its_a_mad_mad_word extends MIDlet implements vAdEngine.VservInterface{
  
    int score=0,qno=0;
    String word[]={"amphitheater ","anathema ","annul ","anodyne ","anoint ","anonymity ","antediluvian ","antithesis ","apathetic ","aphasia ","aphorism ","aplomb ","apocryphal ","apostate ","apotheosis ","approbation ","archaic ","archipelago ","ardor ","arraign ","arrogate ","ascendancy ","ascribe ","ashen ","asinine ","askance ","askew ","aspersion ","assail ","assent ","assiduous ","assuage ","astringent ","asunder ","atone ","august ","avow ","awry ","axiom ","bacchanal ","banal ","bane ","bastion ","beguile ","behemoth ","beleaguer ","berate ","bestial ","bestow ","bevy ","bicker ","bilious ","bilk ","blandish ","blight ","blithe ","bombast ","bourgeois ","broach ","brusque ","bulwark ","burgeon ","burly ","cabal ","cadaver ","cajole ","calumny ","canard ","candor ","canvass ","capricious ","careen ","castigate ","cataclysm ","cathartic ","catholic ","caucus ","cavil ","cede ","censorious ","chagrin ","chalice ","chary ","cherubic ","chicanery ","chide ","chimerical ","choleric ","circumvent ","citadel ","clamor ","cleave ","clemency ","cloister ","coalesce ","coddle ","cogent ","cognate ","cognomen ","colloquy ","collusion ","commodious ","complicity ","compunction ","concur ","conflagration ","confluence ","confound ","congeal ","conjecture ","conjure ","consanguinity ","consecrate ","construe ","continence ","contrite ","contusion ","conundrum ","convivial ","convoke ","coquette ","corroborate ","coterie ","countenance ","cower ","crass ","craven ","credence ","creed ","cringe ","culpable ","cupidity ","curmudgeon ","dally ","debutante ","decadence ","decapitate ","deciduous ","decorous ","decry ","deference ","defile ","deft ","defunct ","deleterious ","deluge ","demagogue ","demean ","demur ","denigrate ","depravity ","deprecate ","deride ","desecrate ","desiccate ","despondent ","desultory ","diatribe ","dichotomy ","didactic ","dilettante ","disabuse ","disburse ","disconsolate ","discrete ","discursive ","disdain ","disingenuous ","disjointed ","disparage ","disparate ","disparity ","dispirit ","dissipate ","distend ","distraught ","docile ","dotage ","dour ","droll ","dulcet ","duplicity ","ebullient ","eclectic ","edify ","efface ","effrontery ","effulgent ","elicit ","elucidate ","emaciated ","embroil ","emend ","encomium ","encumber ","endemic ","enervate ","engender ","enigmatic ","enjoin ","ennui ","enthrall ","entreat ","epicure ","epigram ","epithet ","equine ","erode ","errant ","eschew ","espouse ","estranged ","euthanasia ","evanescent ","evince ","exacerbate ","exasperate ","execrable ","exemplary ","exhort ","exhume ","exonerate ","exorcise ","expedient ","expiate ","expunge ","extenuate ","extol ","exuberant ","exude ","exult ","facetious ","facile ","fallow ","fastidious ","fathom ","fatuous ","fealty ","fecund ","feign ","fetid ","fickle ","fidelity ","filch ","filial ","fitful ","flagrant ","fledgling ","flippant ","florid ","flout ","foible ","foist ","foment ","fortuitous ","foster ","fracas ","fraught ","frenetic ","frond ","fulminate ","fulsome ","furtive ","gainsay ","gargantuan ","garner ","garrulous ","gauche ","genre ","gibe ","glib ","glower ","goad ","gossamer ","gouge ","grimace ","hackneyed ","hapless ","harangue ","harbinger ","haughty ","hedonism ","heinous ","hermetic ","hew ","hiatus ","hone ","illimitable ","imbue ","immure ","impair ","impassive ","impeccable ","impecunious ","imperious ","impertinent ","imperturbable ","impervious ","impetuous ","implausible ","impolitic ","importune ","impregnable ","impugn ","inadvertent ","inane ","incandescent ","incarcerate ","incendiary ","inchoate ","incipient ","incisive ","incognito ","incommunicado ","incontrovertible ","inculcate ","incumbent ","incursion ","indict ","indigenous ","indigent ","indolent ","indomitable ","indubitable ","infernal ","infirmity ","ingrate ","ingratiate ","inimical ","innocuous ","innuendo ","inscrutable ","insinuate ","insipid ","insolent ","insular ","insuperable ","insurgent ","insurrection ","inter ","interdict ","interloper ","interminable ","internecine ","intransigent ","intrepid ","inundate ","invective ","inveigh ","inveterate ","invidious ","irascible ","itinerant ","jaded ","juggernaut ","kismet ","knell ","lachrymose ","lampoon ","larceny ","largess ","legerdemain ","levity ","libertine ","licentious ","limpid ","lissome ","lithe ","loathe ","loquacious ","macabre ","machination ","maelstrom ","malapropism ","malcontent ","malediction ","malefactor ","malodorous ","manifold ","martial ","martinet ","masochist ","maudlin ","maverick ","mawkish ","meander ","mendicant ","mercurial ","mettle ","minatory ","mirth ","miscreant ","missive ","modicum ","mollify ","moot ","mordant ","mores ","moribund ","mote ","motley ","multifarious ","munificent ","myriad ","nascent ","natal ","necromancy ","Nemesis ","neologism ","neophyte ","nether ","nettle ","niggardly ","noisome ","nonentity ","obdurate ","obeisance ","obfuscate ","obloquy ","obsequious ","obsequy ","obstinate ","obstreperous ","obtuse ","occlude ","odious ","onerous ","opprobrious ","ordain ","ossify ","ostensible ","ostentatious ","overweening ","pacifist ","paean ","palaver ","pall ","palliate ","pallid ","palpable ","paltry ","panache ","pandemic ","panegyric ","panoply ","paragon ","pariah ","parley ","parry ","partisan ","pathos ","patrician ","patrimony ","peccadillo ","pedagogue ","pedant ","pejorative ","pellucid ","penance ","penchant ","penitent ","pensive ","perdition ","peremptory ","perfunctory ","peripatetic ","pernicious ","pert ","pertinacious ","pertinent ","philistine ","phlegmatic ","pillory ","pique ","pithy ","pittance ","placid ","platitude ","plebeian ","plethora ","poignant ","polemic ","portend ","portly ","potentate ","prattle ","precept ","precipice ","precipitous ","precocious ","precursor ","predilection ","premeditate ","preponderance ","preposterous ","presage ","privation ","probity ","proclivity ","prodigal ","prodigious ","profligate ","progenitor ","progeny ","prognosis ","prognosticate ","prolix ","promontory ","promulgate ","propensity ","propinquity ","propitiate ","proscribe ","proselytize ","protean ","protract ","provident ","prude ","prudent ","prurient ","puerile ","pugnacious ","pulchritude ","punctilious ","pungent ","purport ","pusillanimous ","quaff ","quagmire ","quandary ","quell ","querulous ","quibble ","quiescent ","Quixotic ","raconteur ","rampant ","rancor ","rant ","rapacious ","rapprochement ","raze ","recalcitrant ","recant ","recidivism ","recondite ","recreant ","refractory ","regal ","relegate ","renege ","replete ","reprehensible ","reproach ","reprobate ","reprove ","repudiate ","requiem ","respite ","resplendent ","restitution ","restive ","retort ","retrench ","retrieve ","retrograde ","revelry ","revere ","revile ","revulsion ","ribald ","rife ","risque ","rostrum ","ruminate ","rustic ","sacrosanct ","sagacious ","sallow ","sanguine ","sapient ","sardonic ","saunter ","savant ","schism ","scintilla ","scintillate ","scoff ","scurrilous ","secular ","sedition ","sententious ","sequester ","seraphic ","serendipity ","servile ","simian ","simper ","sinecure ","skulk ","slake ","sloth ","slovenly ","sobriety ","sobriquet ","sodden ","solecism ","solicitous ","soliloquy ","solstice ","somber ","somnambulist ","somnolent ","soporific ","sordid ","spawn ","specious ","sporadic ","sportive ","spurn ","squalid ","staid ","steadfast ","stentorian ","stigma ","stilted ","stoic ","stolid ","stratagem ","stricture ","stultify ","stymie ","suave ","sublimate ","sublime ","subterfuge ","succulent ","sully ","supercilious ","supplant ","surly ","surmise ","surmount ","surreptitious ","sustenance ","swarthy ","Sybarite ","sycophant ","taciturn ","talon ","tantamount ","tawdry ","amplify ","ancillary ","anomaly ","artifact ","artisan ","authoritarian ","autocrat ","bifurcated ","blatant ","bountiful ","brazen ","breach ","caricature ","carnivorous ","catalyst ","centripetal ","chaotic ","chauvinist ","complement ","composure ","compress ","constituent ","constraint ","correlation ","corrugate ","depose ","depreciate ","determinate ","dexterous ","dwindle ","earthy ","entity ","equity ","equivocal ","eulogy ","exotic ","extemporaneous ","fabricate ","fallible ","felicitous ","flair ","flaunt ","flora ","fraudulent ","fusion ","germinate ","heterogeneous ","hypothetical ","inception ","inconsequential ","indefatigable ","indicative ","indisputable ","infantile ","ingenuous ","injurious ","innovate ","integrity ","intermittent ","introspective ","introvert ","invoke ","iota ","irreverent ","jaundice ","lackluster ","laudable ","lexicon ","litigation ","lunar ","luscious ","metaphor ","microcosm ","migratory ","mishap ","mnemonic ","monotony ","omnivorous ","opportunist ","orifice ","overt ","paradox ","parasite ","patent ","pediatrician ","perusal ","plenitude ","polyglot ","propagate ","reactionary ","reciprocate ","regimen ","rehabilitate ","reminiscence ","renegade ","resilient ","strident ","subliminal ","superannuated ","superficial ","supple ","synchronous ","tainted ","talisman ","theocracy ","therapeutic ","tortuous ","transcend ","transmute ","tribute ","turbulence ","unobtrusive ","vent ","verisimilitude ","versatile ","vicarious ","viscous ","warranty ","wax ","weather ","yoke ","temporal ","tenacious ","tendentious ","tenet ","tensile ","tenuous ","tepid ","terse ","tether ","thrall ","thwart ","timorous ","tirade ","toady ","torpid ","transient ","translucent ","travesty ","trenchant ","trepidation ","trite ","tryst ","tumult ","turbid ","turgid ","turpitude ","tyro ","umbrage ","unctuous ","unkempt ","unsullied ","usurp ","usury ","vacillate ","vacuous ","vapid ","venal ","vendetta ","venerable ","verdant ","vex ","vicissitude ","vie ","vignette ","vilify ","vindicate ","virile ","virulent ","vitiate ","vitriolic ","vociferous ","volition ","voluminous ","wallow ","wan ","wane ","wary ","welter ","whet ","wily ","winsome ","wizened ","wraith ","wry ","zephyr ","amphibian ","anachronism ","apothegm ","appraise ","arable ","asperity ","assay ","audit ","augury ","aver ","aversion ","aviary ","banter ","beatific ","benighted ","benison ","blanch ","bludgeon ","bolster ","burnish ","canny ","carnal ","carp ","cavalcade ","celerity ","cession ","champ ","chastise ","chattel ","churlish ","circumscribe ","clairvoyant ","collate ","complaisant ","consequential ","contumacious ","cuisine ","culmination ","curator ","daunt ","declivity ","deranged ","derivative ","descry ","diffidence ","dirge ","discomfit ","discordant ","dissimulate ","distaff ","doughty ","dross ","dyspeptic ","effluvium ","effusive ","elation ","eloquence ","emollient ","ensconce ","enunciate ","epilogue ","epitome ","equestrian ","excoriate ","exculpate ","expatiate ","expatriate ","expurgate ","extrinsic ","extrovert ","fell ","fervid ","fetter ","finicky ","fissure ","flaccid ","flamboyant ","fluster ","forbearance ","forte ","fractious ","frenzied ","funereal ","gall ","gambol ","gaunt ","gustatory ","hallow ","hoary ","holocaust ","ignominious ","impious ","implacable ","improvident ","incarnadine ","indenture ","interstice ","iridescent ","lackadaisical ","languor ","lapidary ","latitude ","lionize ","loiter ","lull ","maritime ","megalomania ","mendacious ","meretricious ","molt ","monastic ","morbid ","naivet� ","nihilism ","nomadic ","non sequitur ","nuptial ","objurgate ","opalescent ","ornithologist ","orotund ","palette ","pastiche ","patricide ","peculation ","pediment ","penumbra ","permeable ","philology ","plaintiff ","plangent ","politic ","potable ","presentiment ","primordial ","pummel ","putrid ","quintessence ","ramshackle ","ratiocination ","raucous ","ravenous ","rectitude ","refectory ","retinue ","rococo ","roil ","salubrious ","serenity ","serrated ","sinuous ","slough ","sluggard ","sophist ","sophomoric ","staccato ","succinct ","synthetic ","threnody ","tremulous ","tundra ","upbraid ","vagrant ","variegated ","vaunted ","veracious ","verity ","vernal ","wrangle ","abase ","abash ","abdicate ","abeyance ","abhor ","abjure ","ablution ","abortive ","abrogate ","absolve ","abstruse ","abut ","abysmal ","accede ","acclimate ","acclivity ","accolade ","accost ","accouter ","acme ","acquiesce ","actuate ","acumen ","adamant ","adduce ","adjunct ","admonish ","adroit ","adulation ","advent ","adventitious ","aegis ","affect ","affray ","agape ","aggrandize ","aghast ","alacrity ","allay ","allege ","allegory ","alliteration ","allude ","amenable ","amiss ","amity ","amorous ","amorphous ","amortize ","amuck ","anarchist ","animadversion ","animus ","annals ","apocalyptic ","apoplexy ","appall ","apparition ","appellation ","apposite ","apropos ","arbiter ","archetype ","argot ","aria ","array ","arroyo ","artifice ","aseptic ","azure ","badger ","badinage ","bagatelle ","bandy ","bard ","baroque ","bask ","bauble ","beatitude ","begrudge ","beholden ","bereft ","beset ","besmirch ","bicameral ","bivouac ","blase ","bode ","bogus ","brackish ","bucolic ","burlesque ","cache ","cadaverous ","callow ","canine ","captious ","carafe ","cardinal ","carrion ","cascade ","casuistry ","cauterize ","chafe ","chaste ","chasten ","cipher ","cleft ","clique ","cloven ","codicil ","cogitate ","cognizant ","cohere ","cohort ","concordat ","condescend ","condiment ","condolence ","coniferous ","consort ","contagion ","contingent ","contort ","controvert ","cordon ","corollary ","corpulent ","cortege ","coruscate ","covenant ","crestfallen ","crevice ","cruet ","cull ","culvert ","curry ","cynosure ","dank ","dauntless ","deadpan ","debonair ","decant ","decrepitude ","defamation ","deflect ","defray ","deign ","delirium ","delve ","demeanor ","demented ","demure ","denizen ","denouement ","deposition ","depredation ","derelict ","desolate ","desuetude ","dialectic ","diminution ","disconcert ","disinter ","disinterested ","disputatious ","disquisition ","dissolute ","dissonance ","distrait ","doggerel ","dolorous ","dregs ","drone ","duenna ","ecclesiastical ","eclat ","educe ","effete ","effusion ","elegiac ","emblazon ","embryonic ","emeritus ","enamored ","enclave ","engross ","epoch ","escapade ","eviscerate ","ex officio ","excision ","exegesis ","exigency ","exiguous ","expletive ","extant ","extirpate ","extrude ","facet ","factious ","factitious ","factotum ","faux pas ","febrile ","ferment ","ferret ","fervor ","fester ","fiat ","firebrand ","flagellate ","flail ","foray ","fortitude ","fret ","fritter ","frivolity ","fruition ","galvanize ","gamut ","garnish ","genealogy ","genesis ","genuflect ","ghastly ","glean ","gnome ","gorge ","gory ","grapple ","grisly ","guffaw ","gusto ","guttural ","haggard ","halcyon ","hale ","hamper ","harbor ","harridan ","harry ","heedless ","hegira ","hibernal ","histrionic ","homily ","horde ","hortatory ","hovel ","hoyden ","hubris ","hummock ","humus ","ichthyology ","idyllic ","immolate ","impinge ","imponderable ","imprimatur ","impunity ","impute ","inalienable ","incantation ","incapacitate ","inclement ","incriminate ","incubus ","ineffable ","ineluctable ","infidel ","influx ","infraction ","inimitable ","iniquitous ","inopportune ","inordinate ","insensate ","insouciant ","insubordinate ","integument ","inveigle ","irresolute ","jejune ","jostle ","ken ","knave ","knead ","lacerate ","lackey ","laity ","lambent ","lave ","lax ","lectern ","limn ","litany ","litotes ","lout ","lupine ","luxuriant ","maim ","manacle ","marauder ","masticate ","mausoleum ","mayhem ","medley ","melee ","mellifluous ","menial ","mete ","miasma ","mien ","minion ","minutiae ","mire ","miscegenation ","miscellany ","modish ","molten ","monolithic ","mortify ","mottled ","mountebank ","muffle ","mulct ","muse ","muster ","noncommittal ","nonplus ","nubile ","nugatory ","oaf ","obelisk ","obituary ","oblation ","obliquity ","odoriferous ","offal ","offertory ","ogle ","onus ","opprobrium ","opus ","orison ","paleontologist ","palpitate ","pandemonium ","pander ","pantomime ","parapet ","paroxysm ","parsimonious ","parvenu ","passe ","pastoral ","peculate ","pedantic ","pell-mell ","penurious ","peregrination ","perforce ","perigee ","perjury ","peroration ","petrify ","petty ","petulant ","picaresque ","pied ","piquant ","platonic ","plebiscite ","plumb ","polity ","poltroon ","portend ","prate ","preamble ","preternatural ","prim ","primogeniture ","primp ","proboscis ","prod ","profusion ","propellant ","prophylactic ","propound ","proscenium ","prosody ","provender ","proviso ","puissant ","purblind ","purgatory ","purloin ","purview ","quaint ","qualms ","quarry ","quay ","queasy ","quip ","quirk ","quizzical ","quorum ","rabid ","raiment ","rankle ","realm ","reconnaissance ","recrimination ","recumbent ","redolent ","redoubtable ","redundant ","reek ","refraction ","regale ","remiss ","remnant ","remorse ","rend ","render ","rendezvous ","rendition ","reparation ","repartee ","repellent ","repercussion ","repine ","reprieve ","reprimand ","reprisal ","retaliate ","retribution ","reverent ","reverie ","rigor ","rime ","risible ","roseate ","roster ","ruffian ","rummage ","ruse ","sacerdotal ","salutary ","sanctimonious ","sang-froid ","sanguinary ","sapid ","sarcophagus ","sartorial ","sate ","saturnine ","satyr ","savoir-faire ","savor ","scarify ","scurry ","scuttle ","sebaceous ","seclusion ","sedulous ","seethe ","semblance ","senescence ","sepulcher ","sequacious ","serried ","shibboleth ","shoal ","shrew ","sidereal ","sinewy ","skinflint ","skittish ","skullduggery ","slander ","sleight ","slither ","smattering ","smirk ","snivel ","solvent ","somatic ","spasmodic ","spate ","spectral ","splenetic ","stanza ","stoke ","stratum ","stupor ","sub rosa ","substantiate ","substantive ","succor ","succumb ","suffuse ","sultry ","sunder ","sundry ","supernumerary ","suture ","sylvan ","tantalize ","taper ","tarn ","tarry ","taurine ","taut ","temperate ","tempo ","tentative ","tenure ","terrapin ","testy ","thespian ","throes ","throng ","timbre ","Titanic ","tithe ","titular ","tocsin ","touchstone ","traduce ","travail ","tribunal ","troglodyte ","truckle ","tutelage ","tyranny ","unassuming ","uncouth ","unsavory ","unscathed ","unseemly ","untenable ","ursine ","uxorious ","vagary ","vainglorious ","valor ","vanguard ","vassal ","vehement ","veneer ","venial ","venturesome ","viand ","victuals ","visage ","viscid ","vitreous ","vituperative ","votary ","vouchsafe ","vulpine ","waggish ","wastrel ","waylay ","wean ","wheedle ","whimsical ","wince ","winnow ","wither ","wont ","wrath ","wreak ","wrest ","writhe ","yen ","yore ","aberration ","abettor ","abnegation ","abominate ","abrade ","abstemious ","acetic ","acidulous ","acquiescence ","acquittal ","actuarial ","acuity ","addiction ","addle ","adjuration ","adjure ","admonition ","agility ","agitation ","alimentary ","allure ","allusion ","alluvial ","amalgamate ","amazon ","ambrosia ","andirons ","anneal ","annuity ","antecede ","anthropoid ","apiary ","apogee ","apothecary ","appurtenances ","aquiline ","arcade ","archaeology ","aromatic ","arrant ","asceticism ","assessment ","astronomical ","athwart ","aureole ","auroral ","auscultation ","austerity ","baffle ","bandanna ","barb ","barrage ","bate ","bawdy ","bedizen ","bedraggle ","befuddle ","behoove ","benignant ","bereavement ","bete noire ","betrothal ","bibulous ","bigotry ","blasphemous ","blazon ","blurt ","boorish ","bouillon ","Bowdlerize ","braggadocio ","brazier ","brindled ","brittle ","brocade ","brooch ","buffoonery ","bugaboo ","bumptious ","bungle ","buskin ","buxom ","cameo ","canker ","canto ","caparison ","caprice ","carillon ","carmine ","carousal ","carte blanche ","caryatid ","caste ","catapult ","catechism ","censor ","centaur ","cerebration ","chaff ","chivalrous ","ciliated ","circlet ","clangor ","clarion ","clavicle ","climactic ","clime ","coadjutor ","cockade ","coeval ","cog ","cohesion ","colander ","collage ","collier ","colossal ","comely ","comestible ","comeuppance ","comity ","conclave ","condign ","connivance ","connubial ","cormorant ","cornice ","corsair ","covetous ","coy ","cozen ","crabbed ","credo ","crepuscular ","crone ","crotchet ","cul-de-sac ","dappled ","dastard ","daub ","dawdle ","debenture ","decollete ","decrepit ","deducible ","defalcate ","deliquescent ","delusion ","delusive ","demesne ","demolition ","demoniacal ","denotation ","depilate ","derision ","dermatologist ","descant ","desideratum ","despoil ","despotism ","detergent ","detonation ","devolve ","diadem ","dint ","dipsomaniac ","disapprobation ","disavowal ","dishabille ","dishearten ","dismember ","disport ","dissuasion ","divergent ","divination ","docket ","doddering ","doff ","dorsal ","douse ","dowdy ","drudgery ","durance ","eclipse ","eerie ","efflorescent ","elusory ","elysian ","emanate ","emendation ","emetic ","emolument ","empyreal ","encomiastic "};
    String meaning[]={" oval-shaped theater"," curse, ban"," cancel, nullify"," pain soothing"," consecrate, to apply oil, especially as a sacred rite"," state of being anonymous, having no name"," ancient, obsolete, pre historic"," direct opposite"," unconcerned, indifferent"," inability to speak or use words"," maxim, old saying"," poise, confidence"," a doubtful authenticity, not genuine, fictional"," one who abandons one's faith"," Deification, glorification"," praise, official approval"," Antiquated, from an earlier time"," group of islands"," great emotion or passion"," indict, to call to court to answer a charge"," seize without right, to demand or claim arrogantly"," powerful state"," to attribute"," resembling ashes, or deathly pale"," stupid"," to view with suspicion, scornfully"," crooked, tilted"," slander, false rumor, damaging report"," attack"," to express agreement"," hard-working, diligent, persistent"," lessen (pain), to make less severe, ease"," causing contraction, severe, harsh"," apart, into different parts"," make amends for a wrong"," noble, dignified, awe-inspiring, venerable"," declare"," crooked, askew, amiss"," self-evident truth, premise, postulate"," orgy, drunkenly festive"," trite, overly common"," poison, nuisance, something causing ruin"," fort, fortification, stronghold"," deceive, seduce, mislead"," monster, huge creature"," besiege, to harass, plague"," to scold harshly"," beast-like, brutal"," to give as a gift, grant"," group"," quarrel, to have a petty argument"," ill-tempered"," swindle, cheat, defraud"," to coax with flattering, grovel"," decay, afflict, destroy"," Joyful, cheerful, or without appropriate thought"," pompous speech"," middle class"," bring up a topic of conversation"," curt, rough and abrupt in manner"," fortification"," sprout or flourish"," husky, brawny"," plot, a secret group seeking to overturn something"," corpse, dead body"," encourage, coax, flatter"," Slander, false and malicious accusation"," hoax, a lie"," frankness, honesty of expression"," survey, examine thoroughly"," fickle, impulsive, whimsical, without much thought"," swerve, to lean on one side"," criticize, punish, chastise"," catastrophe, disaster"," purgative, purifying, cleansing"," universal, worldly"," a small group within an organization or a meeting of such a group"," quibble, raise trivial objections"," transfer ownership, to surrender possession of something"," condemning speech, severely critical"," shame, embarrassment, humiliation"," goblet, cup"," cautious, watchful, extremely shy"," sweet, innocent"," trickery, fraud, deception"," scold, express disapproval"," imaginary, impossible"," easily angered, short-tempered"," evade, avoid, to go around"," fortress or stronghold"," noisy outcry"," to split or separate, to stick, adhere"," forgiveness, merciful leniency"," refuge, to confine, seclude"," combine, to grow together"," to pamper, baby, treat indulgently"," well-put, convincing, logically forceful"," from the same source, related"," family name, any name, nickname"," conference"," conspiracy, collaboration, complicity"," spacious"," guilt by association, knowing partnership in wrong doing"," remorse, regret"," To agree"," large fire, big, destructive fire"," flowing together, meeting of two streams, meeting place"," bewilder, to baffle, perplex"," solidify, as a liquid freezing, to become thick or solid"," hypothesis, speculation, prediction"," summon, to evoke a spirit, cast a spell"," related by blood, kinship"," make holy, dedicate to a goal, to declare sacred"," interpret or to explain"," self-control, self-restraint"," apologetic, deeply sorrowful and repentant for a wrong"," A bruise"," enigma, puzzle or problem with no solution, riddle"," sociable, festive, fond of eating, drinking, and people"," convene, summon, to call together"," woman who flirts"," to confirm, verify"," small group, group of people with a common interest or purpose"," facial expression, to favor, support"," showing fear, to cringe in fear"," crude, unrefined"," cowardly"," Belief, acceptance of something as true or real"," Belief or principle"," cower, to shrink in fear"," blameworthy, guilty, responsible for wrong"," greed"," boor, cranky person"," procrastinate, to act playfully or waste time"," a girl debuting into society"," deterioration, decay (e.g. moral or cultural)"," kill by beheading"," shedding leaves, short-lived, temporary"," seemly, proper, tasteful, socially correct"," castigate, to belittle, openly condemn"," courteously yielding to another, respect, honor"," pollute, to make unclean or dishonor"," skillful, dexterous"," extinct, no longer existing, dead"," harmful, destructive, detrimental"," a flood, to submerge, overwhelm"," An unprincipled politician, leader"," to degrade, humiliate, humble"," take exception, to express doubts or objections"," defame, to slur or blacken someone's reputation"," immorality, sinfulness"," belittle, disparage"," To ridicule, to mock, make fun of"," profane, to abuse something sacred"," dehydrate, to dry completely"," depressed, feeling discouraged and dejected"," without direction in life, at random, rambling, unmethodical"," long denunciation, bitter verbal attack"," a division into two parts"," instructional"," amateur, dabbler"," correct, to free from a misconception"," pay out"," inconsolable, unable to be consoled, extremely sad"," separate, distinct"," rambling, wandering from topic to topic"," to regard with scorn and contempt"," deceptive, sly and crafty"," disconnected, incoherent, being separated"," belittle, speak disrespectfully about"," various, dissimilar, different in kind"," difference, contrast, dissimilarity"," discourage, to dishearten, make dejected"," scatter"," swell, inflate, bloat"," distressed, very worried"," domesticated, trained, tame"," senility, mental decline"," sullen and gloomy, stern and severe"," amusing in a wry"," melodious, pleasant sounding"," deceit, treachery, dishonesty, double-dealing"," exuberant, full of enthusiasm and high spirits"," joyful"," instruct morally and spiritually"," To obliterate"," insolence"," brilliant"," provoke"," make clear, clarify"," underfed, gaunt"," involve, cause to fall into disorder"," correct"," warm praise"," burden, to hinder, restrict motion"," Peculiar to some specified country or people"," weaken, sap strength from"," generate, to produce"," puzzling, inexplicable"," urge, order, command"," boredom, lack of interest and energy"," mesmerize, to captivate, enchant"," plead, beg"," gourmet, person with refined taste in food and wine"," saying, short, witty saying or poem"," name, appellation, phrase"," pertaining to horses"," wear away, to diminish"," wandering, mistaken"," avoid, to abstain from"," to support or advocate"," alienated, separated"," mercy-killing"," fleeting, very brief, short-lived"," attest, demonstrate, to show clearly"," worsen"," irritate, vex"," very bad, abominable, utterly detestable"," outstanding, serving as an example"," strongly urge"," uncover, to remove from a grave"," free from blame"," to expel evil spirits"," advantageous, convenient, efficient"," atone, make amends for"," erase, eliminate completely"," To diminish the gravity or importance of"," praise highly"," joyous, happy"," emit, ooze"," rejoice"," joking, sarcastic, witty"," very easy"," unproductive, unplowed"," meticulous, careful with details"," understand, to measure the depth of"," inane, stupid"," Loyalty"," fertile, fruitful, productive"," pretend, give a false impression"," foul-smelling, putrid, stinking"," always changing one's mind"," Loyalty"," steal something of little value"," of a son or daughter"," irregular"," outrageous, shameless"," just beginning, struggling"," Having a light, pert, trifling disposition"," ruddy, with too much decoration"," to show disregard for the law or rules"," weakness, minor fault"," palm off a fake"," instigate"," happening by luck, fortunate"," encourage"," noisy fight"," filled"," harried, neurotic"," bending tree"," denounce, menace"," excessive, insincere"," stealthy"," to deny"," large"," gather"," talkative, loquacious, wordy"," awkward, crude"," kind, category"," heckle"," insincere manner"," stare angrily"," encourage"," thin and flimsy"," overcharge, scoop out"," expression of disgust"," trite"," unlucky"," a pompous speech"," forerunner"," arrogant"," the pursuit of pleasure in life"," shocking, wicked"," airtight, sealed"," to cut with an ax"," interruption"," sharpen"," limitless"," infuse, dye, wet"," build a wall around"," injure"," calm, without feeling"," faultless"," indigent, having no money"," domineering"," insolent, rude"," calm"," Impenetrable"," quick to act without thinking"," unlikely, inconceivable"," unwise"," urgent request"," totally safe from attack"," criticize"," unintentional"," vacuous, stupid"," brilliant"," to put in a jail"," burning easily, flammable"," just begun"," beginning to exist"," keen, penetrating"," disguised"," unable to communicate with others"," Indisputable"," instill, indoctrinate, to teach"," obligatory, required"," raid"," charge with a crime"," Native"," very poor"," lazy"," invincible, fearless"," unquestionable"," hellish"," ailment, disease"," ungrateful person"," pleasing, flattering, endearing"," adverse, hostile, unfriendly"," Harmless"," indirect and subtle criticism"," cannot be fully understood"," to suggest, imply, say indirectly"," flat, dull, lacking flavor"," insulting"," narrow-minded, isolated"," insurmountable"," rebellious"," uprising, rebellion"," bury"," prohibit"," intruder, meddler in others' affairs"," unending"," mutually destructive"," uncompromising"," fearless"," flood"," verbal insult"," to rail against, protest strongly"," habitual, chronic, long-standing"," incurring ill-will"," irritable"," Wandering, unsettled"," spent, bored with one's situation"," unstoppable force"," fate"," sound of a funeral bell"," tearful"," satirize, to attack with satire"," theft of property"," generous donation"," trickery"," Frivolity, humor"," one without moral restraint"," lewd, immoral"," transparent, clearly understood"," agile, supple"," moving and bending with ease"," abhor, hate"," Talkative"," gruesome"," plot or scheme"," whirlpool, agitated state of mind"," comical misuse of a word"," one who is forever dissatisfied"," curse"," evildoer, culprit"," fetid, foul-smelling"," multiple, diverse"," warlike, pertaining to the military"," strict disciplinarian"," one who enjoys pain"," weepy, sentimental"," a person who resists adherence to a group"," sickeningly sentimental"," to wander aimlessly without direction"," beggar"," changeable, volatile, quick"," courage, capacity for bravery"," threatening"," jollity, laughter"," one who behaves criminally"," letter or note"," a small amount"," to calm or make less severe"," disputable, previously decided"," biting, sarcastic"," moral standards, customs"," near death"," speck, small particle"," diverse, many colored"," diverse, many-sided"," generous"," innumerable"," incipient, coming into existence"," related to birth"," sorcery, black magic"," implacable foe, often victorious opponent"," new word or expression"," beginner"," located under or below"," irritate"," stingy"," harmful, stinking"," person of no significance"," unyielding"," homage, deference"," bewilder, muddle, to confuse"," slander, abusive language"," fawning, servile, overly submissive"," funeral ceremony"," stubborn"," noisy, unruly, troublesome"," stupid, dull"," block, to shut"," despicable, hateful"," burdensome"," abusive, disgraceful"," appoint"," harden"," apparent, seeming"," pretentious, showy"," arrogant, forward"," one who opposes all violence"," a song of praise"," babble, nonsense"," to become dull or weary"," to make less serious, ease"," pale, sallow, lacking color or liveliness"," touchable, obvious, real"," scarce, pitifully small or worthless"," flamboyance, flair"," spread over a whole area or country"," praise"," full suit of armor"," model of excellence or perfection"," outcast"," conference, discussion"," avert, ward off, reflect"," supporter"," emotion, feeling of sadness"," aristocrat"," inheritance or heritage derived from one's father"," a minor fault"," dull, formal teacher"," a person who is too interested in formal rules and small unimportant details"," insulting, having bad connotations"," transparent, easily understood"," voluntary suffering to repent for a wrong"," inclination"," repentant"," sad"," damnation, complete ruin"," dictatorial"," careless, done in a routine way"," moving from place to place"," destructive"," flippant, bold"," persevering"," Relevant, applicable"," barbarian, narrow-minded person"," sluggish, someone who is calm"," punish by ridicule"," sting, arouse interest"," concise, to the point"," alms, trifle"," Serene, calm"," trite remark, stale"," common, vulgar"," overabundance"," pungent, sharp, emotionally moving"," a controversy"," omen"," large, dignified"," sovereign, king"," chatter, foolish talk"," principle, law"," cliff, edge"," steep"," advanced"," forerunner"," inclination, preference"," plan in advance"," predominance"," ridiculous, illogical"," omen, indicate in advance"," lack of usual necessities or comforts"," integrity, complete honesty"," inclination, tendency"," wasteful"," marvelous, enormous"," licentious, prodigal, corrupt"," ancestor"," children"," forecast"," foretell"," long-winded, wordy"," headland, cape"," publish, disseminate"," inclination"," nearness, kinship"," satisfy, to win over"," prohibit, to condemn"," recruit, convert"," changing readily"," To prolong, extend"," having foresight, thrifty"," puritan"," cautious, careful"," exhibiting lewd desires"," Childish"," combative, quarrelsome"," beauty"," careful in observing rules of behavior or ceremony"," sharp smell or taste"," claim to be"," cowardly"," to drink heartily"," difficult situation"," dilemma, difficulty"," suppress, allay"," complaining"," to argue about insignificant and irrelevant details"," still, motionless, at rest"," impractical, romantic"," story teller"," unbridled, raging"," resentment, dislike"," rage, scold"," grasping, avaricious, greedy"," reconciliation"," destroy"," resisting authority or control"," retract a statement"," habitual criminal activity"," known to only a few"," coward, betrayer of faith"," obstinate"," royal"," assign to an inferior position"," break a promise"," complete"," blameworthy, unacceptable"," blame"," morally unprincipled person"," to criticize or correct"," to reject as having no authority"," rest, a mass for the dead"," interval or relief"," shining, splendid"," act of compensating for loss or damage"," nervous, uneasy"," quick replay"," reorganize, to regroup"," reclaim"," regress"," merrymaking"," honor"," to criticize with harsh language"," aversion"," coarse, vulgar"," widespread, abundant"," off-color, racy"," stage for public speaking"," reflect upon"," rural"," sacred"," wise"," sickly yellow in color"," cheerful"," wise, shrewd"," scornful"," walk in a leisurely manner"," scholar"," a division or separation"," very small amount"," sparkle"," ridicule"," abusive, insulting"," worldly, nonreligious"," treason, resistance to authority"," concise, trying to appear wise"," to remove or set apart"," angelic, pure"," making fortunate discoveries"," slavish, obedient"," monkey like"," smile foolishly, smirk"," well paid position with little responsibility"," sneak about"," to calm down or moderate"," laziness"," sloppy"," composed"," nickname"," soaked"," ungrammatical construction"," considerate, concerned"," A monologue"," furthest point"," Gloomy"," sleepwalker"," Sleepy"," sleep inducing"," foul, ignoble, dirty and unpleasant"," produce"," false but plausible"," occurring irregularly"," playful"," reject"," filthy"," demure, sedate, boring"," loyal, immovable"," extremely loud"," mark of disgrace"," formal, stiff, unnatural"," indifferent to pain or pleasure"," impassive"," trick"," negative criticism"," inhibit, enfeeble"," hinder, thwart"," smooth"," to repress impulses"," lofty, excellent"," cunning, ruse"," juicy, delicious"," stain"," arrogant"," replace"," rude, crass"," to guess"," overcome"," secretive"," supplying the necessities of life"," dark (as in complexion)"," pleasure-seeker, lover of luxury"," flatterer, flunky"," who does not talk much"," claw of an animal"," equivalent"," gaudy, cheap"," enlarge, increase, intensify"," supplementary, subsidiary, subordinate"," deviation from the rule, irregularity"," an object made by human, of historical interest"," a skilled handicraftsman"," dictator, extremely strict, bossy"," dictator or a high ranking government officer"," divided into two branches, forked"," glaring, obvious, showy"," abundant, plentiful"," bold, shameless, impudent"," breaking of a rule, agreement, or law"," cartoon, exaggerated portrait"," meat-eating"," something that causes change without being changed"," tending toward the center"," in utter disorder"," a man who thinks men are better than women"," To make complete, perfect"," Calmness of appearance"," to reduce, squeeze"," electorate, component, part"," something that limits what you can do"," mutual relationship, association"," to wrinkle or draw into folds"," testify, to remove from a high position"," To lessen the worth of"," Definitely limited or fixed, conclusive"," skillful, adroit"," To diminish or become less"," crude"," being, existence"," impartiality, justice"," Ambiguous, open to two interpretations"," high praise"," Foreign, romantic"," unrehearsed"," construct"," Capable of erring"," very appropriate, pertinent"," a natural aptitude"," to show off"," plants"," Counterfeit"," union, coalition"," To begin to develop into an embryo or higher form"," composed of unlike parts, different"," theoretical, speculative"," The beginning"," Valueless"," never getting tired"," suggestive, implying"," not disputed, unquestioned"," childish, immature"," na�ve and unsophisticated"," harmful"," to invent, modernize"," decency, honest, wholeness"," starting and stopping"," looking within oneself"," To turn within"," request assistance or protection"," A small mark or part"," disrespectful"," disease of yellowish discoloration of skin"," dull, dreary, colorless"," Praiseworthy"," A dictionary"," lawsuit"," related to the moon"," Rich, sweet, and delicious"," figure of speech comparing two different things"," The world on a small scale"," Wandering from place to place with the seasons"," Misfortune"," related to memory"," A lack of variation"," eating everything"," One who takes advantage of circumstances"," a small opening"," open to view"," seemingly in contradiction"," one who lives at another's expense"," the right to make or sell a new invention"," a child doctor"," reading carefully"," Abundance"," Speaking several tongues"," To spread"," related to,  or favoring reaction"," To give and take mutually"," government rule, systematic plan"," To restore to a former status"," remembrance of past events"," rebel, dissident"," the quality of springing back"," rough, harsh, caustic, loud"," subconscious, imperceptible"," retired"," shallow and phony"," Easily bent"," happening at the same time"," contaminated, corrupt"," an object supposed to bring good luck"," government by the priests"," medicinal"," with bends or turns"," To surpass"," To change in nature or form"," a gift or statement showing respect"," violent agitation"," inconspicuous, not blatant"," small opening, outlet"," appearance of being true"," adaptable, all-purpose"," substitute, surrogate"," sticky, gluey, thick"," guarantee of a product's soundness"," increase, grow"," endure the effects of weather or other forces"," join together, unite"," limited by time, secular, not lasting forever"," persistent"," biased"," doctrine, principle"," capable of being stretched"," thin, insubstantial"," lukewarm"," concise, brief"," tie down, tie with a rope"," slave"," to block or prevent from happening"," fearful, timid"," scolding speech"," fawner, sycophant"," lethargic, inactive"," fleeting, temporary"," clear, lucid, almost transparent"," caricature, farce, parody"," incisive, penetrating"," fear"," commonplace, insincere"," meeting, rendezvous"," commotion"," muddy, clouded"," Swollen, not flowing"," Depravity, evil"," beginner"," resentment"," insincere"," messy in appearance"," spotless"," seize, to appropriate"," overcharge, lending money at illegal rates of interest"," To waver"," inane, empty, not showing intelligence or purpose"," vacuous, insipid"," willing to do wrong for money"," grudge, feud"," respected because of age"," green, lush"," annoy, to irritate"," changing fortunes"," compete"," scene, decorative design"," defame"," free from blame"," manly"," deadly, poisonous"," spoil, ruin"," scathing, burning"," adamant, clamoring"," free will"," bulky, extensive, or great quantity"," indulge, luxuriate"," sickly pale"," dissipate, wither"," guarded, careful"," confusion, hodgepodge"," stimulate, to sharpen"," shrewd, clever"," charming"," shriveled"," ghost"," twisted, amusing"," gentle breeze, west wind"," creature that lives on land and water"," Anything occurring or existing out of its proper time"," a short saying"," assess, evaluate the value"," suitable for cultivation"," roughness of temper"," to analyze or estimate"," formal examination of final records"," prophecy or prediction of events"," to declare to be true"," intense dislike"," cage where birds are kept"," to tease playfully and in good humor"," supremely happy, angelic, saintly"," un enlightened"," Blessing"," bleach, whiten, to take the color out"," to hit someone several times with a heavy object"," To support or make something strong"," To make brilliant or shining"," clever and able to think quickly, especially about money or business"," of the flesh, sensual"," to find faults, complain constantly"," a procession or sequence"," quick moving or acting"," Surrender, as of possessions or rights"," to chew noisily"," to criticize or punish someone"," piece of personal property"," rude, ungracious"," To confine within bounds"," who can see the future, having ESP"," to sort or put in proper order"," Agreeable, friendly"," important"," rebellious"," cookery, style of cooking"," climax, final stage"," in charge of a library or museum"," to frighten, subdue"," a place that declines or slopes downwards"," insane, delirious, maniacal"," copied or adapted, not original"," To discern, to discover or reveal"," shyness, lack of confidence"," lament with music, funeral hymn"," To put to confusion, discomfort"," harsh-sounding, badly out of tune"," to disguise"," the female branch of a family"," brave, dauntless"," waste matter, worthless impurities"," suffering from indigestion, gloomy and irritable"," noxious smells"," expressing emotion without restraint"," exhilaration, joy"," fluent and effective speech"," cream for softening, making supple"," to hide safely, settle comfortably"," verbalize, articulate"," The close of a narrative or poem"," A simplified representation"," one who rides on horseback"," to denounce"," to clear of blame or fault"," to discuss in detail, elaborate"," who does not live in one's own country"," to purify by removing obscenities"," not inherent or essential, coming from without"," an outgoing person"," to chop, cut down"," fervent, passionate"," to restrain, to bind"," meticulous, fussy"," a crack or break"," limp, flabby, weak"," Characterized by extravagance"," confuse"," Patient endurance or toleration of offenses"," A strong point"," wayward, unruly, disorderly"," feverishly fast, hectic"," mournful, appropriate to a funeral"," bitterness, nerve"," Playful leaping or frisking"," thin, emaciated"," relevant to the sense of tasting"," to make holy"," white, old"," widespread destruction"," Shameful"," not devout in religion"," doubtful, dubious"," lacking foresight or thrift"," blood-red in color"," bound to another by contract"," a small space between things"," showing many colors"," Listless, idle"," Lassitude of body or depression"," relating to precious stones"," freedom from narrow limitations"," treat as a celebrity"," dawdle, loaf"," moment of calm"," Situated on or near the sea"," mental state with delusions of wealth and power"," Untrue"," Alluring by false or gaudy show"," to shed hair, skin periodically"," related to monks"," abnormally gloomy"," a lack of worldly wisdom"," a belief in nothing, extreme skepticism"," moving from place to place"," an irrelevant conclusion"," relating to marriage"," to chide, scold"," iridescent, displaying colors"," scientist who studies birds"," pompously said"," board for mixing paints"," imitation of another's style"," murder of one's own father"," theft of money or goods"," triangular gable on a roof or fa�ade"," partial shadow in an eclipse"," penetrable"," study of words"," injured person in a lawsuit"," plaintive, resounding sadly"," expedient, prudent, well devised"," suitable for drinking"," sense of foreboding"," existing at the beginning, rudimentary"," beat, attack"," dirty, rotten"," The most essential part of anything"," dilapidated, falling to pieces"," reasoning"," Harsh sounding"," extremely hungry"," moral uprightness"," dining hall"," group of attendants"," ornate, highly decorated"," to disturb or cause disorder"," healthy"," calm, peacefulness"," toothed, with a zigzag edge"," Curving in and out"," to discard or shed"," lazy, inactive person"," person good at arguing deviously"," immature and overconfident"," marked by abrupt, clear-cut sounds"," Concise"," artificial, imitation"," a sad poem or song, dirge"," trembling, fearful"," treeless plain found in Arctic or sub arctic regions"," to scold sharply"," An idle wanderer"," many-colored"," boasted, bragged"," truthful, accurate"," Truth"," related to spring"," loud quarrel"," lower, humiliate"," humiliate, embarrass"," give up power or position"," postponement, temporary suspension"," detest, loathe"," renounce, to formally reject or abandon"," cleansing, washing"," unsuccessful, interruptive while incomplete"," cancel, to abolish by authority"," acquit, to forgive or free from blame"," difficult to comprehend"," touch, border on"," deficient, sub par"," yield, express approval, agree to"," accustom oneself to a climate"," ascent, incline"," applause, praise"," to approach and speak to someone"," equip"," summit, highest point"," to agree, comply passively"," induce, start"," sharpness of insight"," insistent, uncompromising, unyielding"," offer as example"," addition, something added, attached, or joined"," warn gently, caution, or reprimand"," skillful, accomplished, highly competent"," applause, high praise"," arrival"," accidental"," that which protects"," influence"," public brawl"," openmouthed, wonder"," exaggerate, to make larger or greater in power"," horrified"," swiftness, speed, cheerful willingness, eagerness"," to reassure; to lessen, ease, or soothe"," assert without proof"," fable, symbolic representation"," repetition of the same sound"," refer to indirectly"," agreeable"," wrong, out of place"," Friendship"," strongly attracted to love; showing love"," shapeless"," to diminish by installment payments"," murderous frenzy"," terrorist"," critical remark"," hate"," historical records"," ominous, doomed"," stroke"," horrify"," phantom"," title, name"," apt"," Appropriate"," judge"," original model"," slang"," operatic song"," arrangement"," gully"," trick"," sterile"," sky blue"," To pester"," banter, teasing conversation"," nonentity, trifle"," discuss lightly"," poet"," ornate"," take pleasure in, sun"," A trinket, trifle"," state of bliss"," resent, envy"," in debt"," deprived of"," harass, surround"," slander, sully"," having two legislative branches"," encampment"," bored with life"," portend"," forged, false"," salty"," rustic"," farce"," hiding place"," haggard"," inexperienced"," pertaining to dogs"," fond of finding fault in others"," bottle"," chief"," decaying flesh"," small waterfall"," clever argument to trick people"," to sear"," abrade"," pure, virgin"," castigate"," zero"," split"," a small group"," split"," supplement to a will"," ponder"," aware"," To stick together"," an associate"," Agreement"," patronize, talk down to, to treat someone as though you are better"," seasoning"," sympathy for the family or friends of a person who has recently died"," bearing cones"," spouse"," infectious agent"," conditional"," twist"," dispute"," bond, chain"," consequence"," fat"," procession"," sparkle"," agreement, pact"," dejected"," crack"," small bottle"," pick out, select"," drain"," seek favor by flattery"," celebrity"," damp"," courageous"," expressionless"," sophisticated, affable"," pour"," enfeeblement"," slander"," turn aside"," pay"," condescend"," mental confusion, ecstasy"," dig, explore (of ideas)"," behavior"," deranged"," sedate, reserved"," dweller"," resolution"," testimony"," preying on, plunder"," negligent"," forsaken"," disuse"," pertaining to debate"," Reduction"," confuse"," unearth"," Impartial"," fond of arguing"," elaborate treatise"," profligate, immoral"," Discord"," preoccupied, absent-minded"," poor verse"," gloomy"," residue, riffraff"," speak in a monotonic voice"," governess"," churchly"," brilliance"," draw forth, evoke"," worn out"," pouring forth"," sad"," imprint, brand"," rudimentary"," retired, but retaining title"," charmed, captivated"," area enclosed within another region"," captivate"," era"," adventure"," disembowel"," by virtue of position"," removal"," interpretation"," urgency"," scanty"," oath"," existing"," seek out and destroy"," force out"," aspect"," causing disagreement"," artificial"," handyman"," false step, mistake"," feverish, delirious"," turmoil"," rummage through"," intensity"," decay"," decree"," agitator"," whip"," whip"," raid"," patience, courage"," worry"," squander"," playfulness"," realization, completion"," excite to action"," range"," decorate"," ancestry"," beginning"," kneel in reverence"," horrible"," gather"," dwarf-like being"," stuff, satiate"," bloody"," struggle"," gruesome"," laughter"," Keen enjoyment"," throaty"," gaunt"," serene"," healthy"," obstruct"," give shelter, conceal"," hag or an ugly old woman"," harass"," careless"," a journey to a more pleasant place"," wintry"," overly dramatic"," sermon"," group"," inspiring good deeds"," shanty, cabin"," tomboy, boisterous girl"," arrogance"," knoll, mound"," soil"," study of fish"," natural, picturesque"," sacrifice"," encroach, touch"," difficult to estimate"," sanction"," exemption from harm"," charge"," that which cannot be taken away"," chant"," disable"," harsh"," accuse"," nightmare"," inexpressible"," inescapable"," nonbeliever"," inflow"," violation"," peerless"," unjust, wicked"," untimely"," excessive"," without feeling"," nonchalant"," disobedient"," a covering"," lure"," hesitant, uncertain"," barren"," push, brush against"," range of comprehension"," con man"," massage"," tear, cut"," servant"," laymen"," softly radiant"," wash"," loose, careless"," reading desk"," portray, describe"," list"," understatement for emphasis"," goon"," wolf-like"," lush"," injure"," shackle"," plunderer"," chew"," tomb"," mutilation"," mixture"," riot"," sweet sounding"," humble, degrading"," distribute"," toxin"," appearance, demeanor"," subordinate"," trivia"," marsh"," intermarriage between races"," mixture of items"," chic"," melted"," large and uniform"," humiliate"," spotted"," charlatan"," stifle, quiet"," defraud"," ponder"," to gather one's forces"," neutral, circumspect"," bring to a halt by confusion"," marriageable"," useless, worthless"," awkward person"," tall column, monument"," eulogy"," offering, sacrifice"," perversity"," pleasant odor"," inedible parts of a butchered animal"," church collection"," flirt"," burden"," disgrace"," literary work of musical composition"," prayer"," one who studies fossils"," beat, throb"," din, commotion"," cater to people's baser instincts"," mime"," rampart, defense"," outburst, convulsion"," stingy"," newcomer, social climber"," outmoded"," rustic"," embezzle, steal"," bookish"," in a confused manner"," stingy"," wandering"," by necessity"," point when moon is nearest to the earth"," lying"," conclusion of an oration"," calcify, shock"," trivial"," irritable, peevish"," roguish, adventurous"," mottled, brindled"," tart-tasting, spicy"," nonsexual"," referendum"," measure"," methods of government"," coward"," signify, augur"," babble"," introduction"," abnormal"," formal, prudish"," first-born child"," groom"," snout"," urge"," overabundance"," rocket fuel"," preventive"," propose"," platform, rostrum"," study of poetic structure"," dry food, fodder"," stipulation"," strong"," obtuse, dim-sighted"," limbo, netherworld"," To steal"," range, understanding"," old-fashioned"," misgivings"," prey, game"," wharf"," squeamish"," joke"," eccentricity"," odd"," majority"," mad, furious"," clothing"," cause bitterness, resentment"," kingdom, domain"," surveillance"," countercharge, retaliation"," reclining"," fragrant"," formidable, steadfast"," repetitious"," smell"," bending, deflection"," entertain"," Negligent"," residue, fragment"," guilt"," to tear apart"," deliver, provide"," a meeting"," version, interpretation"," amends, atonement"," witty conversation"," causing aversion"," consequence"," fret"," temporary suspension"," rebuke"," retaliation"," revenge"," reprisal"," respectful"," daydream"," harshness"," white frost"," laughable"," rosy, optimistic"," list of people"," brutal person, bully"," hunt"," trick"," priestly"," good, wholesome"," self-righteous"," coolness under fire"," gory, murderous"," interesting"," stone coffin"," pertaining to clothes"," satisfy fully"," gloomy"," demigod, goat-man"," tact, polish"," enjoy"," criticize"," move briskly"," to sink"," like fat"," solitude"," diligent"," fume, resent"," likeness"," old age"," tomb"," eager to follow, ductile"," saw-toothed"," password"," reef"," virago"," pertaining to the stars"," fibrous, stringy"," miser"," excitable"," trickery"," defame"," dexterity"," slide"," superficial knowledge"," smug look"," whine"," financially sound"," pertaining to the body"," intermittent"," sudden outpouring"," ghostly"," peevish"," division of a poem"," prod, fuel"," layer"," lethargy"," in secret"," verify"," substantial"," help, comfort"," yield, submit"," pervade, permeate"," sweltering"," split"," various"," subordinate"," surgical stitch"," rustic"," tease"," candle"," small lake"," linger"," bull-like"," tight, stretched"," moderate"," speed"," provisional"," status given after a period of time"," turtle"," petulant"," actor"," anguish"," crowd"," tonal quality, resonance"," huge"," donate one-tenth"," in name only, figurehead"," alarm bell, signal"," standard"," slander"," work, drudgery"," court"," cave dweller"," yield"," guardianship"," oppression"," modest"," uncultured, crude"," distasteful, offensive"," unhurt"," unbecoming, improper"," cannot be achieved"," bear-like"," a doting husband"," whim"," conceited"," bravery"," leading position"," subject"," adamant"," false front, fa�ade"," excusable"," bold, risky"," food"," food"," facial expression"," thick, gummy"," glassy"," abusive"," fan, aficionado"," confer, bestow"," fox-like"," playful"," spendthrift"," ambush"," remove from nursing, break a habit"," coax"," capricious"," cringe"," separate"," shrivel"," custom"," anger, fury"," inflict"," snatch"," contort"," desire"," long ago"," different from normal or usual"," encourager"," repudiation, self-sacrifice"," to hate"," to rub off a surface"," Characterized by self denial or abstinence"," related to vinegar"," sour in taste or manner"," Passive consent"," release from blame (as by a court)"," calculating"," sharpness"," compulsive, habitual need"," To make inefficient or unable to think"," solemn urging"," to request solemnly"," Genteelly point out mistake"," nimbleness"," excitement, uneasiness"," supplying nourishment"," appeal, attract"," indirect reference"," soil deposits left by rivers"," To mix or join together to become one"," female warrior"," food of the Greek gods that provided immortal youth & beauty, anything "," metal supports in a fireplace"," to gradually heat and cool in order to soften, reduce brittleness"," An annual payment or income"," To precede"," manlike"," A place where bees are kept"," The climax"," One who keeps drugs for sale and puts up prescriptions"," subordinate possessions"," like an eagle, bent, booked, curved"," a roofed passage between shops"," the study of ancient cultures by looking for and examining their "," fragrant"," Notoriously bad"," doctrine of self-denial"," estimation"," enormously large or extensive"," across, opposition"," sun's corona, halo"," pertaining to the aurora borealis"," act of listening to the heart or lungs to discover abnormalities"," quality of being self disciplined"," to frustrate or unable to understand"," large, bright-colored handkerchief"," sharp projection from fishhook"," a lot of questions or criticism"," let down, restrain"," indecent, obscene"," dress with vulgar finery"," wet thoroughly"," confuse thoroughly"," to be fit, to be right"," Benevolent in feeling, character"," state of being deprived of something valuable or beloved"," aversion"," Engagement to marry"," Fond of drinking"," discrimination, prejudice"," profane, impious"," print or decorate something in a very noticeable way"," to say something suddenly and without thinking, especially when you are "," Rude"," clear beef soup"," To expurgate in editing"," someone who boasts"," An open pan or basin for holding live coals"," tawny or grayish with streaks or spots"," Fragile"," rich, gaudy fabric"," a piece of jewelry for women which is fastened onto clothes with a pin"," coarse jokes, etc"," bugbear, object of baseless terror"," full of offensive self-conceit"," to do something wrong in a very careless or stupid way"," thick-soled half boot worn by actors of Greek tragedy"," plump, vigorous, jolly"," when someone famous appears for a short time in a film or play"," any ulcerous sore, any evil"," part of an extended poem"," showy harnesser, ornamentation for a horse"," A whim"," a set of bells capable of being played"," rich red"," To drink deeply and in boisterous or jovial manner"," complete freedom to do what you want"," sculptured column of a female figure"," one of the hereditary classes in Hindu society"," slingshot"," book for religious instruction"," to prohibit publication by law"," mythical figure, half man and half horse"," thought"," worthless products of an endeavor"," courteous to ladies"," having minute hairs, one-celled animal"," small ring, band"," loud, resounding noise"," shrill, trumpet like sound"," collarbone"," relating to the highest point"," region, climate"," assistant, colleague"," decoration worn on hat"," living at the same time as contemporary"," a spoke in a wheel, a small and unimportant person"," consistency"," utensil with perforated bottom used for straining"," a picture made by sticking small pieces of paper or other materials"," worker in coal mine, ship carrying coal"," huge"," a woman who is attractive in appearance"," something fit to be eaten"," rebuke, one's deserved fate or punishment"," courteousness, civility"," private meeting"," adequate, deservedly severe"," pretence of ignorance of something wrong, assistance or permission to "," related to marriage or matrimony"," greedy, rapacious bird"," a decorative border around the walls of a room close to the ceiling"," pirate ship"," very desirous of something, avaricious, greedy"," shy, modest"," cheat, hoodwink, swindle"," sour, peevish"," a set of beliefs"," pertaining to twilight"," hag"," a fancy, a whim, an eccentricity"," a blind alley, a trap"," spotted"," A base coward"," to paint carelessly, to smear"," to waste time by trifling, to move slowly"," bond issued to secure a loan"," having a low-necked dress"," Enfeebled, as by old age or some chronic infirmity"," derived by reasoning"," to misuse money put in trust"," capable of absorbing moisture from air and becoming liquid"," Mistaken conviction"," deceptive, raising vain hopes"," domain"," destruction"," related to evil spirits, devilish"," the exact literary meaning of a word, designation, definition"," remove hair"," Ridicule"," one who studies the skin and its diseases"," discuss fully"," that which is desired"," to bereave, rob, plunder, strip of possessions"," Any severe and strict rule"," cleansing agent"," explosion"," to roll down, to hand down"," crown"," means, effort"," a person having an uncontrollable desire for alcohol, inebriate"," rejection, disapproval"," Denial"," in a state of undress"," discourage, lose spirit"," cut into small parts"," amuse"," advise against"," Tending in different directions"," The forecast of future events or discovery of what is lost or hidden"," a list of cases to be dealt with"," shaky, infirm from old age"," take off"," belonging to the back side, posterior, tail"," to plunge into water, to extinguish"," slovenly, untidy"," Hard and constant work in any dull occupation"," confinement"," The obstruction of Sun by moon, or of moon by earth"," weird"," opening in flower"," tending to deceive expectations"," relating to paradise, blissful"," to express a feeling or quality through the way one looks"," corrections of errors"," a medicine that causes vomiting"," salary or fees for a job, remuneration, pay scale"," celestial, fiery"," praising, eulogistic"};
    RecordStore rs = null;
    String answers[];
    String REC_STORE = "ReadWriteRMS";
    Form main ;
    public void startApp() {

    Hashtable vservConfigTableAd = new Hashtable();
    vservConfigTableAd.put("appId", "6470"); //101 is test appId
    vservConfigTableAd.put("categoryId", "30");//18 is test categoryId
    VservManager vservManager = new VservManager(this, vservConfigTableAd);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {

        Hashtable vservConfigTableAd = new Hashtable();
         vservConfigTableAd.put("appId", "6470"); //101 is test appId
         vservConfigTableAd.put("categoryId", "30");//18 is test categoryId
         vservConfigTableAd.put("showAt", "end");
         VservManager vservManager = new VservManager(this, vservConfigTableAd);
   }

    int[] drawnumbers()
        {
        int MAX = 4;
        int drawNum[] = new int[4];
        Random r = new Random();

        drawNum[0] = r.nextInt(4);
        while (drawNum[1] == drawNum[0])
        {
             drawNum[1] = r.nextInt(4);
        }
        while ((drawNum[2] == drawNum[1]) || (drawNum[2] == drawNum[0]) )
        {
             drawNum[2] = r.nextInt(4);
        }

             drawNum[3] = 6-drawNum[0]-drawNum[1]-drawNum[2];


        for(int i=0;i<4;i++)
        System.out.println("random number "+ (i+1) + " : " + drawNum[i]);
        return drawNum;
        }

        void createquestion(RadioButton[] rb,Label name, ButtonGroup banswers)
        {
        Random r = new Random() ;
        qno = r.nextInt(word.length);
        String  question = word[qno];
        String answer = meaning[qno];
        String results[] = new String[4];
        results[0]=answer;
        int temp1=-1 ;
        int temp2=-1 ;
        int temp3=-1;
        while(temp1==qno||temp1==-1)
        temp1 = r.nextInt(word.length);
        results[1] = meaning[temp1];
        while(temp2==temp1||temp2==qno||temp2==-1)
        temp2 = r.nextInt(word.length);
        results[2] = meaning[temp2];
        while(temp3==temp2||temp3==temp1||temp3==qno||temp3==-1)
        temp3 = r.nextInt(word.length);
        results[3] = meaning[temp3];

        System.out.println("Results are :");
        for(int i=0;i<4;i++)
        System.out.println(results[i]);


        int randno[] = drawnumbers();
        answers= new String[4];
        for(int i=0;i<4;i++)
        {
        answers[i]=results[randno[i]];
        }

        System.out.println("answers are :");
        for(int i=0;i<4;i++)
        System.out.println(answers[i]);


        for(int i=0;i<4;i++)
        {
            rb[i].setTickerEnabled(true);
            rb[i].setText(answers[i]);
        }
        name.setText(question + " is ");
        banswers.setSelected(0);
        banswers.clearSelection();
        }

        void addwords(TextArea ta1,TextArea ta2 )
        {
            Random le = new Random();
            int t = le.nextInt(word.length);
            ta1.setText(word[t] + " is");
            
            ta2.setText(meaning[t]);
        }

  private void openRecStore(){
  try{
  rs = RecordStore.openRecordStore(REC_STORE, true );
  }catch (Exception e){}
  }

  public void closeRecStore(){
  try{
  rs.closeRecordStore();
  }catch (Exception e){}
  }

 private int readRecStore()
 {

     int answer = -1 ;
     try
     {
     int n = rs.getNumRecords();
     if(n==0)
         answer = -1 ;
     else
     {
       String stuff = new String(rs.getRecord(1));
       answer = Integer.parseInt(stuff);

     }
     }
     catch(Exception e ){}
     return answer ;
 }

void finalcheck()
    {
                     openRecStore();
                     // Code for high score
                     int oldscore = readRecStore();
                     if(score>oldscore)
                     {
                      Integer s = new Integer(score);
                      String x = s.toString();
                      byte[] data1 = x.getBytes();
                      if(oldscore==-1)
                      {
                        try {
                        rs.addRecord(data1, 0, data1.length);
                        } catch (RecordStoreException ex) {
                        }
                      }
                      else
                      {
                        try {
                        rs.setRecord(1, data1, 0, data1.length);
                        } catch (RecordStoreException ex) {
                                            }
                      }
                     }
                     closeRecStore();
}

    public void constructorMainApp() {
           Hashtable vservConfigTableAnalytics = new Hashtable();
           vservConfigTableAnalytics.put("propId", "6470");//101 is test propId
           VservAgent  vservAgent = new VservAgent(this, vservConfigTableAnalytics);
    }

    public void startMainApp() {
           try{
      Display.init(this);

       try
        {
            Resources r1 = Resources.open("/theme1.res");
            UIManager.getInstance().setThemeProps(r1.getTheme(r1.getThemeResourceNames()[0]));
        }
        catch(Exception e)
        {

        }

       Form splash = new Form();
        Image icon = null ;
        try {

             icon = Image.createImage("/dictionary.png");
             icon.scale(splash.getPreferredW(),splash.getPreferredH());

        } catch (IOException ex) {

        }

        Label splashtext = new Label(icon);

        Command splaskok = new Command("OK"){
            public void actionPerformed(ActionEvent ae)
            {
        main = new Form("Welcome");
        final BoxLayout b = new BoxLayout(BoxLayout.Y_AXIS);
        main.setLayout(b);
        Button learns = new Button("Learn a word");
        Button test = new Button("Take a test");
        Button Scores = new Button("High scores");
        Button Rules = new Button("Help");
        Button exit = new Button("Exit");
        Button about = new Button("About");

        about.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent evt){
            Form  abt = new Form("About");
             BoxLayout v = new BoxLayout(BoxLayout.Y_AXIS);
             abt.setLayout(v);
             TextArea appname = new TextArea();
             TextArea version = new TextArea();
             TextArea myname = new TextArea();
             appname.setText("Its a Mad Mad Word");
             version.setText("Version 1.0");
             myname.setText("Siddharth CT");
             appname.setEditable(false);
             version.setEditable(false);
             myname.setEditable(false);

             Command c = new Command("OK"){
                 public void actionPerformed(ActionEvent ae)
                 {
                 main.show();
                 }};
             abt.addComponent(appname);
             abt.addComponent(version);
             abt.addComponent(myname);
             abt.addCommand(c);
             abt.show();

          }
        });

        Rules.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // To be coded

              Form rul = new Form("Rules");
               TextArea ta = new TextArea("Choose the correct answer to get one point , if you choose a wrong answer you loose the game  SO PLAY WITH CAUTION !");
               ta.setSize(rul.getPreferredSize());
               ta.setUIID("Label");

               rul.addComponent(ta);
               Command ok1 = new Command("ok"){
               public void actionPerformed(ActionEvent ae)
                   {
                   main.show();
                   }
               };
               rul.addCommand(ok1);
               rul.show();
                }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               destroyApp(true);
                }
        });

        learns.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

               final Form  learn = new Form("Learn a word");
                learn.setLayout(b);
                Label l1 = new Label("Meaning of the word");
               Label l2 = new Label();
               Label l3 = new Label();
               final TextArea ta1 = new TextArea();
                ta1.setUIID("Label");
                ta1.setEditable(false);
               final TextArea ta2 = new TextArea();
                ta2.setEditable(false);
                l2.setTickerEnabled(true);
                l3.setTickerEnabled(true);
                addwords(ta1,ta2);
                learn.addComponent(l1);
                learn.addComponent(ta1);
                learn.addComponent(ta2);

                Command nxt = new Command("next word"){public void actionPerformed(ActionEvent ae){
                addwords(ta1,ta2);
                learn.repaint();
                learn.show();
                }};

                Command goback = new Command("Go back"){public void actionPerformed(ActionEvent ae){
                score = 0;
                main.show();
                }};
                learn.addCommand(nxt);
                learn.addCommand(goback);
                learn.show();
                }

        });

        test.addActionListener(new ActionListener() {
                        private RadioButton[] rb;
                        private ButtonGroup banswers;
                        private Command ok;
                        private Command back;
            public void actionPerformed(ActionEvent evt) {
               final Form f = new Form("Test Section");
                 BoxLayout bl = new BoxLayout(BoxLayout.Y_AXIS);
                 f.setLayout(bl);
               Random  r = new Random();
               Label setline = new Label("Meaning of the word ");
               final Label name = new Label();
                rb = new RadioButton[4];
                for(int i=0;i<4;i++)
                rb[i] = new RadioButton();
                banswers = new ButtonGroup();
                for(int i=0;i<4;i++)
                 banswers.add(rb[i]);
                 createquestion(rb,name,banswers);

                f.addComponent(setline);
                f.addComponent(name);
                for(int i=0;i<4;i++)
                f.addComponent(rb[i]);
                f.show();

                 ok = new Command("Answer"){
                   public void actionPerformed(ActionEvent evt) {
                   System.out.println(banswers.getSelectedIndex()+ " " + qno);

            if(banswers.getSelectedIndex()==-1)
            {
             Dialog d = new Dialog();
             TextArea t = new TextArea("Choose an option before answering");
             t.setEditable(false);
             t.setUIID("Label");
             d.addComponent(t);
             Command[] cmd = new Command[1];
             Command okd = new Command("ok")
             {
             public  void actionPerformed(ActionEvent ae)
             {
             f.show();
             }
             };
             cmd[0]=okd;
             Dialog.show("Error", d, cmd);
            }
            else if(answers[banswers.getSelectedIndex()].equalsIgnoreCase(meaning[qno]))
            {
            score++;
            Dialog d = new Dialog("Score : " + score);
            Command next = new Command("next") {
                public void actionPerformed(ActionEvent evt) {

                     f.repaint();
                     createquestion(rb,name,banswers);
                     f.show();
                    }
                    };
           /* Command exit = new Command("Go back"){
                 public void actionPerformed(ActionEvent evt) {

                    finalcheck();
                    score=0;
                    main.show();
                    }
                    };
             */       Command[] cmds = new Command[1];
                        cmds[0] = next;
                        //cmds[1] = exit;
                        Dialog.show("Correct",d, cmds);

            }
            else
            {
             Dialog d = new Dialog("Score : " + score);

            Command exit = new Command("quit"){
                 public void actionPerformed(ActionEvent evt) {

                     finalcheck();
                     score=0;
                     main.show();

                    }
                    };
                    Command[] cmds = new Command[1];
                        cmds[0] = exit;
                        Dialog.show("Wrong ",d, cmds);
                        main.show();
            }


                   }};
                 back = new Command("Exit"){
                   public void actionPerformed(ActionEvent evt) {
                   finalcheck();
                   score=0;
                   main.show();}};

                 f.addCommand(ok);
                 f.addCommand(back);

                }
        });


         Scores.addActionListener(new ActionListener() {
                        private Form scores;
                        private Label printscores;
            public void actionPerformed(ActionEvent evt) {

                scores = new Form("Scores");
                BorderLayout b = new BorderLayout();
                scores.setLayout(b);
                printscores = new Label();
                Resources res = null;
                        try {
                            res = Resources.open("/theme1.res");
                            Font font = res.getFont("Font 4");
                            printscores.getStyle().setFont(font);

                        } catch (IOException ex) {
                        }

                setscores();
                Command getback = new Command("Go back"){
                public void actionPerformed(ActionEvent ae)
                    {

                    main.show();
                }
                };
                scores.addComponent(BorderLayout.CENTER,printscores);
                scores.show();
                scores.addCommand(getback);
                }

            private void setscores() {

                openRecStore();
                int data = readRecStore();
                if(data == -1 )
                    printscores.setText(" no high scores yet");
                else
                    printscores.setText(" High score : " + data);
                closeRecStore();

            }
        });
        main.addComponent(learns);
        main.addComponent(test);
        main.addComponent(Scores);
        main.addComponent(Rules);
        main.addComponent(about);
        main.addComponent(exit);

        main.show();
            }
        };

        splash.addCommand(splaskok);
        splash.addComponent(splashtext);
        splash.show();
        }
        catch(Exception e)
        {
        }
    }

    public void resumeMainApp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
