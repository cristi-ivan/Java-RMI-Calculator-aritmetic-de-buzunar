Java-RMI-Calculator-aritmetic-de-buzunar
========================================
  Aplicatie realizata folosind Java si RMI ce implementeaza complet functionalitatea unui calculator aritmetic de buzunar.
  
## Operatii:
* adunare  
* scadere  
* inmultire
* impartire
* inversare
* ridicare la putere
* factorial
* radacina patrata.

## Stare:
  Calculatorul mentine starea sa (rezultatul curent) pentru fiecare operatie pe care o executa. Initial, rezultatul curent este zero si acesta este afectat de fiecare operatie invocata de utilizator (inclusiv de operatiile care lucreaza cu memoria—vezi mai jos). In cazul an o operatie genereaza o eroare (cum ar fi ampartirea la zero), rezultatul curent va reprezenta acest lucru printr-o valoare non-numerica.
  
## Memorie

  Se considera ca modelul implementat ofera memorie, asupra careia se pot face urmatoarele operatii: 
  
- adunare (rezultatul curent se adauga la valoarea memoriei)
- scadere (rezultatul curent se scade din valoarea memoriei)
- stocare (rezultatul curent devine valoarea memoriei)
- citire (valoarea memoriei devine operandul curent)
- stergere (valoarea memoriei este (re)initializata cu 0)

## Informartii suplimentare

  Aplicatia permite utilizatorului sa aleaga operatii pe care ii va invoca pe server, afisand rezultatele (sau eventualele erori). Proiectul implementeaza un meniu simplu (in mod text) ce afiseaza toate optiunile disponibile iar utilizatorul poate selecta o operatie.
