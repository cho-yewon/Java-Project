import javax.swing.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceInquiry extends JFrame {
    private final DB_MAN dbManager = new DB_MAN();  // DBMAN 객체 생성

    public BalanceInquiry() {
        initComponents();
        setSize(450, 350); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        checkBalanceButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        accountLabel1 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        accountLabel2 = new javax.swing.JLabel();
        btnCancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 400));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setSize(new java.awt.Dimension(400, 400));

        titleLabel.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("조회");

        nameField.setColumns(20);
        nameField.setToolTipText("사용자 이름을 입력받습니다.");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        checkBalanceButton.setText("잔고 조회");
        checkBalanceButton.setToolTipText("클릭하면 계좌 번호와 잔고를 조회합니다.");
        checkBalanceButton.setActionCommand("verifyAccount");
        checkBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setLineWrap(true);
        resultTextArea.setRows(5);
        resultTextArea.setToolTipText("조회된 잔고가 표시됩니다.");
        jScrollPane1.setViewportView(resultTextArea);

        accountLabel1.setText("전화번호");

        phoneField.setColumns(20);
        phoneField.setToolTipText("사용자 전화번호를 입력받습니다.");
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        accountLabel2.setText("이름");

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
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountLabel1)
                            .addComponent(accountLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(phoneField))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkBalanceButton)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel1)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBalanceButton)
                    .addComponent(btnCancle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        
    }//GEN-LAST:event_nameFieldActionPerformed

    private void checkBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalanceButtonActionPerformed
        String name = nameField.getText().trim();  // 이름 입력받기
        String phoneNumber = phoneField.getText().trim();  // 전화번호 입력받기

        // 이름과 전화번호 입력 확인
        if (name.isEmpty() || phoneNumber.isEmpty()) {
            resultTextArea.setText("이름과 전화번호를 모두 입력해주세요.");
            return;
        }

        try {
            dbManager.dbOpen(); // DB 연결

            // 이름과 전화번호로 user_id 조회
            String getAccountQuery = "SELECT user_id FROM User WHERE name = ? AND phone_number = ?";
            PreparedStatement stmt = dbManager.DB_con.prepareStatement(getAccountQuery);
            stmt.setString(1, name);  // 이름 바인딩
            stmt.setString(2, phoneNumber);  // 전화번호 바인딩

            ResultSet rs = stmt.executeQuery();

            // 결과 확인
            if (rs.next()) {
                int userId = rs.getInt("user_id");  // user_id 조회

                // 해당 user_id로 계좌 정보와 잔고 조회
                String balanceQuery = "SELECT account_number, balance FROM Account WHERE user_id = ?";
                PreparedStatement balanceStmt = dbManager.DB_con.prepareStatement(balanceQuery);
                balanceStmt.setInt(1, userId);  // user_id로 바인딩

                ResultSet balanceRs = balanceStmt.executeQuery();

                if (balanceRs.next()) {
                    String accountNumber = balanceRs.getString("account_number");  // 계좌 번호 조회
                    double balance = balanceRs.getDouble("balance");  // 잔고 조회

                    // 소수점 없는 정수로 변환하여 출력
                    resultTextArea.setText("계좌 번호: " + accountNumber + "\n잔고: " + String.format("%,.0f", balance) + "원");
                    
                    // 7초 후 ReturnFrame으로 이동
                    Timer timer = new Timer(7000, e -> {
                        ReturnFrame returnFrame = new ReturnFrame();
                        returnFrame.setVisible(true);
                        this.dispose(); // 현재 창 닫기
                    });
                    timer.setRepeats(false); // 타이머를 한 번만 실행
                    timer.start();
                } else {
                    resultTextArea.setText("잔고를 조회할 수 없습니다.");
                }
            } else {
                resultTextArea.setText("입력한 이름과 전화번호에 일치하는 계좌가 없습니다.");
            }
        } catch (SQLException e) {
            resultTextArea.setText("SQL 오류: " + e.getMessage());
        } catch (IOException e) {
            resultTextArea.setText("IO 오류: " + e.getMessage());
        } finally {
            try {
                dbManager.dbClose();  // DB 연결 종료
            } catch (IOException e) {
                resultTextArea.setText("DB 연결 종료 오류: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_checkBalanceButtonActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        ReturnFrame ReturnFrame = new ReturnFrame();
        ReturnFrame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnCancleActionPerformed

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalanceInquiry().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel1;
    private javax.swing.JLabel accountLabel2;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton checkBalanceButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
