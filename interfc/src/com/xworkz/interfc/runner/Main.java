package com.xworkz.interfc.runner;

import com.xworkz.interfc.externali.*;
import com.xworkz.interfc.externali.Lamp;
import com.xworkz.interfc.internalcl.ElectricWaterPump;
import com.xworkz.interfc.internalcl.EspressoMachine;
import com.xworkz.interfc.internalcl.GrillMicrowaveOvenImpli;
import com.xworkz.interfc.internalcl.MicrowaveImpli;
import com.xworkz.interfc.intfc1.*;
import com.xworkz.interfc.intfc2.*;

public class Main {
    public static void main(String[] args) {
        Bed bed=new Account();
        bed.gotup();
        Bicycle bicycle=new Account();
        bicycle.ride();

        BicycleHelmet bicycleHelmet=new Album();
        bicycleHelmet.tanprotect();
        Blender blender=new Album();
        blender.rotate();

        Blender blender1=new Animal();
        Boat boat=new Animal();
        boat.move();

        BusStop busStop=new Bank();
        Camera camera=new Bank();
        camera.lens();

        CarCharger carCharger=new Bike();
        carCharger.movecar();
        Chair chair=new Bike();
        chair.pull();

        Computer computer=new Book();
        computer.operate();
        Curtain curtain=new Book();

        Dehumidifier dehumidifier=new Car();
        Dishwasher dishwasher=new Car();
        dishwasher.dish();

        Drone drone=new Cat();
        drone.highfly();
        ElectricCar electricCar=new Cat();
        electricCar.automate();

        ElectricKettle electricKettle=new Customer();
        electricKettle.kettle();
        Elevator elevator=new Customer();
        elevator.closedoor();

        Elevator elevator1=new Dog();
        Fan fan=new Dog();
        fan.regulator();

        FanCooler fanCooler=new Employee();
        fanCooler.fanrotate();
        FanHeater fanHeater=new Employee();
        fanHeater.low();

        FireExtinguisher fireExtinguisher=new Flight();
        fireExtinguisher.fireexit();
        FoodProcessor foodProcessor=new Flight();
        foodProcessor.food();

        Fridge fridge=new Game();
        fridge.close();
        Generator generator=new Game();

        GPSNavigator gpsNavigator=new Hotel();
        gpsNavigator.app();
        HairDryer hairDryer=new Hotel();
        hairDryer.hair();

        HomeSecuritySystem homeSecuritySystem=new Invoice();
        homeSecuritySystem.home();
        Helicopter helicopter=new Invoice();

        Humidifier humidifier=new Library();
        humidifier.humid();
        HybridCar hybridCar=new Library();
        hybridCar.hybrid();

        Iron iron=new Movie();
        iron.melt();
        Lamp lamp=new Movie();
        lamp.light();
        LampPost lampPost=new Tube();
        lampPost.post();

        Microwave microwave=new MicrowaveImpli();
        microwave.wave();
        MicrowaveOven microwaveOven=new GrillMicrowaveOvenImpli();
        microwaveOven.oven();

        Mixer mixer=new Tube();
        mixer.grind();
        MotionSensor motionSensor=new Cane();
        motionSensor.sense();

        Motorcycle motorcycle=new Cane();
        motorcycle.cyc();

        Oven oven=new Music();
        oven.heat();
        Phone phone=new Music();
        phone.scream();

        Printer printer=new Order();
        printer.read();
        PrinterScanner printerScanner=new Tray();
        printerScanner.scnr();
        Refrigerator refrigerator=new Order();
        refrigerator.system();

        Router router=new Beam();
        router.route();
        Satellite satellite=new Dice();
        satellite.stlt();
        Scooter scooter=new Dice();
        scooter.scooty();

        SmartDoor smartDoor=new Comb();
        smartDoor.door();
        SmartFridge smartFridge=new Comb();
        smartFridge.fridge();

        SmartLock smartLock=new Comb();
        smartLock.lock1();
        SmartSpeaker smartSpeaker=new Player();
        smartSpeaker.speaker();

        SmartThermostat smartThermostat=new Comb();
        smartThermostat.thermo();
        SnowConeMachine snowConeMachine=new Product();
        snowConeMachine.snow();
        Speaker speaker=new Player();

        SmokeDetector smokeDetector=new Product();


        Sofa sofa=new Room();
        sofa.sofa();
        Subway subway=new Bell();
        subway.sub();
        Table table=new Room();
        table.onthetable();
        Taxi taxi=new Bell();
        taxi.olataxi();

        Thermometer thermometer=new Bell();
        thermometer.meter();
        Toaster toaster=new Bell();
        toaster.toast1();

        AC ac=new Student();
        ac.energySaverMode();
        Airplane airplane=new Student();
        airplane.landon();

        AirPurifier airPurifier=new Teacher();
        airPurifier.clean();
        BarcodeScanner barcodeScanner=new Teacher();
        barcodeScanner.scan();

        Train train=new Ticket();
        train.trains();
        Truck truck=new Ticket();
        truck.trucks();
        TV tv=new Grate();
        tv.television();
        VacuumCleaner vacuumCleaner=new Crate();
        vacuumCleaner.cleaner();

        WashingMachine washingMachine=new Grate();
        washingMachine.washes();
        WaterPump waterPump=new ElectricWaterPump();
        waterPump.pump();

        CoffeeMaker coffeeMaker=new EspressoMachine();
        coffeeMaker.makes();

    }
}
