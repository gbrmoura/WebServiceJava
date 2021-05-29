/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicecorreio;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            
            URL url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
            QName qname = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AtendeClienteService");
            
            
            Service service = Service.create(url, qname);
            
            AtendeCliente client = service.getPort(AtendeCliente.class);
           
            String CEP = JOptionPane.showInputDialog("Cep :");
          
            EnderecoERP ret = client.consultaCEP(CEP);
            
            System.out.println("----------------------------------------------------\n");
            System.out.println("Endereço CEP : " + CEP);
            System.out.println("    Endereço : " + ret.getEnd());
            System.out.println("    Cidade   : " + ret.getCidade());
            System.out.println("    Estado   : " + ret.getUf());
            System.out.println("----------------------------------------------------\n");
            
        } catch(Exception e){
            throw new Error("error whiel ... " + e.getMessage());
        }
    }
    
}
