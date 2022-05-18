package assigment2;

public class vowel_and_consonent {
	void checkvowel(char a) {
			if(a=='a'|a=='e'|a=='i'|a=='o'|a=='u'|a=='A'|a=='E'|a=='I'|a=='O'|a=='U') {
				System.out.println("its vowel");
			}
			else if(a=='b'|a=='c'|a=='d'|a=='f'|a=='g'|a=='h'|a=='j'|a=='k'|a=='l'|a=='m'|a=='n'|a=='p'|a=='q'|a=='r'|a=='s'|a=='t'|a=='v'|a=='w'|a=='x'|a=='y'|a=='z'|
					a=='B'|a=='C'|a=='D'|a=='F'|a=='G'|a=='H'|a=='J'|a=='K'|a=='L'|a=='M'|a=='N'|a=='O'|a=='P'|a=='Q'|a=='R'|a=='S'|a=='T'|a=='V'|a=='W'|a=='X'|a=='Y'|a=='Z') {
				System.out.println("its consonant");
			}else {
				System.out.println("invalid character");
			}
}
	public static void main(String[] args) {
		vowel_and_consonent later=new vowel_and_consonent();
		later.checkvowel('A');
		later.checkvowel('c');
		later.checkvowel('1');
	}
}
