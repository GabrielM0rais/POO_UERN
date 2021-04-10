/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Filme;
import com.mycompany.avalicaopoo.Avaliations;
import com.mycompany.avalicaopoo.Opinioes;

/**
 *
 * @author Gabriel Morais
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    private Filme starWars = new Filme(0, "Star Wars Episódio I: A Ameaça Fantasma",
    "Ficção científica/Ação", 
            "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa "
            + "de salvar o planeta das garras de Darth Sidious. Durante a "
            + "viagem, eles conhecem um habilidoso menino e decidem "
            + "treiná-lo para se tornar um Jedi. Mas o tempo irá "
            + "revelar que as coisas nem sempre são o que aparentam ser.");
        
    private Avaliations starwars1 = new Avaliations(0, "Evan Williams", 3, 
            "Tudo em Phantom Menace existe em um vácuo brilhante e barulhento.");
        
    private Avaliations starwars2 = new Avaliations(0, "Joe Holleman", 5, 
            "O filme é divertido, na maior parte, e várias cenas são "
                    + "tão boas ou melhores do que qualquer coisa que "
                    + "Lucas criou nos filmes originais. Os personagens "
                    + "humanos, no entanto, não são tão interessantes "
                    + "quanto os dos episódios anteriores.");
        
    private Avaliations starwars3 = new Avaliations(0, "Ênio Gabriel", 4, 
            "Os visuais e os efeitos de ameaça fantasmas são muito bons,"
                    + " principalmente para o contexte anual a qual está"
                    + " inserido, mas falta um pouco da essência dos outros"
                    + " filmes");

    private Filme ligaDaJustica = new Filme(1, "Liga da Justiça",
    "Ação/Aventura",
    "Impulsionado pela restauração de sua fé na humanidade e inspirado pelo "
            + "ato altruísta do Superman, Bruce Wayne convoca sua nova "
            + "aliada Diana Prince para o combate contra um inimigo ainda "
            + "maior, recém-despertado. Juntos, Batman e Mulher-Maravilha "
            + "buscam e recrutam com agilidade um time de meta-humanos, mas "
            + "mesmo com a formação da liga de heróis sem precedentes, "
            + "poderá ser tarde demais para salvar o planeta de um "
            + "catastrófico ataque.");

    private Avaliations ligaDajustica1 = new Avaliations(1, "Kim Newman", 1, 
            "É uma saga ainda mais complicada do que Dawn of Justice, "
                    + "com um macguffin cansativo e pesado em que três "
                    + "caixas mágicas devem ser reunidas para o mal e, "
                    + "em seguida, separadas para o bem");

    private Avaliations ligaDajustica2 = new Avaliations(1, "Noel Murray", 3, 
            "Todos os filmes de Snyder em DC - Liga da Justiça incluída - "
                    + "parecem mais preocupados com as repercussões das "
                    + "ações do que com as ações em si.");

    private Avaliations ligaDajustica3 = new Avaliations(1, "Stephen Romei", 4, 
            "A ação às vezes é emocionante, mas os resultados são "
                    + "previsíveis. Na verdade, muitas vezes isso dá a "
                    + "sensação de um filme de cenário, feito para "
                    + "lançar uma série.");

    private Filme laranjaMecanica = new Filme(2, "Laranja Mecânica", 
    "Crime/Drama",
    "O jovem Alex passa as noites com uma gangue de amigos briguentos. "
            + "Depois que é preso, se submete a uma técnica de modificação "
            + "de comportamento para poder ganhar sua liberdade.");

    private  Avaliations laranjaMecanica1 = new Avaliations(2, "John Huddy", 4, 
            "Se Laranja Mecânica não é um filme excelente ou memorável, é "
                    + "definitivamente uma demonstração da grande promessa "
                    + "que esta jovem e crescente forma de "
                    + "arte chamada cinema possui");

    private Avaliations laranjaMecanica2 = new Avaliations(2, "Tom Beasley", 4, 
            "É uma coisa difícil de colocar antes de seus glazzies, "
                    + "mas acredite em mim, é realmente horrorshow.");

    private Avaliations laranjaMecanica3 = new Avaliations(2, "Ênio Gabriel", 5, 
            "Um dos melhores filmes inspirados em filmes que já li"
                    + " a parte em que o persoangem principal"
                    + " canta 'i sing in the rain' da pra sentir toda a "
                    + "cena, simplesmente incrivel!");

    private Filme[] arrFilms = {starWars, ligaDaJustica, laranjaMecanica};
    
    private Avaliations[] arrAvaliacoes = {starwars1, 
        starwars2, 
        starwars3,
        ligaDajustica1, 
        ligaDajustica2, 
        ligaDajustica3,
        laranjaMecanica1, 
        laranjaMecanica2, 
        laranjaMecanica3};
        
    private Videoteca videoteca = new Videoteca(arrFilms);
    private Opinioes opinioes = new Opinioes(arrAvaliacoes);
    
    public MainFrame() {
        initComponents();       
        
        int idx = filmSelector.getSelectedIndex();
        
        filmSelector.setModel(new javax.swing.DefaultComboBoxModel<>(
            this.videoteca.getNamesFilmes()
        ));
        
        nameFilmSelected.setText(this.arrFilms[idx].getName());
        genFilmSelected.setText(this.arrFilms[idx].getGen());
        descriptionFilmSelected.setText(this.arrFilms[idx].getDescription());
        avarageFilmSelected.setText(Integer.toString(
                this.opinioes.avarageAvaliations(
                        this.arrFilms[idx].getId()
                )
        ));
        largeAvaregeFilmSelected.setText(Integer.toString(
                this.opinioes.largeAvaliation(
                        this.arrFilms[idx].getId()
                )
        ));
        smallerAvarageFilmSelected.setText(Integer.toString(
                this.opinioes.smallerAvaliotions(
                        this.arrFilms[idx].getId()
                )
        ));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        filmSelector = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameFilmSelected = new javax.swing.JTextField();
        genFilmSelected = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionFilmSelected = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        avarageFilmSelected = new javax.swing.JTextField();
        largeAvaregeFilmSelected = new javax.swing.JTextField();
        smallerAvarageFilmSelected = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecione o filme: ");

        filmSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filmSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmSelectorActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");
        jLabel2.setMaximumSize(new java.awt.Dimension(41, 41));
        jLabel2.setMinimumSize(new java.awt.Dimension(41, 41));

        jLabel3.setText("Gênero:");
        jLabel3.setMaximumSize(new java.awt.Dimension(41, 41));
        jLabel3.setMinimumSize(new java.awt.Dimension(41, 41));

        jLabel4.setText("Sinopse:");

        nameFilmSelected.setEditable(false);
        nameFilmSelected.setText("jTextField1");
        nameFilmSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFilmSelectedActionPerformed(evt);
            }
        });

        genFilmSelected.setEditable(false);
        genFilmSelected.setText("jTextField1");

        descriptionFilmSelected.setEditable(false);
        descriptionFilmSelected.setColumns(20);
        descriptionFilmSelected.setLineWrap(true);
        descriptionFilmSelected.setRows(5);
        descriptionFilmSelected.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionFilmSelected);

        jLabel6.setText("Média:");

        jLabel7.setText("Menor nota:");

        jLabel8.setText("Maior nota:");

        avarageFilmSelected.setText("jTextField1");

        largeAvaregeFilmSelected.setText("jTextField2");

        smallerAvarageFilmSelected.setText("jTextField3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameFilmSelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genFilmSelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smallerAvarageFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(largeAvaregeFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avarageFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(avarageFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(largeAvaregeFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(smallerAvarageFilmSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel5.setText("INFORMAÇÕES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(26, 26, 26)
                            .addComponent(filmSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(filmSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filmSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmSelectorActionPerformed
        // TODO add your handling code here:
        int idx = filmSelector.getSelectedIndex();
        
        nameFilmSelected.setText(this.arrFilms[idx].getName());
        genFilmSelected.setText(this.arrFilms[idx].getGen());
        descriptionFilmSelected.setText(this.arrFilms[idx].getDescription());
        avarageFilmSelected.setText(Integer.toString(
                this.opinioes.avarageAvaliations(
                        this.arrFilms[idx].getId()
                )
        ));
        largeAvaregeFilmSelected.setText(Integer.toString(
                this.opinioes.largeAvaliation(
                        this.arrFilms[idx].getId()
                )
        ));
        smallerAvarageFilmSelected.setText(Integer.toString(
                this.opinioes.smallerAvaliotions(
                        this.arrFilms[idx].getId()
                )
        ));
    }//GEN-LAST:event_filmSelectorActionPerformed

    private void nameFilmSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFilmSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFilmSelectedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avarageFilmSelected;
    private javax.swing.JTextArea descriptionFilmSelected;
    private javax.swing.JComboBox<String> filmSelector;
    private javax.swing.JTextField genFilmSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largeAvaregeFilmSelected;
    private javax.swing.JTextField nameFilmSelected;
    private javax.swing.JTextField smallerAvarageFilmSelected;
    // End of variables declaration//GEN-END:variables
}
