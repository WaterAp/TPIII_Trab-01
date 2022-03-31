package br.edu.univas.main;

import br.edu.univas.vo.*;
import java.util.*;

public class StartApp {

	static ArrayList<Titulo> titulos = new ArrayList<Titulo>();
	static ArrayList<Player> players = new ArrayList<Player>();
	static Scanner ler = new Scanner(System.in);
	static int  idGlobal = 0;
	static boolean searchMode = false, searchMode2;
	
	public static int readInteger() {
		int value = ler.nextInt();
		ler.nextLine();
		return value;
	}
	
	public static void main(String[] args) {
		
	
		int option;
		boolean control = true;
		
		do {
			
			menu1();
			option = readInteger();
			switch (option) {
			
				case 1:
					if (!titulos.isEmpty() &&  !players.isEmpty()) {
						buscar();
						
					} else {
						System.out.println("Voc� n�o pode buscar o que assistir com cat�logo de t�tulos e streaming vazios!!!\n\n");
						
					}
					break;
				
				case 2:
					
					System.out.println("\n");
					addPlayer();
					break;
					
				case 3:
					//ADD TITULO
					if (!players.isEmpty()) {
						System.out.println("\n");
						addTitle();
						
					} else {
						System.out.println("Voc� deve adicionar pelo menos 1 streaming(player) antes come�ar a adicionar t�tulos... \n\n");
						
					}
					break;
				
				case 4:
					System.out.println("Espero ter ajudado a decidir o que assisitir! Tchau!!! |;^D ");
					control = false;
					break;
					
				default:
					System.out.println("Op��o invalida, tente novamente!!!");
					
					break;
		
			}	
			
		} while(control);
		
		ler.close();
	}

	public static void menu1() {
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("          -->   Menu de configura��o  <--             \n");
		System.out.println("1- Buscar o que Assistir.          ");
		System.out.println("2- Adicionar streaming(Player).    ");
		System.out.println("3- Adicionar T�tulo.               ");
		System.out.println("4- Sair                            ");
		System.out.println("Escolha uma op��o.                 ");
	}

	public static void menu2() {
		
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("     --> Menu de adi��o de elenco ao t�tulo <--             \n");
		if(searchMode)  System.out.println("1- Adicionar ator ao elenco para busca.   ");System.out.println("1- Adicionar ator ao elenco.      							  ");
		System.out.println("2- Finalizar adi��o.               							  ");
		System.out.println("Escolha uma op��o.                 							  ");
	}
	
	public static void menu3() {
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("     --> Menu de adi��o de g�nero ao t�tulo <--             \n");
		if(searchMode)  System.out.println("1- Adicionar um genero ao t�tulo para busca.   ");System.out.println("1- Adicionar um genero ao t�tulo.  							  ");
		System.out.println("2- Finalizar adi��o.               							  ");
		System.out.println("Escolha uma op��o.                 							  ");
	}
	
	public static void menu4() {
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("      --> Menu de adi��o de t�tulo ao streaming <--         \n");
		if(searchMode)System.out.println("1- Adicionar t�tulo a um streaming para busca.                           ");System.out.println("1- Adicionar t�tulo a um streaming.                           ");
		System.out.println("2- Finalizar atribui��o.                                      ");
		System.out.println("Escolha uma op��o.                                            ");
	}
	
	public static void menu5() {
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("               --> Menu de busca <--         \n               ");
		System.out.println("1- Realizar sugest�es com base em filtros personalizados.     ");
		System.out.println("2- Realizar sugest�es com base no g�nero do filme.            ");
		System.out.println("3- Realizar sugest�o aleat�ria                                ");
		System.out.println("4- Listar todos t�tulos cadastrados.                          ");
		System.out.println("9- Voltar ao menu de configura��o.                            ");
		System.out.println("Escolha uma op��o.                                            ");
		
		
	}
	
	public static void menu6() {
		System.out.println("Buscando...                     \n");
		System.out.println("1- Buscar pelo  tipo.             ");
		System.out.println("2- Buscar pelo  nome do t�tulo.   ");
		System.out.println("3- Buscar por g�nero.             ");
		System.out.println("4- Buscar t�tulo pelo diretor.    ");
		System.out.println("5- Buscar pela classifica��o indicativa  ");
		System.out.println("6- Buscar streaming               ");
		System.out.println("Escolha um op��o.                 ");
	}
	
	public static void addPlayer() {
		searchMode = false;
		
		Player p1 = new Player();
		String name;
		String url;
		
		//Player
		System.out.println("           #############################      			  	  ");
		System.out.println("           ##### WhatToWatchHelper #####  	   			 	  ");
		System.out.println("           #############################      		\n\n	  ");
		System.out.println("            -->   Adi��o de player   <--         \n               ");
		
		System.out.println("Muito bem! qual nome do streaming deseja cadastrar em nosso app de ajuda? ");
		name = ler.nextLine(); 
		p1.setNome(name);
		
		System.out.println("Agora, digite a url do site desse streaming: ");
		url = ler.nextLine();	
		p1.setSite(url);
		
		if (players.isEmpty()) {
			
			players.add(p1);
			System.out.println("Streaming foi cadastrado com sucesso!!!\n\n");
			
		}  else if (players.contains(p1)) {
			
			System.out.println("N�o foi possivel adicionar pois esse streaming j� est� cadastrado!!!\n\n");
			
		} else {
			
			players.add(p1);
			System.out.println("Streaming foi cadastrado com sucesso!!!\n\n");
			
		}

	}
	
	public static void addTitle() {
		
		Titulo t1 = new  Titulo();	
		boolean movieOrSeries; 
		int ageRating;
		String ttl;
		String diretor;
		String descricao;
		ArrayList<String> elencoToSet;
		ArrayList<String> generoToSet;
		ArrayList<Player> streamingToSet;
		
		System.out.println("Vamos definir se � um filme ou uma s�rie... \n");
		movieOrSeries = knowMovieOrSeries();
		
		System.out.println("Muito bem! agora defina  nome que ser� exibido para esse t�tulo:                       Ex: O Poderoso Chef�o.");
		ttl = ler.nextLine();
		
		System.out.println("Agora defina Classifica��o Indicativa do T�tulo:                         Ex: 0 para livres, 12, 14, 16 ou  18");
		ageRating = readInteger();
		
		System.out.println("Agora informe o diretor do T�tulo: ");
		diretor = ler.nextLine();
		
		System.out.println("\nMuito bem, agora vamos adicionar o elenco do t�tulo... \n ");
		elencoToSet = addElenco();
		
		System.out.println("\nAgora vamos adicionar g�neros deste t�tulo... \n");
		generoToSet = addGeneros();
		
		System.out.println("Muito bem, agora vamos definir em quais Streamings esse t�tulo est�... \n");
		streamingToSet  =  addPlayerToTtl();
		
		System.out.println("Por fim, adicione uma descri��o ao t�tulo: ");
		descricao =  ler.nextLine();
		
		t1.setTipo(movieOrSeries);
		t1.setTitulo(ttl);
		t1.setAgeRating(ageRating);
		t1.setDiretor(diretor);
		t1.setElenco(elencoToSet);
		t1.setGenero(generoToSet);
		t1.setStreamings(streamingToSet);
		t1.setDescricao(descricao);
		t1.setId(idGlobal);
		idGlobal++;
		
		titulos.add(t1);
		System.out.println("Novo t�tulo adicionado!!!\n\n");
		
	}
	
	public static boolean knowMovieOrSeries() {
		
		String  info, filme = "filme", serie = "serie";
		boolean control = true;
		
		if(searchMode) {  
			System.out.println("O t�tulo que deseja buscar � um 'Filme' ou uma 'S�rie'? ");
			
		} else {
			System.out.println("O t�tulo que deseja adicionar � um 'Filme' ou uma 'S�rie'? ");
			
		}
		System.out.println("Obs: digite 'filme' caso seja um filme ou digite 'serie' caso seja uma s�rie.");
		do {
			info = ler.nextLine();
			if(info.equalsIgnoreCase(filme)) {
				System.out.println("Ok... t�tulo definido como Filme!!!");
				control = false;
				return true;
				
				
			} else if (info.equalsIgnoreCase(serie)) {
				System.out.println("Ok... t�tulo definido como S�rie!!!\n\n");
				control = false;
				return false;
				
			} else {
				System.out.println("Informa��o n�o corresponde, tente novamente!!!");
				
			}
			
		} while (control);
		return true;
		
	}
	
	public static ArrayList<String> addElenco() {
		
		ArrayList<String> elenco = new ArrayList<String>();
		String ator;
		boolean control = true;
		int option, qtd = 0;
		
		do {
			menu2();
			option = readInteger();
			switch (option) {
			
				case 1:
					if (searchMode)System.out.println("Escreva o nome do ator que desejada adicionar ao elenco para buscarmos: "); System.out.println("Escreva o nome do ator que desejada adicionar ao elenco: ");
					ator = ler.nextLine();
					
					if (ator.equals(null) || ator.equals("")) {
						
						System.out.println("Esse nome n�o � valido tente novamente!!! ");
						
					} else {
						
						elenco.add(ator);
						if(searchMode)  System.out.println("Ator adicionado a busca!"); System.out.println("Ator adicionado! \n");
						qtd++;
						
					}
					break;
				
				case 2:
					if (qtd == 0) {
						
						System.out.println("Voc� deve adicionar pelo menos 1 ator ao elenco, tente novamente!!!");
						
					} else {
						
						control = false;
						System.out.println("Elenco finalizado!!!\n");
						
					}
					
					break;
					
				default:
					System.out.println("Op��o invalida, tente novamente!!!");
					
					break;
			
			}
			
		} while (control);
		
		return elenco;
	}
	
	public static ArrayList<String> addGeneros() {
		
		ArrayList<String> thisTtl = new ArrayList<String>();
		boolean control =  true;
		int option, qtd =  0;
		String genero;
		
		do {
			menu3();
			option= readInteger();
			
			switch (option)  {
				
				case 1:
					
					if (searchMode)System.out.println("Escreva o g�nero que deseja adicionar para busca:   Ex: A��o, Terror, Fic��o cient�fica"); System.out.println("Escreva o g�nero que deseja adicionar para o t�tulo:   Ex: A��o, Terror, Fic��o cient�fica");
					genero= ler.nextLine();
					
					if (genero.equals(null) || genero.equals("")) {
						
						System.out.println("Esse g�nero n�o � valido tente novamente!!! ");
						
					} else {
						
						thisTtl.add(genero);
						System.out.println("G�nero atribuido ao  t�tulo!!!\n");
						qtd++;
						
					}
					
					break;
					
				case 2:
					
					if (qtd == 0) {
						
						if (searchMode)System.out.println("Voc� deve adicionar pelo menos 1 g�nero para busca, tente novamente!!!");System.out.println("Voc� deve adicionar pelo menos 1 g�nero ao t�tulo, tente novamente!!!");
						
					} else {
						
						control = false;
						System.out.println("Sele��o de g�nero para t�tulo finalizada!!!\n\n");
						
					}
					
					break;
					
				default:
					
					System.out.println("Op��o invalida, tente novamente!!!");
					
					break;
			
			}
			
		}while (control);
		
		return thisTtl;
	}
	
	public static ArrayList<Player> addPlayerToTtl() {
		
		ArrayList<Player> plyrsThisTtl = new ArrayList<Player>();
		boolean control =  true;
		int option, qtd  = 0;
		Player itemSearch = new Player();
		Player parameter = new Player();
		
		do {
			menu4();
			option = readInteger();

			switch (option) {
				
			case 1:
				
				if(searchMode);System.out.println("Vamos fazer uma busca do streaming em nosso cat�logo de players antes de atribuir o t�tulo a ele, para isso...\n ");
				if(searchMode)System.out.println("Digite o nome do streaming na qual voc� quer colocar o t�tulo para busca: ");System.out.println("Digite o nome do streaming na qual voc� quer colocar o t�tulo: ");
				itemSearch.setNome(ler.nextLine());
				System.out.println("Agora a url do streaming: ");
				itemSearch.setSite(ler.nextLine());
				
				boolean found = false;
				for(int i =  0;i <  players.size();i++) {
					
					parameter = players.get(i);
					if(itemSearch.equals(parameter)) {
						
						plyrsThisTtl.add(players.get(i));
						
						if(searchMode)System.out.println("T�tulo adicionado ao streaming "+ parameter.getNome() + " para busca\n");System.out.println("T�tulo adicionado ao streaming "+ parameter.getNome() + "\n");
						found = true;
						qtd++;
						break;
					
					} 
					
				}
				
				if(!found) {
					
					System.out.println("O streaming n�o foi encontrado, tente  realizar a busca novamente ou tente adicionar em outro...");
					
				}
				
				break;
				
			case 2:
				
				if (qtd == 0) {
					
					System.out.println("Voc� deve atribuir o t�tulo a pelo menos 1 streaming, tente novamente!!!");
					
				} else {
					
					control = false;
					System.out.println("Atribui��o de t�tulo ao streaming finalizada!!!\n");
					
				}
				
				
				
				break;
				
			default:
				
				System.out.println("Op��o invalida, tente novamente!!!");
				
				break;
			
			
			}
			
			
		}while(control);
		
		return  plyrsThisTtl;
	}
	
	public static  void buscar() {
		
		searchMode = true;
		
		ArrayList<Titulo> printList = new ArrayList<Titulo>();
		Random  random = new Random();
		boolean control = true;
		int option;
		
		do  {
			
			menu5();
			option = readInteger();
			
			switch (option) {
				
				case  1:
					printList.clear();
					searchMode2 = true;
					searchingWithFilters(printList);
					
					if(!printList.isEmpty()) {
						System.out.println("T�tulos encontrados na busca: ");
						for (int i =  0;i < printList.size();i++)  {
							System.out.println(printList.get(i));
							System.out.println();
							
						}
						
						
					} else {
						
						System.out.println("Desculpa! mas n�o achamos o(s) t�tulo(s) desejado(s), tente novamente... \n");
						
					}
					
					break;
				case 2:
					printList.clear();
					searchMode2 = false;
					searchingWithFilters(printList);
					
					if(!printList.isEmpty()) {
						System.out.println("T�tulos encontrados na busca: ");
						for (int i =  0;i < printList.size();i++)  {
							System.out.println(printList.get(i));
							System.out.println();
							
						}
						
						
					} else {
						
						System.out.println("Desculpa! mas n�o achamos t�tulos com o g�nero desejado, tente novamente... \n");
						
					}
					
					
					break;
				case 3:
					System.out.println("A nossa sugest�o aleat�ria vai para:\n");
					
					Titulo t2= new Titulo();
					
					int index= random.nextInt(titulos.size());
					t2 = titulos.get(index);
					
					System.out.println(t2 + " \n\n");
					
					break;
					
				case 4:
					System.out.println("Listando todos t�tulos cadastrados...\n");
					
					for(int i = 0;i <  titulos.size();i++) {
						System.out.println(titulos.get(i).toString());
						System.out.println("\n");
					}
					
					break;
					
				case 9:
					
					System.out.println("Voltando ao menu de configura��o... \n\n");
					control = false;
					
					break;
				default:
					System.out.println("Op��o invalida, tente novamente!!!");
				break;
			}
		} while (control);
	}

	public static ArrayList<Titulo> searchingWithFilters(ArrayList<Titulo> printList) {
		
		boolean control = true, tipo;
		int option1, age;
		String aux;
		Player  selectedPlyr  = new Player();
		
		
		do {
			
			if(searchMode2) {
				menu6();
				option1 = readInteger();
				
			} else {
				System.out.println("Buscando por g�nero... \n");
				option1 = 3;
			}
			
			switch (option1) {
				case 1:
					tipo = knowMovieOrSeries();
					
					System.out.println("Realizando a busca...\n");
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).isTipo() ==  tipo) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					break;
				case 2:
					System.out.println("Digite o nome do t�tulo: ");
					aux = ler.nextLine();
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).getTitulo().equalsIgnoreCase(aux)) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					break;
				case 3:
					System.out.println("Digite o g�nero: ");
					aux = ler.nextLine();
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).getGenero().contains(aux)) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					break;
				case 4:
					System.out.println("Digite o nome do diretor: ");
					aux = ler.nextLine();
					
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).getDiretor().equalsIgnoreCase(aux)) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					break;
				case 5:
					System.out.println("Digite a classifica��o indicativa desejada: ");
					age = readInteger();
					
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).getAgeRating() == age) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					
					break;
				case 6:
					System.out.println("Digite o nome do streaming: ");
					selectedPlyr.setNome(ler.nextLine());
					
					System.out.println("Agora digite a url dele: ");
					selectedPlyr.setSite(ler.nextLine());
					
					for(int i = 0;i < titulos.size();i++) {
						if(titulos.get(i).getStreamings().contains(selectedPlyr)) {
							printList.add(titulos.get(i));
							
						}
					}
					
					control = false;
					
					
					break;
				default:
					System.out.println("Op��o invalida, tente novamente!!!");
					break;
			}
			
		} while (control);
		
		return null;
		
	}
	
}
