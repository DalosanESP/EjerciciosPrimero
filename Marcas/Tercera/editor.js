function negrita(){
    document.execCommand("bold",false,null);
}
function cursiva(){
    document.execCommand("italic",false,null);
}
function subrayado(){
    document.execCommand("underline",false,null);
}
function alineai(){
    document.execCommand("justifyleft", false, null);
}
function alinead(){
    document.execCommand("justifyright", false, null);
}
function alineac(){
    document.execCommand("justifycenter", false, null);
}
function alineaf(){
    document.execCommand("justifyfull", false, null);
}
function listuno(){
    document.execCommand("insertunorderedlist", false, null);
}
function listo(){
    document.execCommand("insertorderedlist", false, null);
}
function subi(){
    document.execCommand("subscript", false, null);
}
function supi(){
    document.execCommand("superscript", false, null);
}
function fontcolor(){
    var color = prompt("Introduce el color de la fuente"); //prompt es un cuadro de texto que se utiliza para paserla la variable a la funcion
    document.execCommand("forecolor", false, color);
}
function backcolor(){
    var color = prompt("Introduce el color de fondo");
    document.execCommand("backcolor", false, color);
}
function insertarimg(){
    var imagen = prompt("Introduce la ruta y el nombre del archivo");
    document.execCommand("insertimage", false, imagen);
}
function hipervinculo(){
    var direccion = prompt("Introduce la URL;","http://");
    document.execCommand("createlink", false, direccion);
}
function publicar(){
    var direccion = document.getElementById("contenido").innerHTML;
    document.getElementById("mensajes").innerHTML = contenido;
}