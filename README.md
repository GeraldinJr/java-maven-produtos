### Problema

Seu Roberto é um comerciante e que precisa de um sistema para gerenciar os produtos de seu armazém. 

Neste programa console, solicite a quantidade de produtos a cadastrar, depois cadastre estes produtos em um array list em memória. 

Dentro do mesmo programa faça um item de menu que liste os produtos cadastrados e o valor total da soma de todos os produtos.

### Gerando o projeto

``` sh
mvn archetype:generate                                  \
  -DinteractiveMode=false                               \
  -DarchetypeArtifactId=maven-archetype-quickstart      \
  -DarchetypeVersion=1.4                                \
  -DgroupId=br.com.produtos                             \
  -DartifactId=produtos
```

### Dependencias adicionais

Adicionar ao arquivo `pom.xml`

``` xml

<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>provided</scope>
</dependency>


```

### Configuração do manifest

``` xml

<plugin>
  <artifactId>maven-jar-plugin</artifactId>
  <version>3.0.2</version>
  <configuration>
    <archive>
      <manifest>
        <addClasspath>true</addClasspath>
        <!-- here we specify that we want to use the main method within the App class -->
        <mainClass>br.com.produtos.App</mainClass>
      </manifest>
    </archive>
  </configuration>
</plugin>

```

### Build da aplicação

``` sh

mvn validate # validar se o projeto está correto e todas as informações necessárias estão disponíveis
mvn compile # compila o código fonte da aplicação
mvn package # gera o jar da aplicação, rodando os testes de unidade
mvn clean # limpa a pasta target
mvn clean compile package -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true # compila e gera o pacote sem rodar os testes
mvn install # instala o pacote no repositório local, para uso como dependência em outros projetos localmente
mvn deploy #feito em um ambiente de integração ou lançamento, copia o pacote final para o repositório remoto para compartilhamento com outros desenvolvedores e projetos.

```

### Executar

``` sh

mvn exec:java -Dexec.mainClass="br.com.produto.App" # roda a aplicação apontando para a classe principal

```

### Executar jar ou war

``` sh

java -jar target/produto-1.0-SNAPSHOT.jar # roda binário do java compilado
java -jar target/produto-1.0-SNAPSHOT.war # roda binário do java compilado

```
