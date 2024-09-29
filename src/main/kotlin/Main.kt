package com.github.uuladzislau

import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Paragraph


fun main() {
    val pdfWriter = PdfWriter("example.pdf")
    val pdfDocument = PdfDocument(pdfWriter)

    Document(pdfDocument).use { document ->
        document.add(Paragraph("Hello World!"))
    }
}