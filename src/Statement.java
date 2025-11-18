
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Statement extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN(); 

    public Statement() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        accountField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        btnCancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("통장 정리");

        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountLabel.setText("계좌 번호");

        accountField.setColumns(20);

        checkButton.setText("조회");
        checkButton.setActionCommand("checkTransactions");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setLineWrap(true);
        resultTextArea.setRows(5);
        jScrollPane1.setViewportView(resultTextArea);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkButton))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(accountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle)
                    .addComponent(checkButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        String account = accountField.getText();  // 계좌 번호 입력 받음
        if (account.isEmpty()) {
            resultTextArea.setText("계좌 번호를 입력해주세요.");
            return;
        }

        // 계좌 번호 형식 검증 (숫자만 입력 허용)
        if (!account.matches("\\d+")) {
            resultTextArea.setText("계좌 번호는 숫자만 입력 가능합니다.");
            return;
        }

        try {
            DBM.dbOpen();

            // 1. 계좌 번호로 account_id 조회
            String getAccountIdQuery = "SELECT account_id FROM Account WHERE account_number = ?";
            PreparedStatement stmt = DBM.DB_con.prepareStatement(getAccountIdQuery);
            stmt.setString(1, account);  // 계좌 번호를 바인딩
            DBM.DB_rs = stmt.executeQuery();

            // 계좌 번호에 해당하는 account_id가 있는지 확인
            if (DBM.DB_rs.next()) {
                int accountId = DBM.DB_rs.getInt("account_id");  // account_id를 가져옴

                // 2. account_id로 거래 내역 조회
                String transactionQuery = "SELECT transaction_id, transaction_type, amount, transaction_date FROM Transaction WHERE account_id = ? ORDER BY transaction_date DESC";
                PreparedStatement transactionStmt = DBM.DB_con.prepareStatement(transactionQuery);
                transactionStmt.setInt(1, accountId);  // account_id로 바인딩
                DBM.DB_rs = transactionStmt.executeQuery();

                // 거래 내역이 있을 경우
                if (DBM.DB_rs.next()) {
                    StringBuilder transactions = new StringBuilder();
                    do {
                        String transactionId = DBM.DB_rs.getString("transaction_id");
                        String type = DBM.DB_rs.getString("transaction_type");
                        String amount = DBM.DB_rs.getString("amount");
                        String date = DBM.DB_rs.getString("transaction_date");

                        transactions.append("거래 ID: ").append(transactionId)
                                    .append("\n유형: ").append(type)
                                    .append("\n금액: ").append(amount)
                                    .append("\n날짜: ").append(date)
                                    .append("\n------------------\n");  // 거래 내역 간 간격 추가
                    } while (DBM.DB_rs.next());

                    resultTextArea.setText(transactions.toString());  // 거래 내역 출력
                } else {
                    resultTextArea.setText("거래 내역이 없습니다.");
                }
            } else {
                resultTextArea.setText("입력한 계좌 번호에 해당하는 계좌가 없습니다.");
            }

            DBM.dbClose();
            
            // 7초 후 ReturnFrame으로 이동
            Timer timer = new Timer(7000, e -> {
                ReturnFrame returnFrame = new ReturnFrame();
                returnFrame.setVisible(true);
                this.dispose(); // 현재 창 닫기
            });
            timer.setRepeats(false); // 타이머를 한 번만 실행
            timer.start();
        } catch (SQLException e) {
            resultTextArea.setText("데이터베이스 오류: " + e.getMessage());
        } catch (Exception e) {
            resultTextArea.setText("오류 발생: " + e.getMessage());
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        ReturnFrame ReturnFrame = new ReturnFrame();
        ReturnFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statement().setVisible(true);  // Statement 프레임을 표시
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton checkButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
