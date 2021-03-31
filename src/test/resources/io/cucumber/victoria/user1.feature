@ignore
#language:pt
Funcionalidade: Acessar o site Tricentis, preencher o formulario e ver a mensagem de sucesso
	O objetivo é realizar uma solicitação de seguro de veiculo

	Cenario: Entrar no site de Tricentis
		Dado que estou no site da Tricentis

	Cenario: Preencher o formulario na aba Enter Vehicle Data e pressionar next
		Quando preencho o campo Make "Audi"
		E preencho o campo Model "Scooter"
		E preencho o campo Cylinder Capacity "150"
		E preencho o campo Engine Performance "300"
		E preencho o campo Date of Manufacture "10/02/2018"
		E preencho o campo Number of Seats1 "2"
		E preencho o campo Right Hand Drive "No"
		E preencho o campo Number of Seats2 "2"
		E preencho o campo Fuel Type "Diesel"
		E preencho o campo Payload "30"
	  E preencho o campo Total Weight "150"
		E preencho o campo List Price "50000"
		E preencho o campo License Plate Number "AAA5555"
		E preencho o campo Annual Mileage "1000" e clico no botao next

	Cenario: Preencher o formulario na aba Enter Insurant Data e pressionar next
		Quando preencho o campo First Name "Fulana"
		E preencho o campo Last Name "Silva"
		E preencho o campo Date of Birth "10/10/1980"
		E preencho o campo Gender "Female"
		E preencho o campo Street Address "Rua Tal"
		E preencho o campo Country "Brazil"
		E preencho o campo Zip Code "99999999"
		E preencho o campo City "Recife"
		E preencho o campo Occupation "Public Official"
		E preencho o campo Hobbies "Skydiving" 
		E preencho o campo Website "www.teste.com"
		E preencho o campo Picture /pasta/foto e clico no botao next

	Cenario: Preencher o formulario na aba Enter Product Data e pressionar next
		Quando preencho o campo Start Date "05/01/2021"
		E preencho o campo Insurance Sum "7.000.000,00"
		E preencho o campo Merit Rating "Bonus 3"
		E preencho o campo Damage Insurance "Partial Coverage"
		E preencho o campo Optional Products "Euro Protection"
		E preencho o campo Courtesy Car "No" e clico no botao next

	Cenario: Preencher o formulario na aba Select Price Option e pressionar next
		Quando preencho o campo Select Option "Silver" e clico no botao next

	Cenario: Preencher o formulario na aba Send Quote e pressionar send
		Quando preencho o campo E-Mail "fulana@teste.com"
		E preencho o campo Phone "99999999"
		E preencho o campo Username "fulanasilva"
		E preencho o campo Password "Fs12345"
		E preencho o campo Confirm Password "Fs12345"
		E preencho o campo Comments "teste de comentário"
		E clico no botao Send
		Entao verifico a mensagem "Sending e-mail success!" 


