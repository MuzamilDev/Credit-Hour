import javax.swing.*;
class CreditHour {
    public static void main(String[] args) {
        String sir;
        String Criteria;
        String MCSThree[] = {"MicroProcessor And Assembly Language", "Introduction to Software Engineering","Visual Programming","Data Communication", "Communications Skills"};
        String MCSFour[] = {"OOD", "Compiler Construction", "Artificial Intelligence", "Computer Architecture","Computer Network"};
        String BSCSSeven[] = {"Human Computer Interaction","Data WareHousing","Artificial Intelligence","HMR","Professional Practice"};
        String BSCSEight[]={"Introduction to Data Mining","Computer Architecture","Information Security"};
        String MsResearch[] = {"Data Mining"};
        String PhD[] = {""};


        sir = JOptionPane.showInputDialog("Enter Respectable Name of Teacher ");

        Criteria = JOptionPane.showInputDialog("Please Enter Qualification ");



        if (Criteria .equals("PHD"))
        {
            JOptionPane.showMessageDialog(null, "Dr. " + sir + " can teach Four Credit Hour Course of " + MCSThree[0] + " to class MCS 3rd Semester ");
        }
        else if (Criteria.equals("MS"))
        {
            JOptionPane.showMessageDialog(null, "Prof. " + sir + " can teach Three Credit hour Course of " + MCSFour[3] + " to class MCS 4rth Semester");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Prof. " + sir + " can teach Two Credit hour course at any levels");
        }

    }
    }

