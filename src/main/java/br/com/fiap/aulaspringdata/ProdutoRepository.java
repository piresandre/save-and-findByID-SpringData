package br.com.fiap.aulaspringdata;

import br.com.fiap.aulaspringdata.bean.ProdutoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<ProdutoBean,Integer> {

}
