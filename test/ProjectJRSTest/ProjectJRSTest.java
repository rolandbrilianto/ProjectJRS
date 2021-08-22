package ProjectJRSTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projectjrs.*;

/**
 *
 * @author roland
 */
public class ProjectJRSTest {
    
    public ProjectJRSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
@Test
public void HitungPajak(){
    int totalpaket=27000;
    int totalalacarte= 12000;
    int totalminuman=6000;
            System_Order HitungPajak = new projectjrs.System_Order();
int expResult = 4500;
    assertEquals(expResult, HitungPajak.pajak(totalpaket, totalalacarte, totalminuman, 10, 100));
    assertEquals(5000, HitungPajak.pajak(30000, 15000, 5000, 10, 100));
    assertEquals(5000, HitungPajak.pajak(25000, 15000, 10000, 10, 100));
    assertEquals(5500, HitungPajak.pajak(45000, 5000, 5000, 10, 100));
           
}
@Test
public void HitungCombo(){
    int jumlah_Beli=2;
    int Harga =27000;
    System_Order HitungCombo = new projectjrs.System_Order();
    int expResult = 54000;
    assertEquals(expResult, HitungCombo.multiply(jumlah_Beli, Harga));
    assertEquals(100000, HitungCombo.multiply(2, 50000));
    assertEquals(60000, HitungCombo.multiply(4, 15000));
    assertEquals(50000, HitungCombo.multiply(2, 25000));
}
@Test
public void HitungAlaCarte(){
    int jumlah_Beli1=2;
    int Harga1=12000;
    System_Order HAC = new projectjrs.System_Order();
    int expResult = 24000;
    assertEquals(expResult, HAC.multiply(jumlah_Beli1, Harga1));
    assertEquals(100000, HAC.multiply(5, 20000));
    assertEquals(45000, HAC.multiply(3, 15000));
    assertEquals(48000, HAC.multiply(4, 12000));
    
}
@Test
public void Minuman(){
   int jumlah_Beli2=2;
   int Harga2=6000;
   System_Order Minuman = new projectjrs.System_Order();
   int expResult = 12000;
    assertEquals(expResult, Minuman.multiply(jumlah_Beli2, Harga2));
    assertEquals(20000, Minuman.multiply(2, 10000));
     assertEquals(10000, Minuman.multiply(1, 10000));
      assertEquals(30000, Minuman.multiply(2, 15000));
    
}
@Test
public void Kembalian(){
    int jumlahby = 15000;
    int total_Harga = 12000;
    System_Order Kembalian = new projectjrs.System_Order();
    int expResult = 3000;
    assertEquals(expResult, Kembalian.subtract(jumlahby, total_Harga));
     assertEquals(10000, Kembalian.subtract(100000, 90000));
      assertEquals(25000, Kembalian.subtract(50000, 25000));
           assertEquals(50000, Kembalian.subtract(75000, 25000));
}
@Test
public void Total(){
    int totalpaket=27000;
    int totalalacarte= 12000;
    int totalminuman=6000;
    int pajak =4500;
    System_Order Total = new projectjrs.System_Order();
    int expResult = 49500;
    assertEquals(expResult, Total.total(totalpaket, totalminuman, totalalacarte, pajak));
           assertEquals(27500, Total.total(10000, 10000, 5000, 2500));
           assertEquals(44000, Total.total(15000, 15000, 10000, 4000));
                  }
@Test
public void Reset(){
    System_Order RESET = new projectjrs.System_Order();
    String Test=RESET.Reset2();
    assertNull(Test);
            
}
@Test
public void Drink(){
    System_Order Drink = new projectjrs.System_Order();
    String Test =Drink.drink();
    assertNull(Test);
}
@Test
public void alacarte(){
    System_Order alacarte = new projectjrs.System_Order();
    String Test =alacarte.alacarte();
    assertNull(Test);
}
@Test
public void combo(){
    System_Order combo = new projectjrs.System_Order();
    String Test =combo.combo();
    assertNull(Test);
}
@Test
public void bayar(){
    System_Order bayar = new projectjrs.System_Order();
    String Test =bayar.bayar();
    assertNull(Test);
}
@Test
public void hilang(){
    System_Order HL = new projectjrs.System_Order();
    String Test =HL.hilang();
    assertNull(Test);
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
