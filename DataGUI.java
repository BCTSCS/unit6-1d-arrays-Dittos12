import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataGUI extends JFrame {
    private JTextField inputField;
    private JButton analyzeColorButton, analyzeDietButton, analyzeStatusButton, analyzeNameButton;
    private JButton commonColorButton, commonDietButton, commonStatusButton;
    private JButton leastCommonColorButton, statusPercentageButton;
    private JTextArea resultsArea;
    private DataAnalyzer analyzer;

    public DataGUI() {
        setTitle("Data Analysis GUI");
        setSize(600, 600);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        analyzer = new DataAnalyzer("countries.txt", "populations.txt", "incomes.txt", "unemployment.txt");

        inputField = new JTextField(20);
        analyzeColorButton = new JButton("Analyze Color");
        analyzeDietButton = new JButton("Analyze Diet");
        analyzeStatusButton = new JButton("Analyze Status");
        analyzeNameButton = new JButton("Analyze Name");
        commonColorButton = new JButton("Most Common Color");
        commonDietButton = new JButton("Most Common Diet");
        commonStatusButton = new JButton("Most Common Status");
        leastCommonColorButton = new JButton("Least Common Color");
        statusPercentageButton = new JButton("Status Percentage");
        resultsArea = new JTextArea(10, 50);

        add(inputField);
        add(analyzeColorButton);
        add(analyzeDietButton);
        add(analyzeStatusButton);
        add(analyzeNameButton);
        add(commonColorButton);
        add(commonDietButton);
        add(commonStatusButton);
        add(leastCommonColorButton);
        add(statusPercentageButton);
        add(new JScrollPane(resultsArea));

        analyzeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeByColor();
            }
        });
        
        analyzeDietButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeByDiet();
            }
        });

        analyzeStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeByStatus();
            }
        });

        analyzeNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeByName();
            }
        });
    }

    private void analyzeByColor() {
        resultsArea.setText("Analyzing by color...");
    }

    private void analyzeByDiet() {
        resultsArea.setText("Analyzing by diet...");
    }

    private void analyzeByStatus() {
        resultsArea.setText("Analyzing by status...");
    }

    private void analyzeByName() {
        resultsArea.setText("Analyzing by name...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DataGUI().setVisible(true));
    }
}
