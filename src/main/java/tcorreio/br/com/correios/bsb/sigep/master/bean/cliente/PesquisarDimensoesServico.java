
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarDimensoesServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte?do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarDimensoesServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarDimensoesServico", propOrder = {
    "codigo",
    "embalagem"
})
public class PesquisarDimensoesServico {

    protected String codigo;
    protected String embalagem;

    /**
     * Obt?m o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obt?m o valor da propriedade embalagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     * Define o valor da propriedade embalagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalagem(String value) {
        this.embalagem = value;
    }

}
