package LabExamples.SOLID.solved.OCP;

/**
 * The Report interface lets new report types to be added without changing existing code.
 */
public interface Report {
    String generate();
}
