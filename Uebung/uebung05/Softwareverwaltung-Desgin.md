# Klassen

__Fortbildungsaktivitäten:__ 
    * mehrere versch. [Aktivitäten], [Status] (laufend, beendt etc)
    * beliebig viele können sich {anmelden} 
    * if ([Status] == beendet) {zertifikat vergeben -> Teilnehmer}

__Seminar extends Fortbildungsaktivitäten__
    * Rechnung: [Nr], etc
    * {rechnung erstellt aber noch nicht bezahlt}
    * {änderungen mitteilen -> Teilnehmer}

__SeminarIntern extends Seminar__
    * eigener Status für Firmenseminar -> kein Zertifikat vergben nur Rechnung

__Veranstaltung extends Seminar__
    * if (Veranstalung abgesagt) {absage versenden -> Teilnehmer}

__Seminar-Anbieter__
    * {stornieren -> Aktivitäten}

__Dozent extends Seminar-Anbieter__
    * [attributeBlaBla]
    * [Leiter]: Boolean
    * [Fachgebiet] evtl. eigene Klasse 
    * {Fortbildungsaktivität durchführen} kann von * ausgeführt werden
    Constraints: immer nur ein Leiter

__Teilnehmer__
    * [Name], [Id] etc

__TeilnehmerPrivat extends Teilnehmer__
    * [Privat]
    * {anmelden -> Seminar}
    * {absagen -> Seminar}

__TeilnehmerFirma extends Teilnehmer__
    * [Firma]
    * {als intern buchen -> Seminar} (von mehreren Firmen möglich)
