# Descrição do Desafio

Criar um projeto de teste Selenium WebDriver e Cucumber preenchendo o formulário do site http://sampleapp.tricentis.com/101/app.php e validando os campos.

## Casos de testes

<b>Funcionalidade:</b> Acessar o site Tricentis, preencher o formulario e ver a mensagem de sucesso
O objetivo é realizar uma solicitação de seguro de veiculo<br>

### Usuário 1

<b>Cenario:</b> Entrar no site de Tricentis<br>
Dado que estou no site da Tricentis<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Vehicle Data e pressionar next<br>
Quando preencho o campo Make "Audi"<br>
E preencho o campo Model "Scooter"<br>
E preencho o campo Cylinder Capacity "150"<br>
E preencho o campo Engine Performance "300"<br>
E preencho o campo Date of Manufacture "10/02/2018"<br>
E preencho o campo Number of Seats1 "2"<br>
E preencho o campo Right Hand Drive "No"<br>
E preencho o campo Number of Seats2 "2"<br>
E preencho o campo Fuel Type "Diesel"<br>
E preencho o campo Payload "30"<br>
E preencho o campo Total Weight "150"<br>
E preencho o campo List Price "50000"<br>
E preencho o campo License Plate Number "AAA5555"<br>
E preencho o campo Annual Mileage "1000" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Insurant Data e pressionar next<br>
Quando preencho o campo First Name "Fulana"<br>
E preencho o campo Last Name "Silva"<br>
E preencho o campo Date of Birth "10/10/1980"<br>
E preencho o campo Gender "Female"<br>
E preencho o campo Street Address "Rua Tal"<br>
E preencho o campo Country "Brazil"<br>
E preencho o campo Zip Code "99999999"<br>
E preencho o campo City "Recife"<br>
E preencho o campo Occupation "Public Official"<br>
E preencho o campo Hobbies "Skydiving"<br> 
E preencho o campo Website "www.teste.com"<br>
E preencho o campo Picture /pasta/foto e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Product Data e pressionar next<br>
Quando preencho o campo Start Date "05/01/2022"<br>
E preencho o campo Insurance Sum "7.000.000,00"<br>
E preencho o campo Merit Rating "Bonus 3"<br>
E preencho o campo Damage Insurance "Partial Coverage"<br>
E preencho o campo Optional Products "Euro Protection"<br>
E preencho o campo Courtesy Car "No" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Select Price Option e pressionar next<br>
Quando preencho o campo Select Option "Silver" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Send Quote e pressionar send<br>
Quando preencho o campo E-Mail "fulana@teste.com"<br>
E preencho o campo Phone "99999999"<br>
E preencho o campo Username "fulanasilva"<br>
E preencho o campo Password "Fs12345"<br>
E preencho o campo Confirm Password "Fs12345"<br>
E preencho o campo Comments "teste de comentário"<br>
E clico no botao Send<br>
Entao verifico a mensagem "Sending e-mail success!"<br> 

## Usaário 2

<b>Cenario:</b> Entrar no site de Tricentis<br>
Dado que estou no site da Tricentis<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Vehicle Data e pressionar next<br>
Quando preencho o campo Make "Porsche"<br>
E preencho o campo Model "Moped"<br>
E preencho o campo Cylinder Capacity "250"<br>
E preencho o campo Engine Performance "180"<br>
E preencho o campo Date of Manufacture "10/02/2018"<br>
E preencho o campo Number of Seats1 "3"<br>
E preencho o campo Right Hand Drive "Ye"<br>
E preencho o campo Number of Seats2 "1"<br>
E preencho o campo Fuel Type "Electric Power"<br>
E preencho o campo Payload "50"<br>
E preencho o campo Total Weight "200"<br>
E preencho o campo List Price "100000"<br>
E preencho o campo License Plate Number "FFF0000"<br>
E preencho o campo Annual Mileage "2500" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Insurant Data e pressionar next<br>
Quando preencho o campo First Name "Jose"<br>
E preencho o campo Last Name "Santana"<br>
E preencho o campo Date of Birth "10/10/1980"<br>
E preencho o campo Gender "Male"<br>
E preencho o campo Street Address "Rua x"<br>
E preencho o campo Country "Brazil"<br>
E preencho o campo Zip Code "8888888"<br>
E preencho o campo City "São Paulo"<br>
E preencho o campo Occupation "Farmer"<br>
E preencho o campo Hobbies "Other" <br>
E preencho o campo Website "www.teste2.com"<br>
E preencho o campo Picture /pasta/foto e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Enter Product Data e pressionar next<br>
Quando preencho o campo Start Date "05/01/2022"<br>
E preencho o campo Insurance Sum "20.000.000,00"<br>
E preencho o campo Merit Rating "Malus 10"<br>
E preencho o campo Damage Insurance "No Coverage"<br>
E preencho o campo Optional Products "Legal Defense Insurance"<br>
E preencho o campo Courtesy Car "Yes" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Select Price Option e pressionar next<br>
Quando preencho o campo Select Option "Platinum" e clico no botao next<br>

<b>Cenario:</b> Preencher o formulario na aba Send Quote e pressionar send<br>
Quando preencho o campo E-Mail "jose@teste.com"<br>
E preencho o campo Phone "11111111"<br>
E preencho o campo Username "joseteste"<br>
E preencho o campo Password "Js54321"<br>
E preencho o campo Confirm Password "Js54321"<br>
E preencho o campo Comments "teste de comentário2"<br>
E clico no botao Send<br>
Entao verifico a mensagem "Sending e-mail success!" <br>




