
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Timer;

public class deposit extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();

    public deposit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLable3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        accountField = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        btnCancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("입금");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("이름");

        jLable3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLable3.setText("계좌번호");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("입금 금액");

        jLabel6.setText("원");

        jButton1.setText("입금하기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        btnCancle.setText("취소");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLable3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnCancle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLable3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCancle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameField.getText();
        String amount = amountField.getText();
        String account = accountField.getText();

        if (name.isEmpty() || account.isEmpty() || amount.isEmpty()) {
            info.setText("모든 정보를 입력해주세요.");
        } else if (!account.matches("\\d+")) {
            info.setText("계좌번호는 숫자만 입력 가능합니다.");
        }else if (!amount.matches("\\d+")) {
            info.setText("입금 금액은 숫자만 입력 가능합니다.");
        }        
        int nAmount = Integer.parseInt(amount);

        try {
            DBM.dbOpen();

            // 계좌 확인
            String query = String.format(
                "SELECT balance FROM Account WHERE account_number = '%s'",
                account
            );
            DBM.DB_rs = DBM.DB_stmt.executeQuery(query);

            if (DBM.DB_rs.next()) {
                int currentBalance = DBM.DB_rs.getInt("balance");

                // 계좌 잔액 업데이트
                String updateQuery = String.format(
                    "UPDATE Account SET balance = balance + %d WHERE account_number = '%s'", nAmount, account
                );
                DBM.DB_stmt.executeUpdate(updateQuery);
                info.setText("입금이 완료되었습니다. 현재 잔액: " + (currentBalance + nAmount) + "원");
                
                // 입금 완료 후 Transaction 기록 추가
                String insertTransactionQuery = "INSERT INTO Transaction (account_id, amount, transaction_type, transaction_date) " +
                                                 "VALUES ((SELECT account_id FROM Account WHERE account_number = ?), ?, '입금', NOW())";
                PreparedStatement transactionStmt = DBM.DB_con.prepareStatement(insertTransactionQuery);
                transactionStmt.setString(1, account);
                transactionStmt.setInt(2, nAmount);
                transactionStmt.executeUpdate();
                
                // 7초 후 ReturnFrame으로 이동
                Timer timer = new Timer(7000, e -> {
                    ReturnFrame returnFrame = new ReturnFrame();
                    returnFrame.setVisible(true);
                    this.dispose(); // 현재 창 닫기
                });
                timer.setRepeats(false); // 타이머를 한 번만 실행
                timer.start();
            } else {
                info.setText("계좌 정보를 찾을 수 없습니다.");
            }
            DBM.dbClose();
        } catch (Exception e) {
            info.setText("오류 발생: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        ReturnFrame ReturnFrame = new ReturnFrame();
        ReturnFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton btnCancle;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLable3;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
