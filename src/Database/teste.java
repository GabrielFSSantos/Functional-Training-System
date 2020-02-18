package database;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import objetos.*;
import objetos_dao.*;

public class teste {

	public static void main(String[] args) {
	
            try {
                //Aluno a = new Aluno("João", "123.456.789-10", "joao@email.com", "(31) 9 0000 9999", 15, 'M', new Date(0), new byte[0],"nenhuma");
                
//                Instrutor i = new Instrutor("Teste", "123", "email@email.com", "12345", 1234, "especialista", "senha");
//                
//                InstrutorDAO idao = new InstrutorDAO();
//               
//                System.out.println(idao.getInstrutor("123").validarSenha("senha2"));

//                FuncionarioDAO fdao = new FuncionarioDAO();
//                System.out.print(fdao.getLista().get(0).getTipo());

                Turma_AlunoDAO tadao = new Turma_AlunoDAO();
                System.out.println(tadao.getAlunos(1));

//                AlunoDAO db = new AlunoDAO();
//
//                
//                Aluno a = db.getAluno("123.456.789-19");
//                System.out.println(Arrays.toString(a.getImagem()));
//                ImageIcon image = new ImageIcon(a.getImagem());
//             //   Image image = imageIcon.getImage();
//                PrinterJob printJob = PrinterJob.getPrinterJob();
//                printJob.setPrintable((Graphics graphics, PageFormat pageFormat, int pageIndex) -> {
//                    if (pageIndex != 0) {
//                        return NO_SUCH_PAGE;
//                    }
//                    graphics.drawImage(image.getImage(), 0, 0, image.getIconWidth(), image.getIconHeight(), null);
//                    return PAGE_EXISTS;
//                });     
//                try {
//                    printJob.print();
//                } catch (PrinterException e1) {             
//                    e1.printStackTrace();
//                }


                
//		db.adiciona(a);
	
//		Funcionario F=new Funcionario("Jo�o", "123.456.789.10", "joao@email.com", "(31) 9 0000 9999", 2000,"nada");
		
//		java.util.Date date = new java.util.Date();
//                long milisegundos = date.getTime();
//		Timestamp ts = new Timestamp(milisegundos);		
//		System.out.println(ts);

//		Agendamento agenda = new Agendamento(a, "teste", ts);		
//		AgendamentoDAO ag = new AgendamentoDAO();
//		ag.adiciona(agenda);


//		System.out.println(d);
//		
//		Gastos g=new Gastos(1, 2000, d , "teste",F ) ;
//		//a.setDia_pagamento(15);
//		FuncionarioDAO fd= new FuncionarioDAO();
//		GastosDAO gd=new GastosDAO();
//		fd.altera(F);
//		gd.adiciona(g);

//db.altera(a);
            } catch (Exception ex) {
                Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		
		
		
		

	}

}
