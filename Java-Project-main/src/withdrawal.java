
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Timer;


public class withdrawal extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    public withdrawal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accountField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblPass = new javax.swing.JTextField();
        btnCancle1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("출금");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("이름");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("계좌번호");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("출금 금액");

        jLabel5.setText("원");

        info.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jButton1.setText("출금하기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("계좌 비밀번호");

        btnCancle1.setText("취소");
        btnCancle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancle1ActionPerformed(evt);
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
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 177, Short.MAX_VALUE))
                                    .addComponent(accountField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amountField)
                                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(52, 159, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancle1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle1)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameField.getText();  // 사용자 이름
        String account = accountField.getText();  // 계좌 번호
        String amount = amountField.getText();  // 출금 금액
        String accountPassword = lblPass.getText();  // 계좌 비밀번호

        if (name.isEmpty() || account.isEmpty() || amount.isEmpty() || accountPassword.isEmpty()) {
            info.setText("모든 정보를 입력해주세요.");
            return;
        }

        if (!amount.matches("\\d+")) {
            info.setText("출금 금액은 숫자로 입력해주세요.");
            return;
        }

        try {
            DBM.dbOpen();

            // 계좌와 비밀번호 확인
            String query = "SELECT balance FROM Account WHERE account_number = ? AND password = ? AND user_id = (SELECT user_id FROM User WHERE name = ?)";
            PreparedStatement pstmt = DBM.DB_con.prepareStatement(query);
            pstmt.setString(1, account);
            pstmt.setString(2, accountPassword);
            pstmt.setString(3, name);

            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                info.setText("계좌 번호, 비밀번호 또는 이름이 일치하지 않습니다.");
                DBM.dbClose();
                return;
            }

            int currentBalance = rs.getInt("balance");
            int withdrawAmount = Integer.parseInt(amount);

            if (currentBalance < withdrawAmount) {
                info.setText("잔액이 부족합니다.");
                DBM.dbClose();
                return;
            }

            // 출금 처리
            String updateQuery = "UPDATE Account SET balance = balance - ? WHERE account_number = ?";
            pstmt = DBM.DB_con.prepareStatement(updateQuery);
            pstmt.setInt(1, withdrawAmount);
            pstmt.setString(2, account);
            pstmt.executeUpdate();

            info.setText("출금이 완료되었습니다. 현재 잔액: " + (currentBalance - withdrawAmount) + "원");
            
            // 출금 완료 후 Transaction 기록 추가
            String insertTransactionQuery = "INSERT INTO Transaction (account_id, amount, transaction_type, transaction_date) " +
                                             "VALUES ((SELECT account_id FROM Account WHERE account_number = ?), ?, '출금', NOW())";
            PreparedStatement transactionStmt = DBM.DB_con.prepareStatement(insertTransactionQuery);
            transactionStmt.setString(1, account);
            transactionStmt.setInt(2, withdrawAmount);
            transactionStmt.executeUpdate();
            
            DBM.dbClose();
            
            // 7초 후 ReturnFrame으로 이동
            Timer timer = new Timer(7000, e -> {
                ReturnFrame returnFrame = new ReturnFrame();
                returnFrame.setVisible(true);
                this.dispose(); // 현재 창 닫기
            });
            timer.setRepeats(false); // 타이머를 한 번만 실행
            timer.start();
        } catch (Exception e) {
            info.setText("오류 발생: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancle1ActionPerformed
        // TODO add your handling code here:
        ReturnFrame ReturnFrame = new ReturnFrame();
        ReturnFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancle1ActionPerformed

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
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton btnCancle1;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lblPass;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
