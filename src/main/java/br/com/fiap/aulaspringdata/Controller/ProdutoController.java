package br.com.fiap.aulaspringdata.Controller;

import br.com.fiap.aulaspringdata.ProdutoRepository;
import br.com.fiap.aulaspringdata.bean.ProdutoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;
    @GetMapping("/produto/cadastrar")
    public String abrirFormulario(){
        return "form";
    }


    @PostMapping("/produto/cadastrar")
    public String processarForm(ProdutoBean produto, Model model){
        repository.save(produto);
        return "produtoCadastrado";
    }

    @GetMapping("/produto/buscar")
    public String Buscar(){
        return "buscaProd";
    }

    @PostMapping("/produto/buscar")
    public String BuscarProduto(int codigo, Model model){
        Optional<ProdutoBean> produto = repository.findById(codigo);
        model.addAttribute("prod",produto);
        return "listarProd";
    }
}
