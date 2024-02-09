
   /* Query all columns (attributes) for every row in the CITY table.

    The CITY table is described as follows:

    SELECT * FROM CITY

            6 Rotterdam NLD Zuid-Holland 593321
            3878 Scottsdale USA Arizona 202705
            3965 Corona USA California 124966
            3973 Concord USA California 121780
            3977 Cedar Rapids USA Iowa 120758
            3982 Coral Springs USA Florida 117549
            4054 Fairfield USA California 92256
            4058 Boulder USA Colorado 91238
            4061 Fall River USA Massachusetts 90555*/

   /*
   Query all columns for a city in CITY with the ID 1661.

    The CITY table is described as follows:

    SELECT *
    FROM CITY
    WHERE ID=1661

    1661 Sayama JPN Saitama 162472

    */

   /*
   Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.

    The CITY table is described as follows:

    SELECT *
    FROM CITY
    WHERE COUNTRYCODE='JPN'

    1613 Neyagawa JPN Osaka 257315
    1630 Ageo JPN Saitama 209442
    1661 Sayama JPN Saitama 162472
    1681 Omuta JPN Fukuoka 142889
    1739 Tokuyama JPN Yamaguchi 107078
    */

   /*
   Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.

    SELECT NAME
    FROM CITY
    WHERE COUNTRYCODE='JPN'

    Neyagawa
    Ageo
    Sayama
    Omuta
    Tokuyama

    */

   /*
   Query a list of CITY and STATE from the STATION table.

   SELECT CITY, STATE FROM STATION;

    Acme LA
    Addison MI
    Agency MO
    Aguanga CA
    Alanson MI
    Alba MI
    Albany CA
    Albion IN
    Algonac MI
    Aliso Viejo CA
    Allerton IA
    Alpine AR
    Alton MO
    Amazonia MO
    Amo IN
    Andersonville GA
    Andover CT
    Anthony KS
    Archie MO
    Arispe IA {-truncated-}
    */

   /*
   Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.

    select
    distinct CITY
    from STATION
    where ID%2 = 0

    Aguanga
    Alba
    Albany
    Amo
    Andersonville
    Archie
    Athens
    Atlantic Mine
    Bainbridge
    Baker
    Bass Harbor
    Bayville
    Beaufort
    Bellevue
    Benedict
    Bennington
    Bentonville
    Biggsville
    Bison
    Bono {-truncated-}
    */