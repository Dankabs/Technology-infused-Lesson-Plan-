import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TechnologyIntegratedLessonPlanner extends JFrame {

    public TechnologyIntegratedLessonPlanner() {
        setTitle("TechnologyIntegratedLessonPlanner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        
        JTable table1 = createTeacherInfoTable();
        mainPanel.add(new JScrollPane(table1));
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Table 2: Materials and Resources
        JTable table2 = createMaterialsResourcesTable();
        mainPanel.add(new JScrollPane(table2));
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Table 3: Accommodations and Assessment
        JTable table3 = createAccommodationsAssessmentTable();
        mainPanel.add(new JScrollPane(table3));

        JScrollPane mainScrollPane = new JScrollPane(mainPanel);
        add(mainScrollPane);

        setVisible(true);
    }

    private JTable createTeacherInfoTable() {
        String[] columnNames = {"Field", "Value", "Field", "Value"};
        Object[][] data = {
            {"Teacher Information:", "", "", ""},
            {"First and Surname/s", "", "Date", ""},
            {"Student number/s", "", "", ""},
            {"School", "", "Grade or Class", ""},
            {"Subject", "", "", ""},
            {"Syllabus theme(s) / topic(s) / skill(s)", "", "", ""},
            
            {"Pre-requisite skills & knowledge", "", "", ""},
           
            {"ICT literacy skills required", "", "", ""},
            {"Learning objectives", "", "", ""},
            {"Lesson objectives", "", "", ""},
            {"Approximate time", "", "", ""}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 3;
            }
        };

        JTable table = new JTable(model);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(250);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);

        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row == 0 || row == 3) {
                    c.setBackground(Color.LIGHT_GRAY);
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        });

        return table;
    }

    private JTable createMaterialsResourcesTable() {
        String[] columnNames = {"Materials and Resources", "Value"};
        Object[][] data = {
            {"Materials and Resources (teaching and learning aids)", ""},
            {"Technology hardware", ""},
            {"Technology software", ""},
            {"Internet web sites", ""},
            {"Audio/Visual material", ""},
            {"Alternative backup options", ""},
            {"Other (including supplies for learners)", ""},
            {"", ""},
            {"Procedures", ""},
            {"Time/Skills", "Lesson content and vocabulary"},
            {"", "Teacher Activities and Methods"},
            {"", "Learner Activities and Methods"},
            {"", "Introduction:"},
            {"", "Development:"},
            {"", "Reinforcement:"},
            {"", "Conclusions:"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(340);
        table.getColumnModel().getColumn(1).setPreferredWidth(510);

        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row == 0 || row == 8) {
                    c.setBackground(Color.LIGHT_GRAY);
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        });

        return table;
    }

    private JTable createAccommodationsAssessmentTable() {
        String[] columnNames = {"Field", "Value"};
        Object[][] data = {
            {"Accommodations for Differentiated Instruction(including adaptive/assistive technology and modifications of activities)", ""},
            {"Intellectual challenges", ""},
            {"Auditory challenges", ""},
            {"Visual challenges", ""},
            {"Physical/motor challenges", ""},
            {"Emotional challenges", ""},
            {"Gifted learners", ""},
            {"Continuous Assessment of Learning ", ""},
            {"Briefly describe how learning will be assessed", ""},
           
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(450);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);

        table.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row == 0 || row == 7) {
                    c.setBackground(Color.LIGHT_GRAY);
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        });

        return table;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TechnologyIntegratedLessonPlanner::new);
    }
}