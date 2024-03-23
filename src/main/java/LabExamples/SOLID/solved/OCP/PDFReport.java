package LabExamples.SOLID.solved.OCP;

/**
 * PDFReport implements the Report interface and is for generating PDF reports.
 */
public class PDFReport implements Report {
    @Override
    public String generate() {
        // Logic for generating a PDF report
        return "PDF report generated.";
    }
}
