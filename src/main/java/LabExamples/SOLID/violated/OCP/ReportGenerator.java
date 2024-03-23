package LabExamples.SOLID.violated.OCP;

/**
 * ReportGenerator class violates the Open/Closed Principle by not being extendable without modification.
 */
public class ReportGenerator {
    /**
     * Generates a report based on the specified type.
     * @param reportType the type of report to generate
     * @return a string representing the report
     */
    public String generateReport(String reportType) {
        if ("PDF".equals(reportType)) {
            // Logic for generating a PDF report
            return "PDF report generated.";
        } else if ("Word".equals(reportType)) {
            // Logic for generating a Word report
            return "Word report generated.";
        }
        throw new IllegalArgumentException("Unsupported report type: " + reportType);
    }
}
