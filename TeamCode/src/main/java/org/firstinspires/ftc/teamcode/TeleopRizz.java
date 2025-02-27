package org.firstinspires.ftc.teamcode; //our code

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

//TEST
@TeleOp(name="TeleopRizz", group="Pushbot")
public class TeleopRizz extends OpMode {

    private DcMotor frontRight= ; // sucks
    private DcMotor frontLeft= ; //python lowk better
    private DcMotor backRight= ; //we should use py
    private DcMotor backLeft= ; 
    private Servo   claw;
    private Servo   linear_rail;
    
    //RobotHardwareLite robot = new RobotHardwareLite();

    Gamepad gamepad1 = new Gamepad();

    @Override
    public void init(){
//        robot.init(hardwareMap); //connects to all hardware components
        telemetry.addData("travis:", "fein fein fein fein");
        frontLeft = hardwareMap.get(DcMotor.class, "left_front_drive");
        backLeft = hardwareMap.get(DcMotor.class, "left_back_drive");
        frontRight = hardwareMap.get(DcMotor.class, "right_front_drive");
        backRight = hardwareMap.get(DcMotor.class, "right_back_drive");
        claw = hardwareMap.get(Servo.class, "clawservo");
        linear_rail = hardewareMap.get(Servo.class, "rail");

    }
    @Override //repeats after PLAY, BEFORE STOP
    public void loop(){
        if (gamepad1.a) {
            frontLeft.setPower(1);
            backLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(1);
            telemetry.addLine(String.format("It should be moving"));
        if (gamepad1.b){

            claw.setPosition(110);
        }
        if (gamepad.x){
                linear_rail.setPosition(180);
            }
            
            
        }
//        Thread.sleep(2000)//Francisco only wants to see the robot move
    }
}
