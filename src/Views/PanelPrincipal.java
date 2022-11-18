package Views;

import Controllers.AutoresControllers;
import Controllers.CategoriasControllers;
import Controllers.EditorialesControllers;
import Controllers.ProveedoresControllers;
import Models.Autores;
import Models.AutoresDao;
import Models.Categorias;
import Models.CategoriasDao;
import Models.Editoriales;
import Models.EditorialesDao;
import Models.Proveedores;
import Models.ProveedoresDao;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author Gerald
 */
public class PanelPrincipal extends javax.swing.JFrame {

    Autores au = new Autores();
    AutoresDao auDao = new AutoresDao();

    Editoriales ed = new Editoriales();
    EditorialesDao edDao = new EditorialesDao();

    Categorias ca = new Categorias();
    CategoriasDao caDao = new CategoriasDao();

    Proveedores pr = new Proveedores();
    ProveedoresDao prDao = new ProveedoresDao();

    public PanelPrincipal() {
        initComponents();
        this.setTitle("Sistema Libreria");
        setMinimumSize(new Dimension(800, 790));
        setExtendedState(MAXIMIZED_BOTH);

        //setMaximumSize(new Dimension(1920, 1080));//
        /*autores*/
        AutoresControllers autor = new AutoresControllers(au, auDao, this);
        /*editorial*/
        EditorialesControllers editorial = new EditorialesControllers(ed, edDao, this);
        /*categoria*/
        CategoriasControllers categoria = new CategoriasControllers(ca, caDao, this);
        /*proveedor*/
        ProveedoresControllers proveedor = new ProveedoresControllers(pr, prDao, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupAutores = new javax.swing.JPopupMenu();
        jMenuEliminarAutores = new javax.swing.JMenuItem();
        jMenuReingresarAutores = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuEliminarAutoresDefinitivamente = new javax.swing.JMenuItem();
        jPopupEditoriales = new javax.swing.JPopupMenu();
        jMenuEliminarEditoriales = new javax.swing.JMenuItem();
        jMenuReingresarEditoriales = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuEliminarEditorialesDefinitivamente = new javax.swing.JMenuItem();
        jPopupCategorias = new javax.swing.JPopupMenu();
        jMenuEliminarCategorias = new javax.swing.JMenuItem();
        jMenuReingresarCategorias = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuEliminarCategoriasDefinitivamente = new javax.swing.JMenuItem();
        jPopupProveedores = new javax.swing.JPopupMenu();
        jMenuEliminarProveedores = new javax.swing.JMenuItem();
        jMenuReingresarProveedores = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuEliminarProveedoresDefinitivamente = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btneditarautor = new javax.swing.JButton();
        btnguardarautor = new javax.swing.JButton();
        btnnuevoautor = new javax.swing.JButton();
        txtNombreAutor = new javax.swing.JTextField();
        txtIdAutor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAutores = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableEditoriales = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btneditareditorial = new javax.swing.JButton();
        btnnuevaeditorial = new javax.swing.JButton();
        btnguardareditorial = new javax.swing.JButton();
        txtNombreEditorial = new javax.swing.JTextField();
        txtIdEditorial = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableCategoria = new javax.swing.JTable();
        jPanel39 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btneditarcategoria = new javax.swing.JButton();
        btnnuevacategoria = new javax.swing.JButton();
        btnguardarcategoria = new javax.swing.JButton();
        txtNombreCategoria = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btneditarproveedor = new javax.swing.JButton();
        btnnuevoproveedor = new javax.swing.JButton();
        btnguardarproveedor = new javax.swing.JButton();
        txtNombreProveedor = new javax.swing.JTextField();
        txtIdCategoria1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuEliminarAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Deshabilitado.png"))); // NOI18N
        jMenuEliminarAutores.setText("Deshabilitar");
        jMenuEliminarAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupAutores.add(jMenuEliminarAutores);

        jMenuReingresarAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarAutores.setText("Reingresar");
        jMenuReingresarAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupAutores.add(jMenuReingresarAutores);
        jPopupAutores.add(jSeparator8);

        jMenuEliminarAutoresDefinitivamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove.png"))); // NOI18N
        jMenuEliminarAutoresDefinitivamente.setText("Eliminar Definitivamente");
        jMenuEliminarAutoresDefinitivamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupAutores.add(jMenuEliminarAutoresDefinitivamente);

        jMenuEliminarEditoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Deshabilitado.png"))); // NOI18N
        jMenuEliminarEditoriales.setText("Deshabilitar");
        jMenuEliminarEditoriales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupEditoriales.add(jMenuEliminarEditoriales);

        jMenuReingresarEditoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarEditoriales.setText("Reingresar");
        jMenuReingresarEditoriales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupEditoriales.add(jMenuReingresarEditoriales);
        jPopupEditoriales.add(jSeparator9);

        jMenuEliminarEditorialesDefinitivamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove.png"))); // NOI18N
        jMenuEliminarEditorialesDefinitivamente.setText("Eliminar Definitivamente");
        jMenuEliminarEditorialesDefinitivamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupEditoriales.add(jMenuEliminarEditorialesDefinitivamente);

        jMenuEliminarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Deshabilitado.png"))); // NOI18N
        jMenuEliminarCategorias.setText("Deshabilitar");
        jMenuEliminarCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupCategorias.add(jMenuEliminarCategorias);

        jMenuReingresarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarCategorias.setText("Reingresar");
        jMenuReingresarCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupCategorias.add(jMenuReingresarCategorias);
        jPopupCategorias.add(jSeparator10);

        jMenuEliminarCategoriasDefinitivamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove.png"))); // NOI18N
        jMenuEliminarCategoriasDefinitivamente.setText("Eliminar Definitivamente");
        jMenuEliminarCategoriasDefinitivamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupCategorias.add(jMenuEliminarCategoriasDefinitivamente);

        jMenuEliminarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Deshabilitado.png"))); // NOI18N
        jMenuEliminarProveedores.setText("Deshabilitar");
        jMenuEliminarProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupProveedores.add(jMenuEliminarProveedores);

        jMenuReingresarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange.png"))); // NOI18N
        jMenuReingresarProveedores.setText("Reingresar");
        jMenuReingresarProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupProveedores.add(jMenuReingresarProveedores);
        jPopupProveedores.add(jSeparator11);

        jMenuEliminarProveedoresDefinitivamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove.png"))); // NOI18N
        jMenuEliminarProveedoresDefinitivamente.setText("Eliminar Definitivamente");
        jMenuEliminarProveedoresDefinitivamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPopupProveedores.add(jMenuEliminarProveedoresDefinitivamente);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("The Book Zone");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane.setEnabled(false);
        jTabbedPane.setFocusable(false);

        jPanel13.setAutoscrolls(true);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Autor"));
        jPanel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel15.setText("Nombre Autor");

        btneditarautor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btneditarautor.setText("Editar");
        btneditarautor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarautorActionPerformed(evt);
            }
        });

        btnguardarautor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnguardarautor.setText("Guardar");
        btnguardarautor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarautorActionPerformed(evt);
            }
        });

        btnnuevoautor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnnuevoautor.setText("Nuevo");
        btnnuevoautor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoautorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtNombreAutor)
                .addGap(56, 56, 56))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnnuevoautor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnguardarautor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btneditarautor)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevoautor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarautor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditarautor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        TableAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Autor", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAutores.setComponentPopupMenu(jPopupAutores);
        TableAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableAutores.setDragEnabled(true);
        TableAutores.setFocusable(false);
        TableAutores.setName(""); // NOI18N
        TableAutores.setShowGrid(false);
        jScrollPane2.setViewportView(TableAutores);
        TableAutores.getAccessibleContext().setAccessibleName("");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1805, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("", jPanel13);

        TableEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Editorial", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableEditoriales.setComponentPopupMenu(jPopupEditoriales);
        TableEditoriales.setFocusable(false);
        jScrollPane3.setViewportView(TableEditoriales);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Editorial"));
        jPanel28.setPreferredSize(new java.awt.Dimension(337, 505));

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel16.setText("Editorial");

        btneditareditorial.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btneditareditorial.setText("Editar");
        btneditareditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditareditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditareditorialActionPerformed(evt);
            }
        });

        btnnuevaeditorial.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnnuevaeditorial.setText("Nuevo");
        btnnuevaeditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevaeditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevaeditorialActionPerformed(evt);
            }
        });

        btnguardareditorial.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnguardareditorial.setText("Guardar");
        btnguardareditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardareditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardareditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnnuevaeditorial)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(btnguardareditorial)
                                .addGap(22, 22, 22)
                                .addComponent(btneditareditorial))
                            .addComponent(txtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevaeditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardareditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditareditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1807, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane.addTab("", jPanel14);

        TableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCategoria.setComponentPopupMenu(jPopupCategorias);
        TableCategoria.setFocusable(false);
        jScrollPane4.setViewportView(TableCategoria);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        jPanel39.setPreferredSize(new java.awt.Dimension(337, 505));

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel20.setText("Categoria");

        btneditarcategoria.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btneditarcategoria.setText("Editar");
        btneditarcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarcategoriaActionPerformed(evt);
            }
        });

        btnnuevacategoria.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnnuevacategoria.setText("Nuevo");
        btnnuevacategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevacategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevacategoriaActionPerformed(evt);
            }
        });

        btnguardarcategoria.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnguardarcategoria.setText("Guardar");
        btnguardarcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel39Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnnuevacategoria)
                                .addGap(28, 28, 28)
                                .addComponent(btnguardarcategoria)))
                        .addGap(22, 22, 22)
                        .addComponent(btneditarcategoria)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevacategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, 1808, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(9, 9, 9))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("", jPanel19);

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor", "Telefono", "Direccion", "E-mail", "Observaciones", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProveedor.setComponentPopupMenu(jPopupProveedores);
        TableProveedor.setFocusable(false);
        jScrollPane7.setViewportView(TableProveedor);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));
        jPanel40.setPreferredSize(new java.awt.Dimension(337, 505));

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel21.setText("Proveedor");

        btneditarproveedor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btneditarproveedor.setText("Editar");
        btneditarproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarproveedorActionPerformed(evt);
            }
        });

        btnnuevoproveedor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnnuevoproveedor.setText("Nuevo");
        btnnuevoproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoproveedorActionPerformed(evt);
            }
        });

        btnguardarproveedor.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        btnguardarproveedor.setText("Guardar");
        btnguardarproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproveedorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel8.setText("Teléfono");

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel12.setText("E-mail");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel13.setText("Dirección");

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel14.setText("Observaciones");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel14))
                                    .addComponent(txtObservaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(txtIdCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel13))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel40Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnnuevoproveedor)
                                .addGap(28, 28, 28)
                                .addComponent(btnguardarproveedor)))
                        .addGap(22, 22, 22)
                        .addComponent(btneditarproveedor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(txtIdCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, 1808, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addGap(9, 9, 9))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("", jPanel15);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel36.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 860, 440));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel19.setText("Cliente");
        jPanel37.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, 20));

        jButton16.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton16.setText("Modificar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel37.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 40));

        jButton17.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton17.setText("Eliminar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel37.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, 40));

        jButton18.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton18.setText("Guardar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel37.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 40));
        jPanel37.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, 30));

        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 490));
        jPanel37.getAccessibleContext().setAccessibleName("Cliente");

        jPanel36.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 860, 50));

        jPanel16.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 630));

        jTabbedPane.addTab("", jPanel16);
        jTabbedPane.addTab("", jPanel17);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Libro"));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel1.setText("Cantidad");
        jPanel23.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 70, 20));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel2.setText("Proveedor");
        jPanel23.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 20));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel3.setText("Autor");
        jPanel23.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 20));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel4.setText("Editorial");
        jPanel23.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 70, 20));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel5.setText("Categoria");
        jPanel23.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 20));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel6.setText("ISBN");
        jPanel23.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, 20));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel7.setText("Titulo");
        jPanel23.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 70, 20));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel9.setText("Precio Compra");
        jPanel23.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 20));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jLabel11.setText("Precio Venta");
        jPanel23.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 90, 20));

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));
        jPanel23.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 100, -1));
        jPanel23.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, -1));
        jPanel23.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel23.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, -1));

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 490));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Titulo", "Editorial", "Autor", "Proveedor", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 860, 440));
        jPanel3.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 860, 50));

        jTabbedPane.addTab("", jPanel3);
        jTabbedPane.addTab("", jPanel18);
        jTabbedPane.addTab("", jPanel20);

        getContentPane().add(jTabbedPane, java.awt.BorderLayout.CENTER);
        jTabbedPane.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Archivo");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collapse.png"))); // NOI18N
        jMenuItem9.setText("Modo Ventana");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        jMenuItem10.setText("Minimizar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_screen.png"))); // NOI18N
        jMenuItem11.setText("Maximizar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator7);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administrar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/client.png"))); // NOI18N
        jMenuItem2.setText("Gestionar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/supplier.png"))); // NOI18N
        jMenuItem3.setText("Gestionar Proveedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/category.png"))); // NOI18N
        jMenuItem4.setText("Gestionar Categorias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editorial.png"))); // NOI18N
        jMenuItem6.setText("Gestionar Editoriales");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator4);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/author.png"))); // NOI18N
        jMenuItem7.setText("Gestionar Autores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator6);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        jMenuItem13.setText("Gestionar Libros");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);
        jMenu2.add(jSeparator5);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jMenuItem14.setText("Gestionar Usuarios");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ventas");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell.png"))); // NOI18N
        jMenuItem5.setText("Nueva Venta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Configuración");

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings.png"))); // NOI18N
        jMenuItem12.setText("Configuración de empresa");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Ayuda");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        jMenuItem8.setText("Acerca de ...");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardareditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardareditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardareditorialActionPerformed

    private void btnnuevaeditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaeditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevaeditorialActionPerformed

    private void btneditareditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditareditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditareditorialActionPerformed

    private void btnnuevoautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoautorActionPerformed

    private void btnguardarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarautorActionPerformed

    private void btneditarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarautorActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        setSize(new Dimension(1350, 721));
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed


    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btneditarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarcategoriaActionPerformed

    private void btnnuevacategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevacategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevacategoriaActionPerformed

    private void btnguardarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarcategoriaActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Acerca acerca = new Acerca(this, rootPaneCheckingEnabled);
        acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        this.jTabbedPane.setSelectedIndex(6);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        this.jTabbedPane.setSelectedIndex(5);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        this.jTabbedPane.setSelectedIndex(8);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.jTabbedPane.setSelectedIndex(7);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btneditarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarproveedorActionPerformed

    private void btnnuevoproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoproveedorActionPerformed

    private void btnguardarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarproveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableAutores;
    public javax.swing.JTable TableCategoria;
    public javax.swing.JTable TableEditoriales;
    public javax.swing.JTable TableProveedor;
    public javax.swing.JButton btneditarautor;
    public javax.swing.JButton btneditarcategoria;
    public javax.swing.JButton btneditareditorial;
    public javax.swing.JButton btneditarproveedor;
    public javax.swing.JButton btnguardarautor;
    public javax.swing.JButton btnguardarcategoria;
    public javax.swing.JButton btnguardareditorial;
    public javax.swing.JButton btnguardarproveedor;
    public javax.swing.JButton btnnuevacategoria;
    public javax.swing.JButton btnnuevaeditorial;
    public javax.swing.JButton btnnuevoautor;
    public javax.swing.JButton btnnuevoproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuEliminarAutores;
    public javax.swing.JMenuItem jMenuEliminarAutoresDefinitivamente;
    public javax.swing.JMenuItem jMenuEliminarCategorias;
    public javax.swing.JMenuItem jMenuEliminarCategoriasDefinitivamente;
    public javax.swing.JMenuItem jMenuEliminarEditoriales;
    public javax.swing.JMenuItem jMenuEliminarEditorialesDefinitivamente;
    public javax.swing.JMenuItem jMenuEliminarProveedores;
    public javax.swing.JMenuItem jMenuEliminarProveedoresDefinitivamente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    public javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JMenuItem jMenuReingresarAutores;
    public javax.swing.JMenuItem jMenuReingresarCategorias;
    public javax.swing.JMenuItem jMenuReingresarEditoriales;
    public javax.swing.JMenuItem jMenuReingresarProveedores;
    public javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    public javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    public javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    public javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    public javax.swing.JPanel jPanel41;
    private javax.swing.JPopupMenu jPopupAutores;
    private javax.swing.JPopupMenu jPopupCategorias;
    private javax.swing.JPopupMenu jPopupEditoriales;
    private javax.swing.JPopupMenu jPopupProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    public javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JLabel txtIdAutor;
    public javax.swing.JLabel txtIdCategoria;
    public javax.swing.JLabel txtIdCategoria1;
    public javax.swing.JLabel txtIdEditorial;
    public javax.swing.JLabel txtIdProveedor;
    public javax.swing.JTextField txtNombreAutor;
    public javax.swing.JTextField txtNombreCategoria;
    public javax.swing.JTextField txtNombreEditorial;
    public javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtObservaciones;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
