package clases;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class UdpClient {
    
    private String msg;
    
    public UdpClient(String value, String nome, String pwd, String email,String numeroCartao){
        this.msg = "signin#%#" + nome + "#%#" + pwd + "#%#" + email + "#%#" + numeroCartao + "#%#";
    }
    
    public UdpClient(int login, String email, String pwd){
        this.msg = "login#%#" + email + "#%#" + pwd + "#%#";
    }
    
    public UdpClient(String value, String value2){
        switch(value){
            case "Principal Page":
                    this.msg = "principalpage#%#" + value2 + "#%#";
                break;    
            case "Perfil":
                    this.msg = "perfil#%#" + value2 + "#%#";
                break;
            case "Table Principal Page":
                    this.msg = "tableprincipalpage#%#" + value2 + "#%#";
                break;
            case "Table Movimento Cartao":
                    this.msg = "tablemovimentocartao#%#" + value2 + "#%#";
                break;
            case "Verificar Mensalidade":
                    this.msg = "verificarmensalidade#%#" + value2 + "#%#";
                break;
            case "Catch idUtilizador":
                    this.msg = "catchidutilizador#%#" + value2 + "#%#";
                break;
            case "Procurar Cliente":
                    this.msg = "procurarcliente#%#" + value2 + "#%#";
                break;
        }
    }
    
    public UdpClient(String value,String email,String Pmes, String Pano){
        this.msg = "pagarmensalidade#%#" + email + "#%#" + Pmes + "#%#" + Pano + "#%#";
    }
    
    public UdpClient(int numeroCartao, double credito,String email){
        this.msg = "recarregarcartao" + "#%#" + numeroCartao + "#%#" + credito + "#%#" + email + "#%#";
    }
    
    public String initClient(){
        final int PORT = 50000;
        byte[] buffer = new byte[65508];
        
        try {
            
            InetAddress direccion = InetAddress.getByName("192.168.43.100");
            DatagramSocket socketUDP = new DatagramSocket();
            
            String mensaje = this.msg;
            
            //buffer = this.encriptar(mensaje).getBytes();
            buffer = mensaje.getBytes();
            
            System.out.println("Este es el mensaje encriptado : " + buffer);
            
            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, direccion, PORT);
            
            socketUDP.send(pregunta);
     
            byte[] receivedBuffer = new byte[65508];
            
            DatagramPacket peticion = new DatagramPacket(receivedBuffer, receivedBuffer.length);
            
            System.out.println("Este es el buffer cliente: " + buffer.length);
            
            socketUDP.receive(peticion);
            
            mensaje = new String(peticion.getData());
            System.out.println("Este es el mensaje encriptado en el cliente : " + mensaje);
            socketUDP.close();
            System.out.println("Este es el mensaje desencriptado en el cliente : " + desencriptar(mensaje));
            
            //return desencriptar(mensaje);
            return mensaje;
            
        } catch (SocketException ex) {
            Logger.getLogger(clases.UdpClient.class.getName()).log(Level.SEVERE, null, ex);
            return "Error envio de datos cliente";
        } catch (UnknownHostException ex) {
            Logger.getLogger(clases.UdpClient.class.getName()).log(Level.SEVERE, null, ex);
            return "Error envio de datos cliente";
        } catch (IOException ex) {
            Logger.getLogger(clases.UdpClient.class.getName()).log(Level.SEVERE, null, ex);
            return "Error envio de datos cliente";
        } catch (Exception ex) {
            Logger.getLogger(UdpClient.class.getName()).log(Level.SEVERE, null, ex);
            return "Error envio de datos cliente";
        }
    }
    
    public static String encriptar(String texto) {

        String secretKey = "qualityinfosolutions"; //llave para encriptar datos
        String base64EncryptedString = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
    
    public static String desencriptar(String textoEncriptado) throws Exception {

        String secretKey = "qualityinfosolutions"; //llave para desenciptar datos
        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
}
