# Oscript
Eine dynamische, schwach-typisierte, interpretierte Programmiersprache.

Scalas Syntax ist nichts dagegen, Assembler wirkt im Performance-Vergleich wie mit `eval` ausgeführter JavaScript Code und Google und Facebook haben bereits ihre Backends darauf umgestellt.

Lexer, Parser und Interpreter sind in Java und [ANTLR](http://www.antlr.org/) geschrieben. Die Implementierung folgt in vielen Teilen einem (sehr guten) [Tutorial von Bart Kiers](http://bkiers.blogspot.de/2011/03/creating-your-own-programming-language.html), einem [Screencast von Scott Stanchfield](http://javadude.com/articles/antlr3xtut/) und dem obligatorischen Buch des ANTLR Stammvaters [Terence Parr](http://www.amazon.de/Definitive-ANTLR-Reference-Guide-Domain-specific/dp/0978739256/).

## Ausprobieren?
Im Package oscript liegt eine Interpreter Klasse. Die führt das sample.script aus dem Hauptverzeichnis aus, oder nimmt einen Script-Pfad als Kommandozeilenparameter.

##Warum habe ich noch nie was von Oscript gehört?
1. Die US-Waffenexportgesetzte haben das Ausführen Oscript wegen seiner überlegenen Sytax und Geschwindigkeit bisher unter Todesstrafe gestellt.
2. Ich hab am Dienstag angefangen es zu implementieren.

## Wie sieht sie aus?

	//Sprachsyntax: ein bisschen aus Scala, JavaScript, Ruby
	
	//Kommentare: so
	/* So */
	#oder so
	
	//Semikolons: optional
	println("so");
	println("oder so.")
	
	//Klammern: Pflicht. Grund: kein Dangling Else
	if( 42 != (39 + 3)){
		assert(false) 
	} else {
		assert(true)
	}
	
	//Scoping: lexikalisch (=statisch) und verschachtelt, d.h. jeder {}-Block ist ein
	//neuer Scope, der den Inhalt seiner Eltern-Scopes sehen/ändern darf
	öffentlich = "xyz"
	if(true) {
		öffentlich = "abc"
		//Neuer Scope: 
		geheim = 12345 
	}
	assert(öffentlich == "abc")
	//Fehler:
	//println(geheim)
	
	//Listen
	l1 = ["a", "b"]
	l2 = [1,2,3, ["abc", [1.3, -2]]]
	assert(2 in l2)
	assert(["Kuh"] in ["Schaf", ["Kuh"]])
	//Listen konkatenieren:
	assert([1,2] + [3] == [1,2,3])
	assert([2]*3 == [2,2,2])
	assert(size([1,2,3]) == 3)
	assert([1,2,3] - [3] == [1,2])
	
	//Indexzugriff: nullindiziert und multidimensional
	assert(l1[0] == "a")
	assert(l2[3][0] == "abc")
	
	//Strings: mit Doublequotes
	str = "hello world!"
	//Oder Singlequotes
	str = 'string theorie'
	//Escaping: mit Backslash
	println("Hello \"World\"!")
	//Indexzugriffe
	assert("abc"[1] == "b")
	//Konkatenieren
	assert("a"+"b" == "ab")
	//Vervielfachen
	assert("a"*3 == "aaa")
	
	//Funktionen: Call-by-Value
	def timesTwo(x) { x = 2 *x }
	wert = 21
	timesTwo(21)
	assert(wert == 21)
	
	//Funktionen dürfen benutzt werden bevor sie im Quelltext auftauchen (anders als in Python)
	assert(theFuture() == "is here")
	def theFuture() { return "is here" }
	
	
	//Rekursion:
	def fak(n) {
		if(n == 1) 	{ return 1; }
		else 		{ return n * fak(n-1) } 
	}
	assert(fak(5) == 120)
	
	//Gegenseitiger Aufruf
	def a() { return b() }
	def b() { return "it's me!" }
	assert(a() == "it's me!")
	
	//Quicksort: noch etwas umständlich, was fehlt sind map, filter, reduce
	println(quicksort([24, 3.14159, 23,4,1,5,3,213,4,12,3,24,124,325,5,36,673,67,546456,3,354,73265]))
	
	def quicksort(liste) {
		if(size(liste) > 1) {
			pivot = liste[0]
			sides = partition(liste-[pivot], pivot)
			return quicksort(sides[0]) + [pivot] + quicksort(sides[1])
		} else {
			return liste
		}
	}
	
	def partition(liste, middle) {
		smaller = []
		greater = []
		for each (elem <- liste) {
			if(elem < middle) {
				smaller = smaller + [elem]
			} else {
				greater = greater + [elem]
			}
		}
		return [smaller, greater]
	}
	
	
	//For-Schleife: von, bis
	values = []
	for (i <- 1 to 10) {
		values = values + [i]
	}
	assert(size(values) == i)
	
	//For-Each: iterieren über Listen
	values = []
	foreach (elem <- [1,2,3,4,5]) {
		values = values + [elem]	
	}
	assert(size(values) == 5)
	
	//While-Schleife
	fakultät = 1
	i = 1
	while ( i <= 10 ) {
		fakultät = fakultät * i
		i = i + 1
	}
	assert(fakultät == fak(10))
	
	//Vergleichsoperatoren
	assert(3 < 4)
	//Lexikographischer Vergleich
	assert("Alpha" < "Beta")
	assert(5 <= 6)
	assert(9 > 8)
	assert(9 >= 9)
	assert(1 != [2])
	
	//Boolesche Operatoren
	assert(!(1 == 2 || 1 < 0) && (1 in [1,2,3]))
	//Boolesche Literale
	assert(true && !false)
	
	//Aufrufe an das Betriebssystem (Windows: Powershell, ~x: Bash)
	dirs = os { ls }
	println(dirs);
	
## Was fehlt?
* Natives JSON und REST-Aufrufe
* Objektorientierung
* Closures und Lambdas
* Bibliotheken (-Anbindung)
* Eine Facebook-Fanpage
* Weltfriede