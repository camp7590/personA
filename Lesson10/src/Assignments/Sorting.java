
package Assignments;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Sorting extends javax.swing.JFrame {
    
    int nums[] = new int[50000];
    DefaultListModel list;
    boolean sorted;
    
    public Sorting() {
        initComponents();
        list = new DefaultListModel();
        lstnums.setModel(list);
    }
    
    public void printList(){
        list.clear();
        for (int i = 0; i < 50000; i++) {
            list.add(i, "" + nums[i]);
        }
    }

    public void shuffle(){
        Random r = new Random();
        sorted = false;
        for (int i = 0; i < 50000; i++) {
            nums[i] = r.nextInt(1000) + 1;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList<>();
        btnbubble = new javax.swing.JButton();
        btnselection = new javax.swing.JButton();
        btninsertion = new javax.swing.JButton();
        dsf = new javax.swing.JLabel();
        btnquick = new javax.swing.JButton();
        btngenerate = new javax.swing.JButton();
        txttime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnums);

        btnbubble.setText("Bubble Sort");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselection.setText("Selection Sort");
        btnselection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectionActionPerformed(evt);
            }
        });

        btninsertion.setText("Insertion Sort");
        btninsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertionActionPerformed(evt);
            }
        });

        dsf.setText("Time Lapsed = ");
        dsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnquick.setText("Quick Sort");
        btnquick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquickActionPerformed(evt);
            }
        });

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        txttime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dsf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btninsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnselection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btngenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(btnquick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btngenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbubble, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btninsertion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnselection, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnquick, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dsf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        shuffle();
        printList();
    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
       double time1, time2;
       time1 = System.currentTimeMillis();
        if(sorted){
            JOptionPane.showMessageDialog(this,"This lost is allready sorted - generate new numbers first. ");
            return;
        }
        bubbleSort(nums);
        sorted = true;
        
        time2= System.currentTimeMillis();
        double totaltime = time2 - time1;
        txttime.setText(totaltime + " ms.");
        printList();
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btnselectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectionActionPerformed
        double time1, time2;
        time1 = System.currentTimeMillis(); 
        if(sorted){
            JOptionPane.showMessageDialog(this,"This list is all ready sorted - generate new numbers first. ");
            return;
        }
        selectionSort(nums);
        sorted = true;
        time2= System.currentTimeMillis();
        double totaltime = time2 - time1;
        txttime.setText(totaltime + " ms.");
        printList();
    }//GEN-LAST:event_btnselectionActionPerformed

    private void btninsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertionActionPerformed
       double time1, time2;
       time1 = System.currentTimeMillis();   
        if(sorted){
            JOptionPane.showMessageDialog(this,"This list is all ready sorted - generate new numbers first. ");
            return;
        }
        insertionSort(nums);
        sorted = true;
         time2= System.currentTimeMillis();
        double totaltime = time2 - time1;
        txttime.setText(totaltime + " ms.");
        printList();
    }//GEN-LAST:event_btninsertionActionPerformed

    private void btnquickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquickActionPerformed
         double time1, time2;
       time1 = System.currentTimeMillis();   
        if(sorted){
            JOptionPane.showMessageDialog(this,"This list is all ready sorted - generate new numbers first. ");
            return;
        }
        quickSort(nums, 0, nums.length -1);
        sorted = true;
         time2= System.currentTimeMillis();
        double totaltime = time2 - time1;
        txttime.setText(totaltime + " ms.");
        printList();
    }//GEN-LAST:event_btnquickActionPerformed

   public  static void bubbleSort(int[] a){
     
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++) { 
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while
       
       
}

//supporting swap method

public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}


////////////////////////////////////////////////////////////////

public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(int[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)




/////////////////////////////////////////////////////////////

public static void insertionSort(int a[]){
     
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}
        
}//end method

 public static void quickSort(int[] a, int left, int right){
     if(left >= right) return;
     
     int i = left;
     int j = right;
     int pivotValue = a[(left + right) / 2];
     while (i < j){
         while (a[i] < pivotValue) i++;
         while (pivotValue < a[j]) j--;
         if( i <= j){
             int temp = a[i];
             a[i] = a[j];
             a[j] = temp;
             i++;
             j--;
         }
     
 }
     quickSort (a, left, j);
     quickSort (a, i, right);
 }


///////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsertion;
    private javax.swing.JButton btnquick;
    private javax.swing.JButton btnselection;
    private javax.swing.JLabel dsf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstnums;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables
}
