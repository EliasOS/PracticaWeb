package org.ecollfelipe.ecoparametros.controller;

import org.ecollfelipe.ecoparametros.model.Colecciones;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("prueba") //Comprobar q esta mal
public class Controlador extends Colecciones {
    /*@GetMapping("hola")
    public String holaMundo(){
        System.out.println("holamundo");
        return "holamundo";
    }*/
    @GetMapping("formulario")
    public String devuelveFormulario(){
        System.out.println("dentro del devuelveFormulario");
        return "formulario";
    }

    @GetMapping("devuelveFormularioObjeto")
    public String holamundo(Model modelo, DatosFormulario datosFormulario) {
        System.out.println("Hola Mundo");
        modelo.addAttribute("datosFormulario", datosFormulario);
        return "FormularioPrueba";
    }

    /*
    @PostMapping("recibeParametros")
    public String recibeParametros(
            @RequestParam("nombre") String nombre,
            @RequestParam("pass") String pass,
            @RequestParam("pi") double pi,
            @RequestParam("genero") String genero,
            @RequestParam("aficiones") String[] aficiones,
            @RequestParam("pais") String pais,
            @RequestParam("musica") String[] musica,
            @RequestParam("comentarios") String comentarios,
            @RequestParam("cv_form") String cv_form,
            @RequestParam("imgs") String[] imgs
    ) {
        System.out.printf("Hola %s he recibido tu formulario:\n", nombre);
        System.out.printf("Contraseña: %s\nNúmero Pi: %f\nGénero: \nAficiones: \n", pass, pi, genero, aficiones);
        for (String s : aficiones) {
            System.out.printf("%s\n", s);
            return formulario;
        }

        return formulario;
    }*/

    @ModelAttribute("lista_generos")
    private Map<String, String> devuelveListaGeneros(){
        return getListaGeneros();
    }
    @ModelAttribute("lista_paises")
    private Map<String, Pais> devuelveListaPaises(){
        return getListaPaises();
    }
    @ModelAttribute("lista_aficiones")
    private Map<String, String> devuelveListaAficiones(){
        return getListaAficiones();
    }
    @ModelAttribute("lista_musicas")
    private Map<String, String> devuelveListaMusicas(){
        return getListaMusicas();
    }

    //Tratamiento de Errores
    /*String msgForm;
    if (resultadoVinculacionParametros.hasErrors()) {
        msgForm = "El formulario tiene errores";
    } else {
        msgForm = "El formulario es correcto";
    }*/

    //Pasamos al Formulario los datos a través del Modelo
    modelo.addAtribute("mensaje", msgForm);
    modelo.addAtribute("titulo", "Formulario Repintado");
    modelo.addAtribute("formulario", datosFormulario);
    modelo.addAtribute("generos", Colecciones.GENERO);
    modelo.addAtribute
    modelo.addAtribute

    return "formularioObjeto";

    @PostMapping("recibe-parametros")
    public String recibeParametrosYRepinta(Model modelo,
    @Valid @ModelAttribute("formulario") DatosFormulario repintado,
        BindingResult resultadoVinculadoParametros){
        String mensajeEnFormulario;

        if (resultadoVinculadoParametros.hasErrors()) {
            mensajeEnFormulario = "El formulario tiene errores.";
        } else {
            mensajeEnFormulario = "El formulario NO tiene errores";}

        modelo.addAttribute("mensaje",mensajeEnFormulario);

        return "formulario";
        }
}


