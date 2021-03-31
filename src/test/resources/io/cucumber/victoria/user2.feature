#language:pt
Funcionalidade: Acessar o site Tricentis, preencher o formulario e ver a mensagem de sucesso
	O objetivo é realizar uma solicitação de seguro de veiculo

	Cenario: Entrar no site de Tricentis
		Dado que estou no site da Tricentis

	Cenario: Preencher o formulario na aba Enter Vehicle Data e pressionar next
		Quando preencho o campo Make "Porsche"
		E preencho o campo Model "Moped"
		E preencho o campo Cylinder Capacity "250"
		E preencho o campo Engine Performance "180"
		E preencho o campo Date of Manufacture "15/05/2020"
		E preencho o campo Number of Seats1 "3"
		E preencho o campo Right Hand Drive "Ye"
		E preencho o campo Number of Seats2 "1"
		E preencho o campo Fuel Type "Electric Power"
		E preencho o campo Payload "50"
	  E preencho o campo Total Weight "200"
		E preencho o campo List Price "100000"
		E preencho o campo License Plate Number "FFF0000"
		E preencho o campo Annual Mileage "2500" e clico no botao next

	Cenario: Preencher o formulario na aba Enter Insurant Data e pressionar next
		Quando preencho o campo First Name "Jose"
		E preencho o campo Last Name "Santana"
		E preencho o campo Date of Birth "20/02/1991"
		E preencho o campo Gender "Male"
		E preencho o campo Street Address "Rua x"
		E preencho o campo Country "Brazil"
		E preencho o campo Zip Code "8888888"
		E preencho o campo City "São Paulo"
    #tirar o if e por um for ou n, mas é acumutivo
		E preencho o campo Occupation "Farmer"
		E preencho o campo Hobbies "Cliff Diving" 
		E preencho o campo Website "www.teste2.com"
		E preencho o campo Picture /pasta/foto e clico no botao next

	Cenario: Preencher o formulario na aba Enter Product Data e pressionar next
		Quando preencho o campo Start Date "30/03/2021"
		E preencho o campo Insurance Sum "20.000.000,00"
		E preencho o campo Merit Rating "Malus 10"
		E preencho o campo Damage Insurance "No Coverage"
    #outro checkbox
		E preencho o campo Optional Products "Legal Defense Insurance"
		E preencho o campo Courtesy Car "Yes" e clico no botao next

	Cenario: Preencher o formulario na aba Select Price Option e pressionar next
		Quando preencho o campo Select Option "Platinum" e clico no botao next

	Cenario: Preencher o formulario na aba Send Quote e pressionar send
		Quando preencho o campo E-Mail "jose@teste.com"
		E preencho o campo Phone "11111111"
		E preencho o campo Username "joseteste"
		E preencho o campo Password "Js54321"
		E preencho o campo Confirm Password "Js54321"
		E preencho o campo Comments "teste de comentário2"
		E clico no botao Send
		Entao verifico a mensagem "Sending e-mail success!" 


