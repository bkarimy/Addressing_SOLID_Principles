package LabExamples.SOLID.solved.OCP;

/**
 * WordReport implements the Report interface and is used for generating Word reports.
 */
public class ExcelReport implements Report {
    @Override
    public String generate() {
        // Logic for generating a Word report
        return "Excel report generated.";
    }
}
