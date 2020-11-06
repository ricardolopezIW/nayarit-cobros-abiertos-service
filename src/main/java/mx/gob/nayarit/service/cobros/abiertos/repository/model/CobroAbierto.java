package mx.gob.nayarit.service.cobros.abiertos.repository.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "cobros_abiertos")
public class CobroAbierto {

    @Id
    @Field(name = "_id")
    private Integer id;

    @Field(name = "nombre")
    private String nombre;

    @Field(name = "a_paterno")
    private String aPaterno;

    @Field(name = "a_materno")
    private String aMaterno;

    @Field(name = "curp")
    private String curp;

    @Field(name = "tipo_persona")
    private String tipoPersona;

    @Field(name = "conceptos")
    private List<Concepto> conceptos;

    @Field(name = "fecha")
    private String fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public List<Concepto> getConceptos() {
        return conceptos;
    }

    public void setConceptos(List<Concepto> conceptos) {
        this.conceptos = conceptos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
