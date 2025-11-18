
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangePassword extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();  

    public ChangePassword() {
    initComponents();  // GUI 컴포넌트 초기화
   
        
    // 본인 인증 버튼에 ActionListener 추가
    jButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            accountFieldActionPerformed(e);  // 본인 인증 메서드 호출
        }
    });
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        accountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        btnCancle = new javax.swing.JButton();

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton2))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("계좌 비밀번호 변경");

        accountLabel.setText("계좌 번호");

        accountField.setColumns(20);
        accountField.setToolTipText("계좌 번호를 입력하세요.");
        accountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("현재 비밀번호");

        jLabel4.setText("새 비밀번호");

        jLabel5.setText("비밀번호 확인");

        jButton1.setText("본인 인증");
        jButton1.setToolTipText("계좌 번호와 비밀번호를 확인합니다.");
        jButton1.setActionCommand("verifyAccount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        changePasswordButton.setText("비밀번호 변경");
        changePasswordButton.setToolTipText("새 비밀번호를 입력하여 비밀번호를 변경합니다.");
        changePasswordButton.setActionCommand("changePassword");
        changePasswordButton.setEnabled(false);
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setLineWrap(true);
        resultTextArea.setRows(5);
        resultTextArea.setToolTipText("비밀번호 변경 결과가 표시됩니다.");
        jScrollPane1.setViewportView(resultTextArea);

        currentPasswordField.setColumns(20);
        currentPasswordField.setToolTipText("현재 비밀번호를 입력하세요.");

        newPasswordField.setColumns(20);
        newPasswordField.setToolTipText("새 비밀번호를 입력하세요.");

        confirmPasswordField.setColumns(20);
        confirmPasswordField.setToolTipText("새 비밀번호를 확인하세요.");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(accountLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(accountField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(4, 4, 4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle)
                    .addComponent(changePasswordButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountFieldActionPerformed
        String account = accountField.getText();  // 계좌 번호
        char[] currentPassword = currentPasswordField.getPassword();  // 현재 비밀번호

        try {
            DBM.dbOpen(); // DB 연결 열기

            // Account 테이블에서 account_number와 password를 확인하는 쿼리
            String query = "SELECT * FROM Account WHERE account_number = ? AND password = ?";
            PreparedStatement stmt = DBM.DB_con.prepareStatement(query);
            stmt.setString(1, account);  // 계좌 번호를 바인딩
            stmt.setString(2, new String(currentPassword));  // 비밀번호를 바인딩

            // 쿼리 실행
            DBM.DB_rs = stmt.executeQuery();

            // 결과 확인
            if (DBM.DB_rs.next()) {
                resultTextArea.setText("본인 인증 되었습니다.");
                changePasswordButton.setEnabled(true); // 비밀번호 변경 버튼 활성화
            } else {
                resultTextArea.setText("사용자 정보를 찾을 수 없습니다.");
                changePasswordButton.setEnabled(false); // 비밀번호 변경 버튼 비활성화
            }

            DBM.dbClose(); // DB 연결 닫기
        } catch (SQLException e) {
            resultTextArea.setText("DB 오류: " + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accountFieldActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        char[] newPassword = newPasswordField.getPassword();  
        char[] confirmPassword = confirmPasswordField.getPassword();  

        if (newPassword.length != 4 || confirmPassword.length != 4) {
            resultTextArea.setText("비밀번호는 4자리여야 합니다.");
          
            return;
        }

        if (Arrays.equals(newPassword, confirmPassword)) {
            try {
                DBM.dbOpen(); 

                String updateQuery = "UPDATE Account SET password = ? WHERE account_number = ?";
                PreparedStatement stmt = DBM.DB_con.prepareStatement(updateQuery);
                stmt.setString(1, new String(newPassword));  
                stmt.setString(2, accountField.getText());  

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    resultTextArea.setText("비밀번호 변경이 완료되었습니다.");
                } else {
                    resultTextArea.setText("비밀번호 변경에 실패했습니다.");
                }

                DBM.dbClose();

                Timer timer = new Timer(7000, e -> {
                    ReturnFrame returnFrame = new ReturnFrame();
                    returnFrame.setVisible(true);
                    this.dispose(); 
                });
                timer.setRepeats(false);
                timer.start();

            } catch (SQLException e) {
                resultTextArea.setText("DB 오류: " + e.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            resultTextArea.setText("새 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        ReturnFrame ReturnFrame = new ReturnFrame();
        ReturnFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String account = accountField.getText().trim();
        char[] currentPassword = currentPasswordField.getPassword();

        if (account.isEmpty()) {
            resultTextArea.setText("계좌 번호를 입력해주세요.");
            return;
        }

        try {
            DBM.dbOpen(); 

            String query = "SELECT * FROM Account WHERE account_number = ? AND password = ?";
            PreparedStatement stmt = DBM.DB_con.prepareStatement(query);
            stmt.setString(1, account);  
            stmt.setString(2, new String(currentPassword));  

            DBM.DB_rs = stmt.executeQuery();

            if (DBM.DB_rs.next()) {
                changePasswordButton.setEnabled(false);  
                CaptchaDialog captchaDialog = new CaptchaDialog(this, resultTextArea);
                captchaDialog.setVisible(true);  

                // 캡챡 인증 완료 후 버튼 상태 업데이트
                if (captchaDialog.isCaptchaValid()) {
                    changePasswordButton.setEnabled(true);  
                    resultTextArea.setText("본인 인증 되었습니다.");
                } else {
                    resultTextArea.setText("캡챠 인증에 실패했습니다.");
                    changePasswordButton.setEnabled(false);  
                }
            } else {
                resultTextArea.setText("사용자 정보를 찾을 수 없습니다.");
                changePasswordButton.setEnabled(false);  
            }

            DBM.dbClose();
        } catch (SQLException e) {
            resultTextArea.setText("DB 오류: " + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            ChangePassword cp = new ChangePassword();
            cp.setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JTextArea resultTextArea;
    // End of variables declaration//GEN-END:variables
}
