import Autentificacion.Interfaz.Dashboard;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard dashboard = new Dashboard();
                dashboard.setLocationRelativeTo(null);
                dashboard.setVisible(true);
            }
        });
    }
}
