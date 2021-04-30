//importation des differents packages pour le dev du progamme
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class moyen {
    public static void main(String[] args){
        //Creation de la fenetre
        JFrame window = new JFrame();
        //le title de la fenetre
        window.setTitle("Moyen");
        //la taille de la fenetre
        window.setSize(500,800);
        //maintenir la fenetre ouverte
        window.setLocationRelativeTo(null);
        //Lorsque l'utilisateur ferme la fentre que le programme s'arrete aussi
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creation de fenetre secondaire le "panel"
        JPanel panel1 = new JPanel();
        //l'ajout du panel a la fenetre
        window.add(panel1);
        //l'ajout de couleur au panel
        panel1.setBackground(Color.cyan);
        //l'ajout du layout
        panel1.setLayout(null);
        //maintenant l'ajout des differents elements du programme
        //creation et ajout du label dans le panel moyenne 30%
        JLabel moyen1 = new JLabel();
        moyen1.setText("Moyenne 30%");
        Font police = new Font("Arial", Font.BOLD, 16);
        moyen1.setFont(police);
        moyen1.setBounds(60, 20 , 200, 50);
        panel1.add(moyen1);
        //creation et ajout du label dans le panel pour le resultat de 30%
        JLabel note1 = new JLabel("0");
        note1.setBounds(100, 66, 100,25);
        note1.setFont(police);
        panel1.add(note1);    
        //creation et ajout dans le panel du label 70%
        JLabel moyen2 = new JLabel();
        moyen2.setText("Moyenne 70%");
        moyen2.setFont(police);
        moyen2.setBounds(300, 20 , 200, 50);
        panel1.add(moyen2);
        //creation et ajout dans le panel du label du calcul de 70%
        JLabel note2 = new JLabel("0");
        note2.setBounds(350, 66, 100,25);
        note2.setFont(police);
        panel1.add(note2);
        //creation et ajout dans le panel du label 100%
        JLabel moyen3 = new JLabel();
        moyen3.setText("Moyenne 100%");
        moyen3.setFont(police);
        moyen3.setBounds(180, 150 , 200, 50);
        panel1.add(moyen3);
        //creation et ajout du label dans le panel de 100%
        JLabel note3 = new JLabel("0");
        note3.setBounds(230, 196, 200,25);
        note3.setFont(police);
        panel1.add(note3);
        //creation et ajout du label de input dans le panel de 30%
        JLabel tNote1 = new JLabel();
        tNote1.setText("Note 30%");
        tNote1.setFont(police);
        tNote1.setBounds(60, 400 , 200, 50);
        panel1.add(tNote1);
        //creation et ajout du input (JtextField) dans le panel 30%
        JTextField eNote1 = new JTextField();
        eNote1.setBounds(62, 446, 100,25);
        panel1.add(eNote1);
        //creation et ajout du label de input dans le panel de 70%
        JLabel tNote2 = new JLabel();
        tNote2.setText("Note 70%");
        tNote2.setFont(police);
        tNote2.setBounds(300, 400 , 200, 50);
        panel1.add(tNote2);
        //creation et ajout du input (JtextField) dans le panel 70%
        JTextField eNote2 = new JTextField();
        eNote2.setBounds(300, 446, 100,25);
        panel1.add(eNote2);
        //le bouton calcul
        JButton boutCal = new JButton("Calculer");
        boutCal.setBackground(Color.ORANGE);
        boutCal.setBounds(182, 550, 100,50);
        panel1.add(boutCal);
        //petit commentaire pour se marrer en cas de note inferieur a 10
        JLabel rire = new JLabel();
        rire.setFont(police);
        rire.setBounds(180, 280 , 200, 50);
        panel1.add(rire);
        //actions du bouton boutCal
        boutCal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              int num1 = Integer.parseInt(eNote1.getText());  
              int num2 = Integer.parseInt(eNote2.getText());
              int num30 = (num1*30)/100;
              int num70 = (num2*70)/100;
              int num100 = num30+num70;
              note3.setText(Integer.toString(num100));
              note2.setText(Integer.toString(num70));
              note1.setText(Integer.toString(num30));
              if (num100 < 10){
                  rire.setText("Pauvre de toi");
              }
            }
        });
        //la cette sysntaxe permet de rendre visite la fenetre lors de l'execution du programme 
        window.setVisible(true);    
    }
}
