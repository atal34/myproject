package PDF;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class AddingContent {
	public static void main(String args[]) throws IOException {

		String filename = "C:/Users/pb155/Desktop/temp/outputfile.pdf";

		PDDocument doc = new PDDocument();

		// a valid PDF document requires at least one page
		PDPage blankPage = new PDPage();
		PDPage page2 = new PDPage();
		doc.addPage(page2);

		doc.addPage(blankPage);
		for (int i = 0; i < 2; i++) {
			doc.addPage(page2);
		}
		doc.save(filename);

		// Retrieving the pages of the document
		PDPage page = doc.getPage(0);
		PDPage page22 = doc.getPage(1);
		PDPageContentStream contentStream = new PDPageContentStream(doc, page);
		PDPageContentStream contentStream1 = new PDPageContentStream(doc, page22);

		// Begin the Content stream
		contentStream.beginText();

		// Setting the font to the Content stream
		// contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		contentStream.setFont(PDType1Font.TIMES_BOLD, 14);
		contentStream.newLineAtOffset(230, 700);
		String text = "ENGAGEMENT LETTER";
		contentStream.showText(text);
		contentStream.newLine();
		contentStream.endText();
		contentStream.drawLine(230, 695, 395, 695);

		String associatedEntity = " CUMMINS GENERATOR TECHNOLOGIES LIMITED (CGTUK)";
		contentStream.beginText();
		contentStream.setFont(PDType1Font.TIMES_BOLD, 11);
		String number = "By Cummins Inc.";
		int len = associatedEntity.length();
		float xCordinate = (600 - len * 4.7f) / 2;
		int x = (int) xCordinate;
		System.out.println(len);
		contentStream.newLineAtOffset(x, 680);

		contentStream.showText(associatedEntity);
		contentStream.endText();

		contentStream.beginText();
		contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
		contentStream.newLineAtOffset(220, 640);
		String number1 = "Reference number - CGTUK-2017-69";
		contentStream.showText(number1);
		contentStream.endText();

		contentStream.beginText();
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		contentStream.newLineAtOffset(80, 610);
		contentStream.setLeading(10.5f);
		String letter = " Effective 1st April 2017" + associatedEntity;
		contentStream.showText(letter);
		contentStream.endText();

		contentStream.beginText();
		contentStream.newLineAtOffset(80, 595);
		contentStream.showText(PdfUtiil.ENGAGAMENT_LETTER_SCRIPT2);
		contentStream.endText();

		contentStream.beginText();
		contentStream.newLineAtOffset(80, 580);
		contentStream.showText(PdfUtiil.ENGAGAMENT_LETTER_SCRIPT3);
		contentStream.endText();

		contentStream.beginText();
		contentStream.newLineAtOffset(80, 565);
		contentStream.showText("and " + associatedEntity);
		contentStream.endText();

		System.out.println("Content added");

		// Closing the content stream
		contentStream.close();
		contentStream1.setFont(PDType1Font.TIMES_BOLD, 13);

		contentStream1.beginText();
		// Adding text in the form of string
		contentStream1.newLineAtOffset(200, 750);
		contentStream1.showText(PdfUtiil.ENGAGAMENT_ORDER_SHEET);
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 686);
		contentStream1.showText(PdfUtiil.LOCAL_PROJECT_NUMBER + " :  318");
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 666);
		contentStream1.showText(PdfUtiil.FUNDING_BU_NAME + " :  CE");
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 646);
		contentStream1.showText(PdfUtiil.LINE_OF_ENGINEERING + " :  CE");
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 626);
		contentStream1.showText(PdfUtiil.PROJECT_CATEGORY + " :  Category...E");
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 606);
		contentStream1.showText(PdfUtiil.PROJECT_NAME + " :  CE VPI Edison CM400");
		contentStream1.endText();

		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, 586);
		contentStream1.showText(PdfUtiil.PROJECT_DECS + " :  ");
		contentStream1.endText();
		String desc = "Fortuna would be newly desized,1 high efficifor666666 global but now I am modifying stand adding more dta to the string to entendiiiiiiiiiiiiiiiring even more  power generations markets for standby and continous operations. These new designs will also have 20% assembly time reduction over current products.";

		System.out.println(desc.length());
		int y = 571;
		
		int parts = desc.length()/100;
		System.out.println(parts);
		String[] descParts = new String[parts+1];
		descParts[0] = desc.substring(0, 99);
		int j = 0;
		for(int i=0;i<parts;i++){
			descParts[i]=desc.substring(j, j+100);
			System.out.println(descParts[i]);
			j=j+100;
		}
		descParts[parts]=desc.substring(j);
		System.out.println(descParts[parts]);
		
		for (int x1 = 0; x1 < parts+1; x1++) {
			
			if (descParts[x1]!= null) {
				contentStream1.beginText();
				contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
				contentStream1.newLineAtOffset(85, y);
				contentStream1.showText(descParts[x1]);
				contentStream1.endText();
				y = y - 15;
			}

		}
		
		contentStream1.beginText();
		contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream1.newLineAtOffset(84, y-5);
		contentStream1.showText(PdfUtiil.PROJECT_DELIVERABLES + " :  ");
		contentStream1.endText();
		
		
		
		String deliverables = "Develop a market leading alternator range to meet customer requirements for standby applications between 7.5 kVA to 62.5 kVA for global markets. Production launched, fully validated and PPAP approved platform products.";

		System.out.println(deliverables.length());
		
		int parts1 = deliverables.length()/100;
		System.out.println(parts1);
		String[] descParts1 = new String[parts1+1];
		descParts1[0] = deliverables.substring(0, 99);
		int b = 0;
		for(int a=0;a<parts1;a++){
			descParts1[a]=deliverables.substring(b, b+100);
			System.out.println(descParts1[a]);
			b=b+100;
		}
		descParts1[parts1]=deliverables.substring(b);
		System.out.println(descParts1[parts1]);
		
		for (int x1 = 0; x1 < parts1+1; x1++) {
			
			if (descParts1[x1]!= null) {
				contentStream1.beginText();
				contentStream1.setFont(PDType1Font.TIMES_ROMAN, 11);
				contentStream1.newLineAtOffset(85, y-15);
				contentStream1.showText(descParts1[x1]);
				contentStream1.endText();
				y = y - 15;
			}

		}
		
		
		
		
		contentStream1.drawLine(80, y + 6, 550, y + 6);

		contentStream1.drawLine(200, 745, 435, 745);
		contentStream1.drawLine(80, 700, 550, 700);
		contentStream1.drawLine(80, 680, 550, 680);
		contentStream1.drawLine(80, 660, 550, 660);
		contentStream1.drawLine(80, 640, 550, 640);
		contentStream1.drawLine(80, 620, 550, 620);
		contentStream1.drawLine(80, 600, 550, 600);
		// contentStream1.drawLine(80, 70, 550, 70);
		// contentStream1.drawLine(70, 70, 70, 470);
		// contentStream1.drawLine(70, 500, 470, 500);

		contentStream1.close();

		// Saving the document
		doc.save(filename);

		// Closing the document
		doc.close();
	}
}
