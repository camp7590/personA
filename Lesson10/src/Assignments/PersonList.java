
package Assignments;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PersonList extends javax.swing.JFrame {

    ArrayList<PersonA> people= new ArrayList<PersonA>();
    DefaultListModel list = new DefaultListModel();
   
    public PersonList() {
        initComponents();
        people.add(new PersonA("Bob",25,"M"));
        people.add(new PersonA("Fran",55,"F"));
        people.add(new PersonA("Mike",15,"M"));
        people.add(new PersonA("sue",30,"F"));
        lstpeople.setModel(list);
        for(PersonA p:people){
            list.addElement(p.getName());
        }

    }
      public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
    
      public void clearform() {
        txtname.setText("");
        txtage.setText("");
        lstpeople.clearSelection();
        buttonGroup1.clearSelection();
    }
      
      public void show(PersonA p){
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge());
        if(p.getGender()=="M")
            optmale.setSelected(true);
        else
            optfemale.setSelected(true);
      }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();
        mnufemale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpeople);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(optmale);
        optmale.setText("Male");
        optmale.setActionCommand("M");

        buttonGroup1.add(optfemale);
        optfemale.setText("Female");
        optfemale.setActionCommand("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(optmale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(optfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optfemale)
                    .addComponent(optmale))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        jMenu1.setText("File");

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/exit.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/exit.png"))); // NOI18N
        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        mnuadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/insert.png"))); // NOI18N
        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnudelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnudelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/delete.png"))); // NOI18N
        mnudelete.setText("Delete");
        mnudelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnudelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/all.png"))); // NOI18N
        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu3.add(mnuall);

        mnumale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnumale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/male.png"))); // NOI18N
        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnumale);

        mnufemale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnufemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/female.png"))); // NOI18N
        mnufemale.setText("Female");
        mnufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnufemale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnudeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudeleteActionPerformed
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new PersonA(name,0,""));
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearform();
        
    }//GEN-LAST:event_mnudeleteActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        String name = txtname.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = buttonGroup1.getSelection().getActionCommand();
        PersonA p = new PersonA(name, age, gender);
        int loc = findInsertPoint(people,p);
        people.add(loc,p);
        list.add(loc, p.getName());
        clearform();
        
    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemaleActionPerformed
        list.clear();
        for(PersonA person : people){
            if(person.getGender()=="F")
                list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnufemaleActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
       String name = "" + lstpeople.getSelectedValue();
       int loc = search(people, new PersonA(name,0,""));
      show(people.get(loc));
    }//GEN-LAST:event_lstpeopleMouseClicked

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        clearform();
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
              list.clear();
        for(PersonA person : people){
             list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnuallActionPerformed

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        list.clear();
        for(PersonA person : people){
            if(person.getGender()=="M")
                list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnumaleActionPerformed

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
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudelete;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufemale;
    private javax.swing.JMenuItem mnumale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
