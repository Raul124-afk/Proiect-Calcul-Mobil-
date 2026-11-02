# Proiect-Calcul-Mobil-# 


# Proiect Calcul Mobil – JobNest

**Tema aleasă: Jobs**

**Membrii echipei: Raul Berinde, Nicu Biriș și Sălnicean Flaviu**

Am ales tema „Jobs” deoarece ni se pare utilă o aplicație care să ajute persoanele aflate în căutarea unui loc de muncă. Aplicația noastră se va numi **JobNest** și va fi dedicată în special ofertelor de muncă remote, adică joburilor care permit lucrul de la distanță.

Vrem să realizăm o aplicație Android în care utilizatorii să poată vedea o listă de oferte de muncă, să caute și să filtreze joburi și să apese pe o ofertă pentru a vedea detaliile: compania, descrierea postului, locația acceptată, salariul (dacă este precizat) și linkul pentru aplicare. Vor exista ecrane pentru lista de joburi, detaliile unei oferte, joburile favorite și setări. Utilizatorul va putea salva oferte direct pe telefon și le va regăsi chiar și după închiderea aplicației. Informațiile despre joburi vor fi preluate dintr-un API extern.

Pentru a îndeplini și cerințe de notare superioară, vrem să adăugăm patru funcționalități: sincronizarea favoritelor în cloud prin Firebase, notificări pentru oferte noi, folosirea opțională a locației telefonului pentru a verifica orientativ ce joburi sunt potrivite pentru regiunea utilizatorului și citirea vocală a descrierilor prin text-to-speech.

**Împărțirea taskurilor**

Am împărțit sarcinile în funcție de părțile principale ale aplicației. Raul Berinde se va ocupa în special de interfață, ecranul cu lista de joburi, căutare și filtrare, navigarea dintre ecrane și citirea vocală a descrierilor prin text-to-speech.

Nicu Biriș se va ocupa de conectarea la API-ul extern pentru preluarea datelor, integrarea Firebase pentru sincronizarea favoritelor în cloud și sistemul de notificări pentru oferte noi.

Sălnicean Flaviu se va ocupa de ecranul cu detaliile unei oferte, salvarea locală a ofertelor favorite pe telefon, ecranul de setări și folosirea opțională a locației telefonului pentru verificarea ofertelor potrivite regiunii.

Vom lucra împreună la verificarea aplicației, corectarea problemelor și prezentarea finală. Fiecare dintre noi va avea taskuri și commit-uri proprii în repository-ul comun de GitHub, iar progresul îl vom urmări prin GitHub Projects.

**API-ul ales: Remotive Remote Jobs API**

https://remotive.com/api/remote-jobs

Acest API oferă anunțuri pentru joburi remote. În aplicație vom menționa Remotive ca sursă și vom păstra linkul către anunțul original.

