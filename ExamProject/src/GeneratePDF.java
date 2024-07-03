	import com.itextpdf.text.*;
	import com.itextpdf.text.pdf.PdfWriter;
	import java.io.*;

import javax.swing.text.Document;
/*import java.sql.*;*/
	public class GeneratePDF {
		private static final String FILE_NAME = "D:\\result.pdf";
	    static String name,subject,status,maxmarks,getmarks;
		
	    public  void data(String nam, String sub, int max, int no, String str2) {
		name=nam;
		subject=sub;
		maxmarks=String.valueOf(max);
		getmarks=String.valueOf(no);
		status=str2;	
		}
	    public static void main(String[] args) {
	    	writePdf();
	    }
	    private static void writePdf() {
	        Document document = new Document();
	        try {
	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
	            document.open();
	            Paragraph p = new Paragraph();
	            p.add("Result for the Quiz \n \n \n");
	            p.setAlignment(Element.ALIGN_CENTER);
	            document.add(p);
	            Paragraph p2 = new Paragraph();
	            p2.add("\t \t \t \t Name \t \t \t \t \t \t \t \t \t Subject\t \t \t \t \t \t Obtain Marks\t \t \t \t \t \t Result \n \n \n"); //no alignment
	            p2.setAlignment(Element.ALIGN_CENTER);
	            document.add(p2);
	            Paragraph p3 = new Paragraph();
	            p3.add("\t \t \t \t "+name);
	            p3.add("\t \t \t \t "+subject);
	            p3.add("\t \t \t \t \t \t \t \t \t \t"+getmarks+"/");
	            p3.add(maxmarks);
	            p3.add("\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t "+status);
	            p3.setAlignment(Element.ALIGN_CENTER);
	            document.add(p3);
	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.close();

	            System.out.println("Result Generated...........");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        }    
	    
	}
