import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaptchaDialog extends JDialog {
    private JTextField captchaInputField;
    private JLabel captchaLabel;
    private JButton submitButton, refreshButton;
    private String generatedCaptchaText;
    private JTextArea resultTextArea;
    private boolean captchaValid = false;

    public CaptchaDialog(JFrame parent, JTextArea resultTextArea) {
        super(parent, "본인 인증", true);
        this.resultTextArea = resultTextArea;
        setLayout(new BorderLayout());

        generatedCaptchaText = CaptchaGenerator.generateCaptchaText();
        
        ImageIcon captchaImage = new ImageIcon(CaptchaGenerator.generateCaptchaImage(generatedCaptchaText));
        captchaLabel = new JLabel(captchaImage, SwingConstants.CENTER);

        captchaInputField = new JTextField(10);

        submitButton = new JButton("확인");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userCaptchaInput = captchaInputField.getText().trim();

                if (userCaptchaInput.equals(generatedCaptchaText)) {
                    resultTextArea.setText("본인 인증 되었습니다.");
                    captchaValid = true;
                    dispose();
                } else {
                    resultTextArea.setText("캡챠 인증에 실패했습니다.");
                    refreshCaptcha();
                }
            }
        });

        refreshButton = new JButton("새로고침");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshCaptcha();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(submitButton);
        buttonPanel.add(refreshButton);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(captchaLabel);
        panel.add(captchaInputField);
        panel.add(buttonPanel);

        add(panel, BorderLayout.CENTER);

        setSize(captchaImage.getIconWidth() + 50, 200);
        setLocationRelativeTo(parent);
    }

    private void refreshCaptcha() {
        generatedCaptchaText = CaptchaGenerator.generateCaptchaText();
        ImageIcon captchaImage = new ImageIcon(CaptchaGenerator.generateCaptchaImage(generatedCaptchaText));
        captchaLabel.setIcon(captchaImage);
        captchaInputField.setText("");
    }

    public boolean isCaptchaValid() {
        return captchaValid;
    }
}
