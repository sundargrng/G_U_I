 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TransportGUI {
    private JFrame frame;
    private JPanel firstPanel,secondPanel,displayFirstPanel, displaySecondPanel;
    private JTextField tf;
    private JTextField tf1;
    private JTextField IDtf;
    private JTextField IDtf1;
    private JTextField IDtf2;
    private JTextField WEIGHTtf;
    private JTextField WEIGHTtf1;
    private JTextField speedtf;
    private JTextField speedtf1;
    private JTextField colortf;
    private JTextField colortf1;
    private JTextField EDtf;
    private JTextField TQtf;
    private JTextField NOStf;
    private JTextField FTCtf;
    private JTextField GCtf;

    private JTextField CAtf;
    private JTextField rangeTf;
    private JTextField BCtf;
    private JTextField priceTf;
    private JTextField CTtf;
    private JTextField brandTf;
    private JTextField mileageTf;
    private JTextField sellPriceTf;

    public String gettf() {
        return tf.getText();
    }

    public String gettf1() {
        return tf1.getText();
    }

    public Integer getIDtf2() {
        try{
            return Integer.parseInt(IDtf2.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }

    }

    public Integer getIDtf1() {
        try{
            return Integer.parseInt(IDtf1.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }

    }

    public Integer getIDtf() {
        try{
            return Integer.parseInt(IDtf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }

    }

    public String getWEIGHTtf() {
        return WEIGHTtf.getText();
    }

    public String getWEIGHTtf1() {
        return WEIGHTtf1.getText();
    }

    public String  getspeedtf() {
        return speedtf.getText();
    }

    public String getspeedtf1() {
        return speedtf1.getText();
    }

    public String getcolortf() {
        return colortf.getText();
    }

    public String getcolortf1() {
        return colortf1.getText();
    }

    public String getEDtf() {
        return EDtf.getText();
    }

    public String getTQtf() {
        return TQtf.getText();
    }

    public Integer getNOStf() {
        try{
            return Integer.parseInt(NOStf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }

    public Integer getFTCtf() {
        try{
            return Integer.parseInt(FTCtf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }

    public String getGCtf() {
        return GCtf.getText();
    }

    public Integer getCAtf() {
        try{
            return Integer.parseInt(CAtf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }

    public Integer getRangeTf() {
        try {
            return Integer.parseInt(rangeTf.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getBCtf() {
        try{
            return Integer.parseInt(BCtf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }

    public Integer getPriceTf() {
        try{
            return Integer.parseInt(priceTf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }

    public String getCTtf() {
        return CTtf.getText();
    }

    public String getBrandTf() {
        return brandTf.getText();
    }

    public String getMileageTf() {
        return mileageTf.getText();
    }
    public  Integer getSellPrice(){
        try{
            return Integer.parseInt(sellPriceTf.getText());
        }
        catch (NumberFormatException ex){
            return  null;
        }
    }


    private JButton addAR;
    private JButton addES;
    private JButton bookAR;
    private JButton purchaseES;
    private JButton sellES;
    private JButton displaybtn;
    private JButton clearbtn;
    private JButton displaybtn1;

    private JButton clearbtn1;
    private JLabel L1;
    private JLabel L2;
    private JLabel L3;
    private JLabel L4;
    private JLabel L5;
    private JLabel L6;
    private JLabel L7;
    private JLabel L8;
    private JLabel L9;
    private JLabel L10;
    private JLabel L11;
    private JLabel L12;
    private JLabel L13;
    private JLabel L14;
    private JLabel L15;
    private JLabel L16;
    private JLabel L17;
    private JLabel L18;
    private JLabel L19;
    private JLabel L20;
    private JLabel L21;
    private JLabel L22;
    private JLabel L23;
    private JLabel L24;
    private JLabel L25;
    private JLabel L26;
    private JLabel L27;
    private JLabel L28;
    private JLabel L29;
    private JLabel L30;
    private JLabel L31;
    private JLabel L32;

    private JLabel L33;
    private JLabel L34;


    private JComboBox yearsComboBox;
    private JComboBox monthsComboBox;

    private JComboBox daysComboBox;

    private ArrayList <Vehicle> vehicles;
    private ArrayList years;
    private ArrayList months;
    private ArrayList days;
    public void createGUI(){

        frame=new JFrame("Sasto Tesla Company");
        frame.setLayout(new GridLayout(4,2));
        years=new ArrayList<>();
        months=new ArrayList();
        days=new ArrayList<>();
        vehicles=new ArrayList<>();
        tf=new JTextField(20);
        IDtf=new JTextField(20);
        WEIGHTtf=new JTextField(20);
        speedtf=new JTextField(20);
        colortf=new JTextField(20);
        tf1=new JTextField(20);
        IDtf1=new JTextField(20);
        WEIGHTtf1=new JTextField(20);
        speedtf1=new JTextField(20);
        colortf1=new JTextField(20);
        IDtf2=new JTextField(20);
        EDtf=new JTextField(20);
        TQtf=new JTextField(20);
        NOStf=new JTextField(20);
        FTCtf=new JTextField(20);
        GCtf=new JTextField(20);
        CAtf=new JTextField(20);
        rangeTf=new JTextField(20);
        BCtf=new JTextField(20);
        priceTf=new JTextField(20);
        CAtf=new JTextField(20);
        CTtf=new JTextField(20);
        brandTf=new JTextField(20);
        mileageTf=new JTextField(20);
        IDtf1=new JTextField(20);
        sellPriceTf=new JTextField(20);
        addAR=new JButton("Add ");
        addES=new JButton("Add");
        bookAR=new JButton("Book");
        purchaseES=new JButton("Purchase");
        sellES=new JButton("Sell");
        displaybtn=new JButton("Display");
        clearbtn=new JButton("Clear");
        displaybtn1=new JButton("Display");
        clearbtn1=new JButton("Clear");

        L3=new JLabel("Vehicle Name");
        L5=new JLabel("Vehicle ID");
        L8=new JLabel("Vehicle Weight") ;
        L10=new JLabel("Vehicle Speed");
        L11=new JLabel("Vehicle Color");
        L4=new JLabel("Vehicle Name");
        L6=new JLabel("Vehicle ID");
        L9=new JLabel("Vehicle Weight") ;
        L12=new JLabel("Vehicle Speed");
        L13=new JLabel("Vehicle Color");
        L7=new JLabel("Vehicle ID");
        L14=new JLabel("Engine Displacement");
        L15=new JLabel("Torque");
        L16=new JLabel("No of Seats");
        L17=new JLabel("Fuel Tank Capacity");
        L18=new JLabel("Ground Clearance");
        L19=new JLabel("Charge Amount");
        L20=new JLabel("Range");
        L21=new JLabel("Battery Capacity");
        L22=new JLabel("Price");
        L19=new JLabel("Charge Amount");
        L23=new JLabel("Charging Time");
        L24=new JLabel("Brand");
        L25=new JLabel("Mileage");
        L26=new JLabel("Electric Scooter:  ");
        L27=new JLabel("Auto Rickshaw  :");
        L31=new JLabel("BOOK AUTO RICKSHAW");
        L32=new JLabel("PURCHASE ELECTRIC SCOOTER");
        L33=new JLabel("SELL ELECTRIC SCOOTER");
        L6=new JLabel("Vehicle ID");
        L30 = new JLabel("Date");
        L1=new JLabel("AUTO RICKSHAW");
        L2=new JLabel("ELECTRIC SCOOTER");
        L29= new JLabel("Price");
        String years[] = {"Select Date", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",

                "27", "28", "29", "30", "31"};
        yearsComboBox=new JComboBox(years);
        monthsComboBox=new JComboBox(months);
        daysComboBox=new JComboBox(days);
        L34 = new JLabel("No data found, add some data and try again!");

        firstPanel= new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        firstPanel.setLayout(new GridBagLayout());
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=3;
        gbc.insets=new Insets(0,0,10,10);
        firstPanel.add(L1,gbc);
        gbc.gridwidth=1;
        gbc.gridx=0;
        gbc.gridy=1;
        firstPanel.add(L5,gbc);
        gbc.gridy=2;
        firstPanel.add(L3,gbc);
        gbc.gridy=3;
        firstPanel.add(L8,gbc);
        gbc.gridy=4;
        firstPanel.add(L11,gbc);
        gbc.gridy=5;
        firstPanel.add(L10,gbc);
        gbc.gridy=6;
        firstPanel.add(L14,gbc);
        gbc.gridy=7;
        firstPanel.add(L15,gbc);
        gbc.gridy=8;
        firstPanel.add(L17,gbc);
        gbc.gridy=9;
        firstPanel.add(L18,gbc);


        gbc.gridx=1;
        gbc.gridy=1;
        firstPanel.add(IDtf,gbc);
        gbc.gridy=2;
        firstPanel.add(tf,gbc);
        gbc.gridy=3;
        firstPanel.add(WEIGHTtf,gbc);
        gbc.gridy=4;
        firstPanel.add(colortf,gbc);
        gbc.gridy=5;
        firstPanel.add(speedtf,gbc);
        gbc.gridy=6;
        firstPanel.add(EDtf,gbc);
        gbc.gridy=7;
        firstPanel.add(TQtf,gbc);
        gbc.gridy=8;
        firstPanel.add(FTCtf,gbc);
        gbc.gridy=9;
        firstPanel.add(GCtf,gbc);
        gbc.gridy=10;
        firstPanel.add(addAR,gbc);

        gbc.gridx = 0;
        gbc.gridy=11;
        firstPanel.add(L31,gbc);
        gbc.gridy=12;
        firstPanel.add(L30,gbc);
        gbc.gridy=13;
        firstPanel.add(daysComboBox,gbc);
        gbc.gridx=1;
        firstPanel.add(monthsComboBox,gbc);
        gbc.gridx=2;
        firstPanel.add(yearsComboBox,gbc);
        gbc.gridx=0;
        gbc.gridy=14;
        firstPanel.add(L19,gbc);
        gbc.gridy=15;
        firstPanel.add(L16,gbc);
        gbc.gridx=1;
        gbc.gridy=14;
        firstPanel.add(CAtf,gbc);
        gbc.gridy=15;
        firstPanel.add(NOStf,gbc);
        gbc.gridy=16;
        firstPanel.add(bookAR,gbc);
        gbc.gridy=17;

        firstPanel.add(clearbtn,gbc);
        gbc.gridx=0;
        gbc.gridy=17;

        firstPanel.add(displaybtn,gbc);



        secondPanel=new JPanel();
        secondPanel.setLayout(new GridBagLayout());
        GridBagConstraints g= new GridBagConstraints();
        g.insets=new Insets(0,0,10,10);
        g.gridx=0;
        g.gridy=0;
        g.gridwidth=3;
        secondPanel.add(L2,g);
        g.gridy=1;
        g.gridwidth=1;
        secondPanel.add(L6,g);
        g.gridy=2;
        secondPanel.add(L4,g);
        g.gridy=3;
        secondPanel.add(L9,g);
        g.gridy=4;
        secondPanel.add(L13,g);
        g.gridy=5;
        secondPanel.add(L12,g);
        g.gridy=6;
        secondPanel.add(L21,g);
        g.gridy=8;
        secondPanel.add(L32,g);
        g.gridy=9;
        secondPanel.add(L24,g);
        g.gridy=10;
        secondPanel.add(L22,g);
        g.gridy=11;
        secondPanel.add(L23,g);
        g.gridy=12;
        secondPanel.add(L25,g);
        g.gridy=13;
        secondPanel.add(L20,g);
        g.gridy=15;
        secondPanel.add(L33,g);
        g.gridy=16;
        secondPanel.add(L29,g);
        g.gridy=18;
        secondPanel.add(displaybtn1,g);




        g.gridx=1;
        g.gridy=1;
        secondPanel.add(IDtf1,g);
        g.gridy=2;
        secondPanel.add(tf1,g);
        g.gridy=3;
        secondPanel.add(WEIGHTtf1,g);
        g.gridy=4;
        secondPanel.add(colortf1,g);
        g.gridy=5;
        secondPanel.add(speedtf1,g);
        g.gridy=6;
        secondPanel.add(BCtf,g);
        g.gridy=7;
        secondPanel.add(addES,g);
        g.gridy=9;
        secondPanel.add(brandTf,g);
        g.gridy=10;
        secondPanel.add(priceTf,g);
        g.gridy=11;
        secondPanel.add(CTtf,g);
        g.gridy=12;
        secondPanel.add(mileageTf,g);
        g.gridy=13;
        secondPanel.add(rangeTf,g);
        g.gridy=14;
        secondPanel.add(purchaseES,g);
        g.gridy=17;
        secondPanel.add(sellES,g);

        g.gridy=16;
        secondPanel.add(sellPriceTf,g);
        g.gridy=18;
        secondPanel.add(clearbtn1,g);

        frame.setSize(1000,1000);
        frame.setLayout(new GridLayout(1,2));
        frame.add(firstPanel);
        frame.add(secondPanel);
        frame.setVisible(true);
        addES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tf1.getText().isEmpty() || IDtf1.getText().isEmpty()|| WEIGHTtf1.getText().isEmpty()
                            || colortf1.getText().isEmpty()|| speedtf1.getText().isEmpty()||BCtf.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "Empty field(s)");
                    }
                    else {
                        ElectricScooter electricScooter = new ElectricScooter( Integer.parseInt(
                                IDtf1.getText()),tf1.getText(), WEIGHTtf1.getText(), colortf1.getText(),
                                speedtf1.getText(), Integer.parseInt(BCtf.getText()));
                        vehicles.add(electricScooter);
                        JOptionPane.showMessageDialog(frame, "Vehicle ID (" + IDtf1.getText() + ") is added.");
                        clearElectricScooter();
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(frame,"Please enter data properly");

                }


            }
        });
        addAR.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tf.getText().isEmpty() || IDtf.getText().isEmpty() || WEIGHTtf.getText().isEmpty()
                            || colortf.getText().isEmpty() || speedtf.getText().isEmpty() || EDtf.getText().isEmpty()
                            || TQtf.getText().isEmpty() || FTCtf.getText().isEmpty() || GCtf.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(frame, "Empty field(s)");
                    } else {
                        AutoRickshaw autoRickshaw = new AutoRickshaw(Integer.parseInt(
                                IDtf.getText()), tf.getText(), WEIGHTtf.getText(), colortf.getText(),
                                speedtf.getText(), Integer.parseInt(EDtf.getText()), TQtf.getText(), Integer.parseInt(FTCtf.getText()),
                                GCtf.getText());
                        vehicles.add(autoRickshaw);
                        JOptionPane.showMessageDialog(frame, "Vehicle ID (" + IDtf.getText() + ") is added.");
                        clearAutoRickshaw();


                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please fill data properly");

                }



            }
        }));
        displaybtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2= new JFrame();

                String[] columns = {"ID", "Name", "Weight", "Color", "Speed", "Battery Capacity"
                        , "Brand", "Price", "Charging Time", "Mileage", "Range"};
                Object[][] data = new Object[vehicles.size()][columns.length];
                displayFirstPanel=new JPanel( new GridBagLayout());
                displayFirstPanel.setSize(1500,500);
                JTable table1= new JTable(data,columns);
                JScrollPane scrollPane = new JScrollPane(table1);
                scrollPane.setMinimumSize(new Dimension(400, 100));
                scrollPane.setVisible(false);
                displayFirstPanel.add(new JScrollPane(table1));
                frame2.add(displayFirstPanel);
                frame2.setSize(1000,800);
                frame2.setVisible(true);
                scrollPane.setVisible(true);
                DefaultTableModel tableModel = new DefaultTableModel();
                int row = 0;
                int column = 0;
                boolean hasPurchasedElectricScooter = false;

                for (Vehicle vehicle : vehicles) {
                    if (vehicle instanceof ElectricScooter) {
                        ElectricScooter electricScooter = (ElectricScooter) vehicle;
                        data[row][column++] = electricScooter.getVehicleId();
                        data[row][column++] = electricScooter.getVehicleName();
                        data[row][column++] = electricScooter.getVehicleWeight();
                        data[row][column++] = electricScooter.getVehicleColor();
                        data[row][column++] = electricScooter.getVehicleSpeed();
                        data[row][column++] = electricScooter.getBatteryCapacity();
                        data[row][column++] = electricScooter.getBrandName();
                        data[row][column++] = electricScooter.getPrice();
                        data[row][column++] = electricScooter.getChargingTime();
                        data[row][column++] = electricScooter.getMileage();
                        data[row][column++] = electricScooter.getRange();
                        column = 0;
                        row++;
                        hasPurchasedElectricScooter = true;
                    }
                }
                if (hasPurchasedElectricScooter) {
                    tableModel.setDataVector(data, columns);
                    table1.setModel(tableModel);
                    L34.setVisible(false);
                } else {
                    L34.setVisible(true);
                    scrollPane.setVisible(false);
                }
            }
        });
        
        displaybtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3= new JFrame();
                displaySecondPanel=new JPanel(new GridBagLayout());
                displaySecondPanel.setSize(1500,500);
                String [] columns1= {"ID", "Name", "Weight ", "Color ",
                        "Speed", "Engine Displacement", "Torque", "Fuel Tank Capacity", "Ground Clearance," ,
                        "Booked Date", "Charge Amount", "No of Seats"
                };
                Object[][] data1 = new Object[vehicles.size()][columns1.length];
                JTable table2= new JTable(data1,columns1);
                displaySecondPanel.add(new JScrollPane(table2));

                JScrollPane scrollPane2 = new JScrollPane(table2);
                scrollPane2.setMinimumSize(new Dimension(400, 100));
                scrollPane2.setVisible(false);
                displaySecondPanel.add(new JScrollPane(table2));
                frame3.setSize(1000,800);
                frame3.setVisible(true);
                scrollPane2.setVisible(true);

                frame3.add(displaySecondPanel);
                frame3.setSize(1000,800);
                frame3.setVisible(true);




                int row = 0;
                int column = 0;
                boolean hasBookedAutoRickshaw = false;
                DefaultTableModel tableModel = new DefaultTableModel();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle instanceof AutoRickshaw) {
                        AutoRickshaw autoRickshaw = (AutoRickshaw) vehicle;
                        data1[row][column++] = autoRickshaw.getVehicleId();
                        data1[row][column++] = autoRickshaw.getVehicleName();
                        data1[row][column++] = autoRickshaw.getVehicleWeight();
                        data1[row][column++] = autoRickshaw.getVehicleColor();
                        data1[row][column++] = autoRickshaw.getVehicleWeight();
                        data1[row][column++] = autoRickshaw.getEngineDisplacement();
                        data1[row][column++] = autoRickshaw.getTorque();
                        data1[row][column++] = autoRickshaw.getFuelTankCapacity();
                        data1[row][column++] = autoRickshaw.getGroundClearance();
                        data1[row][column++] = autoRickshaw.getBookedDate();
                        data1[row][column++] = autoRickshaw.getChargeAmount();
                        data1[row][column++] = autoRickshaw.getNumberOfSeats();

                        column = 0;
                        row++;
                        hasBookedAutoRickshaw = true;
                    }
                }
                if (hasBookedAutoRickshaw) {
                    tableModel.setDataVector(data1, columns1);
                    table2.setModel(tableModel);
                    L34.setVisible(false);
                } else {
                    L34.setVisible(true);
                    scrollPane2.setVisible(false);
                }

            }
        });
        bookAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int autoRickshawId= Integer.parseInt(IDtf.getText());
                    int chargeAmount = Integer.parseInt(CAtf.getText());
                    int numberOfSeats = Integer.parseInt(NOStf.getText());
                    String bookedDate=yearsComboBox.getSelectedItem().toString()+"/"+monthsComboBox.getSelectedItem().toString()+"/"+daysComboBox.getSelectedItem().toString();

                    if (autoRickshawId==0||chargeAmount==0||numberOfSeats==0|| yearsComboBox.getSelectedItem().equals("Year")|| monthsComboBox.getSelectedItem().equals("Months")||daysComboBox.getSelectedItem().equals("Days")) {
                        JOptionPane.showMessageDialog(frame,"Please enter all fields ");

                    } else if (vehicles.size()!=0) {
                        for (Vehicle vehicle:vehicles){
                            if (vehicle instanceof  AutoRickshaw && vehicle.getVehicleId()==autoRickshawId){
                                AutoRickshaw auto= (AutoRickshaw) vehicle;
                                if (auto.getIsBooked()){
                                    JOptionPane.showMessageDialog(frame, "Auto Rickshaw is already booked");

                                }else {
                                    JOptionPane.showMessageDialog(frame, "AutoRickshaw with Vehicle ID "+autoRickshawId+" is booked");
                                    auto.bookRickshaw(bookedDate,chargeAmount,numberOfSeats);
                                }

                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "Vehicle ID not found");
                            }
                        }


                    }

                    else {
                        JOptionPane.showMessageDialog(frame, "Vehicle ID not found");
                    }
                    clearAutoRickshaw();


                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(frame,"PLease fill all the fields");

                }
            }
        });

        purchaseES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int vehicleId=getIDtf1();
                    int range = getRangeTf();
                    int price = getPriceTf();
                    String brand = getBrandTf();
                    String chargingTime= getCTtf();
                    String mileage = getMileageTf();
                    if (vehicleId==0|| range==0||price==0||brand.isEmpty()|| chargingTime.isEmpty()||mileage.isEmpty()){
                        JOptionPane.showMessageDialog(frame,"Please fill all the  fields");
                    }else if (vehicles.size()!=0){
                        for (Vehicle vehicle:vehicles){
                            if (vehicle instanceof  ElectricScooter && vehicle.getVehicleId()==vehicleId){
                                ElectricScooter electricScooter = (ElectricScooter)  vehicle;
                                if (electricScooter.gethasPurchased()) {
                                    JOptionPane.showMessageDialog(frame, "Electric scooter is already purchased");
                                }else{
                                    electricScooter.purchaseScooter(brand,price,chargingTime,mileage,range);
                                    JOptionPane.showMessageDialog(frame, "ElectricScooter has been purchased successfully \n" + "Vehicle ID: " + electricScooter.getVehicleId() + "\n" +
                                            "Brand:" + electricScooter.getBrandName() + "\n" + "Price:" + electricScooter.getPrice() + "\n" + "Charging Time::" + electricScooter.getChargingTime() + "\n" +
                                            "Mileage:" + electricScooter.getMileage() + "\n" + "Range:" + electricScooter.getRange());

                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "Vehicle ID is not added");
                            }
                        }

                    }else {
                        JOptionPane.showMessageDialog(frame,"Electric Scooter is not found");
                    }
                    clearElectricScooter();

                }catch (Exception ex){
                    System.out.println("PLease fill all the fields");
                }



            }
        });
        sellES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int vehicleId1 = getIDtf1();
                    if(vehicleId1==0){
                        JOptionPane.showMessageDialog(frame, "Please enter vehicle ID");


                    } else if (vehicles.size()!=0) {

                        for (Vehicle vehicle:vehicles){
                            if(vehicle instanceof ElectricScooter && vehicle.getVehicleId()==vehicleId1){
                                ElectricScooter electricScooter = (ElectricScooter) vehicle;
                                if(electricScooter.getHasSold()){
                                    JOptionPane.showMessageDialog(frame, "The electric scooter is already sold");

                                }
                                else {
                                    JOptionPane.showMessageDialog(frame,"Electric scooter with vehicle ID "+vehicleId1+" has been sold");
                                    electricScooter.sellScooter(getSellPrice());
                                }

                            }
                            else {
                                JOptionPane.showMessageDialog(frame,"Vehicle ID not found");
                            }
                        }


                    }clearElectricScooter();

                }
                catch (Exception ex){

                }
            }
        });
        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearAutoRickshaw();
            }
        });
        clearbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearElectricScooter();
            }
        });
        firstPanel.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void clearAutoRickshaw(){
        tf.setText("");
        IDtf.setText("");
        WEIGHTtf.setText("");
        colortf.setText("");
        speedtf.setText("");
        EDtf.setText("");
        TQtf.setText("");
        GCtf.setText("");
        FTCtf.setText("");
        CAtf.setText("");
        NOStf.setText("");
    }

    public  void clearElectricScooter(){
        colortf1.setText("");
        IDtf1.setText("");
        tf1.setText("");
        WEIGHTtf1.setText("");
        colortf1.setText("");
        speedtf1.setText("");
        BCtf.setText("");
        brandTf.setText("");
        priceTf.setText("");
        CTtf.setText("");
        mileageTf.setText("");
        rangeTf.setText("");
        sellPriceTf.setText("");

    }


    public static void main(String[] args) {
        TransportGUI obj =new TransportGUI();
        obj.createGUI();
    }


}
