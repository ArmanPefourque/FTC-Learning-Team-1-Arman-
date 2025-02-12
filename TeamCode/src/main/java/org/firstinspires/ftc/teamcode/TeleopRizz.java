package org.firstinspires.ftc.teamcode; //our code
import java;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//TEST
@TeleOp(name="TeleopRizz", group="Pushbot")
public class TeleopRizz extends OpMode {

    private DcMotor frontRight= null; //jaZDVVZDZDZSVVZDZDVva sucks
    private DcMotor frontLeft= null; //python lowk better
    private DcMotor backRight= null; //we should use py
    private DcMotor backLeft= null; //

    RobotHardwareLite robot = new RobotHardwareLite();

    @Override
    public void init(){
//        robot.init(hardwareMap); //connects to all hardware components
        telemetry.addData("travis:", "fein fein fein fein");
        frontLeft =

    }
    @Override //repeats after PLAY, BEFORE STOP
    public void loop(){

        robot.frontLeft.setPower(0.1);
        robot.backLeft.setPower(0.1);
        robot.frontRight.setPower(0.1);
        robot.backRight.setPower(0.1);
        telemetry.addLine(String.format("It should be moving"));

//        Thread.sleep(2000)//Francisco only wants to see the robot move
    }
}