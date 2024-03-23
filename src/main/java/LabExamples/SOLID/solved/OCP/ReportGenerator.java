package LabExamples.SOLID.solved.OCP;

public class ReportGenerator {
    private Report report;

    /**
     * Constructor for ReportService.
     * @param report the Report implementation to use for report generation
     */
    public ReportGenerator(Report report) {
        this.report = report;
    }

    /**
     * Generates a report.
     * @return a string representing the generated report
     */
    public String generateReport() {
        return report.generate();
    }
}
