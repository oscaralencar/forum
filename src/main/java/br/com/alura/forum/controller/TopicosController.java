package br.com.alura.forum.controller;

import br.com.alura.forum.controller.TopicoDto.TopicoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {


        return TopicoDto.converter(Arrays.asList());
    }
}
