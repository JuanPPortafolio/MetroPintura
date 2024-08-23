
package com.mycompany.tesis;

import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.layout.renderer.CellRenderer;
import com.itextpdf.layout.renderer.DrawContext;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class pdf {
 
    public static float p(double peo){
    float a = Double.valueOf(peo).floatValue();
    return a;
    }
    public static void crear(Map<String, Map<Object, Object>> res){
        
        String DEST = "factura_"+res.get("Factura").get("Numero").toString()+".pdf";

        PdfWriter writer = null;
        try {
            writer = new PdfWriter(DEST);
        } catch (FileNotFoundException ex) {
        }
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        Table tablaproveedor = new Table(new UnitValue[]{UnitValue.createPointValue(20), UnitValue.createPointValue(500), UnitValue.createPointValue(100)});
        tablaproveedor.addCell(new Cell().add(new Paragraph("COMPRADOR").setRotationAngle(Math.toRadians(90))).setVerticalAlignment(VerticalAlignment.MIDDLE));
        
        Paragraph datosEmpresa = new Paragraph( res.get("Proveedor").get("Nombre").toString());
        datosEmpresa.setFontSize(12);
        datosEmpresa.setBold();
        Cell celdadatosempresa =  new Cell().add(datosEmpresa);
        celdadatosempresa.add(new Paragraph(
                    "RIF: " + res.get("Proveedor").get("Rif").toString()
                + "\nNúmero Telefónico: " + res.get("Proveedor").get("telefono").toString()
                + "\nDirección: " + res.get("Proveedor").get("direccion").toString()));
        tablaproveedor.addCell(new Cell().add(celdadatosempresa).setBorderRight(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT));
        
        Table tablafecha = new Table(new UnitValue[]{ UnitValue.createPointValue(100/3), UnitValue.createPointValue(100/3),UnitValue.createPointValue(100/3)});
        
        tablafecha.addCell(new Cell(1,3).add(new Paragraph("Factura")).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
        tablafecha.addCell(new Cell().add(new Paragraph("Nr.")).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));
       
        Cell codigo = new Cell(1,2);
        codigo.add(new Paragraph(res.get("Factura").get("Numero").toString()));
        codigo.setNextRenderer(new RoundedCellRenderer(codigo, new float[]{p(0.2157), p(0.2157), p(0.2157), p(0.22)}, false));
        codigo.setTextAlignment(TextAlignment.CENTER);
        tablafecha.addCell(codigo);
        
        tablafecha.addCell(new Cell().add(new Paragraph("Dia:")).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        tablafecha.addCell(new Cell().add(new Paragraph("Mes:")).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        tablafecha.addCell(new Cell().add(new Paragraph("Año:")).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        Cell dia = new Cell();
        dia.add(new Paragraph(res.get("Factura").get("dia").toString()));
        dia.setNextRenderer(new RoundedCellRenderer(dia, new float[]{p(0.2157), p(0.2157), p(0.2157), p(0.22)}, false));
        dia.setTextAlignment(TextAlignment.CENTER);
        Cell mes = new Cell();
        mes.add(new Paragraph(res.get("Factura").get("mes").toString()));
        mes.setNextRenderer(new RoundedCellRenderer(mes, new float[]{p(0.2157), p(0.2157), p(0.2157), p(0.22)}, false));
        mes.setTextAlignment(TextAlignment.CENTER);
        Cell ano = new Cell();
        ano.add(new Paragraph(res.get("Factura").get("ano").toString()));
        ano.setNextRenderer(new RoundedCellRenderer(ano, new float[]{p(0.2157), p(0.2157), p(0.2157), p(0.22)}, false));
        ano.setTextAlignment(TextAlignment.CENTER);
        tablafecha.addCell(dia);
        tablafecha.addCell(mes);
        tablafecha.addCell(ano);
        
        tablaproveedor.addCell(new Cell().add(tablafecha).setBorderLeft(Border.NO_BORDER).setVerticalAlignment(VerticalAlignment.MIDDLE));
        
        Cell celdaproveedor = new Cell().add(tablaproveedor);
        celdaproveedor.setNextRenderer(new RoundedCellRenderer(celdaproveedor, new float[]{p(0), p(0), p(0), p(1)}, false));
        document.add(celdaproveedor);
        DeviceRgb blanco = new DeviceRgb(250, 250, 250);
        DeviceRgb gris = new DeviceRgb(30, 30, 30);
        // Título
        Paragraph titulo = new Paragraph("Factura a:");
        titulo.setFontSize(24);
        titulo.setFontColor(blanco);
        titulo.setTextAlignment(TextAlignment.CENTER);
        titulo.setBackgroundColor(gris);
        document.add(titulo);
        
        Table tablacomprador = new Table(new UnitValue[] {UnitValue.createPercentValue(70),UnitValue.createPercentValue(30)},true);
        Cell Razonsocial = new Cell();
        Razonsocial.add(new Paragraph("Razón Social:").setBold());
        Razonsocial.add(new Paragraph(" Metro Pinturas, C.A.").setFontSize(10));
        tablacomprador.addCell(Razonsocial);
        Cell rif = new Cell();
        rif.add(new Paragraph("Rif:").setBold());
        rif.add(new Paragraph(" J-40194919-3").setFontSize(10));
        tablacomprador.addCell(rif);
        Cell direccion = new Cell();
        direccion.add(new Paragraph("Dirección Fiscal:").setBold());
        direccion.add(new Paragraph("AV.44 ESQ. CON CARRETERA N GALPON #32 SECTOR EL DANTO CIUDAD OJEDA EDO. ZULIA").setFontSize(10));
        tablacomprador.addCell(direccion);
        Cell telefono = new Cell();
        telefono.add(new Paragraph("Teléfono:").setBold());
        telefono.add(new Paragraph(" +584144379612").setFontSize(10));
        tablacomprador.addCell(telefono);
        Cell celdacomprador = new Cell().add(tablacomprador);
        celdacomprador.setNextRenderer(new RoundedCellRenderer(celdacomprador, new float[]{p(0), p(0), p(0), p(1)}, false));
        document.add(celdacomprador);

        
        Table tablaproductos = new Table(new UnitValue[]{UnitValue.createPointValue(70),UnitValue.createPointValue(490),UnitValue.createPointValue(70),UnitValue.createPointValue(80)});
        
        tablaproductos.addCell(new Cell().add(new Paragraph("Cantidad").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(gris).setFontColor(blanco)));
        tablaproductos.addCell(new Cell().add(new Paragraph("Producto").setBold().setBackgroundColor(gris).setFontColor(blanco).setPaddingLeft(3)));
        tablaproductos.addCell(new Cell().add(new Paragraph("P.Unidad").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(gris).setFontColor(blanco)));
        tablaproductos.addCell(new Cell().add(new Paragraph("P.Total").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(gris).setFontColor(blanco)));
        List<List<String>> items = new ArrayList<>();
                 float Subtotal = 0;
                 DecimalFormat decimalFormat = new DecimalFormat("#.00");
                 String kilos = " Kg.",divisa = " $";
        for (int i = 0; i < 14; i++) {
            Map<String, String> get = (Map<String, String>) res.get("Productos").get(i);
            if (get.get("cantidad").length() <2) {
                kilos = "";divisa = "";
            }
            //System.out.println();
            for (int e = 0; e < 4; e++) {
                switch (e) {
                    case 0 -> tablaproductos.addCell(new Cell().add(new Paragraph(get.get("cantidad")).setTextAlignment(TextAlignment.RIGHT).add(new Text(kilos).setFontSize(7))));
                    case 1 -> tablaproductos.addCell(new Cell().add(new Paragraph(get.get("descripcion"))));
                    case 2 -> tablaproductos.addCell(new Cell().add(new Paragraph(get.get("precio")).setTextAlignment(TextAlignment.RIGHT).add(new Text(divisa).setFontSize(7))));
                    case 3 -> {
                        String precio = "";
                        try {
                            
                            Subtotal =Subtotal + (Float.parseFloat(get.get("cantidad"))*Float.parseFloat(get.get("precio")));
                            precio = decimalFormat.format(Float.parseFloat(get.get("cantidad"))*Float.parseFloat(get.get("precio")));
                        } catch (NumberFormatException ex) {
                            precio = "\n";
                        }
                        
                        tablaproductos.addCell(new Cell().add(new Paragraph(precio).setTextAlignment(TextAlignment.RIGHT).add(new Text(divisa).setFontSize(7))));
                    }
                }
            }
        }
        kilos = " Kg.";divisa = " $";
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph("Sub-Total:").setTextAlignment(TextAlignment.RIGHT).setBold().setBackgroundColor(gris).setFontColor(blanco).setPaddingRight(6)));
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph(decimalFormat.format(Subtotal)).setTextAlignment(TextAlignment.RIGHT).add(new Text(divisa).setFontSize(7))));
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph("IGTF (3%):").setTextAlignment(TextAlignment.RIGHT).setBold().setBackgroundColor(gris).setFontColor(blanco).setPaddingRight(6)));
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph(decimalFormat.format(Subtotal*0.03)).setTextAlignment(TextAlignment.RIGHT).add(new Text(divisa).setFontSize(7))));
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph("Total:").setTextAlignment(TextAlignment.RIGHT).setBold().setBackgroundColor(gris).setFontColor(blanco).setPaddingRight(6)));
        tablaproductos.addCell(new Cell(1,2).add(new Paragraph(decimalFormat.format(Subtotal+Subtotal*0.03)).setTextAlignment(TextAlignment.RIGHT).add(new Text(divisa).setFontSize(7))));
        
        Cell celdaproductos = new Cell().add(tablaproductos);
        celdaproductos.setNextRenderer(new RoundedCellRenderer(celdaproductos, new float[]{p(0), p(0), p(0), p(1)}, false));
        document.add(celdaproductos);
        
        Table tablafirmas = new Table(2,true);
        tablafirmas.setHorizontalAlignment(HorizontalAlignment.CENTER);
        tablafirmas.setBorder(Border.NO_BORDER);
        
        Cell entrega = new Cell();
        Paragraph entregap = new Paragraph();
        entrega.add(new Paragraph("Realiza la Factura:\n").setTextAlignment(TextAlignment.CENTER).setBold());
        entregap.setFontSize(10);
        entregap.add("Nombre:\n\n").setTextAlignment(TextAlignment.LEFT);
        entregap.add("Cedula:\n\n");
        entregap.add("Firma:");
        entrega.add(entregap);
        
        Cell recibe = new Cell();
        Paragraph recibep = new Paragraph();
        recibe.add(new Paragraph("Recibe Conforme:\n").setTextAlignment(TextAlignment.CENTER).setBold());
        recibep.setFontSize(10);
        recibep.add("Nombre:\n\n").setTextAlignment(TextAlignment.LEFT);
        recibep.add("Cedula:\n\n");
        recibep.add("Firma:\n\n");
        recibe.add(recibep);
        
        tablafirmas.addCell(entrega);
        tablafirmas.addCell(recibe);
        Cell celdafirmas = new Cell().add(tablafirmas);
        celdafirmas.setNextRenderer(new RoundedCellRenderer(celdafirmas, new float[]{p(0), p(0), p(0), p(1)}, false));
        document.add(celdafirmas);
        document.close();
        try {
            // Crear un objeto File con la ruta del archivo PDF
            File file = new File(DEST);

            // Abrir el archivo PDF con la aplicación predeterminada del sistema
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    
    protected static class RoundedCellRenderer extends CellRenderer {
    protected float[] cmykColor;
    protected boolean isColoredBackground;

    public RoundedCellRenderer(Cell modelElement, float[] cmykColor, boolean isColoredBackground) {
        super(modelElement);
        modelElement.setBorder(Border.NO_BORDER);
        this.cmykColor = cmykColor;
        this.isColoredBackground = isColoredBackground;
    }
    

    @Override
    public void drawBackground(DrawContext drawContext) {
        Rectangle rect = getOccupiedAreaBBox();
        PdfCanvas canvas = drawContext.getCanvas();
        canvas
                .saveState()
                .roundRectangle(rect.getLeft() + 1.5f, rect.getBottom() + 1.5f, rect.getWidth() - 3f, rect.getHeight() - 3f, 4)
                .setStrokeColorCmyk(cmykColor[0], cmykColor[1], cmykColor[2], cmykColor[3])
                .setLineWidth(1.5f);
        if (isColoredBackground) {
            canvas.setFillColor(new DeviceCmyk(cmykColor[0], cmykColor[1], cmykColor[2], cmykColor[3])).fillStroke();
        } else {
            canvas.stroke();
        }
        canvas.restoreState();

    }
}
    
}
