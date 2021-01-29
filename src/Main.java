
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    SystemClass systemClass = new SystemClass();
    
    public Main() {
        
        //ÖRNEK HASTANE VE BU HASTANELERE AİT DOKTOR VE ASİSTANLARI EKLİYORUZ
        systemClass.addHospital(new Hospital("Acıbadem"));
        systemClass.addHospital(new Hospital("Munak"));
        systemClass.addHospital(new Hospital("Anakucagi"));
        
        systemClass.addDoctor(new Doctor("Munna Akum", "Psychiatry", 5, systemClass.getHospital(0)));
        systemClass.addDoctor(new Doctor("Mustafa Leyla", "Urology", 3, systemClass.getHospital(0)));
        systemClass.addDoctor(new Doctor("Akın Kırmızı", "Neurology", 11, systemClass.getHospital(0)));
        systemClass.addDoctor(new Doctor("Emine Ufuk", "Oncology Center", 4, systemClass.getHospital(0)));
        systemClass.addDoctor(new Doctor("Şakir Uğur", "Pedagogy", 6, systemClass.getHospital(0)));
        
        systemClass.addDoctor(new Doctor("Yağmur Ak", "Psychiatry", 5, systemClass.getHospital(1)));
        systemClass.addDoctor(new Doctor("Esra Meltem", "Urology", 3, systemClass.getHospital(1)));
        systemClass.addDoctor(new Doctor("İmdat Yıldız", "Neurology", 7, systemClass.getHospital(1)));
        systemClass.addDoctor(new Doctor("Buse İs", "Pedagogy", 11, systemClass.getHospital(1)));
        systemClass.addDoctor(new Doctor("Esra Yıldız", "Oncology Center", 11, systemClass.getHospital(1)));
        
        systemClass.addDoctor(new Doctor("Azime Kurt", "Psychiatry", 5, systemClass.getHospital(2)));
        systemClass.addDoctor(new Doctor("Yasemin Küçük", "Urology", 3, systemClass.getHospital(2)));
        systemClass.addDoctor(new Doctor("Erdoğan Mulk", "Neurology", 7, systemClass.getHospital(2)));
        systemClass.addDoctor(new Doctor("Caner Yevik", "Pedagogy", 11, systemClass.getHospital(2)));
        systemClass.addDoctor(new Doctor("Güneş Doğdu", "Oncology Center", 11, systemClass.getHospital(2)));
        
        
        systemClass.addAssistant(new Assistant("Abdülhadi Saparca", 5, systemClass.getHospital(0)));
        systemClass.addAssistant(new Assistant("Elaldı Tayan",  3, systemClass.getHospital(0)));
        systemClass.addAssistant(new Assistant("Eldem Mursal", 11, systemClass.getHospital(0)));
        systemClass.addAssistant(new Assistant("Ender Ayrım", 4, systemClass.getHospital(0)));
        systemClass.addAssistant(new Assistant("Günışık Sevigen",  6, systemClass.getHospital(0)));
        
        systemClass.addAssistant(new Assistant("Elçin Ilık", 5, systemClass.getHospital(1)));
        systemClass.addAssistant(new Assistant("Enginsu Yücekayalı",  3, systemClass.getHospital(1)));
        systemClass.addAssistant(new Assistant("Ehil Uyu",  7, systemClass.getHospital(1)));
        systemClass.addAssistant(new Assistant("Elçim Karademir", 11, systemClass.getHospital(1)));
        systemClass.addAssistant(new Assistant("Ender Akküt",  11, systemClass.getHospital(1)));
        
        systemClass.addAssistant(new Assistant("Enginiz Güleryüz",  5, systemClass.getHospital(2)));
        systemClass.addAssistant(new Assistant("Abdülhamit Sel",  3, systemClass.getHospital(2)));
        systemClass.addAssistant(new Assistant("Emine Pehlivanoğlu", 7, systemClass.getHospital(2)));
        systemClass.addAssistant(new Assistant("Elik Özayral",  11, systemClass.getHospital(2)));
        systemClass.addAssistant(new Assistant("Elanur Akarçay",  11, systemClass.getHospital(2)));
        
       
        initComponents();
        
        //EKLEDİĞİMİZ HASTANELERİ HASTANELIST COMBOBOX'A EKLIYORUZ
        for(Hospital h: systemClass.getHospitals()){
            hospitallist.addItem(h.getHospitalName());
            hospitallist1.addItem(h.getHospitalName());
        }
        
       
        editDisable();
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hospitallist = new javax.swing.JComboBox<>();
        specialcare = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        departmentlist = new javax.swing.JComboBox<>();
        addAppointment = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        employeelist = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        appointmentday = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        appList = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        departmentlist1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        hospitallist1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        doctorlist1 = new javax.swing.JComboBox<>();
        priceTxt1 = new javax.swing.JTextField();
        savebtn = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        specialcare1 = new javax.swing.JCheckBox();
        appointmentday1 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("List of Hospitals");

        hospitallist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        hospitallist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitallistMouseClicked(evt);
            }
        });
        hospitallist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitallistActionPerformed(evt);
            }
        });

        specialcare.setText("I need special Care");

        jLabel2.setText("Full Name");

        jLabel3.setText("Department");

        departmentlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Neurology", "Oncology Center", "Pedagogy", "Psychiatry", "Urology" }));
        departmentlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentlistActionPerformed(evt);
            }
        });

        addAppointment.setText("Add Appointment");
        addAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentActionPerformed(evt);
            }
        });

        jLabel4.setText("List of Doctors");

        employeelist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", " " }));
        employeelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeelistActionPerformed(evt);
            }
        });

        jLabel5.setText("Appointment Day");

        jLabel6.setText("Price:");

        priceTxt.setEditable(false);

        appList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Department", "Hospital", "Special Care", "Doctor", "App. Day", "Price"
            }
        ));
        appList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appListMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(appList);

        jLabel7.setText("Full Name");

        jLabel8.setText("Department");

        departmentlist1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Neurology", "Oncology Center", "Pedagogy", "Psychiatry", "Urology" }));
        departmentlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentlist1ActionPerformed(evt);
            }
        });

        jLabel9.setText("List of Hospitals");

        hospitallist1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        hospitallist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitallist1MouseClicked(evt);
            }
        });
        hospitallist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitallist1ActionPerformed(evt);
            }
        });

        jLabel10.setText("List of Doctors");

        doctorlist1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", " " }));
        doctorlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorlist1ActionPerformed(evt);
            }
        });

        priceTxt1.setEditable(false);

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Price:");

        jLabel12.setText("Appointment Day");

        specialcare1.setText("I need special Care");

        appointmentday1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentday1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(916, 916, 916))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(specialcare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fullname)
                            .addComponent(departmentlist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitallist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeelist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceTxt)
                            .addComponent(appointmentday, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(specialcare1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(57, 57, 57))
                        .addComponent(fullname1)
                        .addComponent(departmentlist1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hospitallist1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doctorlist1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceTxt1)
                        .addComponent(appointmentday1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departmentlist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hospitallist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specialcare1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addComponent(doctorlist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addComponent(priceTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(savebtn))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departmentlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hospitallist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(specialcare)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(employeelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(appointmentday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAppointment)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hastane Listesi combobox undan seçilen isimli hastaneye ait doktorları alıyor ve bunları doctorlist combobox una ekliyor
    private void hospitallistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitallistActionPerformed
        String hospitalName = hospitallist.getSelectedItem().toString();
        Hospital h = systemClass.getHospital(hospitalName);
        String department = departmentlist.getSelectedItem().toString();  
        employeelist = systemClass.displayDoctors(h, employeelist, department);//doktorları ekleyen fonksiyon

        //appointmentday = systemClass.displayDays(systemClass.getDoctor(doctorlist.getSelectedItem().toString().substring(0, doctorlist.getSelectedItem().toString().indexOf("(")-1)), appointmentday);
    }//GEN-LAST:event_hospitallistActionPerformed

    
    private void addAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAppointmentActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)appList.getModel(); // model bir data table alıyoruz eklemeleri bunun üzerine yapacağız
        dtm.setRowCount(0);// tablo daha önceden doluysa ilk başta boşaltıyoruz
        String hospitalName = hospitallist.getSelectedItem().toString();// seçilen hastane ismi
        Hospital h = systemClass.getHospital(hospitalName);// bu isme ait hastane objesi
        boolean sp = specialcare.isSelected() ? true : false;// specialcare işaretlenmişse true değilse false
        Employee e = systemClass.searchEmployeeByName(employeelist.getSelectedItem().toString().substring(0, employeelist.getSelectedItem().toString().indexOf("(")-1));// doctor listesinde seçilen isme ailt doctor objesini alıyoruz
       
        h.addPatient(new Patient(fullname.getText(), departmentlist.getSelectedItem().toString(), h, sp, e, appointmentday.getSelectedItem().toString(), Double.parseDouble(priceTxt.getText()) )); //seçilen hastaneye patient eklemesi yapıyoruz
        for(Hospital hs : systemClass.getHospitals()){//burada bu hastanedeki her patienti model tablomuza ekliyoruz
            for(Patient p : hs.getPatients()){
                Object [] row = {p.getFullname(), p.getCategory(), p.getHospital().getHospitalName(), p.isSpecialCare(), p.getDoctor().getFullname(), p.getDayOfAppointment(), p.getPrice()};
                dtm.addRow(row);
            }
        }
         if(e instanceof Doctor) { // kullanıcı Employee olarak Doctor seçmişse doktor vergi verecek 
            ((Doctor) e).payTax(h.getPatients().size());
            priceTxt.setText(String.valueOf(systemClass.searchEmployeeByName(employeelist.getSelectedItem().toString().substring(0, employeelist.getSelectedItem().toString().indexOf("(")-1)).price));//vergisini verdikten sonra price güncellenecek

        }
    }//GEN-LAST:event_addAppointmentActionPerformed

    private void hospitallistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitallistMouseClicked
    }//GEN-LAST:event_hospitallistMouseClicked

    //herhangi bir department seçtiğinde 
    private void departmentlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentlistActionPerformed
       if(!hospitallist.getSelectedItem().toString().equals("-")){//Eğer hastane listesinden bir hastane seçilmemişse herhnagi bir şey değişmeyecek, ama hastane seçili ise o hastaneye ve departmana ait doktorlar listelenecek
            String hospitalName = hospitallist.getSelectedItem().toString();
            Hospital h = systemClass.getHospital(hospitalName); // seçilen hastane objesi
            String department = departmentlist.getSelectedItem().toString();
            employeelist = systemClass.displayDoctors(h, employeelist, department);//seçilen hastaneye ve departmana göre employeelist i değiştiriyoruz
       }
       
    }//GEN-LAST:event_departmentlistActionPerformed

    //herhangi bir çalışan seçilmişse bu çalışana ait hangi günler çalıştığını appointmentday combobox una ekliyoruz
    private void employeelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeelistActionPerformed
        if(hospitallist.getSelectedIndex()!=0 && departmentlist.getSelectedIndex() != 0  && employeelist.getSelectedIndex() != -1){
            
            appointmentday = systemClass.displayDays(systemClass.searchEmployeeByName(employeelist.getSelectedItem().toString().substring(0, employeelist.getSelectedItem().toString().indexOf("(")-1)), appointmentday);
            priceTxt.setText(String.valueOf(systemClass.searchEmployeeByName(employeelist.getSelectedItem().toString().substring(0, employeelist.getSelectedItem().toString().indexOf("(")-1)).price));
            
            
        }
    }//GEN-LAST:event_employeelistActionPerformed

    //1 li olan methodlar üsttekilerin aynısını yapıyor
    private void departmentlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentlist1ActionPerformed
        if(!hospitallist1.getSelectedItem().toString().equals("-")){
            String hospitalName = hospitallist1.getSelectedItem().toString();
            Hospital h = systemClass.getHospital(hospitalName);
            String department = departmentlist1.getSelectedItem().toString();
            doctorlist1 = systemClass.displayDoctors(h, doctorlist1, department);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentlist1ActionPerformed

    private void hospitallist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitallist1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitallist1MouseClicked

    private void hospitallist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitallist1ActionPerformed

        String hospitalName = hospitallist1.getSelectedItem().toString();
        Hospital h = systemClass.getHospital(hospitalName);
        String department = departmentlist1.getSelectedItem().toString();
        
        doctorlist1 = systemClass.displayDoctors(h, doctorlist1, department);
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitallist1ActionPerformed

    private void doctorlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorlist1ActionPerformed
        if(hospitallist1.getSelectedIndex()!=0 && departmentlist1.getSelectedIndex() != 0  && doctorlist1.getSelectedIndex() != -1){
            
            appointmentday1 = systemClass.displayDays(systemClass.searchEmployeeByName(doctorlist1.getSelectedItem().toString().substring(0, doctorlist1.getSelectedItem().toString().indexOf("(")-1)), appointmentday1);
            priceTxt1.setText(String.valueOf(systemClass.searchEmployeeByName(doctorlist1.getSelectedItem().toString().substring(0, doctorlist1.getSelectedItem().toString().indexOf("(")-1)).price));
            
            
        }
    }//GEN-LAST:event_doctorlist1ActionPerformed

    //bu fonksiyonda tablodan seçilen kişinin ismini fullnamez de tutuyoruz
    //ve düzenlemeler yapıyoruz.
    //tüm hastanelerde bu isme sahip olan hasta objesini buluyoruz ve
    // özelliklerini setler ile değiştiriyoruz
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        editDisable();
        int index = appList.getSelectedRow();
        String fullnamez = appList.getValueAt(index, 0).toString();
        for(Hospital hs : systemClass.getHospitals()){
            for(Patient p : hs.getPatients()){
                if(p.getFullname().equals(fullnamez)){// hasta objesinin ismi seçilen satırdaki isimle aynı ise bilgileri değişecek hasta budur
                    p.setFullname(fullname1.getText());
                    p.setCategory(departmentlist1.getSelectedItem().toString());
                    p.setHospital(systemClass.getHospital(hospitallist1.getSelectedItem().toString()));
                    if(specialcare1.isSelected()) p.setSpecialCare(true);
                    else p.setSpecialCare(false);
                    p.setEmp(systemClass.searchEmployeeByName(doctorlist1.getSelectedItem().toString().substring(0, doctorlist1.getSelectedItem().toString().indexOf("(")-1)));
                    p.setDayOfAppointment(appointmentday1.getSelectedItem().toString());
                    p.setPrice(Double.parseDouble(priceTxt1.getText()));
                    break;
                }
            }
        }
        
        DefaultTableModel dtm = (DefaultTableModel)appList.getModel();
        dtm.setRowCount(0);
        for(Hospital hs : systemClass.getHospitals()){
            for(Patient p : hs.getPatients()){
                Object [] row = {p.getFullname(), p.getCategory(), p.getHospital().getHospitalName(), p.isSpecialCare(), p.getDoctor().getFullname(), p.getDayOfAppointment(), p.getPrice()};
                dtm.addRow(row);
            }
        }
        
        
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void appointmentday1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentday1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentday1ActionPerformed

    //tabloda tıklanılan row'a ait bilgileri sağdaki kısımlara ekler
    private void appListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appListMouseClicked
       
        int index = appList.getSelectedRow();
        fullname1.setText(appList.getValueAt(index, 0).toString());
        departmentlist1.setSelectedItem(appList.getValueAt(index, 1).toString());
        hospitallist1.setSelectedItem(appList.getValueAt(index, 2).toString());
        if(appList.getValueAt(index, 3).toString().equals("true"))specialcare1.setSelected(true);
        else specialcare1.setSelected(false);
        
        String hospitalName = hospitallist1.getSelectedItem().toString();
        Hospital h = systemClass.getHospital(hospitalName);
        String department = departmentlist1.getSelectedItem().toString();
        doctorlist1 = systemClass.displayDoctors(h, doctorlist1, department);
        appointmentday1 = systemClass.displayDays(systemClass.searchEmployeeByName(doctorlist1.getSelectedItem().toString().substring(0, doctorlist1.getSelectedItem().toString().indexOf("(")-1)), appointmentday1);
        priceTxt1.setText(String.valueOf(systemClass.searchEmployeeByName(doctorlist1.getSelectedItem().toString().substring(0, doctorlist1.getSelectedItem().toString().indexOf("(")-1)).price));

        editEnable();
        
    }//GEN-LAST:event_appListMouseClicked

    private void appListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_appListMouseEntered


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
                
            }
        });
    }

    //sağ taraftaki kısımları editlemeyi engeller
    private void editDisable(){
        fullname1.setEnabled(false);
        departmentlist1.setEnabled(false);
        hospitallist1.setEnabled(false);
        specialcare1.setEnabled(false);
        doctorlist1.setEnabled(false);
        appointmentday1.setEnabled(false);
        fullname1.setEnabled(false);
        savebtn.setEnabled(false);
    }
    
    //sağ taraftaki kısımı editlemeyi açıyor. Bunu tablo da bir yere tıklayınca kullanıyoruz ki bilgiler sağa geldiğinde editleyebilelim.
    private void editEnable(){
        fullname1.setEnabled(true);
        departmentlist1.setEnabled(true);
        hospitallist1.setEnabled(true);
        specialcare1.setEnabled(true);
        doctorlist1.setEnabled(true);
        appointmentday1.setEnabled(true);
        fullname1.setEnabled(true);
        savebtn.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addAppointment;
    private javax.swing.JTable appList;
    private javax.swing.JComboBox<String> appointmentday;
    private javax.swing.JComboBox<String> appointmentday1;
    private javax.swing.JComboBox<String> departmentlist;
    private javax.swing.JComboBox<String> departmentlist1;
    private javax.swing.JComboBox<String> doctorlist1;
    private javax.swing.JComboBox<String> employeelist;
    private javax.swing.JTextField fullname;
    private javax.swing.JTextField fullname1;
    private javax.swing.JComboBox<String> hospitallist;
    private javax.swing.JComboBox<String> hospitallist1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField priceTxt1;
    private javax.swing.JToggleButton savebtn;
    private javax.swing.JCheckBox specialcare;
    private javax.swing.JCheckBox specialcare1;
    // End of variables declaration//GEN-END:variables
}
