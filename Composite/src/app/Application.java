/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;
import orders.SaleOrder;
import products.CompositeProduct;
import products.SimpleProduct;

/**
 *
 * @author Usuario
 */
@SuppressWarnings("ALL")

public class Application {

    /**
     * TODO Tarea! Extender el ejemplo para crear un tipo de PC corporativo con
     * sus propias características y un tipo de laptop (portátil) con sus
     * propias características.
     */
    private final Random random = new Random();

    private SimpleProduct ram4gb;
    private SimpleProduct ram8gb;
    private SimpleProduct disk500gb;
    private SimpleProduct disk1tb;
    private SimpleProduct cpuAMD;
    private SimpleProduct cpuIntel;
    private SimpleProduct cpuInteli5;
    private SimpleProduct smallCabinete;
    private SimpleProduct bigCabinete;
    private SimpleProduct monitor20inch;
    private SimpleProduct monitor30inch;
    private SimpleProduct simpleMouse;
    private SimpleProduct customMouse;
    private SimpleProduct gammerMouse;

    private CompositeProduct gammerPC;
    private CompositeProduct homePC;
    private CompositeProduct pc2x1;
    private CompositeProduct laptop;
    private CompositeProduct corporativo;

    public Application() {
        buildProducts();
    }

    private void buildProducts() {
        //Simple product construction
        ram4gb = new SimpleProduct("RAM 4GB", 750, "KingStone");
        ram8gb = new SimpleProduct("RAM 8GB", 1000, "KingStone");
        disk500gb = new SimpleProduct("HDD 500GB", 1500, "ACME");
        disk1tb = new SimpleProduct("HDD 1TB", 2000, "ACME");
        cpuAMD = new SimpleProduct("AMD phenon", 4000, "AMD");
        cpuIntel = new SimpleProduct("Intel i7", 4500, "Intel");
        cpuInteli5 = new SimpleProduct("Intel i5", 3500, "Intel");
        smallCabinete = new SimpleProduct("Small cabinet", 2000, "ExCom");
        bigCabinete = new SimpleProduct("Big Cabinet", 2200, "ExCom");
        monitor20inch = new SimpleProduct("Display 20'", 1500, "HP");
        monitor30inch = new SimpleProduct("Display 30'", 2000, "HP");
        simpleMouse = new SimpleProduct("Simple mouse", 150, "Genius");
        customMouse = new SimpleProduct("Wireless Mouse ", 350, "HP");
        gammerMouse = new SimpleProduct("Gammer mouse", 750, "Alien");

        //Composite product - Gammer pc with 8gb ram,HDD 1tb, Intel i7 processor
        //large cabinet,display 30' and one gammer mouse.
        gammerPC = new CompositeProduct("Gammer PC");
        gammerPC.addProduct(ram8gb);
        gammerPC.addProduct(disk1tb);
        gammerPC.addProduct(cpuIntel);
        gammerPC.addProduct(bigCabinete);
        gammerPC.addProduct(monitor30inch);
        gammerPC.addProduct(gammerMouse);
        //Composite product - Package consisting of two packages, Gammer PC + Home PC
        pc2x1 = new CompositeProduct("Pack PC Gammer + Home PC");
        pc2x1.addProduct(gammerPC);
        pc2x1.addProduct(homePC);

        laptop = new CompositeProduct("Laptop");
        laptop.addProduct(ram4gb);
        laptop.addProduct(disk500gb);
        laptop.addProduct(cpuAMD);
        laptop.addProduct(customMouse);

        corporativo = new CompositeProduct("PC Corporativo");
        corporativo.addProduct(ram8gb);
        corporativo.addProduct(disk1tb);
        corporativo.addProduct(cpuInteli5);
        corporativo.addProduct(monitor20inch);
        corporativo.addProduct(simpleMouse);
    }

    public void orderSimpleProducts() {

        SaleOrder simpleProductOrder = new SaleOrder(random.nextInt(), "Juan Pachón");
        simpleProductOrder.addProduct(ram4gb);
        simpleProductOrder.addProduct(disk1tb);
        simpleProductOrder.addProduct(simpleMouse);
        simpleProductOrder.printOrder();
    }

    public void orderGammerPC() {
        SaleOrder gammerOrder = new SaleOrder(1, "Carlos Quijano");
        gammerOrder.addProduct(gammerPC);
        gammerOrder.printOrder();
    }

    public void orderCombo() {
        SaleOrder comboOrder = new SaleOrder(3, "Paquete 2x1 en PC");
        comboOrder.addProduct(pc2x1);
        comboOrder.printOrder();
    }

    public void orderBig() {
        SaleOrder customOrder = new SaleOrder(4, "Cristian Sanchez");
        customOrder.addProduct(homePC);
        customOrder.addProduct(ram8gb);
        customOrder.addProduct(ram4gb);
        customOrder.addProduct(monitor30inch);
        customOrder.addProduct(gammerMouse);
        customOrder.printOrder();
    }

    public void orderCorpoPc() {
        SaleOrder corpoPc = new SaleOrder(5, "Empresa ABC");
        corpoPc.addProduct(corporativo);
        corpoPc.printOrder();
    }

    public void orderLaptop() {
        SaleOrder orderLaptot = new SaleOrder(6, "Juanito Perez");
        orderLaptot.addProduct(laptop);
        orderLaptot.printOrder();
    }
}
