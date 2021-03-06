![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)
![](https://img.shields.io/badge/maven-v.3.3-orange.svg)

# Descrição do Desafio :computer:

Criar um projeto de teste Selenium WebDriver e Cucumber, usando Page objects. Preencher o formulário do site http://sampleapp.tricentis.com/101/app.php e validar os campos.

## Casos de testes :bookmark_tabs:

<b>Funcionalidade:</b> Acessar o site Tricentis, preencher o formulario e ver a mensagem de sucesso
O objetivo é realizar uma solicitação de seguro de veiculo<br>

### Usuário 1 :woman: 

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
Quando preencho o campo First Name "Paloma"<br>
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

## Usaário 2 :man:

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

-------------------------------------------------------------------

## Tecnologias utilizadas 
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------

## Como utilizar :bookmark_tabs:
### Pré requisitos
Instalar programas abaixo de acordo com seu sistema operacional.<br>
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador


- Clone do projeto
 ```bash
git clone https://github.com/victoriardspaiva/testeSeleniumTricentis
 ```

- Entrando na pasta do projeto
 ```bash
cd testeSeleniumTricentis
 ```

- Configurando Selenium em seu computador:
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

# Estrutura dos arquivos :file_folder:  

<br>
<pre>
├───.mvn
├───driver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina
├───src
│   └───test
│       ├───java
│       │   └───io
│       │       └───cucumber
│       │           └───victoria
│       │               ├───config
│       |               |      └───Configuração.java   
│       │               ├───img
│       |               |      └───img.jpg
|       |               ├───Home.java
|       |               ├───InsurantData.java
|       |               ├───PriceOption.java
|       |               ├───ProductData.java
|       |               ├───RunCucumberTest.java
|       |               ├───SendQuote.java
|       |               └───VehicleData.java
|       └───resources        
│           └───io
│               └───cucumber
│                   └───victoria
|                       ├───user1.feature
|                       └───user2.feature
|
├───test.bat -- Arquivo para rodar teste no Windows
└───test.sh -- Arquivo para rodar teste no Unix
</pre>

