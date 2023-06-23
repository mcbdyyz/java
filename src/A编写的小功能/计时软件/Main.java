package A编写的小功能.计时软件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Main {
    private static long AFTER_TIME=0;
    private static long NEW_TIME=0;
    JFrame jf = new JFrame("计时器");
    JLabel jl =new JLabel("0");
    JPanel jp =new JPanel();
    JButton jbtn = new JButton(new AbstractAction("开始") {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            if(jbtn.getText().equals("终止")){
                jbtn.setText("开始");
                NEW_TIME =date.getTime();
                System.out.println(NEW_TIME);
                long l = NEW_TIME - AFTER_TIME;

                float useTime =(float) l/1000/60;
                jl.setText("用时："+useTime+"分钟");
            }else {
                jbtn.setText("终止");
                jl.setText("计时中");

                AFTER_TIME = date.getTime();
                System.out.println(AFTER_TIME);
            }

        }
    });
    JButton jbtn2 =new JButton();
    public void init(){
        //组装视图
        jf.setSize(10,10);
        jp.add(jl);
        jf.add(jp,BorderLayout.CENTER);
        jf.add(jbtn,BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Main().init();
    }
}
