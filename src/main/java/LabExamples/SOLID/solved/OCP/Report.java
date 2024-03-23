package LabExamples.SOLID.solved.OCP;

/**
 * The Report interface allows new report types to be added without modifying existing code.
 */
public interface Report {
    String generate();
}
