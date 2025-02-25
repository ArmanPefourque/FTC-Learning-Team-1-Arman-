package org.firstinspires.ftc.teamcode; //our code

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
        frontLeft = hardwareMap.get(DcMotor.class, "left_front_drive");
        backLeft = hardwareMap.get(DcMotor.class, "left_back_drive");
        frontRight = hardwareMap.get(DcMotor.class, "right_front_drive");
        backRight = hardwareMap.get(DcMotor.class, "right_back_drive");

    }
    @Override //repeats after PLAY, BEFORE STOP
    public void loop(){

        frontLeft.setPower(1);
        backLeft.setPower(1);
        frontRight.setPower(1);
        backRight.setPower(1);
        telemetry.addLine(String.format("It should be moving"));

//        Thread.sleep(2000)//Francisco only wants to see the robot move
    }
}