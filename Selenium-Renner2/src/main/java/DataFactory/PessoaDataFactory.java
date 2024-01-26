package DataFactory;

import Model.PessoaModel;
import net.datafaker.Faker;

public class PessoaDataFactory {
    private static Faker faker = new Faker();

    private static PessoaModel novaPessoa(){
        PessoaModel pessoa = new PessoaModel();
        pessoa.setNome(faker.name().firstName().replaceAll("[^a-zA-Z0-9 ]", ""));
        pessoa.setSobrenome(faker.name().lastName().replaceAll("[^a-zA-Z0-9 ]", ""));
        pessoa.setEmail(pessoa.getNome().replaceAll("[^a-zA-Z0-9]", "") + "@" + faker.internet().domainName());
        pessoa.setSenha("Senha1234");
        pessoa.setEmpresa(faker.company().name());
        pessoa.setEndereco("rua 1");
        pessoa.setEstado(faker.country().capital().replaceAll("[^a-zA-Z0-9]", ""));
        pessoa.setCidade("Varginha");
        pessoa.setCep(faker.address().zipCode());
        pessoa.setNumeroCel(faker.phoneNumber().cellPhone());
        return pessoa;
    }

    public static PessoaModel pessoaValida(){
        return novaPessoa();
    }
}
