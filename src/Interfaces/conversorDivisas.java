/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.text.DecimalFormat;

/**
 *
 * @author user21
 */
public class conversorDivisas extends javax.swing.JFrame {

    int queConversionInicial, queConversionFinal;
    double montoInicial, montoFinal;
    
    public conversorDivisas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        montoConvertir.setHorizontalAlignment(montoConvertir.RIGHT);
        montoConvertido.setHorizontalAlignment(montoConvertido.RIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo1 = new javax.swing.JLabel();
        imagenOracle2 = new javax.swing.JLabel();
        etiquetaInstruccion1 = new javax.swing.JLabel();
        seleccionConversionInicial = new javax.swing.JComboBox<>();
        botonRegresar = new javax.swing.JButton();
        montoConvertir = new javax.swing.JTextField();
        montoConvertido = new javax.swing.JTextField();
        etiquetaInstruccion2 = new javax.swing.JLabel();
        etiquetaInstruccion3 = new javax.swing.JLabel();
        seleccionConversionFinal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Conversor de Divisas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaTitulo1.setText("CONVERSOR DE DIVISAS");

        imagenOracle2.setBackground(new java.awt.Color(255, 255, 255));
        imagenOracle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dinero.png"))); // NOI18N

        etiquetaInstruccion1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etiquetaInstruccion1.setText("Monto a convertir");

        seleccionConversionInicial.setBackground(new java.awt.Color(204, 204, 255));
        seleccionConversionInicial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        seleccionConversionInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MXN Pesos Mexicanos", "USD Dólar", "EUR Euro", "KRW Won Surcoreano" }));
        seleccionConversionInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionConversionInicialActionPerformed(evt);
            }
        });

        botonRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/izquierda.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        montoConvertir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        montoConvertir.setToolTipText("Ingrese solo números");
        montoConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoConvertirKeyTyped(evt);
            }
        });

        montoConvertido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        montoConvertido.setToolTipText("Ingrese solo números");

        etiquetaInstruccion2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etiquetaInstruccion2.setText("Resultado");

        etiquetaInstruccion3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etiquetaInstruccion3.setText("a");

        seleccionConversionFinal.setBackground(new java.awt.Color(204, 204, 255));
        seleccionConversionFinal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        seleccionConversionFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MXN Pesos Mexicanos", "USD Dólar", "EUR Euro", "KRW Won Surcoreano" }));
        seleccionConversionFinal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionConversionFinalItemStateChanged(evt);
            }
        });
        seleccionConversionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionConversionFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(etiquetaInstruccion2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(montoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(etiquetaTitulo1)
                                .addGap(18, 18, 18)
                                .addComponent(imagenOracle2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(seleccionConversionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etiquetaInstruccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(seleccionConversionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(etiquetaInstruccion1)
                        .addGap(18, 18, 18)
                        .addComponent(montoConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagenOracle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaInstruccion1)
                    .addComponent(montoConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionConversionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaInstruccion3)
                    .addComponent(seleccionConversionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaInstruccion2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void montoConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoConvertirKeyTyped

        char []soloNumeros = {'1','2','3','4','5','6','7','8','9','0','.'};

        int comparador=0;

        for(int i=0;i<=10;i++){
            if (soloNumeros[i]==evt.getKeyChar()){
                comparador=1;
            }
        }

        if(comparador==0) {
            evt.consume();  
            getToolkit().beep(); 
         }   
        
    }//GEN-LAST:event_montoConvertirKeyTyped

    private void seleccionConversionInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionConversionInicialActionPerformed
       
        int idSeleccionI = seleccionConversionInicial.getSelectedIndex();
        
       switch (idSeleccionI){
           
            case 0:                
                queConversionInicial = 0;
                seleccionConversionFinal.setSelectedIndex(1); 
               break;
            
            case 1:
                queConversionInicial = 1;
                seleccionConversionFinal.setSelectedIndex(0);
                break;
                
            case 2:
                queConversionInicial = 2;
                seleccionConversionFinal.setSelectedIndex(0);   
                break;
            
            case 3:
                queConversionInicial = 3;
                seleccionConversionFinal.setSelectedIndex(0);     
                break;
       
        default:
            throw new AssertionError();
       }    
       
       

                
        
    }//GEN-LAST:event_seleccionConversionInicialActionPerformed

    private void seleccionConversionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionConversionFinalActionPerformed
        montoConvertido.setText("");
        montoInicial = Double.parseDouble(montoConvertir.getText());
        calculos(montoInicial, queConversionInicial, queConversionFinal);   
    }//GEN-LAST:event_seleccionConversionFinalActionPerformed

    private void seleccionConversionFinalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionConversionFinalItemStateChanged
        
        int idSeleccionF = seleccionConversionFinal.getSelectedIndex();
        
        switch (idSeleccionF){
           
            case 0:                
                queConversionFinal = 0;                
               break;
            
            case 1:
                queConversionFinal = 1;
                break;
                
            case 2:
                 queConversionFinal = 2;
                break;

            case 3:
                 queConversionFinal = 3;
                break;                
       
            default:
            throw new AssertionError();
        }        
        
    }//GEN-LAST:event_seleccionConversionFinalItemStateChanged

    


public void calculos(double montosIniciales, int cInicial, int cFinal){


    if(cInicial==0){
        
        if(cFinal==1){
           montoFinal = (montosIniciales * 0.0587 ) ;
        }
        
        else{
            if(cFinal==2){
                montoFinal = (montosIniciales * 0.0539);
            }
            else{
                if(cFinal==3){
                    montoFinal = (montosIniciales * 78.7361);                
                }
                
                else{ montoFinal = montosIniciales;}
            }
        }
    }
    
    else{

        if(cInicial==1){
            if(cFinal==0){
               montoFinal = (montosIniciales * 17.0240 ) ;
            }

            else{
                if(cFinal==2){
                    montoFinal = (montosIniciales * 0.9178);
                }
                else{
                    if(cFinal==3){
                        montoFinal = (montosIniciales * 1341.4062);                        
                    } 
                    
                    else{ montoFinal = montosIniciales;}                                        
                }
            }            
        }
        
        else{

            if(cInicial==2){

                if(cFinal==0){
                   montoFinal = (montosIniciales * 18.5446 ) ;
                }

                else{
                    if(cFinal==1){
                        montoFinal = (montosIniciales * 1.0893);
                    }
                    else{
                        if(cFinal==3){
                            montoFinal = (montosIniciales * 1460.316);                            
                        }
                        
                        else{ montoFinal = montosIniciales;}                        
                    }
                }                
            }
                        
            else{
            
                if(cFinal==0){
                   montoFinal = (montosIniciales * 0.01269 ) ;
                }

                else{
                    if(cFinal==1){
                        montoFinal = (montosIniciales * 0.000745);
                    }
                    else{
                        if(cFinal==2){
                            montoFinal = (montosIniciales * 0.000684);                            
                        }
                        
                        else{ montoFinal = montosIniciales;}                        
                    }
                }              
            }
        }        
    }
    
    DecimalFormat formato = new DecimalFormat("#.####");
    montoConvertido.setText(String.valueOf(formato.format(montoFinal)));
}    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel etiquetaInstruccion1;
    private javax.swing.JLabel etiquetaInstruccion2;
    private javax.swing.JLabel etiquetaInstruccion3;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel imagenOracle2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField montoConvertido;
    private javax.swing.JTextField montoConvertir;
    private javax.swing.JComboBox<String> seleccionConversionFinal;
    private javax.swing.JComboBox<String> seleccionConversionInicial;
    // End of variables declaration//GEN-END:variables
}
